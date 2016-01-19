package com.payment.generator.domain;

import java.io.Serializable;
import java.util.Date;

public class PayTradeOrder implements Serializable {
    private String tradeNo;

    private String outTradeNo;

    private Date createdTime;

    private Date expDate;

    private Date dealTime;

    private Long payAmount;

    private Long refundAmount;

    private Short tradeState;

    private Short refundState;

    private String payIp;

    private String remark;

    private String payUserId;

    private String callBackUrl;

    private String notifyUrl;

    private static final long serialVersionUID = 1L;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Short getTradeState() {
        return tradeState;
    }

    public void setTradeState(Short tradeState) {
        this.tradeState = tradeState;
    }

    public Short getRefundState() {
        return refundState;
    }

    public void setRefundState(Short refundState) {
        this.refundState = refundState;
    }

    public String getPayIp() {
        return payIp;
    }

    public void setPayIp(String payIp) {
        this.payIp = payIp == null ? null : payIp.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPayUserId() {
        return payUserId;
    }

    public void setPayUserId(String payUserId) {
        this.payUserId = payUserId == null ? null : payUserId.trim();
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
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", expDate=").append(expDate);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", tradeState=").append(tradeState);
        sb.append(", refundState=").append(refundState);
        sb.append(", payIp=").append(payIp);
        sb.append(", remark=").append(remark);
        sb.append(", payUserId=").append(payUserId);
        sb.append(", callBackUrl=").append(callBackUrl);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}