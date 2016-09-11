package com.payment.trade.service;


import com.payment.comm.base.exception.PaymentException;
import com.payment.trade.bo.PayBO;

import java.util.Map;

/**
 * 支付用service
 * @author kan
 * @version 2.0
 * @since 2015/8/10 15:04
 */
public interface PayService {
    /**
     * 银行页面回调标识
     */
    String CALLBACK_HTML = "html";

    /**
     * 银行后台回调标识
     */
    String CALLBACK_SERVER = "server";

    /**
     * 获取在线支付跳转页面
     *
     * @param payBO - 支付详情
     * @return - 在线支付跳转页面
     * @throws PaymentException
     */
    String buildBankHtml(PayBO payBO) throws PaymentException;


    /**
     * 支付回调接口，
     * 描述：支付渠道回调验证
     * @param paraMap  - 请求参数集
     * @param payNo    -
     * @param remoteIp - 请求Ip地址
     * @param type     - ()
     * @return - 回调结果（type为"html"时）
     */
    String callback(Map<String, String[]> paraMap, String payNo, String remoteIp, String type) throws PaymentException;


}
