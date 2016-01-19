package com.payment.trade.service;

import com.payment.generator.domain.PayTradeOrder;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.payment.trade.service  <br>
 * 描      述:  订单相关操作   <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/19      <br>
 */
public interface TradeOrderService  {

    PayTradeOrder selectByPrimaryKey(String tradeNo);

    PayTradeOrder create(PayTradeOrder tradeOrder);

}
