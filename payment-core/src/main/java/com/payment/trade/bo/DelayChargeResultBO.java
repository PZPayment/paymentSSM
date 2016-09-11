package com.payment.trade.bo;


import com.payment.domain.DepositOrder;

/**
 * 包      名: com.ofpay.acct.trade.service.bo           <br>
 * 描      述:    支付成功通知处理返回值        <br>
 * 创 建 人 :  kan      <br>
 */
public class DelayChargeResultBO {

    /**
     * 是否完成充值
     */
    private boolean isCharge;

    /**
     * 充值单详情
     */
    private DepositOrder payChargeOrder;


    public boolean isCharge() {
        return isCharge;
    }

    public void setCharge(boolean charge) {
        isCharge = charge;
    }

    public DepositOrder getPayChargeOrder() {
        return payChargeOrder;
    }

    public void setPayChargeOrder(DepositOrder payChargeOrder) {
        this.payChargeOrder = payChargeOrder;
    }
}
