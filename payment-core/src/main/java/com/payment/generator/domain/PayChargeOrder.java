package com.payment.generator.domain;

import com.payment.comm.base.domain.AbstractEntity;

import java.io.Serializable;
import java.util.Date;

public class PayChargeOrder extends AbstractEntity implements Serializable {

    private String chargeNo;

    private Long chargeAmount;

    private Short chargeState;

    private Date chargeTime;

    private Date dealTime;

    private String userId;

    private String outChargeNo;

    private Short payFlag;

    private String remark;

    private String payType;
    private static final long serialVersionUID = 1L;

    public String getChargeNo() {
        return chargeNo;
    }

    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo == null ? null : chargeNo.trim();
    }

    public Long getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Long chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public Short getChargeState() {
        return chargeState;
    }

    public void setChargeState(Short chargeState) {
        this.chargeState = chargeState;
    }

    public Date getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(Date chargeTime) {
        this.chargeTime = chargeTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOutChargeNo() {
        return outChargeNo;
    }

    public void setOutChargeNo(String outChargeNo) {
        this.outChargeNo = outChargeNo == null ? null : outChargeNo.trim();
    }

    public Short getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(Short payFlag) {
        this.payFlag = payFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chargeNo=").append(chargeNo);
        sb.append(", chargeAmount=").append(chargeAmount);
        sb.append(", chargeState=").append(chargeState);
        sb.append(", chargeTime=").append(chargeTime);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", userId=").append(userId);
        sb.append(", outChargeNo=").append(outChargeNo);
        sb.append(", payFlag=").append(payFlag);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String getId() {
        return chargeNo;
    }
}