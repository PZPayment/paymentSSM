package com.payment.trade.service.impl;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.base.service.BaseService;
import com.payment.comm.constants.BaseErrorCode;
import com.payment.comm.constants.SystemConstants;
import com.payment.generator.domain.AcctBalance;
import com.payment.generator.domain.AcctFundsRecord;
import com.payment.generator.domain.AcctUser;
import com.payment.trade.bo.FundsRecordBO;
import com.payment.trade.bo.TransferBO;
import com.payment.trade.bo.TransferResultBO;
import com.payment.trade.service.AcctFundsService;
import com.payment.trade.service.BalanceService;
import com.payment.trade.service.TransferService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

/**
 *
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述: 转账的基础方法
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/20
 */
@Service
public class TransferServiceImpl implements TransferService {

    private final static Logger logger = LoggerFactory.getLogger(TransferServiceImpl.class);

    @Autowired
    BalanceService balanceService;
    @Autowired
    AcctFundsService acctFundsService;

    public void acctTransfer(TransferBO transferBO, FundsRecordBO fundsRecordBO) throws PaymentException {

        //判断合法性
        if (transferBO.getFromUser().getUserId().equals(transferBO.getToUser().getUserId())) {
            logger.warn("同一个人转账 默认成功! outOrderNo={}", fundsRecordBO.getOutOrderNo());
        }
        //try
        try {
            //开始转钱
            //先减
            balanceChaege(transferBO.getFromUser(), -transferBO.getFromAmount(), fundsRecordBO);
            //在加
            balanceChaege(transferBO.getToUser(), transferBO.getToAmount(), fundsRecordBO);
        } catch (PaymentException e) {
            // 异常 向上抛
            throw e;
        }

    }

    private void balanceChaege(AcctUser acctUser, Long amount, FundsRecordBO fundsRecordBO) throws PaymentException {

        //查询余额
        AcctBalance acctBalanceOld = balanceService.getBalanceByUserId(acctUser.getId());
        if (amount < 0) {
            //判断余额是否够扣
            if (acctBalanceOld.getBalance() < Math.abs(amount)) {
                throw new PaymentException("余额不足,当前余额为:" + acctBalanceOld.getBalance() / 100);
            }
        }
        //修改余额账本
        AcctBalance acctBalance = new AcctBalance();
        acctBalance.setBalanceId(acctBalanceOld.getBalanceId());
        acctBalance.setBalance(amount);

        AcctBalance acctBalanceNew = balanceService.update(acctBalance);
        //生成流水bean
        AcctFundsRecord acctFundsRecord = buildFundsRecord(amount, fundsRecordBO, acctBalanceNew, acctUser, amount > 0);
        //保存流水记录
        acctFundsService.create(acctFundsRecord);
    }

    private AcctFundsRecord buildFundsRecord(Long amount, FundsRecordBO fundsRecordBO, AcctBalance acctBalance, AcctUser acctUser, boolean isIn) {
        AcctFundsRecord record = new AcctFundsRecord();
        if (isIn) {
            record.setTradeTypeId(fundsRecordBO.getInFundsType().getEnumTradeType().getTradeTypeId());
            record.setBusiTypeId(fundsRecordBO.getInFundsType().getBusiTypeId());
            record.setBusiTypeName(fundsRecordBO.getInFundsType().getBusiTypeName());
            record.setIncomeAmount(Math.abs(amount));
            record.setBalance(acctBalance.getBalance());
            record.setFundsName(fundsRecordBO.getOutFundsType().getEnumTradeType().getTradeTypeName()[0]);
        } else {
            record.setTradeTypeId(fundsRecordBO.getOutFundsType().getEnumTradeType().getTradeTypeId());
            record.setBusiTypeId(fundsRecordBO.getOutFundsType().getBusiTypeId());
            record.setBusiTypeName(fundsRecordBO.getOutFundsType().getBusiTypeName());
            record.setPayoutAmount(Math.abs(amount));
            record.setBalance(acctBalance.getBalance());
            record.setFundsName(fundsRecordBO.getOutFundsType().getEnumTradeType().getTradeTypeName()[1]);
        }

        record.setCreatedTime(Calendar.getInstance().getTime());
        record.setUserId(acctUser.getUserId());
        record.setOrderNo(fundsRecordBO.getOrderNo());
        record.setOutOrderNo(fundsRecordBO.getOutOrderNo());
        record.setFundsDesc(fundsRecordBO.getRefundDesc());

        record.setInOutType(isIn ? SystemConstants.CAPITAL_FLOWS_IN : SystemConstants.CAPITAL_FLOWS_OUT);
        return record;
    }
}
