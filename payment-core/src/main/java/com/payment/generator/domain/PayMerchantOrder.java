package com.payment.generator.domain;

import java.io.Serializable;
import java.util.Date;

public class PayMerchantOrder implements Serializable {
    private String payNo;

    private String outTradeNo;

    private String gateOrderNo;

    private String bankOrderNo;

    private Date createdTime;

    private Date expDate;

    private Date dealTime;

    private Date callbackTime;

    private Long payAmount;

    private Long commission;

    private Long realAmount;

    private Short tradeState;

    private Short callbackState;

    private Short refundState;

    private Long refundAmount;

    private String bankCode;

    private String bankName;

    private String payIp;

    private String callbackUrl;

    private String nontifyUrl;

    private String checkNo;

    private String tradeNo;

    private Date refundTime;

    private String payUserId;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getGateOrderNo() {
        return gateOrderNo;
    }

    public void setGateOrderNo(String gateOrderNo) {
        this.gateOrderNo = gateOrderNo == null ? null : gateOrderNo.trim();
    }

    public String getBankOrderNo() {
        return bankOrderNo;
    }

    public void setBankOrderNo(String bankOrderNo) {
        this.bankOrderNo = bankOrderNo == null ? null : bankOrderNo.trim();
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

    public Date getCallbackTime() {
        return callbackTime;
    }

    public void setCallbackTime(Date callbackTime) {
        this.callbackTime = callbackTime;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public Long getCommission() {
        return commission;
    }

    public void setCommission(Long commission) {
        this.commission = commission;
    }

    public Long getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Long realAmount) {
        this.realAmount = realAmount;
    }

    public Short getTradeState() {
        return tradeState;
    }

    public void setTradeState(Short tradeState) {
        this.tradeState = tradeState;
    }

    public Short getCallbackState() {
        return callbackState;
    }

    public void setCallbackState(Short callbackState) {
        this.callbackState = callbackState;
    }

    public Short getRefundState() {
        return refundState;
    }

    public void setRefundState(Short refundState) {
        this.refundState = refundState;
    }

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getPayIp() {
        return payIp;
    }

    public void setPayIp(String payIp) {
        this.payIp = payIp == null ? null : payIp.trim();
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl == null ? null : callbackUrl.trim();
    }

    public String getNontifyUrl() {
        return nontifyUrl;
    }

    public void setNontifyUrl(String nontifyUrl) {
        this.nontifyUrl = nontifyUrl == null ? null : nontifyUrl.trim();
    }

    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo == null ? null : checkNo.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public String getPayUserId() {
        return payUserId;
    }

    public void setPayUserId(String payUserId) {
        this.payUserId = payUserId == null ? null : payUserId.trim();
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
        sb.append(", payNo=").append(payNo);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", gateOrderNo=").append(gateOrderNo);
        sb.append(", bankOrderNo=").append(bankOrderNo);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", expDate=").append(expDate);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", callbackTime=").append(callbackTime);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", commission=").append(commission);
        sb.append(", realAmount=").append(realAmount);
        sb.append(", tradeState=").append(tradeState);
        sb.append(", callbackState=").append(callbackState);
        sb.append(", refundState=").append(refundState);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", payIp=").append(payIp);
        sb.append(", callbackUrl=").append(callbackUrl);
        sb.append(", nontifyUrl=").append(nontifyUrl);
        sb.append(", checkNo=").append(checkNo);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", refundTime=").append(refundTime);
        sb.append(", payUserId=").append(payUserId);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}