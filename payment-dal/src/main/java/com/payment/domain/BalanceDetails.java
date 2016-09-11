package com.payment.domain;

import com.payment.comm.base.domain.AbstractEntity;

import java.io.Serializable;
import java.util.Date;

public class BalanceDetails  extends AbstractEntity implements Serializable {
    private String detailsId;

    private Integer tradeTypeId;

    private String userId;

    private Date createTime;

    private Long payoutAmount;

    private Long incomeAmount;

    private Long balance;

    private String outOrderNo;

    private String orderNo;

    private String detailsName;

    private String detailsDesc;

    private Short inOutType;

    private Integer busiTypeId;

    private String busiTypeName;

    private static final long serialVersionUID = 1L;

    public String getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId == null ? null : detailsId.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getDetailsName() {
        return detailsName;
    }

    public void setDetailsName(String detailsName) {
        this.detailsName = detailsName == null ? null : detailsName.trim();
    }

    public String getDetailsDesc() {
        return detailsDesc;
    }

    public void setDetailsDesc(String detailsDesc) {
        this.detailsDesc = detailsDesc == null ? null : detailsDesc.trim();
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
        sb.append(", detailsId=").append(detailsId);
        sb.append(", tradeTypeId=").append(tradeTypeId);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", payoutAmount=").append(payoutAmount);
        sb.append(", incomeAmount=").append(incomeAmount);
        sb.append(", balance=").append(balance);
        sb.append(", outOrderNo=").append(outOrderNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", detailsName=").append(detailsName);
        sb.append(", detailsDesc=").append(detailsDesc);
        sb.append(", inOutType=").append(inOutType);
        sb.append(", busiTypeId=").append(busiTypeId);
        sb.append(", busiTypeName=").append(busiTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String getId() {
        return detailsId;
    }
}