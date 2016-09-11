package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.comm.constants.EnumBalanceType;
import com.payment.comm.errorCode.UserErrorCode;
import com.payment.comm.handler.RedisHandler;
import com.payment.comm.utils.JsonUtils;
import com.payment.comm.utils.MoneyUtils;
import com.payment.dao.BalanceMapper;
import com.payment.dao.UserMapper;
import com.payment.domain.Balance;
import com.payment.domain.BalanceCriteria;
import com.payment.domain.User;
import com.payment.domain.UserCriteria;
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
public class UserServiceImpl extends BaseServiceImpl<User, UserCriteria> implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    BalanceMapper balanceMapper;

    @Override
    protected BaseDao<User, UserCriteria, String> getDao() {
        return userMapper;
    }

    @Override
    public User findUser(String userId) throws PaymentException {

        try {
            String userJson = RedisHandler.get(userId);
            if (StringUtils.isBlank(userJson)) {
                User user = findOne(userId);
                RedisHandler.set(userId, user);
                return user;
            } else {
                return JsonUtils.convertObject(userJson, User.class);
            }
        } catch (PaymentException e) {
            throw new PaymentException(UserErrorCode.USER_NOT_EXISTIS);
        }
    }

    public static void main(String[] args) {
        String s = "{\"id\":\"A882699\",\"userId\":\"A882699\",\"payPsw\":null,\"isUsePayPsw\":null,\"countInvalidPwd\":null,\"pwdStrength\":null,\"payBaseKey\":null,\"payPswType\":null,\"idType\":null,\"idNo\":null,\"userState\":null,\"realName\":null,\"emaill\":null,\"mobile\":null,\"realCheck\":null,\"regIp\":null,\"regTime\":null,\"companyName\":null}";


        try {
           User user = JsonUtils.convertObject(s, User.class);
            System.out.println(user);
        } catch (PaymentException e) {
            System.out.println(e);
        }
    }

    @Override
    public UserAcctResultBO queryUserAcctInfo(String userId) {
        UserAcctResultBO acctResultBO = new UserAcctResultBO();
        BalanceCriteria acctBalanceCriteria = new BalanceCriteria();
        acctBalanceCriteria.createCriteria().andUserIdEqualTo(userId);
        List<Balance> list = balanceMapper.selectByExample(acctBalanceCriteria);
        if (!CollectionUtils.isEmpty(list)) {
            for (Balance acctBalance : list) {
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
