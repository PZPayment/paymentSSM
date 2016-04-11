package com.payment.trade.service;

import com.payment.comm.base.exception.PaymentException;
import com.payment.trade.bo.PaymentBO;
import com.payment.trade.bo.PaymentResultBO;
import com.payment.trade.bo.RefundBO;
import com.payment.trade.bo.RefundResultBO;

/**
 * 包      名: com.payment.trade.service  <br>
 * 描      述:   支付逻辑实现                    <br>
 * 创 建 人 : kan <br>
 */
public interface PaymentService {

    PaymentResultBO payment(PaymentBO paymentBO) throws PaymentException;

    boolean paymentSettle(PaymentBO paymentBO) throws PaymentException;

    RefundResultBO refund(RefundBO refundBO) throws PaymentException;
}
