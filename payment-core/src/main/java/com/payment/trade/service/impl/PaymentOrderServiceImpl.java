package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.comm.constants.SeqConstants;
import com.payment.comm.errorCode.BaseErrorCode;
import com.payment.comm.utils.DateUtils;
import com.payment.comm.utils.OrderNoUtils;
import com.payment.dao.CommonMapper;
import com.payment.dao.PaymentOrderMapper;
import com.payment.domain.PaymentOrder;
import com.payment.domain.PaymentOrderCriteria;
import com.payment.trade.service.PaymentOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 *
 * 包      名: com.kan.trade.payment  <br>
 * 描      述:  订单相关操作
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/29
 */
@Service
public class PaymentOrderServiceImpl extends BaseServiceImpl<PaymentOrder,PaymentOrderCriteria> implements PaymentOrderService {

   @Autowired
    PaymentOrderMapper paymentOrderMapper;

    @Autowired
    CommonMapper commonMapper;


    @Override
    protected BaseDao<PaymentOrder, PaymentOrderCriteria, String> getDao() {
        return paymentOrderMapper;
    }

    /**
     * 函数功能：交易流水，规则PT+数据库时间(yymmdd)+8位序列seq_pay_tradeno
     *
     * @return String
     */
    @Override
    public String generateTradeNo() {
        Long seq = commonMapper.receiveNextLongVal(SeqConstants.SEQ_PAYMNET_NO);
        String dateStr = DateUtils.toString(new Date(), "yyyyMMdd");
        return OrderNoUtils.fillString( "%1$010d", seq, "T" + dateStr, "");
    }

    @Override
    public void modifyPayTradeOrderState(PaymentOrder payTradeOrder, Short payState, Short settleState, Short refundState) throws PaymentException {
        PaymentOrder payTradeOrderNew = new PaymentOrder();
        payTradeOrderNew.setPaymentState(payState);
        payTradeOrderNew.setSettleState(settleState);
        payTradeOrderNew.setRefundState(refundState);
        payTradeOrderNew.setDealTime(new Date());
        PaymentOrderCriteria payTradeOrderCriteria = new PaymentOrderCriteria();
        payTradeOrderCriteria.createCriteria().andPaymentStateEqualTo(payTradeOrder.getPaymentState());
        payTradeOrderCriteria.createCriteria().andPaymentNoEqualTo(payTradeOrder.getPaymentNo());
        int i = paymentOrderMapper.updateByExampleSelective(payTradeOrderNew,payTradeOrderCriteria);
        if (i != 1) {
            throw new PaymentException(BaseErrorCode.DATA_UPDATE_FAILED);
        }
    }


}
