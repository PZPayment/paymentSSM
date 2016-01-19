package com.payment.generator.dao;


import com.payment.comm.base.dao.BaseDao;
import com.payment.generator.domain.PayTradeOrder;
import com.payment.generator.domain.PayTradeOrderCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PayTradeOrderMapper extends BaseDao<PayTradeOrder,PayTradeOrderCriteria,String>{
    PayTradeOrder selectByOutNo(String outOrderNo);
}