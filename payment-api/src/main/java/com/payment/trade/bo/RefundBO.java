package com.payment.trade.bo;

import com.payment.comm.base.bo.BaseApiBean;
import com.payment.comm.utils.MoneyUtils;

import java.math.BigDecimal;

/**
 *  退款请求BO
 */
public class RefundBO extends BaseApiBean {

    /**
     * 退款单号
     */
    private String orderNo;
    /**
     * 退款金额
     */
    private BigDecimal refundAmount;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    @Override
    public void formatAmount() {
        if (!isFormat()) {
            refundAmount = MoneyUtils.yuanTosysUnitP(refundAmount);
            setFormat(true);
        }
    }
}
