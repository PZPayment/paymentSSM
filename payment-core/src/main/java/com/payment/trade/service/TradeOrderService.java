package com.payment.trade.service;

import com.payment.comm.base.service.BaseService;
import com.payment.generator.domain.PayTradeOrder;
import com.payment.generator.domain.PayTradeOrderCriteria;

/**
 *
 * 包      名: com.payment.trade.service  <br>
 * 描      述:  订单相关操作
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/19
 */
public interface TradeOrderService extends BaseService<PayTradeOrder,PayTradeOrderCriteria> {


    String generateTradeNo();
}
