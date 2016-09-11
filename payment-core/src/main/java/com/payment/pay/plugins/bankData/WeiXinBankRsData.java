package com.payment.pay.plugins.bankData;

import com.payment.pay.bankRqData.BankRqDataUtils;
import com.payment.pay.bankRsData.BankRsData;
import com.payment.pay.plugins.weixin.WeiXinUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 包      名: com.payment.pay.plugins.bankData  <br>
 * 描      述: 微信回调数据                      <br>
 * 创 建 人 : kan <br>
 */
public class WeiXinBankRsData extends BankRsData{
    private String appid;
    private String bank_type;
    private String cash_fee;
    private String fee_type;
    private String is_subscribe;
    private String mch_id;
    private String nonce_str;
    private String openid;
    private String out_trade_no;
    private String result_code;
    private String return_code;
    private String sign;
    private String time_end;
    private String total_fee;
    private String trade_type;
    private String transaction_id;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public String getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(String cash_fee) {
        this.cash_fee = cash_fee;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getIs_subscribe() {
        return is_subscribe;
    }

    public void setIs_subscribe(String is_subscribe) {
        this.is_subscribe = is_subscribe;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public boolean checkSign(String key) {
        String value = "";
        Field[] FieldArr = getClass().getDeclaredFields();
        //生成排序MAP
        SortedMap<String, String> packageParams = new TreeMap<String, String>();
        for (Field field : FieldArr) {
            try {
                value = String.valueOf(BankRqDataUtils.getFieldValue(field.getName(), this));
            } catch (Exception e) {
                value = "";
            }
            if (!StringUtils.isBlank(value) && !"null".equals(value)) {
                if (!"sign".equals(field.getName())) {
                    packageParams.put(field.getName(), value);
                }
            }
        }
        String sign = WeiXinUtils.createSign(packageParams, key);

        return sign.equals(getSign());
    }
}
