package com.payment.trade.service;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.base.service.BaseService;
import com.payment.generator.domain.AcctUser;
import com.payment.generator.domain.AcctUserCriteria;
import com.payment.user.bo.UserAcctResultBO;

/**
 *
 * 包      名: com.payment.trade.service  <br>
 * 描      述:  用户相关操作
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/28
 */
public interface UserService extends BaseService<AcctUser,AcctUserCriteria> {

    AcctUser findUser(String buyerUserId) throws PaymentException;

    UserAcctResultBO queryUserAcctInfo(String userId);
}
