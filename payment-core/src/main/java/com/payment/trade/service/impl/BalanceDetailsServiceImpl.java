package com.payment.trade.service.impl;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.service.BaseServiceImpl;
import com.payment.comm.constants.SeqConstants;
import com.payment.comm.utils.DateUtils;
import com.payment.comm.utils.OrderNoUtils;
import com.payment.dao.BalanceDetailsMapper;
import com.payment.dao.CommonMapper;
import com.payment.domain.BalanceDetails;
import com.payment.domain.BalanceDetailsCriteria;
import com.payment.trade.service.BalanceDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 包      名: com.payment.trade.service.impl  <br>
 * 描      述:
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/28
 */
@Service
public class BalanceDetailsServiceImpl extends BaseServiceImpl<BalanceDetails, BalanceDetailsCriteria> implements BalanceDetailsService {

    @Autowired
    BalanceDetailsMapper balanceDetailsMapper;

    @Autowired
    CommonMapper commonMapper;

    @Override
    protected BaseDao<BalanceDetails, BalanceDetailsCriteria, String> getDao() {
        return balanceDetailsMapper;
    }

    @Override
    public String generateDetailsId() {
        Long seq = commonMapper.receiveNextLongVal(SeqConstants.SEQ_DETAILS_ID);
        String dateStr = DateUtils.toString(new Date(), "yyyyMMdd");
        return OrderNoUtils.fillString("%1$010d", seq, "B" + dateStr, "");
    }
}
