package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.generator.dao.AcctBalanceMapper;
import com.payment.generator.domain.AcctBalance;
import com.payment.generator.domain.AcctBalanceCriteria;
import com.payment.trade.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:                       <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/20      <br>
 */
@Service
public class BalanceServiceImpl extends BaseServiceImpl<AcctBalance, AcctBalanceCriteria> implements BalanceService {


    @Autowired
    AcctBalanceMapper acctBalanceMapper;

    @Override
    protected BaseDao<AcctBalance, AcctBalanceCriteria, String> getDao() {
        return acctBalanceMapper;
    }

    public AcctBalance getBalanceByIdType(String AcctId, Short balanceTypeId) {
        return null;
    }
}