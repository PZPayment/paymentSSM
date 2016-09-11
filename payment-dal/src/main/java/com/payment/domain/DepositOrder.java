package com.payment.domain;

import com.payment.comm.base.domain.AbstractEntity;

import java.io.Serializable;
import java.util.Date;

public class DepositOrder  extends AbstractEntity implements Serializable {
    private String depositNo;

    private Long depositAmount;

    private Short depositState;

    private Date createTime;

    private Date dealTime;

    private String payType;

    private String userId;

    private String outDepositNo;

    private Short depositFlag;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getDepositNo() {
        return depositNo;
    }

    public void setDepositNo(String depositNo) {
        this.depositNo = depositNo == null ? null : depositNo.trim();
    }

    public Long getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Long depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Short getDepositState() {
        return depositState;
    }

    public void setDepositState(Short depositState) {
        this.depositState = depositState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOutDepositNo() {
        return outDepositNo;
    }

    public void setOutDepositNo(String outDepositNo) {
        this.outDepositNo = outDepositNo == null ? null : outDepositNo.trim();
    }

    public Short getDepositFlag() {
        return depositFlag;
    }

    public void setDepositFlag(Short depositFlag) {
        this.depositFlag = depositFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", depositNo=").append(depositNo);
        sb.append(", depositAmount=").append(depositAmount);
        sb.append(", depositState=").append(depositState);
        sb.append(", createTime=").append(createTime);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", payType=").append(payType);
        sb.append(", userId=").append(userId);
        sb.append(", outDepositNo=").append(outDepositNo);
        sb.append(", depositFlag=").append(depositFlag);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String getId() {
        return depositNo;
    }
}