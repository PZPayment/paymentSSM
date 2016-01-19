package com.payment.generator.domain;

import java.io.Serializable;
import java.util.Date;

public class AcctFundsRecord implements Serializable {
    private String fundsId;

    private Integer tradeTypeId;

    private String userId;

    private Date createdTime;

    private Long payoutAmount;

    private Long incomeAmount;

    private Long balance;

    private String outOrderNo;

    private String orderNo;

    private String fundsName;

    private String fundsDesc;

    private Short inOutType;

    private Integer busiTypeId;

    private String busiTypeName;

    private static final long serialVersionUID = 1L;

    public String getFundsId() {
        return fundsId;
    }

    public void setFundsId(String fundsId) {
        this.fundsId = fundsId == null ? null : fundsId.trim();
    }

    public Integer getTradeTypeId() {
        return tradeTypeId;
    }

    public void setTradeTypeId(Integer tradeTypeId) {
        this.tradeTypeId = tradeTypeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getPayoutAmount() {
        return payoutAmount;
    }

    public void setPayoutAmount(Long payoutAmount) {
        this.payoutAmount = payoutAmount;
    }

    public Long getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(Long incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo == null ? null : outOrderNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getFundsName() {
        return fundsName;
    }

    public void setFundsName(String fundsName) {
        this.fundsName = fundsName == null ? null : fundsName.trim();
    }

    public String getFundsDesc() {
        return fundsDesc;
    }

    public void setFundsDesc(String fundsDesc) {
        this.fundsDesc = fundsDesc == null ? null : fundsDesc.trim();
    }

    public Short getInOutType() {
        return inOutType;
    }

    public void setInOutType(Short inOutType) {
        this.inOutType = inOutType;
    }

    public Integer getBusiTypeId() {
        return busiTypeId;
    }

    public void setBusiTypeId(Integer busiTypeId) {
        this.busiTypeId = busiTypeId;
    }

    public String getBusiTypeName() {
        return busiTypeName;
    }

    public void setBusiTypeName(String busiTypeName) {
        this.busiTypeName = busiTypeName == null ? null : busiTypeName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fundsId=").append(fundsId);
        sb.append(", tradeTypeId=").append(tradeTypeId);
        sb.append(", userId=").append(userId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", payoutAmount=").append(payoutAmount);
        sb.append(", incomeAmount=").append(incomeAmount);
        sb.append(", balance=").append(balance);
        sb.append(", outOrderNo=").append(outOrderNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", fundsName=").append(fundsName);
        sb.append(", fundsDesc=").append(fundsDesc);
        sb.append(", inOutType=").append(inOutType);
        sb.append(", busiTypeId=").append(busiTypeId);
        sb.append(", busiTypeName=").append(busiTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}