package com.payment.trade;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.errorCode.BaseErrorCode;
import com.payment.trade.bo.*;
import com.payment.trade.bo.payMethod.PayMethod;
import com.payment.trade.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 包      名: com.kan.trade.payment  <br>
 * 描      述: 交易
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/28
 */
@Service
public class PaymentProviderImpl implements PaymentProvider {

  @Autowired
    PaymentService paymentService;


    @Override
    public PaymentResultBO realTimePayment(PaymentBO paymentBO, PayMethod payMethod) throws PaymentException {
        return this.payment(paymentBO,payMethod,true);
    }

    @Override
    public PaymentResultBO guaranteePayment(PaymentBO paymentBO, PayMethod payMethod) throws PaymentException {

        return this.payment(paymentBO,payMethod,false);
    }

    public PaymentResultBO payment(PaymentBO paymentBO, PayMethod payMethod, boolean settleType) throws PaymentException {
        //判断空参数
        if (null == paymentBO || null == payMethod) {
            throw new PaymentException(BaseErrorCode.ARGS_IS_NULL);
        }
        //判断bean数据合法性
        paymentBO.validate();
        payMethod.validate();
        //格式化金额
        paymentBO.formatAmount();
        payMethod.formatAmount();
        return paymentService.payment(paymentBO,payMethod,settleType);
    }

    /**
     * 交易退款
     *
     * @param refundBO
     * @return
     * @throws Exception
     */
    public RefundResultBO refund(RefundBO refundBO) throws PaymentException {
        //判断空参数
        if (null == refundBO) {
            throw new PaymentException(BaseErrorCode.ARGS_IS_NULL);
        }
        //判断bean数据合法性
        refundBO.validate();
        //格式化金额
        refundBO.validate();
        return paymentService.refund(refundBO);
    }


    /**
     * 转账方法
     *
     * @param transferBO
     * @return
     * @throws Exception
     */
    public TransferResultBO transfer(TransferBO transferBO) throws Exception {
        TransferResultBO transferResultBO = new TransferResultBO();
        return transferResultBO;
    }
}
