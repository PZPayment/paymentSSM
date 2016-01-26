package com.payment.trade.service.impl;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.constants.BaseErrorCode;
import com.payment.generator.domain.AcctUser;
import com.payment.trade.bo.FundsRecordBO;
import com.payment.trade.bo.TransferBO;
import com.payment.trade.bo.TransferResultBO;
import com.payment.trade.service.TransferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述: 转账的基础方法     <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/20      <br>
 */
public class TransferServiceImpl implements TransferService {

    private final static Logger logger = LoggerFactory.getLogger(TransferServiceImpl.class);


    public void acctTransfer(TransferBO transferBO, FundsRecordBO fundsRecordBO) throws Exception {

        //判断合法性
        if (transferBO.getFromUser().getUserId().equals(transferBO.getToUser().getUserId())){
            logger.warn("同一个人转账 默认成功! outOrderNo={}",fundsRecordBO.getOutOrderNo());
        }
        //try
        try {
            //开始转钱
            //先减
            acctExpense(transferBO.getFromUser(),transferBO.getFromAmount(),fundsRecordBO);
            //在加
            acctIncome(transferBO.getToUser(),transferBO.getToAmount(),fundsRecordBO);
        }catch (PaymentException e) {
            // 异常 向上抛
            throw e;
        }catch (Exception e) {
            // 异常 向上抛
            throw new PaymentException(BaseErrorCode.SYSTEM_ERROR,e.getMessage());
        }



    }

    private void acctExpense(AcctUser acctUser,Long amount,FundsRecordBO fundsRecordBO) throws PaymentException{

        //查询余额
        //判断余额是否够扣
        //修改余额账本
        //生成流水bean
        //保存流水记录
    }

    private void acctIncome(AcctUser acctUser,Long amount,FundsRecordBO fundsRecordBO) throws PaymentException{
        //查询余额
        //修改余额账本
        //生成流水bean
        //保存流水记录
    }
}
