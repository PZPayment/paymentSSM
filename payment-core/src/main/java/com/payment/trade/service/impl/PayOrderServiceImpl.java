package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.comm.constants.SeqConstants;
import com.payment.comm.utils.DateUtils;
import com.payment.comm.utils.OrderNoUtils;
import com.payment.dao.CommonMapper;
import com.payment.dao.PayOrderMapper;
import com.payment.domain.PayOrder;
import com.payment.domain.PayOrderCriteria;
import com.payment.trade.bo.PayBO;
import com.payment.trade.service.PayOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:                       <br>
 * 创 建 人 : kan <br>
 */
@Service
public class PayOrderServiceImpl extends BaseServiceImpl<PayOrder, PayOrderCriteria> implements PayOrderService {

    @Autowired
    private PayOrderMapper payOrderMapper;
    @Autowired
    private CommonMapper commonMapper;


    @Override
    protected BaseDao<PayOrder, PayOrderCriteria, String> getDao() {
        return payOrderMapper;
    }

    @Override
    public String generatePayNo() {
        Long seq = commonMapper.receiveNextLongVal(SeqConstants.SEQ_PAY_NO);
        String dateStr = DateUtils.toString(new Date(), "yyyyMMdd");
        return OrderNoUtils.fillString( "%1$010d", seq, "PP" + dateStr, "");
    }

    @Override
    public PayOrder createPayOrder(PayBO payBO) throws PaymentException {
        PayOrder payOrder = new PayOrder();
        payOrder.setPayNo(this.generatePayNo());
        payOrder.setBankCode(payBO.getBankCode());
        payOrder.setDepositNo(payBO.getOrderNo());
        payOrder.setPayAmount(payBO.getAmount());
        return this.create(payOrder);
    }
}
