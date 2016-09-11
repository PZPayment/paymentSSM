package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.comm.constants.SeqConstants;
import com.payment.comm.errorCode.BaseErrorCode;
import com.payment.comm.utils.DateUtils;
import com.payment.comm.utils.OrderNoUtils;
import com.payment.dao.CommonMapper;
import com.payment.dao.DepositOrderMapper;
import com.payment.domain.DepositOrder;
import com.payment.domain.DepositOrderCriteria;
import com.payment.trade.service.DepositOrderService;
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
public class DepositOrderServiceImpl extends BaseServiceImpl<DepositOrder,DepositOrderCriteria> implements DepositOrderService {

    @Autowired
    DepositOrderMapper depositOrderMapper;

    @Autowired
    CommonMapper commonMapper;


    @Override
    protected BaseDao<DepositOrder, DepositOrderCriteria, String> getDao() {
        return depositOrderMapper;
    }

    /**
     * 函数功能：充值单号，规则PD+数据库时间(yymmdd)+8位序列seq_pay_tradeno
     *
     * @return String
     */
    @Override
    public String generateChargeNo() {
        Long seq = commonMapper.receiveNextLongVal(SeqConstants.SEQ_DEPOSIT_NO);
        String dateStr = DateUtils.toString(new Date(), "yyyyMMdd");
        return OrderNoUtils.fillString( "%1$010d", seq, "PD" + dateStr, "");
    }

    @Override
    public void modifyPayChargeOrderState(DepositOrder depositOrder, Short chargeOrderState) throws PaymentException{
        DepositOrder payChargeOrderNew = new DepositOrder();
        payChargeOrderNew.setDepositState(chargeOrderState);
        payChargeOrderNew.setDealTime(new Date());
        DepositOrderCriteria payChargeOrderCriteria = new DepositOrderCriteria();
        payChargeOrderCriteria.createCriteria().andDepositStateEqualTo(depositOrder.getDepositState());
        payChargeOrderCriteria.createCriteria().andDepositNoEqualTo(depositOrder.getDepositNo());
        int i = depositOrderMapper.updateByExampleSelective(payChargeOrderNew,payChargeOrderCriteria);
        if (i != 1) {
            throw new PaymentException(BaseErrorCode.DATA_UPDATE_FAILED);
        }
    }


}
