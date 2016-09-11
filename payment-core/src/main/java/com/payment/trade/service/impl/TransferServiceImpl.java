package com.payment.trade.service.impl;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.constants.SystemConstants;
import com.payment.domain.Balance;
import com.payment.domain.BalanceDetails;
import com.payment.domain.User;
import com.payment.trade.bo.FundsRecordBO;
import com.payment.trade.bo.TransferBO;
import com.payment.trade.service.BalanceDetailsService;
import com.payment.trade.service.BalanceService;
import com.payment.trade.service.TransferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;

/**
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
    BalanceDetailsService balanceDetailsService;

    @Transactional(rollbackFor = Exception.class)
    public void acctTransfer(TransferBO transferBO, FundsRecordBO fundsRecordBO) throws PaymentException {

        //判断合法性
        if (transferBO.getFromUser().getUserId().equals(transferBO.getToUser().getUserId())) {
            logger.warn("同一个人转账 默认成功! outOrderNo={}", fundsRecordBO.getOutOrderNo());
        }
        //try
        try {
            //开始转钱
            //计算2个人应该先操作谁的钱..
            if (compareFromAndTo(transferBO.getFromUser() + transferBO.getFromBalance(), transferBO.getToUser() + transferBO.getToBalance())) {
                //先减
                balanceChaege(transferBO.getFromUser(), -transferBO.getFromAmount(), fundsRecordBO);
                //在加
                balanceChaege(transferBO.getToUser(), transferBO.getToAmount(), fundsRecordBO);
            } else {
                //先加
                balanceChaege(transferBO.getToUser(), transferBO.getToAmount(), fundsRecordBO);
                //在减
                balanceChaege(transferBO.getFromUser(), -transferBO.getFromAmount(), fundsRecordBO);
            }

        } catch (PaymentException e) {
            // 异常 向上抛
            throw e;
        }

    }

    private void balanceChaege(User acctUser, Long amount, FundsRecordBO fundsRecordBO) throws PaymentException {

        //查询余额
        Balance acctBalanceOld = balanceService.getBalanceByUserId(acctUser.getId());
        if (amount < 0) {
            //判断余额是否够扣
            if (acctBalanceOld.getBalance() < Math.abs(amount)) {
                throw new PaymentException("余额不足,当前余额为:" + acctBalanceOld.getBalance() / 100);
            }
        }
        //修改余额账本
        Balance acctBalance = new Balance();
        acctBalance.setBalanceId(acctBalanceOld.getBalanceId());
        acctBalance.setBalance(amount);

        Balance acctBalanceNew = balanceService.update(acctBalance);
        //生成流水bean
        BalanceDetails acctFundsRecord = buildFundsRecord(amount, fundsRecordBO, acctBalanceNew, acctUser, amount > 0);
        //保存流水记录
        balanceDetailsService.create(acctFundsRecord);
    }

    private BalanceDetails buildFundsRecord(Long amount, FundsRecordBO fundsRecordBO, Balance acctBalance, User acctUser, boolean isIn) {
        BalanceDetails record = new BalanceDetails();
        record.setDetailsId(balanceDetailsService.generateDetailsId());
        if (isIn) {
            record.setTradeTypeId(fundsRecordBO.getInFundsType().getEnumTradeType().getTradeTypeId());
            record.setBusiTypeId(fundsRecordBO.getInFundsType().getBusiTypeId());
            record.setBusiTypeName(fundsRecordBO.getInFundsType().getBusiTypeName());
            record.setIncomeAmount(Math.abs(amount));
            record.setBalance(acctBalance.getBalance());
            record.setDetailsName(fundsRecordBO.getOutFundsType().getEnumTradeType().getTradeTypeName()[0]);
        } else {
            record.setTradeTypeId(fundsRecordBO.getOutFundsType().getEnumTradeType().getTradeTypeId());
            record.setBusiTypeId(fundsRecordBO.getOutFundsType().getBusiTypeId());
            record.setBusiTypeName(fundsRecordBO.getOutFundsType().getBusiTypeName());
            record.setPayoutAmount(Math.abs(amount));
            record.setBalance(acctBalance.getBalance());
            record.setDetailsName(fundsRecordBO.getOutFundsType().getEnumTradeType().getTradeTypeName()[1]);
        }

        record.setCreateTime(Calendar.getInstance().getTime());
        record.setUserId(acctUser.getUserId());
        record.setOrderNo(fundsRecordBO.getOrderNo());
        record.setOutOrderNo(fundsRecordBO.getOutOrderNo());
        record.setDetailsDesc(fundsRecordBO.getRefundDesc());
        record.setInOutType(isIn ? SystemConstants.CAPITAL_FLOWS_IN : SystemConstants.CAPITAL_FLOWS_OUT);
        return record;
    }

    /**
     * 比较账户+类型  转账双方的大小关系
     *
     * @param fromHash
     * @param toHash
     * @return true from<to  false to>from
     */
    private boolean compareFromAndTo(String fromHash, String toHash) {
        return fromHash.compareTo(toHash) <= 0;
    }
}
