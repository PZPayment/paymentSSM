package com.payment.pay.bankRqData;

import java.lang.reflect.Method;

/**
 * 包      名: com.payment.pay.bankRqData  <br>
 * 描      述:  生成支付请求的bean                     <br>
 * 创 建 人 : kan <br>
 */
public class BankRqData {

    /**
     * HTTP请求URL
     */
    private String payUrl = null;


    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String buildHtml() throws Exception {
        return BankRqDataUtils.buildHtml(this);
    }

    private String getFieldValue(String fieldName) throws Exception {
        StringBuffer nameBuf = new StringBuffer("get");
        nameBuf.append(fieldName.substring(0, 1).toUpperCase());
        nameBuf.append(fieldName.substring(1));

        Method method = getClass().getMethod(nameBuf.toString());
        Object result = method.invoke(this);

        if (result == null) {
            return "";
        }

        return String.valueOf(result);
    }

}
