package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.generator.dao.AcctUserMapper;
import com.payment.generator.domain.AcctUser;
import com.payment.generator.domain.AcctUserCriteria;
import com.payment.trade.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:                       <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/28      <br>
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<AcctUser,AcctUserCriteria>implements UserService  {
    @Autowired
    AcctUserMapper acctUserMapper;
    @Override
    protected BaseDao<AcctUser, AcctUserCriteria, String> getDao() {
        return acctUserMapper;
    }
}
