package com.payment.generator.dao;

import com.payment.comm.base.dao.BaseDao;
import com.payment.generator.domain.PayTransferOrder;
import com.payment.generator.domain.PayTransferOrderCriteria;
import org.springframework.stereotype.Service;

@Service
public interface PayTransferOrderMapper extends BaseDao<PayTransferOrder,PayTransferOrderCriteria,String> {

}