package com.payment.trade.bo.payMethod;


import com.payment.comm.constants.EnumPayType;

/**
 * 余额支付方式
 */
public class PayMethodOLP extends PayMethod {
    private static final long serialVersionUID = -5518671750186975197L;

    public PayMethodOLP() {
        super.payType = EnumPayType.OLP;
    }

    @Override
    public PayMethodOLP clone() {
        return (PayMethodOLP) super.clone();
    }

    @Override
    public Boolean isAfterPay(){
        return !payType.isRealTime();
    }
}
