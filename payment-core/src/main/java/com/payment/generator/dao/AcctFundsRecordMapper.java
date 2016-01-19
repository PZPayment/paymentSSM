package com.payment.generator.dao;

import com.payment.comm.base.dao.BaseDao;
import com.payment.generator.domain.AcctFundsRecord;
import com.payment.generator.domain.AcctFundsRecordCriteria;
import org.springframework.stereotype.Service;

@Service
public interface AcctFundsRecordMapper extends BaseDao<AcctFundsRecord,AcctFundsRecordCriteria,String> {

}