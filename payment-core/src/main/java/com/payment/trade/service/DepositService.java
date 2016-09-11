package com.payment.trade.service;

import com.payment.comm.base.exception.PaymentException;
import com.payment.trade.bo.DelayChargeResultBO;
import com.payment.trade.bo.DepositBO;
import com.payment.trade.bo.DepositNotifyBO;
import com.payment.trade.bo.payMethod.PayMethod;

/**
 * 包      名: com.payment.trade.service  <br>
 * 描      述:  充值操作具体实现                     <br>
 * 创 建 人 : kan <br>
 */
public interface DepositService {

    /**
     * 生成充值单
     *
     * @param depositBO 充值主体
     * @param payMethod 支付方式
     * @param rechargeType 充值类型 0:充值 1:在线支付充值
     * @return 返回充值订单号
     * @throws PaymentException
     * @author kan
     */
    String createDeposit(DepositBO depositBO, PayMethod payMethod, short rechargeType) throws PaymentException;

    /**
     * 支付系统成功通知核心交易处理
     *
     * @param depositNotifyBO 充值通知BO
     */
    DelayChargeResultBO depositNotify(DepositNotifyBO depositNotifyBO) throws PaymentException;

}
