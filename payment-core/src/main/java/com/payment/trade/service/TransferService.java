package com.payment.trade.service;

import com.payment.comm.base.exception.PaymentException;
import com.payment.trade.PaymentProvider;
import com.payment.trade.bo.FundsRecordBO;
import com.payment.trade.bo.TransferBO;
import com.payment.trade.bo.TransferResultBO;

/**
 *
 * 包      名: com.payment.trade.service  <br>
 * 描      述:
 * 创 建 人 : kan <br>
 * 修改时间:  16/1/20
 */
public interface TransferService {

    /**
     * 转账方法
     * @param transferBO
     * @return
     */
    public void acctTransfer(TransferBO transferBO, FundsRecordBO fundsRecordBO) throws PaymentException;
}
