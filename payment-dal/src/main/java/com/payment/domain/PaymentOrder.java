package com.payment.domain;

import com.payment.comm.base.domain.AbstractEntity;

import java.io.Serializable;
import java.util.Date;

public  class PaymentOrder   extends AbstractEntity implements Serializable {
    private String paymentNo;

    private String outPaymentNo;

    private Date createTime;

    private Date expDate;

    private Date dealTime;

    private Long paymentAmount;

    private Long refundAmount;

    private Short paymentState;

    private Short refundState;

    private Short settleState;

    private String settleType;

    private String paymentIp;

    private String remark;

    private String paymentUserId;

    private String sellerUserId;

    private String payType;

    private String gateCode;

    private String callBackUrl;

    private String notifyUrl;

    private static final long serialVersionUID = 1L;

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo == null ? null : paymentNo.trim();
    }

    public String getOutPaymentNo() {
        return outPaymentNo;
    }

    public void setOutPaymentNo(String outPaymentNo) {
        this.outPaymentNo = outPaymentNo == null ? null : outPaymentNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public Long getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Long paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Short getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(Short paymentState) {
        this.paymentState = paymentState;
    }

    public Short getRefundState() {
        return refundState;
    }

    public void setRefundState(Short refundState) {
        this.refundState = refundState;
    }

    public Short getSettleState() {
        return settleState;
    }

    public void setSettleState(Short settleState) {
        this.settleState = settleState;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType == null ? null : settleType.trim();
    }

    public String getPaymentIp() {
        return paymentIp;
    }

    public void setPaymentIp(String paymentIp) {
        this.paymentIp = paymentIp == null ? null : paymentIp.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPaymentUserId() {
        return paymentUserId;
    }

    public void setPaymentUserId(String paymentUserId) {
        this.paymentUserId = paymentUserId == null ? null : paymentUserId.trim();
    }

    public String getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId == null ? null : sellerUserId.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getGateCode() {
        return gateCode;
    }

    public void setGateCode(String gateCode) {
        this.gateCode = gateCode == null ? null : gateCode.trim();
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl == null ? null : callBackUrl.trim();
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paymentNo=").append(paymentNo);
        sb.append(", outPaymentNo=").append(outPaymentNo);
        sb.append(", createTime=").append(createTime);
        sb.append(", expDate=").append(expDate);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", paymentAmount=").append(paymentAmount);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", paymentState=").append(paymentState);
        sb.append(", refundState=").append(refundState);
        sb.append(", settleState=").append(settleState);
        sb.append(", settleType=").append(settleType);
        sb.append(", paymentIp=").append(paymentIp);
        sb.append(", remark=").append(remark);
        sb.append(", paymentUserId=").append(paymentUserId);
        sb.append(", sellerUserId=").append(sellerUserId);
        sb.append(", payType=").append(payType);
        sb.append(", gateCode=").append(gateCode);
        sb.append(", callBackUrl=").append(callBackUrl);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String getId() {
        return paymentNo;
    }
}