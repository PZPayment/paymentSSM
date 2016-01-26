package com.payment.trade.service;

import com.payment.trade.bo.FundsRecordBO;
import com.payment.trade.bo.TransferBO;
import com.payment.trade.bo.TransferResultBO;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.payment.trade.service  <br>
 * 描      述:                       <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/20      <br>
 */
public interface TransferService {

    /**
     * 转账方法
     * @param transferBO
     * @return
     */
    public void acctTransfer(TransferBO transferBO, FundsRecordBO fundsRecordBO) throws Exception;
}
