package com.payment.pay.plugins.weixin;


import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.utils.Des3Utils;
import com.payment.comm.utils.Sha1Utils;
import com.payment.domain.PayOrder;
import com.payment.pay.bankRqData.BankRqData;
import com.payment.pay.plugins.PayGateServiceAbstract;
import com.payment.pay.plugins.bankData.WeiXinScanCodeRqData;

import java.util.Map;

/**
 * 包      名: com.payment.pay.plugins  <br>
 * 描      述: 微信扫码支付处理类<br>
 * 创 建 人 : kan <br>
 */
public class WeiXinScanCodeService extends PayGateServiceAbstract {


    private  final String MCH_ID = "MCH_ID";
    private  final String APP_ID="APP_ID";

    private final String APPID = "APPID";

    private final String ACCOUNTNO = "ACCOUNTNO";

    private final String PAYKEY = "PAYKEY";

    private final String PAYURL = "PAYURL";

    @Override
    public int refund(PayOrder order, Long amount, String refundId) throws PaymentException {
        return 0;
    }

    @Override
    public String callback(Map<String, String[]> paramMap, PayOrder order, String type) throws PaymentException {
        return null;
    }

    @Override
    public BankRqData buildHtml(PayOrder order) throws PaymentException {
        WeiXinScanCodeRqData weiXinScanCodeRqData = new WeiXinScanCodeRqData();
        weiXinScanCodeRqData.setPayNo(order.getPayNo());

        String appId = getGateDate(APPID);
        String noncestr = Sha1Utils.getNonceStr();
        String partnerid = getGateDate(ACCOUNTNO);


        WeiXinScanCodePackage weiXinScanCodePackage = new WeiXinScanCodePackage();
        weiXinScanCodePackage.setAppid(getGateDate(APP_ID));
        weiXinScanCodePackage.setSub_appid(appId);
        weiXinScanCodePackage.setNonce_str(noncestr);
        weiXinScanCodePackage.setBody("商品名称");
        weiXinScanCodePackage.setAttach("商品详情");
        weiXinScanCodePackage.setMch_id(getGateDate(MCH_ID));
        weiXinScanCodePackage.setSub_mch_id(partnerid);
        weiXinScanCodePackage.setOut_trade_no(order.getPayNo());
        weiXinScanCodePackage.setTotal_fee(order.getPayAmount().toString());
        weiXinScanCodePackage.setSpbill_create_ip(order.getPayIp());
        weiXinScanCodePackage.setAuth_code(order.getOptRemark());
        String payKey = Des3Utils.decryptMode(getGateDate(PAYKEY));

        String packageXml = WeiXinUtils.genPackage(payKey,WeiXinScanCodePackage.class,weiXinScanCodePackage);

        //获取支付结果
        ScanCodeResult scanCodeResponse = WeiXinUtils.getScanCodeResult(getGateDate(PAYURL), packageXml);
        weiXinScanCodeRqData.setReturnCode(scanCodeResponse.getReturn_code());
        weiXinScanCodeRqData.setReturnMsg(scanCodeResponse.getReturn_msg());
        weiXinScanCodeRqData.setResultCode(scanCodeResponse.getResult_code());
        weiXinScanCodeRqData.setErrCode(scanCodeResponse.getErr_code());

        return weiXinScanCodeRqData;
    }
}
