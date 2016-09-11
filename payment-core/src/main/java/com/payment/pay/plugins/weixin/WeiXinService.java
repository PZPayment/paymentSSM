package com.payment.pay.plugins.weixin;

import com.payment.comm.base.exception.ExceptionHanlder;
import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.constants.TradeConstants;
import com.payment.comm.errorCode.PayErrorCode;
import com.payment.comm.utils.Des3Utils;
import com.payment.comm.utils.Sha1Utils;
import com.payment.domain.PayOrder;
import com.payment.pay.bankRqData.BankRqData;
import com.payment.pay.plugins.PayGateServiceAbstract;
import com.payment.pay.plugins.bankData.WeiXinBankRqData;
import com.payment.pay.plugins.bankData.WeiXinBankRsData;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 包      名: com.payment.pay.plugins  <br>
 * 描      述: 微信支付处理类<br>
 * 创 建 人 : kan <br>
 */
public class WeiXinService extends PayGateServiceAbstract {


    private final static String TRADE_JSAPI = "JSAPI";

    private final static String TRADE_NATIVE = "NATIVE";

    private final static String TRADE_APP = "APP";

    private final String APPID = "APPID";

    private final String ACCOUNTNO = "ACCOUNTNO";

    private final String BANKTYPE = "BANKTYPE";

    private final String PAYKEY = "PAYKEY";

    private final String NOTIFYURL = "NOTIFYURL";

    private final String OPENID = "OPENID";

    private final String PAYURL = "PAYURL";

    private final String REFUNDURL = "REFUNDURL";

    private final String CERURL = "CERURL";

    private final String CERPWD = "CERPWD";

    @Override
    public int refund(PayOrder order, Long amount, String refundId) throws PaymentException {


        String appId = getGateDate(APPID);
        String noncestr = Sha1Utils.getNonceStr();

        //构造微信请求包体
        WeiXinPackage weiXinPackage = new WeiXinPackage();
        weiXinPackage.setAppid(appId);
        weiXinPackage.setMch_id(getGateDate(ACCOUNTNO));
        weiXinPackage.setNonce_str(noncestr);
        weiXinPackage.setOut_trade_no(order.getPayNo());
        weiXinPackage.setOut_refund_no(order.getPayNo());
        weiXinPackage.setTotal_fee(order.getPayAmount().toString());
        weiXinPackage.setRefund_fee(amount.toString());
        weiXinPackage.setOp_user_id(getGateDate(ACCOUNTNO));

        String payKey = Des3Utils.decryptMode(getGateDate(PAYKEY));

        String packageValue = WeiXinUtils.genPackage(payKey,WeiXinPackage.class,weiXinPackage);

        String refundResult = WeiXinUtils.getRefundNo(
                getGateDate(REFUNDURL), packageValue, getGateDate(CERURL), getGateDate(CERPWD));

        if ("SUCCESS".equals(refundResult)) {
            return TradeConstants.REFUND_STATE_SUCCESS;
        } else {
            return TradeConstants.REFUND_STATE_FAILURE;
        }
    }

    @Override
    public String callback(Map<String, String[]> paramMap, PayOrder order, String type) throws PaymentException {
        String result = "<xml><return_code>SUCCESS</return_code></xml>";
        try {
            WeiXinBankRsData weiXinBankRsData = new WeiXinBankRsData();
            weiXinBankRsData.initField(paramMap);
            String payKey = Des3Utils.decryptMode(getGateDate(PAYKEY));

            //校验签名
            if (weiXinBankRsData.checkSign(payKey)) {
                if ("SUCCESS".equals(weiXinBankRsData.getResult_code()) && "SUCCESS".equals(weiXinBankRsData.getReturn_code())) {
                    if (order.getPayAmount().equals(weiXinBankRsData.getTotal_fee())) {
                        result = "<xml><return_code>SUCCESS</return_code></xml>";
                    } else {
                        throw new PaymentException(PayErrorCode.CALLBACK_AMOUNT_ERROR);
                    }
                } else {
                    throw new PaymentException(PayErrorCode.CALLBACK_STATE_ERROR);
                }
            } else {
                throw new PaymentException(PayErrorCode.CALLBACK_SIGN_ERROR);
            }

            //网关流水
            order.setGateOrderNo(weiXinBankRsData.getTransaction_id());

        } catch (Exception e) {
            ExceptionHanlder.Process(e);
        }

        return result;
    }

    @Override
    public BankRqData buildHtml(PayOrder order) throws PaymentException {

        WeiXinBankRqData weiXinBankData = new WeiXinBankRqData();

        String appId = getGateDate(APPID);
        String noncestr = Sha1Utils.getNonceStr();
        String timestamp = Sha1Utils.getTimeStamp();
        String partnerid = getGateDate(ACCOUNTNO);
        String tradeType = getGateDate(BANKTYPE);

        //构造微信请求包体
        WeiXinPackage weiXinPackage = new WeiXinPackage();
        weiXinPackage.setAppid(appId);
        weiXinPackage.setNonce_str(noncestr);


        //截取字符串的长度,最长125个字节
        String bodyStr = WeiXinUtils.getSubstrByCharset("UTF-8", "asdasdad", 125);

        weiXinPackage.setBody(bodyStr);
        weiXinPackage.setAttach("");
        weiXinPackage.setMch_id(partnerid);
        weiXinPackage.setOut_trade_no(order.getPayNo());
        weiXinPackage.setTotal_fee(order.getPayAmount().toString());
        weiXinPackage.setNotify_url(getGateDate(NOTIFYURL));
        weiXinPackage.setSpbill_create_ip(order.getPayIp());
        weiXinPackage.setTrade_type(tradeType);//用于区分是JSAPI NATIVE  APP
        weiXinPackage.setOpenid(order.getOptRemark()); //只有JSAPI方式需要传
        weiXinPackage.setProduct_id(TRADE_NATIVE.equals(tradeType) ? order.getPayNo() : "");//只有NATIVE方式需要传
        String payKey = Des3Utils.decryptMode(getGateDate(PAYKEY));

        String packageValue = WeiXinUtils.genPackage(payKey,WeiXinPackage.class,weiXinPackage);

        //获取预支付ID
        PrePayResult prePayResult = WeiXinUtils.getPayNo(getGateDate(PAYURL), packageValue);

        if ("FAIL".equals(prePayResult.getRequest_code())) {
            throw new PaymentException("微信支付失败：" + prePayResult.getError_msg());
        }

        if (TRADE_JSAPI.equals(tradeType)) {
            SortedMap<String, String> finalpackage = new TreeMap<String, String>();
            finalpackage.put("appId", appId);
            finalpackage.put("timeStamp", timestamp);
            finalpackage.put("nonceStr", noncestr);
            finalpackage.put("package", "prepay_id=" + prePayResult.getPrepay_id());
            finalpackage.put("signType", "MD5");

            String paySign = WeiXinUtils.createSign(finalpackage, payKey);
            finalpackage.put("sign", paySign);

            weiXinBankData.setPackageParams(finalpackage);
        } else if (TRADE_NATIVE.equals(tradeType)) {
            SortedMap<String, String> finalpackage = new TreeMap<String, String>();
            finalpackage.put("codeUrl", prePayResult.getCode_url());

            weiXinBankData.setPackageParams(finalpackage);
        } else if (TRADE_APP.equals(tradeType)) {
            SortedMap<String, String> finalpackage = new TreeMap<String, String>();
            finalpackage.put("appid", appId);
            finalpackage.put("partnerid", partnerid);
            finalpackage.put("prepayid", prePayResult.getPrepay_id());
            finalpackage.put("package", "Sign=WXPay");
            finalpackage.put("timestamp", timestamp);
            finalpackage.put("noncestr", noncestr);
            String paySign = WeiXinUtils.createSign(finalpackage, payKey);
            finalpackage.put("sign", paySign);

            weiXinBankData.setPackageParams(finalpackage);
        } else {
            weiXinBankData.setPackageParams(null);
        }


        return weiXinBankData;
    }


}
