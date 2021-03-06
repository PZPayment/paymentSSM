package com.payment.trade.bo;

import com.payment.comm.base.bo.BaseApiBean;
import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.utils.MoneyUtils;
import org.apache.ibatis.ognl.OgnlOps;

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
     * 结算金额
     * 必传
     */
    private BigDecimal settleAmount;

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
        checkField(settleAmount);
       return true;
    }

    @Override
    public void formatAmount() {
        if (!isFormat()) {
            settleAmount = MoneyUtils.yuanTosysUnitP(settleAmount);
            setFormat(true);
        }
    }
    public BigDecimal getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(BigDecimal settleAmount) {
        this.settleAmount = settleAmount;
    }
}
