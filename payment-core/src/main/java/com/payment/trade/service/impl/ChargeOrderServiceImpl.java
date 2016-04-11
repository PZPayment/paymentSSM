package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.generator.dao.PayChargeOrderMapper;
import com.payment.generator.dao.PayTradeOrderMapper;
import com.payment.generator.domain.PayChargeOrder;
import com.payment.generator.domain.PayChargeOrderCriteria;
import com.payment.generator.domain.PayTradeOrder;
import com.payment.generator.domain.PayTradeOrderCriteria;
import com.payment.trade.service.ChargeOrderService;
import com.payment.trade.service.TradeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * 包      名: com.kan.trade.payment  <br>
 * 描      述:  订单相关操作
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/29
 */
@Service
public class ChargeOrderServiceImpl extends BaseServiceImpl<PayChargeOrder,PayChargeOrderCriteria> implements ChargeOrderService {

    @Autowired
    PayChargeOrderMapper payChargeOrderMapper;


    @Override
    protected BaseDao<PayChargeOrder, PayChargeOrderCriteria, String> getDao() {
        return payChargeOrderMapper;
    }

    /**
     * 函数功能：充值单号，规则M+数据库时间(yymmdd)+8位序列seq_pay_tradeno
     *
     * @return String
     */
    @Override
    public String generateChargeNo() {
        return "";
    }


}
