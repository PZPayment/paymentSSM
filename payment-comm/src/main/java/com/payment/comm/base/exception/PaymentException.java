package com.payment.comm.base.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.payment.comm.base.exception  <br>
 * 描      述:                       <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/20      <br>
 */
public class PaymentException extends Exception {

    private static final long serialVersionUID = 616430919092933128L;

    private static final Logger srvLogger = LoggerFactory.getLogger("srverrlog");

    protected String errorCode;

    protected String errorMsg;


    public PaymentException() {

    }

    public PaymentException(String errorCode) {
        this.setErrorCode(errorCode);
        this.setErrorMsg(ErrorHandler.getErrMsg(errorCode));
        srvLogger.info(errorCode + "|" + ErrorHandler.getErrMsg(errorCode) + "|" + getStrackTrace());
    }

    public PaymentException(String errorCode,String errMsg) {
        this.setErrorCode(errorCode);
        this.setErrorMsg(errMsg);
        srvLogger.info(errorCode + "|" + ErrorHandler.getErrMsg(errorCode) + "|" + getStrackTrace());
    }

    /**
     * 获取业务处里类调用链，方便异常时查问题<br/>
     * <p>注意：仅显示业务类调用链，以com.ofpay开头的类，动态代理类也不在其中</p>
     *
     * @return
     */
    private final String getStrackTrace() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        StringBuilder trace = new StringBuilder();

        //从第三个调用函数开始打印，第一层为Thread.getStackTrace，第二层为本函数getStrackTrace
        for (int i = 2, n = ste == null ? 0 : ste.length; i < n; i++) {
            String methodName = ste[i].getMethodName();
            int lineNumber = ste[i].getLineNumber();
            String className = ste[i].getClassName();

            //非com.ofpay或者是动态代理类（包含$$的类）不记录在轨迹中
            if (null == className || !className.startsWith("com.payment") || className.contains("$$")) {
                continue;
            }

            trace.append(className).append(".").append(methodName).append(":").append(lineNumber).append(System.getProperty("line.separator", "\r\n"));
        }
        return trace.toString();
    }


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
