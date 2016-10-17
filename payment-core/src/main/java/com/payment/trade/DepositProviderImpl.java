package com.payment.trade;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.constants.SystemConstants;
import com.payment.comm.constants.TradeConstants;
import com.payment.trade.bo.DepositBO;
import com.payment.trade.bo.payMethod.PayMethod;
import com.payment.trade.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 包      名: com.payment.trade  <br>
 * 描      述:  充值 <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/4/9      <br>
 */
public class DepositProviderImpl implements DepositProvider {

    @Autowired
    private DepositService depositService;

    /**
     * 用户充值接口
     *
     * @param depositBO
     * @param payMethod
     * @return 返回充值订单号
     * @throws PaymentException
     * @author kan
     */
    public String createDeposit(DepositBO depositBO, PayMethod payMethod) throws PaymentException {
        depositBO.validate();
        payMethod.validate();
        depositBO.formatAmount();
        payMethod.formatAmount();
        return depositService.createDeposit(depositBO, payMethod, TradeConstants.CHARGE_TYPE_RECHARGE);
    }


}
