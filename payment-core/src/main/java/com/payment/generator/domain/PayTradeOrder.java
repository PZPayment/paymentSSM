package com.payment.generator.domain;

import com.payment.comm.base.domain.AbstractEntity;

import java.io.Serializable;
import java.util.Date;

public class PayTradeOrder extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = -4673317001165812066L;
    /**
     * 支付单号
     */
    private String tradeNo;

    /**
     * 外部订单号
     */
    private String outTradeNo;

    /**
     * 生成时间
     */
    private Date createdTime;

    /**
     * 支付到期时间
     */
    private Date expDate;

    /**
     * 支付完成时间
     */
    private Date dealTime;

    /**
     * 买家用户编号
     */
    private String payUserId;

    /**
     * 卖家用户编号
     */
    private String sellerUserId;

    /**
     * 支付金额
     */
    private Long payAmount;

    /**
     * 结算金额
     */
    private Long settleAmount;

    /**
     * 退款金额
     */
    private Long refundAmount;
    /**
     * 退款结算金额
     */
    private Long settleRefundAmount;

    /**
     * 支付状态 0:未支付 1:已支付 2:订单关闭
     */
    private Short tradeState;

    /**
     * 支付状态 0:未退款 1:已退款 2:部分退款
     */
    private Short refundState;

    /**
     * 支付IP
     */
    private String payIp;

    /**
     * 备注
     */
    private String remark;



    /**
     * 回调地址
     */
    private String callBackUrl;

    /**
     * 通知时间
     */
    private String notifyUrl;

    /**
     * 支付方式
     * @return
     */
    private String payType;

    /**
     * 渠道编号
     * @return
     */
    private String gateCode;

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

    public String getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getGateCode() {
        return gateCode;
    }

    public void setGateCode(String gateCode) {
        this.gateCode = gateCode;
    }

    public Long getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(Long settleAmount) {
        this.settleAmount = settleAmount;
    }

    public Long getSettleRefundAmount() {
        return settleRefundAmount;
    }

    public void setSettleRefundAmount(Long settleRefundAmount) {
        this.settleRefundAmount = settleRefundAmount;
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

    public String getId() {
        return tradeNo;
    }
}