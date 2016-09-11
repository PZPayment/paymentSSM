package com.payment.dao;

import com.payment.comm.base.dao.BaseDao;

import java.util.List;

import com.payment.domain.Balance;
import com.payment.domain.BalanceCriteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface BalanceMapper extends BaseDao<Balance,BalanceCriteria,String> {
    int countByExample(BalanceCriteria example);

    int deleteByExample(BalanceCriteria example);

    int deleteByPrimaryKey(Long balanceId);

    int insert(Balance record);

    int insertSelective(Balance record);

    List<Balance> selectByExample(BalanceCriteria example);

    Balance selectByPrimaryKey(Long balanceId);

    int updateByExampleSelective(@Param("record") Balance record, @Param("example") BalanceCriteria example);

    int updateByExample(@Param("record") Balance record, @Param("example") BalanceCriteria example);

    int updateByPrimaryKeySelective(Balance record);

    int updateByPrimaryKey(Balance record);
}