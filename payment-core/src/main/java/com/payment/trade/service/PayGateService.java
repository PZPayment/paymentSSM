package com.payment.trade.service;

import com.payment.comm.base.exception.PaymentException;
import com.payment.domain.PayOrder;
import com.payment.pay.bankRqData.BankRqData;

import java.util.Map;

/**
 * 包      名: com.payment.trade.service  <br>
 * 描      述: 银行插件处理                      <br>
 * 创 建 人 : kan <br>
 */
public interface PayGateService {

    /**
     * 给网关数据赋值
     * @param gateDate
     */
    void setGateDate(Map<String,String> gateDate);
    /**
     * 支付网关退款功能
     *
     * @param order    - 支付订单信息
     * @param amount   - 退款金额
     * @param refundId - 退款明细流水
     * @return - 成功返回true，失败返回false
     * @throws PaymentException - 抛出BaseException异常
     */
    int refund(PayOrder order, Long amount, String refundId) throws PaymentException;

    /**
     * 用户支付成功后，第三方回调功能
     *
     * @param paramMap - 回调请求参数
     * @param order    - 支付订单信息
     * @param type     - 调用类型（CALLBACK_HTML：html调用方式，CALLBACK_SERVER：后台调用方式）
     * @return - 回调结果
     * @throws PaymentException - 抛出BaseException异常
     */
    String callback(Map<String, String[]> paramMap, PayOrder order, String type) throws PaymentException;

    /**
     * 生成支付跳转页面
     *
     * @param order     - 支付订单
     * @return - 支付跳转页面对象
     * @throws PaymentException - 抛出BaseException异常
     */
    BankRqData buildHtml(PayOrder order) throws PaymentException;

}
