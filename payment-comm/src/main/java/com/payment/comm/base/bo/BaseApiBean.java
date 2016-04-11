package com.payment.comm.base.bo;


import com.payment.comm.base.exception.PaymentException;

/**
 * @类功能说明：接口公共类
 * @作者：kan
 * @版本：V1.0
 */
public abstract class BaseApiBean extends BaseBean {

    private static final long serialVersionUID = -1932544566622772528L;

    private String sysId;// 系统标识，有账务系统分配
    private String fromIp;// 操作请求终端IP

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getFromIp() {
        return fromIp;
    }

    public void setFromIp(String fromIp) {
        this.fromIp = fromIp;
    }

    public boolean validate() throws PaymentException {
        return true;
    }

}
