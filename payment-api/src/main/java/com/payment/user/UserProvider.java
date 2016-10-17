package com.payment.user;

import com.payment.comm.base.exception.PaymentException;
import com.payment.user.bo.UserAcctResultBO;

/**
 * 包      名: com.payment.user.bo  <br>
 * 描      述: 账户基本操作接口                      <br>
 * 创 建 人 : kan <br>
 * 修改时间:  16/4/9      <br>
 */
public interface UserProvider {

    /**
     * 函数功能：查询用户账务信息
     *
     * @param userId
     * @return
     * @author Miner 2012-8-11 上午11:23:34
     */
    UserAcctResultBO queryUserAcctInfo(String userId) throws PaymentException;

}
