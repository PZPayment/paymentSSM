package com.payment.trade;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.constants.EnumFundsType;
import com.payment.comm.constants.EnumTransferType;
import com.payment.comm.constants.SystemConstants;
import com.payment.comm.errorCode.BaseErrorCode;
import com.payment.comm.utils.MoneyUtils;
import com.payment.generator.domain.AcctUser;
import com.payment.generator.domain.PayTradeOrder;
import com.payment.trade.bo.*;
import com.payment.trade.bo.payMethod.PayMethod;
import com.payment.trade.service.PaymentService;
import com.payment.trade.service.TradeOrderService;
import com.payment.trade.service.TransferService;
import com.payment.trade.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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

        paymentService.payment(paymentBO,payMethod);


        return null;
    }

    @Override
    public PaymentResultBO guaranteePayment(PaymentBO paymentBO, PayMethod payMethodBO) throws PaymentException {
        return null;
    }

    /**
     * 交易退款
     *
     * @param refundBO
     * @return
     * @throws Exception
     */
    public RefundResultBO refund(RefundBO refundBO) throws PaymentException {
        RefundResultBO refundResultBO = new RefundResultBO();

        return refundResultBO;
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
