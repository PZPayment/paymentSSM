package com.payment.comm.errorCode;

/**
 * 包      名: com.payment.comm.constants  <br>
 * 描      述:  订单交易错误编号<br>
 * 号      段:  300000-399999<br>
 * 创 建 人 : kan <br>
 */
public class TradeErrorCode extends BaseErrorCode {


    /**30XXXX 交易通用的  **/
    /**
     * 支付金额必须大于0
     */
    public static final String PAYMENT_METHOD_AMOUNT_ERROR = "300001";

    /**31XXXX 交易用的  **/
    /**
     * 支付单不存在
     */
    public static final String TRADE_ORDER_NOT_EXISTS ="310001";

    /**
     *订单支付失败
     */
    public static final String TRADE_ORDER_PAY_FAIL = "310002";


    /**32XXXX 充值用的  **/
    /**
     * 充值单不存在
     */
    public static final String CHARGE_ORDER_NOT_EXIST = "320001";
    /**
     * 充值订单已完成
     */
    public static final String CHARGE_ORDER_HAS_DONE = "320002";


}
