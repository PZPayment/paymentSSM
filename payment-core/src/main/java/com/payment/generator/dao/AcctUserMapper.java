package com.payment.generator.dao;

import com.payment.comm.base.dao.BaseDao;
import com.payment.generator.domain.AcctUser;
import com.payment.generator.domain.AcctUserCriteria;
import org.springframework.stereotype.Service;

@Service
public interface AcctUserMapper extends BaseDao<AcctUser,AcctUserCriteria,String>{

}