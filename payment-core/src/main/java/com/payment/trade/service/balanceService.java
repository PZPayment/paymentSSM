package com.payment.trade.service;

import com.payment.comm.base.service.BaseService;
import com.payment.domain.Balance;
import com.payment.domain.BalanceCriteria;

/**
 *
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/20
 */

public interface BalanceService extends BaseService<Balance,BalanceCriteria> {

   Balance getBalanceByUserId(String userId);
}
