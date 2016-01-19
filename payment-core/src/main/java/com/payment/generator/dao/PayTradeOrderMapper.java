package com.payment.generator.dao;

import com.payment.comm.base.dao.BaseDao;

import com.payment.generator.domain.PayTradeOrder;
import com.payment.generator.domain.PayTradeOrderCriteria;
import org.springframework.stereotype.Service;

@Service
public interface PayTradeOrderMapper extends BaseDao<PayTradeOrder,PayTradeOrderCriteria,String>{

}