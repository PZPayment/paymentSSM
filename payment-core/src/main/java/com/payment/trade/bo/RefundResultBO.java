package com.payment.trade.bo;

/**
 * Created by fangchao on 15/12/24.
 */
public class RefundResultBO extends BaseResultBO {

    private static final long serialVersionUID = -4114510570323788606L;

    private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
