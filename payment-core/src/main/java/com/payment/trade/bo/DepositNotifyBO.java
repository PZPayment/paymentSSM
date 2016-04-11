package com.payment.trade.bo;


import com.payment.comm.base.bo.BaseApiBean;
import com.payment.comm.base.exception.PaymentException;

/**
 * 包      名: com.payment.trade.bo<br>
 * 描      述:   支付成功通知核心加款BO <br>
 * 创 建 人 :  kan   <br>
 */
public class DepositNotifyBO extends BaseApiBean {

    /**
     * 通知唯一标识 回支付系统使用
     */
    private String token;
    /**
     * 外部充值单号
     */
    private String outChargeNo;
    /**
     * 充值单号
     */
    private String chargeNo;

    /**
     * 充值用户编号
     */
    private String userId;
    /**
     * 充值账户编号
     */
    private String acctId;

    /**
     * 充值金额
     */
    private Long chargeAmount;

    /**
     * 手续费金额
     */
    private Long chargeCommission;

    /**
     * 银行编号
     */
    private String bankCode;

    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 网关编号
     */
    private String gateCode;
    /**
     * 网关名称
     */
    private String gateName;

    /**
     * 是否自定义
     */
    private boolean isCustom;

    /**
     * 是否新建充值单
     */
    private boolean isCreate;

    /**
     * 是否支付成功
     */
    private boolean isSuccess;

    /**
     * 是否延时到账
     */
    private boolean isDelay;
    /**
     * 到账时间
     */
    private String dealTime;

    /**
     * 是否需要上级承担手续费
     */
    private boolean isBearCommission;

    /**
     * 手续费订单编号
     */
    private String commissionOrderNo;

    /**
     * 充值备注
     */
    private String remark;

    /**
     * 加点是否需要审核
     */
    private boolean isChargeCheck;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOutChargeNo() {
        return outChargeNo;
    }

    public void setOutChargeNo(String outChargeNo) {
        this.outChargeNo = outChargeNo;
    }

    public String getChargeNo() {
        return chargeNo;
    }

    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public Long getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Long chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public Long getChargeCommission() {
        return chargeCommission;
    }

    public void setChargeCommission(Long chargeCommission) {
        this.chargeCommission = chargeCommission;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getGateCode() {
        return gateCode;
    }

    public void setGateCode(String gateCode) {
        this.gateCode = gateCode;
    }

    public boolean isCustom() {
        return isCustom;
    }

    public void setIsCustom(boolean isCustom) {
        this.isCustom = isCustom;
    }

    public boolean isCreate() {
        return isCreate;
    }

    public void setIsCreate(boolean isCreate) {
        this.isCreate = isCreate;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean isDelay() {
        return isDelay;
    }

    public void setIsDelay(boolean isDelay) {
        this.isDelay = isDelay;
    }

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    public boolean isBearCommission() {
        return isBearCommission;
    }

    public void setIsBearCommission(boolean isBearCommission) {
        this.isBearCommission = isBearCommission;
    }

    public String getCommissionOrderNo() {
        return commissionOrderNo;
    }

    public void setCommissionOrderNo(String commissionOrderNo) {
        this.commissionOrderNo = commissionOrderNo;
    }

    public boolean isChargeCheck() {
        return isChargeCheck;
    }

    public void setIsChargeCheck(boolean isChargeCheck) {
        this.isChargeCheck = isChargeCheck;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    @Override
    public boolean validate() throws PaymentException {
        checkField("token");
        checkField("chargeAmount");
        return true;
    }
}
