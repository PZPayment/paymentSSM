package com.payment.trade.service;

import com.payment.comm.base.service.BaseService;
import com.payment.generator.domain.AcctBalance;
import com.payment.generator.domain.AcctBalanceCriteria;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:                       <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/20      <br>
 */
public interface BalanceService extends BaseService<AcctBalance,AcctBalanceCriteria> {

   AcctBalance getBalanceByIdType(String AcctId, Short balanceTypeId);
}
