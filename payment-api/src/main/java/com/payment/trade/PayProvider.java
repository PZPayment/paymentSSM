package com.payment.trade;


import com.payment.comm.base.exception.PaymentException;
import com.payment.trade.bo.PayBO;
import com.payment.trade.bo.PayResultBO;

import java.util.Map;

/**
 * 包      名: com.payment.trade  <br>
 * 描      述:  支付
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/3/9
 */
public interface PayProvider {

    /**
     * 获取和银行交互的数据
     *
     * @param payBO 支付参数
     * @return
     */
    PayResultBO getBankDate(PayBO payBO) throws PaymentException;


    /**
     * 原路退还
     *
     * @param depositNo 充值单编号
     * @return
     */
    PayResultBO refund(String depositNo) throws PaymentException;

    /**
     * 全新的支付回调接口，支付与核心交易分离后的全新流程（推荐使用）
     * 描述：目前提供给【普通网关】的【后台回调】使用
     *
     * @param paraMap  - 请求参数集
     * @param payNo    -
     * @param remoteIp - 请求Ip地址
     * @param type     - ()
     * @return - 回调结果（type为"html"时）
     */
    String callback(Map<String, String[]> paraMap, String payNo, String remoteIp, String type) throws PaymentException;

}
