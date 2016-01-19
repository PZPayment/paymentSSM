package com.payment.trade.bo;

import java.io.Serializable;

/**
 * 操作接口默认返回bean
 * Created by fangchao on 15/12/24.
 */
public class BaseResultBO implements Serializable {


    private static final long serialVersionUID = 2772828545069808903L;
    private Integer resultCode;

    private String resultMsg;

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
