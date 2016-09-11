package com.payment.dao;

import com.payment.comm.base.dao.BaseDao;
import com.payment.domain.BalanceDetails;
import com.payment.domain.BalanceDetailsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface BalanceDetailsMapper extends BaseDao<BalanceDetails,BalanceDetailsCriteria,String> {
    int countByExample(BalanceDetailsCriteria example);

    int deleteByExample(BalanceDetailsCriteria example);

    int insert(BalanceDetails record);

    int insertSelective(BalanceDetails record);

    List<BalanceDetails> selectByExample(BalanceDetailsCriteria example);

    int updateByExampleSelective(@Param("record") BalanceDetails record, @Param("example") BalanceDetailsCriteria example);

    int updateByExample(@Param("record") BalanceDetails record, @Param("example") BalanceDetailsCriteria example);
}