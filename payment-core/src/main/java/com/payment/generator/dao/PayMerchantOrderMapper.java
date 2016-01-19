package com.payment.generator.dao;

import com.payment.comm.base.dao.BaseDao;
import com.payment.generator.domain.PayMerchantOrder;
import com.payment.generator.domain.PayMerchantOrderCriteria;
import org.springframework.stereotype.Service;

@Service
public interface PayMerchantOrderMapper extends BaseDao<PayMerchantOrder,PayMerchantOrderCriteria,String>{

}