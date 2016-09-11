package com.payment.pay.plugins.bankData;

import com.payment.pay.bankRqData.BankRqData;

/**
 * 包      名: com.payment.pay.plugins.bankData  <br>
 * 描      述:                       <br>
 * 创 建 人 : kan <br>
 */
public class WeiXinScanCodeRqData extends BankRqData {

    private static final String RESPONSE_SUCCESS = "SUCCESS";
    private static final String RESPONSE_FAIL = "FAIL";


    String payNo;
    String returnCode;
    String returnMsg;
    String resultCode;
    String errCode;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String buildHtml() throws Exception {
        if (RESPONSE_SUCCESS.equals(returnCode) && RESPONSE_SUCCESS.equals(resultCode)) {
            return RESPONSE_SUCCESS;
        } else {
            return RESPONSE_FAIL;
        }

    }
}
