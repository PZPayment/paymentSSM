package com.payment.trade.bo;

import com.payment.comm.base.bo.BaseApiBean;
import com.payment.comm.base.exception.PaymentException;

import java.math.BigDecimal;

/**
 * 包      名: com.payment.trade.bo  <br>
 * 描      述:                       <br>
 * 创 建 人 : kan <br>
 */
public class PayBO extends BaseApiBean {

    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 金额
     */
    private BigDecimal amount;
    /**
     * 银行编号
     */
    private String bankCode;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 银行备注
     */
    private String bankRemark;



    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public boolean validate() throws PaymentException {
        checkField(orderNo);
        checkField(goodsName);
        checkField(amount);
        checkField(bankCode);
        return true;
    }

    @Override
    public void formatAmount() {
        super.formatAmount();
    }
}
