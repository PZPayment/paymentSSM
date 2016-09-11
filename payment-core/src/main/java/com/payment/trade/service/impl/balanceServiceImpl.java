package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.dao.BalanceMapper;
import com.payment.domain.Balance;
import com.payment.domain.BalanceCriteria;
import com.payment.trade.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/20
 */
@Service
public class BalanceServiceImpl extends BaseServiceImpl<Balance, BalanceCriteria> implements BalanceService {


    @Autowired
    BalanceMapper balanceMapper;

    @Override
    protected BaseDao<Balance, BalanceCriteria, String> getDao() {
        return balanceMapper;
    }

    public Balance getBalanceByUserId(String userid) {
        BalanceCriteria balanceCriteria = new BalanceCriteria();
        balanceCriteria.createCriteria().andUserIdEqualTo(userid);
        //查询账本
        List<Balance> list = balanceMapper.selectByExample(balanceCriteria);
        if (null == list || list.isEmpty()) {
            //账本为空 新增一个账本 返回
            Balance balance = new Balance();
            balance.setUserId(userid);
            balance.setBalance(0L);
            this.create(balance);
            return getBalanceByUserId(userid);
        } else {
            return list.get(0);
        }
    }
}
