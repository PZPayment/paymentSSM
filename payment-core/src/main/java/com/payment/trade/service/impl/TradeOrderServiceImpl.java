package com.payment.trade.service.impl;

import com.payment.generator.dao.PayTradeOrderMapper;
import com.payment.generator.domain.PayTradeOrder;
import com.payment.trade.service.TradeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.kan.trade.payment  <br>
 * 描      述:  订单相关操作                     <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/29      <br>
 */
@Service
public class TradeOrderServiceImpl implements TradeOrderService {

    @Autowired
    PayTradeOrderMapper payTradeOrderMapper;


    public PayTradeOrder selectByPrimaryKey(String tradeNo) {
        return payTradeOrderMapper.selectByPrimaryKey(tradeNo);
    }

    public PayTradeOrder create(PayTradeOrder tradeOrder) {
        payTradeOrderMapper.insert(tradeOrder);
        return tradeOrder;
    }
}
