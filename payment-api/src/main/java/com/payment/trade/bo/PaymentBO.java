package com.payment.trade.bo;

import com.payment.comm.base.bo.BaseApiBean;
import com.payment.comm.base.exception.PaymentException;

import java.math.BigDecimal;

/**
 *  交易请求BO
 */
public class PaymentBO extends BaseApiBean {

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
    private String payType;

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
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
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

    @Override
    public boolean validate() throws PaymentException {
        checkField(buyerUserId);
        checkField(sellerUserId);
        checkField(paymount);
        checkField(payType);
       return true;
    }

    @Override
    public void formatAmount() {
        super.formatAmount();
    }
}
