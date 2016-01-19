package com.payment.generator.dao;

import com.payment.comm.base.dao.BaseDao;
import com.payment.generator.domain.AcctBalance;
import com.payment.generator.domain.AcctBalanceCriteria;
import org.springframework.stereotype.Service;

@Service
public interface AcctBalanceMapper extends BaseDao<AcctBalance,AcctBalanceCriteria,String>{

}