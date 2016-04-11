package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.generator.dao.PayTradeOrderMapper;
import com.payment.generator.domain.PayTradeOrder;
import com.payment.generator.domain.PayTradeOrderCriteria;
import com.payment.trade.service.TradeOrderService;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Locale;


/**
 *
 * 包      名: com.kan.trade.payment  <br>
 * 描      述:  订单相关操作
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/29
 */
@Service
public class TradeOrderServiceImpl extends BaseServiceImpl<PayTradeOrder,PayTradeOrderCriteria> implements TradeOrderService {

    @Autowired
    PayTradeOrderMapper payTradeOrderMapper;


    @Override
    protected BaseDao<PayTradeOrder, PayTradeOrderCriteria, String> getDao() {
        return payTradeOrderMapper;
    }

    /**
     * 函数功能：交易流水，规则M+数据库时间(yymmdd)+8位序列seq_pay_tradeno
     *
     * @return String
     */
    @Override
    public String generateTradeNo() {
        return "";
    }


}
