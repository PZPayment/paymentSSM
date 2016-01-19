package com.payment.generator.dao;

import com.payment.generator.domain.PayTradeOrder;
import com.payment.generator.domain.PayTradeOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

@Service
public interface PayTradeOrderMapper {
    int countByExample(PayTradeOrderCriteria example);

    int deleteByExample(PayTradeOrderCriteria example);

    int deleteByPrimaryKey(String tradeNo);

    int insert(PayTradeOrder record);

    int insertSelective(PayTradeOrder record);

    List<PayTradeOrder> selectByExampleWithRowbounds(PayTradeOrderCriteria example, RowBounds rowBounds);

    List<PayTradeOrder> selectByExample(PayTradeOrderCriteria example);

    PayTradeOrder selectByPrimaryKey(String tradeNo);

    int updateByExampleSelective(@Param("record") PayTradeOrder record, @Param("example") PayTradeOrderCriteria example);

    int updateByExample(@Param("record") PayTradeOrder record, @Param("example") PayTradeOrderCriteria example);

    int updateByPrimaryKeySelective(PayTradeOrder record);

    int updateByPrimaryKey(PayTradeOrder record);
}