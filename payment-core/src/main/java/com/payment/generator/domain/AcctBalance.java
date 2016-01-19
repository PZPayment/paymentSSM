package com.payment.generator.domain;

import java.io.Serializable;
import java.util.Date;

public class AcctBalance implements Serializable {
    private Long balanceId;

    private String userId;

    private Long balance;

    private Short balanceState;

    private Date lastDate;

    private static final long serialVersionUID = 1L;

    public Long getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(Long balanceId) {
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
        sb.append(", lastDate=").append(lastDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}