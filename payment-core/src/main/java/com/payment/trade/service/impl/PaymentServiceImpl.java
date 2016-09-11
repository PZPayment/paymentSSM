package com.payment.trade.service.impl;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.constants.EnumFundsType;
import com.payment.comm.constants.EnumTransferType;
import com.payment.comm.constants.SystemConstants;
import com.payment.comm.constants.TradeConstants;
import com.payment.comm.errorCode.TradeErrorCode;
import com.payment.domain.PaymentOrder;
import com.payment.domain.User;
import com.payment.trade.bo.*;
import com.payment.trade.bo.payMethod.PayMethod;
import com.payment.trade.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);

    @Autowired
    PaymentOrderService paymentOrderService;

    @Autowired
    TransferService transferService;

    @Autowired
    UserService userService;

    @Autowired
    DepositService depositService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public PaymentResultBO payment(PaymentBO paymentBO, PayMethod payMethod, boolean settleType) throws PaymentException {
        PaymentResultBO paymentResultBO = new PaymentResultBO();

        PaymentOrder paymentOrder = paymentOrderService.findOneByOutTradeNo(paymentBO.getOrderNo());

        //2个人
        User payUser = userService.findUser(paymentBO.getBuyerUserId());
        User sellerUser = userService.findUser(paymentBO.getSellerUserId());

        //判断2个人
        if (payUser == null) {
            throw new PaymentException("支付人信息有误");
        }

        if (sellerUser == null) {
            throw new PaymentException("收款信息有误");
        }

        if (paymentOrder == null) {
            //封装支付单信息
            paymentOrder = new PaymentOrder();
            paymentOrder.setPaymentUserId(paymentBO.getBuyerUserId());
            paymentOrder.setSellerUserId(paymentBO.getSellerUserId());
            paymentOrder.setPaymentNo(paymentOrderService.generateTradeNo());
            paymentOrder.setOutPaymentNo(paymentBO.getOrderNo());
            paymentOrder.setPaymentAmount(payMethod.getAmount().longValue());
            paymentOrder.setSettleType(settleType ? "R" : "G");
            paymentOrder.setCallBackUrl(paymentBO.getCallBackUrl());
            paymentOrder.setPaymentState(TradeConstants.TRADE_ORDER_STATE_INIT);
            paymentOrder.setRefundState(TradeConstants.REFUND_STATE_UNREFUND);
            paymentOrder.setSettleState(TradeConstants.TRADE_ORDER_STATE_INIT);
            paymentOrder.setPayType(payMethod.getPayType().getPayTypeId());
            paymentOrder.setGateCode(payMethod.getBankCode());
            //新增支付单
            paymentOrder = paymentOrderService.create(paymentOrder);
        }
        //判断时候是后支付
        if (!payMethod.getPayType().isRealTime()) {
            //封装充值信息
            DepositBO depositBO = new DepositBO();
            depositBO.setOrderNo(paymentOrder.getPaymentNo());
            depositBO.setUserId(paymentBO.getBuyerUserId());
            depositBO.setAmount(payMethod.getAmount());
            //生成充值
            //返回
            paymentResultBO.setTradeNo(depositService.createDeposit(depositBO, payMethod, TradeConstants.CHARGE_TYPE_PAYMENT));
            paymentResultBO.setResultCode(SystemConstants.RESULT_CODE_SUCCESS);
            return paymentResultBO;
        }
        //支付扣款
        TransferBO transferBO = new TransferBO();
        transferBO.setFromUser(payUser);
        if (settleType) {
            transferBO.setToUser(sellerUser);
            transferBO.setTransferType(EnumTransferType.GENERALTRANSFER);
        } else {
            //收款人为担保人 平台担保
            transferBO.setToUser(userService.findUser("AXXXXX"));
            transferBO.setTransferType(EnumTransferType.GUARANTEECONSUMER);
        }
        transferBO.setFromAmount(payMethod.getAmount().longValue());
        transferBO.setToAmount(paymentBO.getSettleAmount().longValue());
        FundsRecordBO fundsRecordBO = new FundsRecordBO();
        fundsRecordBO.setInFundsType(EnumFundsType.ORDER_SETTLE);
        fundsRecordBO.setOutFundsType(EnumFundsType.ORDER_CONSUMER);

        fundsRecordBO.setOptUser("system");
        fundsRecordBO.setOptUserName("system");
        fundsRecordBO.setOrderNo(paymentOrder.getPaymentNo());
        fundsRecordBO.setOutOrderNo(paymentOrder.getOutPaymentNo());
        fundsRecordBO.setRefundDesc("订单支付 单号:" + paymentOrder.getOutPaymentNo());
        transferService.acctTransfer(transferBO, fundsRecordBO);

        paymentOrderService.modifyPayTradeOrderState(paymentOrder, TradeConstants.TRADE_ORDER_STATE_DONE, null, null);
        return paymentResultBO;
    }

    @Override
    public boolean paymentSettle(PaymentBO paymentBO) throws PaymentException {

        PaymentOrder paymentOrder = this.paymentOrderService.findOneByOutTradeNo(paymentBO.getOrderNo());

        if (paymentOrder == null) {
            logger.error("担保交易结算，交易订单不存在：outTradeNo={}", paymentBO.getOrderNo());
            throw new PaymentException(TradeErrorCode.TRADE_ORDER_NOT_EXISTS);
        }
        logger.info("担保交易结算，交易订单查询：tradeOrder={}", paymentOrder.getPaymentNo());

        if (TradeConstants.TRADE_ORDER_STATE_DONE != paymentOrder.getPaymentState()) {
            logger.error("担保交易结算，交易订单未支付：tradeOrder={}", paymentOrder);
            throw new PaymentException(TradeErrorCode.TRADE_ORDER_PAY_FAIL);
        }

        if (TradeConstants.TRADE_ORDER_STATE_DONE == paymentOrder.getSettleState()) {
            logger.warn("担保交易结算，交易订单已结算：tradeOrder={}", paymentOrder);
            return true;
        }
        //订单结算
        TransferBO transferBO = new TransferBO();

        transferBO.setFromUser(userService.findUser("AXXXXX"));
        transferBO.setToUser(userService.findUser(paymentOrder.getSellerUserId()));

        transferBO.setFromAmount(paymentOrder.getPaymentAmount());
        transferBO.setToAmount(paymentOrder.getPaymentAmount());
        transferBO.setTransferType(EnumTransferType.GUARANTEECONSUMER);

        FundsRecordBO fundsRecordBO = new FundsRecordBO();
        fundsRecordBO.setInFundsType(EnumFundsType.ORDER_SETTLE);
        fundsRecordBO.setOutFundsType(EnumFundsType.ORDER_CONSUMER);

        fundsRecordBO.setOptUser("system");
        fundsRecordBO.setOptUserName("system");
        fundsRecordBO.setOrderNo(paymentOrder.getPaymentNo());
        fundsRecordBO.setOutOrderNo(paymentOrder.getOutPaymentNo());
        fundsRecordBO.setRefundDesc("订单结算 单号:" + paymentOrder.getOutPaymentNo());
        transferService.acctTransfer(transferBO, fundsRecordBO);

        //修改结算状态
        paymentOrderService.modifyPayTradeOrderState(paymentOrder, null,TradeConstants.TRADE_ORDER_STATE_DONE,null);
        return true;
    }

    @Override
    public RefundResultBO refund(RefundBO refundBO) throws PaymentException {
        PaymentOrder paymentOrder = this.paymentOrderService.findOneByOutTradeNo(refundBO.getOrderNo());

        if (paymentOrder == null) {
            logger.error("担保交易结算，交易订单不存在：outTradeNo={}", refundBO.getOrderNo());
            throw new PaymentException(TradeErrorCode.TRADE_ORDER_NOT_EXISTS);
        }
        logger.info("担保交易结算，交易订单查询：tradeOrder={}", paymentOrder.getPaymentNo());

        if (TradeConstants.TRADE_ORDER_STATE_DONE != paymentOrder.getPaymentState()) {
            logger.error("担保交易结算，交易订单未支付：tradeOrder={}", paymentOrder);
            throw new PaymentException(TradeErrorCode.TRADE_ORDER_PAY_FAIL);
        }

        if (TradeConstants.TRADE_ORDER_STATE_DONE == paymentOrder.getSettleState()) {
            logger.warn("担保交易结算，交易订单已结算：tradeOrder={}", paymentOrder);
            return new RefundResultBO();
        }
        //2个人
        User payUser = userService.findUser(paymentOrder.getPaymentUserId());
        User sellerUser = userService.findUser(paymentOrder.getSellerUserId());

        //支付扣款
        TransferBO transferBO = new TransferBO();
        transferBO.setFromUser(payUser);
        transferBO.setToUser(sellerUser);
        transferBO.setTransferType(EnumTransferType.GENERALTRANSFER);

        transferBO.setFromAmount(paymentOrder.getPaymentAmount());
        transferBO.setToAmount(paymentOrder.getPaymentAmount());

        FundsRecordBO fundsRecordBO = new FundsRecordBO();

        fundsRecordBO.setInFundsType(EnumFundsType.ORDER_CANCEL_REFUND);
        fundsRecordBO.setOutFundsType(EnumFundsType.ORDER_CANCEL_BACK_SALE);

        fundsRecordBO.setOptUser("system");
        fundsRecordBO.setOptUserName("system");
        fundsRecordBO.setOrderNo(paymentOrder.getPaymentNo());
        fundsRecordBO.setOutOrderNo(paymentOrder.getOutPaymentNo());
        fundsRecordBO.setRefundDesc("订单退款 单号:" + paymentOrder.getOutPaymentNo());
        transferService.acctTransfer(transferBO, fundsRecordBO);

        //修改退款状态
        paymentOrderService.modifyPayTradeOrderState(paymentOrder, null,null,TradeConstants.TRADE_ORDER_STATE_DONE);
        return new RefundResultBO();
    }
}
