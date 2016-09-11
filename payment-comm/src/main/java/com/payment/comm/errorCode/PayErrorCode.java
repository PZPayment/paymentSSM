package com.payment.comm.errorCode;

/**
 * 包      名: com.payment.comm.errorCode  <br>
 * 描      述: 支付错误码     <br>
 * 号      段: 400000-4999999
 * 创 建 人 : kan <br>
 */
public class PayErrorCode  extends BaseErrorCode {
    /**
     * 生成HTML页面失败异常
     */
    public final static String PAY_ADAPTER_EXCEPTION = "400000";

    /**
     * 网关单不存在
     */
    public static final String PAY_ORDER_NOT_EXIST = "400002";



    /**
     * 回调验证_签名异常
     */
    public static final String CALLBACK_SIGN_ERROR = "401000";
    /**
     * 回调验证_金额异常
     */
    public static final String CALLBACK_AMOUNT_ERROR = "401001";
    /**
     * 回调验证_交易异常
     */
    public static final String CALLBACK_STATE_ERROR = "401002";
}
