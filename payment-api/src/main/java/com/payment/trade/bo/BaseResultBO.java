package com.payment.trade.bo;

import java.io.Serializable;

/**
 * 操作接口默认返回bean
 */
public class BaseResultBO implements Serializable {


    private static final long serialVersionUID = 2366205167600992273L;
    private Integer resultCode;

    private String resultMsg;

    public BaseResultBO() {
        this.resultCode=0;
        this.resultMsg="成功";
    }

    public BaseResultBO(Integer resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }


}
