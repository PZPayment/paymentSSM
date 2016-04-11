package com.payment.trade.bo;

import com.payment.comm.constants.EnumFundsType;

/**
 *
 * 包      名: com.payment.trade.service  <br>
 * 描      述:  流水业务BO
 * 创 建 人 : 方超(OF716)  <br>
 */
public class FundsRecordBO {
    /**
     * 操作小类
     */
    private EnumFundsType inFundsType;


    /**
     * 操作小类
     */
    private EnumFundsType outFundsType;

    /**
     * 账务系统订单号
     */
    private String orderNo;

    /**
     * 外部业务订单号
     */
    private String outOrderNo;

    /**
     * 操作人
     */
    private String optUser;

    /**
     * 操作人姓名
     */
    private String optUserName;

    /**
     * 转帐描述
     */
    private String refundDesc;

    public EnumFundsType getInFundsType() {
        return inFundsType;
    }

    public void setInFundsType(EnumFundsType inFundsType) {
        this.inFundsType = inFundsType;
    }

    public EnumFundsType getOutFundsType() {
        return outFundsType;
    }

    public void setOutFundsType(EnumFundsType outFundsType) {
        this.outFundsType = outFundsType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getOptUser() {
        return optUser;
    }

    public void setOptUser(String optUser) {
        this.optUser = optUser;
    }

    public String getOptUserName() {
        return optUserName;
    }

    public void setOptUserName(String optUserName) {
        this.optUserName = optUserName;
    }

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }
}
