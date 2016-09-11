package com.payment.trade.bo;

import com.payment.comm.base.bean.BaseBean;
import com.payment.comm.constants.EnumTransferType;
import com.payment.domain.User;

/**
 * Created by fangchao on 15/12/25.
 */

public class TransferBO extends BaseBean {
    private static final long serialVersionUID = 4107304367123463493L;

    /**
     * 转出
     */
    private User fromUser;
    /**
     * 转入
     */
    private User toUser;
    /**
     * 转出金额
     */
    private Long fromAmount;
    /**
     * 转入金额
     */
    private Long toAmount;

    /**
     * 转出账本
     */
    private String fromBalance;
    /**
     * 转入账本
     */
    private String toBalance;

    /**
     * 业务类型编号
     */
    private EnumTransferType transferType;

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }

    public Long getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(Long fromAmount) {
        this.fromAmount = fromAmount;
    }

    public Long getToAmount() {
        return toAmount;
    }

    public void setToAmount(Long toAmount) {
        this.toAmount = toAmount;
    }

    public EnumTransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(EnumTransferType transferType) {
        this.transferType = transferType;
    }

    public String getFromBalance() {
        return fromBalance;
    }

    public void setFromBalance(String fromBalance) {
        this.fromBalance = fromBalance;
    }

    public String getToBalance() {
        return toBalance;
    }

    public void setToBalance(String toBalance) {
        this.toBalance = toBalance;
    }
}
