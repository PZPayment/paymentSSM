package com.payment.trade;

import com.payment.comm.base.exception.PaymentException;
import com.payment.trade.bo.*;

/**
 *
 * 包      名: com.kan.trade.payment  <br>
 * 描      述: 交易
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/28
 */
public interface PaymentProvider {

    /**
     * 订单实时支付
     *
     * @param paymentBO
     * @return
     * @throws Exception
     */
     PaymentResultBO realTimePayment(PaymentBO paymentBO) throws PaymentException;

    /**
     * 订单担保支付
     *
     * @param paymentBO
     * @return
     * @throws Exception
     */
    PaymentResultBO guaranteePayment(PaymentBO paymentBO) throws PaymentException;

    /**
     * 交易退款
     *
     * @param refundBO
     * @return
     * @throws Exception
     */
     RefundResultBO refund(RefundBO refundBO) throws PaymentException;


}
