package com.payment.domain;

import com.payment.comm.base.domain.AbstractEntity;

import java.io.Serializable;
import java.util.Date;

public class Balance extends AbstractEntity implements Serializable {
    private String balanceId;

    private String userId;

    private Long balance;

    private Short balanceState;

    private Short balanceType;

    private Date lastDate;

    private static final long serialVersionUID = 1L;

    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Short getBalanceState() {
        return balanceState;
    }

    public void setBalanceState(Short balanceState) {
        this.balanceState = balanceState;
    }

    public Short getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(Short balanceType) {
        this.balanceType = balanceType;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", balanceId=").append(balanceId);
        sb.append(", userId=").append(userId);
        sb.append(", balance=").append(balance);
        sb.append(", balanceState=").append(balanceState);
        sb.append(", balanceType=").append(balanceType);
        sb.append(", lastDate=").append(lastDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String getId() {
        return balanceId.toString();
    }
}