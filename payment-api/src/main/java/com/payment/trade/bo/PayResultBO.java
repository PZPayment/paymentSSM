package com.payment.trade.bo;

/**
 * 包      名: com.payment.trade.bo.payMethod  <br>
 * 描      述:                       <br>
 * 创 建 人 : kan <br>
 */
public class PayResultBO extends BaseResultBO {

    private static final long serialVersionUID = 1979608419018635778L;
    private String bankDate;

    public String getBankDate() {
        return bankDate;
    }

    public void setBankDate(String bankDate) {
        this.bankDate = bankDate;
    }
}
