package com.payment.trade.bo;

import lombok.Data;

import java.math.BigDecimal;

/**
 *  交易请求BO
 * Created by fangchao on 15/12/24.
 */
@Data
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



}
