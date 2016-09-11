package com.payment.user;

import com.payment.comm.base.exception.ExceptionHanlder;
import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.errorCode.BaseErrorCode;
import com.payment.trade.service.UserService;
import com.payment.user.bo.UserAcctResultBO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 包      名: com.payment.user  <br>
 * 描      述:   用户操作<br>
 * 创 建 人 : kan <br>
 */
@Service
public class UserProviderImpl implements UserProvider {

    @Autowired
    UserService userService;

    @Override
    public UserAcctResultBO queryUserAcctInfo(String userId) throws PaymentException {
        if (StringUtils.isBlank(userId)) {
            throw new PaymentException(BaseErrorCode.ARGS_IS_NULL);
        }
        try {
            return userService.queryUserAcctInfo(userId);
        } catch (Exception e) {
            ExceptionHanlder.Process(e);
        }
        return null;
    }
}
