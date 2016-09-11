package com.payment.trade.service.impl;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.constants.EnumFundsType;
import com.payment.comm.constants.EnumPayType;
import com.payment.comm.constants.EnumTransferType;
import com.payment.comm.constants.TradeConstants;
import com.payment.comm.errorCode.TradeErrorCode;
import com.payment.domain.DepositOrder;
import com.payment.domain.User;
import com.payment.trade.bo.*;
import com.payment.trade.bo.payMethod.PayMethod;
import com.payment.trade.service.DepositOrderService;
import com.payment.trade.service.DepositService;
import com.payment.trade.service.TransferService;
import com.payment.trade.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:                       <br>
 * 创 建 人 : kan <br>
 */
@Service
public class DepositServiceImpl implements DepositService {

    private final static Logger logger = LoggerFactory.getLogger(DepositServiceImpl.class);

    @Autowired
    DepositOrderService depositOrderService;

    @Autowired
    UserService userService;

    @Autowired
    TransferService transferService;

    @Override
    public String createDeposit(DepositBO depositBO, PayMethod payMethod, short payFlag) throws PaymentException {
        // 参数非法性验证
        if (null == depositBO || !depositBO.validate() || !payMethod.validate()) {
            logger.warn("账本充值,acctDepositBO={},充值方式={}", depositBO, payMethod);
            throw new PaymentException(TradeErrorCode.ARGS_IS_NULL);
        }

        // 校验充值单是否未成功，已成功则抛出异常
        DepositOrder depositOrder = depositOrderService.findOneByOutTradeNo(depositBO.getOrderNo());
        if (depositOrder != null && TradeConstants.CHARGE_ORDER_STATE_DONE.equals(depositOrder.getDepositState())) {
            logger.warn("充值订单生成失败，充值已成功：outNo={},No={},State={}", depositOrder.getOutDepositNo(), depositOrder.getDepositNo(), depositOrder.getDepositState());
            throw new PaymentException(TradeErrorCode.CHARGE_ORDER_HAS_DONE);
        }

        // 生成充值订单
        depositOrder = new DepositOrder();
        depositOrder.setDepositNo(depositOrderService.generateChargeNo());
        depositOrder.setCreateTime(new Date()); // 充值时间
        depositOrder.setUserId(depositBO.getUserId()); // 充值用户标识
        depositOrder.setDepositAmount(payMethod.getAmount().longValue()); // 充值金额
        depositOrder.setDepositState(TradeConstants.CHARGE_ORDER_STATE_INIT); // 充值状态
        depositOrder.setOutDepositNo(depositBO.getOrderNo()); // 外部单号
        depositOrder.setDepositFlag(payFlag);
        depositOrder.setPayType(payMethod.getPayType().getPayTypeId());
        // 不校验充值定单唯一性，重新生成一笔充值单
        depositOrder = this.depositOrderService.create(depositOrder);

        return depositOrder.getDepositNo();
    }

    @Override
    public DelayChargeResultBO depositNotify(DepositNotifyBO depositNotifyBO) throws PaymentException {
        DelayChargeResultBO delayChargeResultBO = new DelayChargeResultBO();
        //获取充值单
        DepositOrder depositOrder = depositOrderService.findOne(depositNotifyBO.getChargeNo());
        ;

        //验证充值单
        if (null == depositOrder || !TradeConstants.CHARGE_ORDER_STATE_INIT.equals(depositOrder.getDepositState())) {
            //为空或者已经非初始状态 流程结束
            logger.warn("验证充值单失败,充值单为空或状态非初始 状态={}", null == depositOrder ? "null" : depositOrder.getDepositState());
            delayChargeResultBO.setCharge(true);
            return delayChargeResultBO;
        }
        if (depositNotifyBO.isSuccess()) {
            //充值(实时和非实时)
            if (!depositNotifyBO.isDelay()) {
                //实时充值
                logger.info("实时充值, chargeNo = {}", depositOrder.getDepositNo());
                charge(depositOrder);
                delayChargeResultBO.setCharge(true);
            } else {
                //非实时充值
                logger.info("非实时充值, chargeNo = {}", depositOrder.getDepositNo());
                //delayCharge(payChargeOrder, depositNotifyBO.getDealTime(), depositNotifyBO.isChargeCheck());
            }
        } else {
            //更新充值单为失败状态
            depositOrderService.modifyPayChargeOrderState(depositOrder, TradeConstants.CHARGE_ORDER_STATE_DONE);
            logger.info("更新充值单为失败状态, chargeNo = {}", depositOrder.getDepositNo());
        }

        //判断是否触发支付
        return delayChargeResultBO;
    }


    private void charge(DepositOrder depositOrder) throws PaymentException {

        //查询充值用户信息
        User payUser = userService.findUser(depositOrder.getUserId());

        //支付扣款
        TransferBO transferBO = new TransferBO();
        //平台
        transferBO.setFromUser(userService.findUser("AXXXXX"));
        //充值用户
        transferBO.setToUser(payUser);
        transferBO.setToAmount(depositOrder.getDepositAmount());
        transferBO.setTransferType(EnumTransferType.GENERALTRANSFER);
        FundsRecordBO fundsRecordBO = new FundsRecordBO();
        fundsRecordBO.setInFundsType(EnumFundsType.RECHARGE_ONLINE);

        fundsRecordBO.setOptUser("system");
        fundsRecordBO.setOptUserName("system");
        fundsRecordBO.setOrderNo(depositOrder.getDepositNo());
        fundsRecordBO.setOutOrderNo(depositOrder.getOutDepositNo());
        transferService.acctTransfer(transferBO, fundsRecordBO);

        if (EnumPayType.OLP.getPayTypeId().equals(depositOrder.getPayType())) {
            if (TradeConstants.CHARGE_TYPE_RECHARGE.equals(depositOrder.getDepositFlag())) {
                fundsRecordBO.setInFundsType(EnumFundsType.RECHARGE_ONLINE);
            } else {
                fundsRecordBO.setInFundsType(EnumFundsType.RECHARGE_ONLINE_PAY);
            }
        } else {
            if (TradeConstants.CHARGE_TYPE_RECHARGE.equals(depositOrder.getDepositFlag())) {
                fundsRecordBO.setInFundsType(EnumFundsType.RECHARGE_OFFLINE);
            } else {
                fundsRecordBO.setInFundsType(EnumFundsType.RECHARGE_OFFLINE_PAY);
            }
        }

        //充值加款
        transferService.acctTransfer(transferBO, fundsRecordBO);
        //更新充值单为充值成功
        this.depositOrderService.modifyPayChargeOrderState(depositOrder, TradeConstants.CHARGE_ORDER_STATE_DONE);
    }

}
