package com.payment.comm.constants;

/**
 * 包      名: com.kan.comm.constants  <br>
 * 描      述:  交易常量类
 * 创 建 人 : 方超 <br>
 * 修改时间:  15/12/28
 */
public class TradeConstants {

    /**
     * 支付状态 初始化 0
     */
    public static final Short TRADE_ORDER_STATE_INIT = 0;
    /**
     * 支付状态 成功 1
     */
    public static final Short TRADE_ORDER_STATE_DONE = 1;

    /**
     * 退款状态（未退款:0）
     */
    public static final Short REFUND_STATE_UNREFUND = 0;

    /**
     * 退款状态（已退款:1）
     */
    public static final Short REFUND_STATE_SUCCESS = 1;

    /**
     * 退款状态（退款失败:2）
     */
    public static final Short REFUND_STATE_FAILURE = 2;

    /**
     * 退款状态(退款中：3)
     */
    public static final Short REFUND_STATE_DOING = 3;


    /**
     * 充值类型 0 : 充值
     */
    public static final Short CHARGE_TYPE_RECHARGE = 0;
    /**
     * 充值类型 0 : 支付
     */
    public static final Short CHARGE_TYPE_PAYMENT = 1;

    /**
     * 充值状态 初始化 0
     */
    public static final Short CHARGE_ORDER_STATE_INIT = 0;
    /**
     * 充值状态 成功 1
     */
    public static final Short CHARGE_ORDER_STATE_DONE = 1;
    /**
     * 充值状态 失败 2
     */
    public static final Short CHARGE_ORDER_STATE_FAIL = 2;
    /**
     * 充值状态  充值中 3
     */
    public static final Short CHARGE_ORDER_STATE_WAIT = 3;

}
