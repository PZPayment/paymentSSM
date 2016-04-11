package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.comm.constants.EnumBalanceType;
import com.payment.comm.errorCode.UserErrorCode;
import com.payment.comm.handler.RedisHandler;
import com.payment.comm.utils.JsonUtil;
import com.payment.comm.utils.MoneyUtils;
import com.payment.generator.dao.AcctBalanceMapper;
import com.payment.generator.dao.AcctUserMapper;
import com.payment.generator.domain.*;
import com.payment.trade.service.UserService;
import com.payment.user.bo.UserAcctResultBO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/28
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<AcctUser, AcctUserCriteria> implements UserService {
    @Autowired
    AcctUserMapper acctUserMapper;

    @Autowired
    AcctBalanceMapper acctBalanceMapper;

    @Override
    protected BaseDao<AcctUser, AcctUserCriteria, String> getDao() {
        return acctUserMapper;
    }

    @Override
    public AcctUser findUser(String userId) throws PaymentException {

        try {
            String userJson = RedisHandler.get(userId);
            if (StringUtils.isBlank(userJson)) {
                AcctUser user = findOne(userId);
                RedisHandler.set(userId, JsonUtil.convertString(user));
                return user;
            } else {
                return JsonUtil.convertObject(RedisHandler.get(userId), AcctUser.class);
            }
        } catch (PaymentException e) {
            throw new PaymentException(UserErrorCode.USER_NOT_EXISTIS);
        }
    }

    @Override
    public UserAcctResultBO queryUserAcctInfo(String userId) {
        UserAcctResultBO acctResultBO = new UserAcctResultBO();
        AcctBalanceCriteria acctBalanceCriteria = new AcctBalanceCriteria();
        acctBalanceCriteria.createCriteria().andUserIdEqualTo(userId);
        List<AcctBalance> list = acctBalanceMapper.selectByExample(acctBalanceCriteria);
        if (!CollectionUtils.isEmpty(list)) {
            for (AcctBalance acctBalance : list) {
                if (EnumBalanceType.BALANCE.getBalanceTypeId().equals(acctBalance.getBalanceType())) {
                    acctResultBO.setBalance(MoneyUtils.sysUnitToYuan(acctBalance.getBalance()));
                } else if (EnumBalanceType.OWB.getBalanceTypeId().equals(acctBalance.getBalanceType())) {
                    acctResultBO.setIntransitBalance(MoneyUtils.sysUnitToYuan(acctBalance.getBalance()));
                } else if (EnumBalanceType.FBB.getBalanceTypeId().equals(acctBalance.getBalanceType())) {
                    acctResultBO.setForegiftBalance(MoneyUtils.sysUnitToYuan(acctBalance.getBalance()));
                }
            }
        }
        return acctResultBO;
    }
}
