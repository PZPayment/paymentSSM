package com.payment.trade.service;

import com.payment.comm.base.service.BaseService;
import com.payment.generator.domain.PayChargeOrder;
import com.payment.generator.domain.PayChargeOrderCriteria;

/**
 * 包      名: com.payment.trade.service  <br>
 * 描      述:  充值单操作                     <br>
 * 创 建 人 : kan <br>
 */
public interface ChargeOrderService extends BaseService<PayChargeOrder,PayChargeOrderCriteria> {
    /**
     * 函数功能：充值单号，规则M+数据库时间(yymmdd)+8位序列seq_pay_tradeno
     *
     * @return String
     */
    String generateChargeNo();
}
