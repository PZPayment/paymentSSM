package com.payment.trade.service.impl;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.constants.EnumFundsType;
import com.payment.comm.constants.EnumTransferType;
import com.payment.comm.constants.SystemConstants;
import com.payment.comm.constants.TradeConstants;
import com.payment.comm.utils.MoneyUtils;
import com.payment.generator.domain.AcctUser;
import com.payment.generator.domain.PayTradeOrder;
import com.payment.trade.bo.*;
import com.payment.trade.bo.payMethod.PayMethod;
import com.payment.trade.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:   支付逻辑实现                     <br>
 * 创 建 人 : kan <br>
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    TradeOrderService tradeOrderService;

    @Autowired
    TransferService transferService;

    @Autowired
    UserService userService;

    @Autowired
    DepositService depositService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public PaymentResultBO payment(PaymentBO paymentBO, PayMethod payMethod) throws PaymentException {
        PaymentResultBO paymentResultBO = new PaymentResultBO();

        PayTradeOrder tradeOrder =  tradeOrderService.findOneByOutTradeNo(paymentBO.getOrderNo());

        //2个人
        AcctUser payUser = userService.findUser(paymentBO.getBuyerUserId());
        AcctUser sellerUser = userService.findUser(paymentBO.getSellerUserId());

        //判断2个人
        if (payUser == null) {
            throw new PaymentException("支付人信息有误");
        }

        if (sellerUser == null) {
            throw new PaymentException("收款信息有误");
        }

        if (tradeOrder == null) {
            //封装支付单信息
            tradeOrder = new PayTradeOrder();
            tradeOrder.setPayUserId(paymentBO.getBuyerUserId());
            tradeOrder.setSellerUserId(paymentBO.getSellerUserId());
            tradeOrder.setTradeNo(tradeOrderService.generateTradeNo());
            tradeOrder.setOutTradeNo(paymentBO.getOrderNo());
            tradeOrder.setPayAmount(payMethod.getAmount().longValue());
            tradeOrder.setSettleAmount(paymentBO.getSettleAmount().longValue());
            tradeOrder.setCallBackUrl(paymentBO.getCallBackUrl());
            //新增支付单
            tradeOrder = tradeOrderService.create(tradeOrder);
        }
        //判断时候是后支付
        if (isHou(paymentBO)) {
            //封装充值信息
            DepositBO depositBO = new DepositBO();
            depositBO.setOrderNo(tradeOrder.getTradeNo());
            depositBO.setUserId(paymentBO.getBuyerUserId());
            depositBO.setAmount(payMethod.getAmount());
            //生成充值
            depositService.createDeposit(depositBO,payMethod, TradeConstants.CHARGE_TYPE_PAYMENT);
            //返回
            paymentResultBO.setTradeNo("");
            paymentResultBO.setResultCode(SystemConstants.RESULT_CODE_SUCCESS);
            return paymentResultBO;
        }
        //支付扣款
        TransferBO transferBO = new TransferBO();
        transferBO.setFromUser(payUser);
        transferBO.setToUser(sellerUser);
        transferBO.setFromAmount(MoneyUtils.yuanTosysUnit(payMethod.getAmount()));
        transferBO.setToAmount(MoneyUtils.yuanTosysUnit(paymentBO.getSettleAmount()));
        transferBO.setTransferType(EnumTransferType.GENERALTRANSFER);
        FundsRecordBO fundsRecordBO = new FundsRecordBO();
        fundsRecordBO.setInFundsType(EnumFundsType.ORDER_SETTLE);
        fundsRecordBO.setInFundsType(EnumFundsType.ORDER_CONSUMER);

        fundsRecordBO.setOptUser("system");
        fundsRecordBO.setOptUserName("system");
        fundsRecordBO.setOrderNo(tradeOrder.getTradeNo());
        fundsRecordBO.setOutOrderNo(tradeOrder.getOutTradeNo());
        fundsRecordBO.setRefundDesc("订单支付 单号:" + tradeOrder.getOutTradeNo());
        transferService.acctTransfer(transferBO, fundsRecordBO);

        return paymentResultBO;
    }

    private boolean isHou(PaymentBO paymentBO) {
        return false;
    }

    @Override
    public boolean paymentSettle(PaymentBO paymentBO) throws PaymentException {
        return false;
    }

    @Override
    public RefundResultBO refund(RefundBO refundBO) throws PaymentException {
        return null;
    }
}
