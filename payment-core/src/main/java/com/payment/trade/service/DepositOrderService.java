package com.payment.trade.service;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.base.service.BaseService;
import com.payment.domain.DepositOrder;
import com.payment.domain.DepositOrderCriteria;

/**
 * 包      名: com.payment.trade.service  <br>
 * 描      述:  充值单操作                     <br>
 * 创 建 人 : kan <br>
 */
public interface DepositOrderService extends BaseService<DepositOrder,DepositOrderCriteria> {
    /**
     * 函数功能：充值单号，规则M+数据库时间(yymmdd)+8位序列seq_pay_tradeno
     *
     * @return String
     */
    String generateChargeNo();

    void modifyPayChargeOrderState(DepositOrder payChargeOrder, Short chargeOrderStateDone) throws PaymentException;
}
