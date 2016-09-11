package com.payment.trade.service;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.base.service.BaseService;
import com.payment.domain.PayOrder;
import com.payment.domain.PayOrderCriteria;
import com.payment.trade.bo.PayBO;

/**
 * 包      名: com.payment.trade.service  <br>
 * 描      述: 支付网关单处理                      <br>
 * 创 建 人 : kan <br>
 */
public interface PayOrderService extends BaseService<PayOrder,PayOrderCriteria> {

    /**
     * 生成网关单编号
     * @return
     */
    String generatePayNo();
    /**
     * 生成网关单
     *
     * @param payBO 网关数据
     * @return 返回充值订单号
     * @throws PaymentException
     * @author kan
     */
    PayOrder createPayOrder(PayBO payBO) throws PaymentException;
}
