package com.payment.trade.service.impl;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.constants.TradeConstants;
import com.payment.comm.errorCode.TradeErrorCode;
import com.payment.comm.utils.MyLogger;
import com.payment.generator.domain.PayChargeOrder;
import com.payment.trade.bo.DepositBO;
import com.payment.trade.bo.payMethod.PayMethod;
import com.payment.trade.service.ChargeOrderService;
import com.payment.trade.service.DepositService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:                       <br>
 * 创 建 人 : kan <br>
 */
public class DepositServiceImpl implements DepositService {

    private final static Logger logger = LoggerFactory.getLogger(DepositServiceImpl.class);

    @Autowired
    ChargeOrderService chargeOrderService;

    @Override
    public String createDeposit(DepositBO depositBO, PayMethod payMethod,short payFlag) throws PaymentException {
        // 参数非法性验证
        if (null == depositBO || !depositBO.validate() || !payMethod.validate()) {
            logger.warn("账本充值,acctDepositBO={},充值方式={}", depositBO, payMethod);
            throw new PaymentException(TradeErrorCode.ARGS_IS_NULL);
        }

        // 校验充值单是否未成功，已成功则抛出异常
        PayChargeOrder chargeOrder =chargeOrderService.findOneByOutTradeNo(depositBO.getOrderNo());
        if (chargeOrder != null && TradeConstants.CHARGE_ORDER_STATE_DONE.equals(chargeOrder.getChargeState())) {
            logger.warn("充值订单生成失败，充值已成功：outChargeNo={},chargeNo={},chargeState={}", chargeOrder.getOutChargeNo(), chargeOrder.getChargeNo(), chargeOrder.getChargeState());
            throw new PaymentException(TradeErrorCode.CHARGE_ORDER_HAS_DONE);
        }

        // 生成充值订单
        PayChargeOrder payChargeOrderBO= new PayChargeOrder();
        payChargeOrderBO.setChargeTime(new Date()); // 充值时间
        payChargeOrderBO.setUserId(depositBO.getUserId()); // 充值用户标识
        payChargeOrderBO.setChargeAmount(payMethod.getAmount().longValue()); // 充值金额
        payChargeOrderBO.setChargeState(TradeConstants.CHARGE_ORDER_STATE_INIT); // 充值状态
        payChargeOrderBO.setOutChargeNo(chargeOrderService.generateChargeNo()); // 外部单号
        payChargeOrderBO.setPayFlag(payFlag);
        payChargeOrderBO.setPayType(payMethod.getPayType().getPayTypeId());

        // 不校验充值定单唯一性，重新生成一笔充值单
        PayChargeOrder payChargeOrder= this.chargeOrderService.create(payChargeOrderBO);

        return payChargeOrder.getChargeNo();

    }
}
