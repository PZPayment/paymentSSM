package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.generator.dao.AcctFundsRecordMapper;
import com.payment.generator.domain.AcctFundsRecord;
import com.payment.generator.domain.AcctFundsRecordCriteria;
import com.payment.trade.service.AcctFundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/28
 */
@Service
public class AcctFundsServiceImpl extends BaseServiceImpl<AcctFundsRecord,AcctFundsRecordCriteria> implements AcctFundsService {

  @Autowired
    AcctFundsRecordMapper acctFundsRecordMapper;

    @Override
    protected BaseDao<AcctFundsRecord, AcctFundsRecordCriteria, String> getDao() {
        return acctFundsRecordMapper;
    }
}
