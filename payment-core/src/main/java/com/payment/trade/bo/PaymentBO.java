package com.payment.trade.bo;

import java.math.BigDecimal;

/**
 *  交易请求BO
 * Created by fangchao on 15/12/24.
 */
public class PaymentBO {

    /**
     * 订单号，业务系统订单号(外部订单号)
     *  必传
     */
    private String orderNo;
    /**
     * 付款方用户标识
     * 必传
     */
    private String buyerUserId;

    /**
     * 收款方用户标识
     * 必传
     */
    private String sellerUserId;
    /**
     * 支付金额
     * 必传
     */
    private BigDecimal paymount;

    /**
     * 支付方式
     */
    private String PayType;

    /**
     * 银行编号
     */
    private String bankCode;

    /**
     * 回调地址
     */
    private String callBackUrl;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public BigDecimal getPaymount() {
        return paymount;
    }

    public void setPaymount(BigDecimal paymount) {
        this.paymount = paymount;
    }

    public String getPayType() {
        return PayType;
    }

    public void setPayType(String payType) {
        PayType = payType;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }
}
