package com.payment.trade.bo.payMethod;


import com.payment.comm.constants.EnumPayType;

/**
 * 余额支付方式
 */
public class PayMethodOBP extends PayMethod {
    private static final long serialVersionUID = -5518671750186975197L;

    public PayMethodOBP() {
        super.payType = EnumPayType.OBP;
    }

    @Override
    public PayMethodOBP clone() {
        return (PayMethodOBP) super.clone();
    }

    @Override
    public Boolean isAfterPay(){
        return !payType.isRealTime();
    }
}
