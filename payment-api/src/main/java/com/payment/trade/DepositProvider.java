package com.payment.trade;

import com.payment.comm.base.exception.PaymentException;
import com.payment.trade.bo.DepositBO;
import com.payment.trade.bo.payMethod.PayMethod;

/**
 * 包      名: com.payment.trade  <br>
 * 描      述:  充值 <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/4/9      <br>
 */
public interface DepositProvider {
    /**
     * 用户充值接口
     *
     * @param depositBO
     * @param payMethod
     * @return 返回充值订单号
     * @throws PaymentException
     * @author kan
     */
    String createDeposit(DepositBO depositBO,PayMethod payMethod) throws PaymentException;


    //DelayChargeResultBO depositNotify(DepositNotifyBO depositNotifyBO) throws PaymentException ;


}
