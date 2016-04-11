package com.payment.comm.errorCode;

/**
 * 包      名: com.payment.comm.constants  <br>
 * 描      述:  订单交易错误编号 <br>
 * 创 建 人 : kan <br>
 */
public class TradeErrorCode extends BaseErrorCode {


    /**30XXXX 交易通用的  **/
    /**
     * 支付金额必须大于0
     */
    public static final String PAYMENT_METHOD_AMOUNT_ERROR = "300001";

    /**31XXXX 交易用的  **/



    /**32XXXX 充值用的  **/
    /**
     * 充值订单已完成
     */
    public static final String CHARGE_ORDER_HAS_DONE = "320001";
}
