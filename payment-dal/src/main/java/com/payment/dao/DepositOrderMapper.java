package com.payment.dao;

import com.payment.comm.base.dao.BaseDao;
import com.payment.domain.DepositOrder;
import com.payment.domain.DepositOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface DepositOrderMapper extends BaseDao<DepositOrder,DepositOrderCriteria,String> {

}