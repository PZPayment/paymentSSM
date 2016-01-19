package com.payment.generator.dao;

import com.payment.comm.base.dao.BaseDao;
import com.payment.generator.domain.PayChargeOrder;
import com.payment.generator.domain.PayChargeOrderCriteria;
import org.springframework.stereotype.Service;

@Service
public interface PayChargeOrderMapper extends BaseDao<PayChargeOrder,PayChargeOrderCriteria,String> {

}