package com.payment.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * 包      名: com.payment.dao  <br>
 * 描      述:  公共的mapper seq取值                     <br>
 * 创 建 人 : kan <br>
 */
@Service
public interface CommonMapper {

   Long receiveNextLongVal(@Param(value="seqName")String seqName);
}
