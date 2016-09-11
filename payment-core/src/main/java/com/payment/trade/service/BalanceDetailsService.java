package com.payment.trade.service;


import com.payment.comm.base.service.BaseService;
import com.payment.domain.BalanceDetails;
import com.payment.domain.BalanceDetailsCriteria;

/**
 *
 * 包      名: com.payment.trade.service  <br>
 * 描      述:  流水相关操作
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/28
 */
public interface BalanceDetailsService extends BaseService<BalanceDetails,BalanceDetailsCriteria> {

    /**
     * 获取流水ID
     * @return
     */
    String generateDetailsId();
}
