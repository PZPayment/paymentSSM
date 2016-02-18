package com.payment.comm.handler;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.utils.JsonUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.payment.comm.handler  <br>
 * 描      述:                       <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/27      <br>
 */
@Service
public class RedisHandler {

    private static RedisTemplate<String, String> redisTemplate;


    public static void set(String key,Object obj) throws PaymentException {

        redisTemplate.opsForValue().set(key,  JsonUtil.convertString(obj));
    }

    public static String get(String key){
       return redisTemplate.opsForValue().get(key);
    }

    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
