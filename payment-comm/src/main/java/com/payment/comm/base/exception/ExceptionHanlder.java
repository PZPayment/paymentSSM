package com.payment.comm.base.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @类功能说明：
 * @公司名称：江苏欧飞
 * @作者：Miner
 * @创建时间：2012-5-10 下午05:39:33
 * @版本：V1.0
 */
public class ExceptionHanlder {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHanlder.class);

    public static void Process(Exception e) throws PaymentException {
        if (e instanceof PaymentException) {
            logger.error("抛出执行异常，e={}", ((PaymentException) e).getErrorMsg());
            throw (PaymentException) e;
        } else if (e instanceof PaymentException) {
            throw new PaymentException(((PaymentException) e).getErrorCode(), ((PaymentException) e).getErrorMsg());
        } else {
            logger.error("执行异常", e);
            throw new PaymentException("-100001");
        }
    }
}