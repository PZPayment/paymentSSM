package com.payment.trade.bo;

import com.payment.comm.base.bo.BaseApiBean;

import java.math.BigDecimal;

/**
 * Created by fangchao on 15/12/25.
 */
public class DepositBO extends BaseApiBean {

    /**
     * 用户编号
     */
    private String userId;
    /**
     * 业务单号
     */
    private String orderNo;

    /**
     * 充值金额
     */
    private BigDecimal amount;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
