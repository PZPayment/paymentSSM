package com.payment.dao;

import com.payment.comm.base.dao.BaseDao;


import com.payment.domain.PaymentOrder;
import com.payment.domain.PaymentOrderCriteria;
import org.springframework.stereotype.Service;

@Service
public interface PaymentOrderMapper extends BaseDao<PaymentOrder,PaymentOrderCriteria,String> {
}