package com.payment.dao;

import com.payment.comm.base.dao.BaseDao;
import com.payment.domain.PayOrder;
import com.payment.domain.PayOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface PayOrderMapper extends BaseDao<PayOrder,PayOrderCriteria,String> {
    int countByExample(PayOrderCriteria example);

    int deleteByExample(PayOrderCriteria example);

    int deleteByPrimaryKey(String payNo);

    int insert(PayOrder record);

    int insertSelective(PayOrder record);

    List<PayOrder> selectByExample(PayOrderCriteria example);

    PayOrder selectByPrimaryKey(String payNo);

    int updateByExampleSelective(@Param("record") PayOrder record, @Param("example") PayOrderCriteria example);

    int updateByExample(@Param("record") PayOrder record, @Param("example") PayOrderCriteria example);

    int updateByPrimaryKeySelective(PayOrder record);

    int updateByPrimaryKey(PayOrder record);
}