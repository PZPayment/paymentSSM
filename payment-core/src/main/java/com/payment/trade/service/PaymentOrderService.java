package com.payment.trade.service;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.base.service.BaseService;
import com.payment.domain.PaymentOrder;
import com.payment.domain.PaymentOrderCriteria;

/**
 *
 * 包      名: com.payment.trade.service  <br>
 * 描      述:  订单相关操作
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/19
 */
public interface PaymentOrderService extends BaseService<PaymentOrder,PaymentOrderCriteria> {


    String generateTradeNo();

    void modifyPayTradeOrderState(PaymentOrder payTradeOrder, Short payState,Short settleState,Short refundState) throws PaymentException;
}
