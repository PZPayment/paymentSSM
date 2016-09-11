package com.payment.domain;

import com.payment.comm.base.domain.AbstractEntity;

import java.io.Serializable;
import java.util.Date;

public class User  extends AbstractEntity implements Serializable {


    private String userId;

    private String payPsw;

    private Short isUsePayPsw;

    private Short countInvalidPwd;

    private Short pwdStrength;

    private String payBaseKey;

    private Short payPswType;

    private Short idType;

    private String idNo;

    private Short userState;

    private String realName;

    private String emaill;

    private String mobile;

    private Short realCheck;

    private String regIp;

    private Date regTime;

    private String companyName;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPayPsw() {
        return payPsw;
    }

    public void setPayPsw(String payPsw) {
        this.payPsw = payPsw == null ? null : payPsw.trim();
    }

    public Short getIsUsePayPsw() {
        return isUsePayPsw;
    }

    public void setIsUsePayPsw(Short isUsePayPsw) {
        this.isUsePayPsw = isUsePayPsw;
    }

    public Short getCountInvalidPwd() {
        return countInvalidPwd;
    }

    public void setCountInvalidPwd(Short countInvalidPwd) {
        this.countInvalidPwd = countInvalidPwd;
    }

    public Short getPwdStrength() {
        return pwdStrength;
    }

    public void setPwdStrength(Short pwdStrength) {
        this.pwdStrength = pwdStrength;
    }

    public String getPayBaseKey() {
        return payBaseKey;
    }

    public void setPayBaseKey(String payBaseKey) {
        this.payBaseKey = payBaseKey == null ? null : payBaseKey.trim();
    }

    public Short getPayPswType() {
        return payPswType;
    }

    public void setPayPswType(Short payPswType) {
        this.payPswType = payPswType;
    }

    public Short getIdType() {
        return idType;
    }

    public void setIdType(Short idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public Short getUserState() {
        return userState;
    }

    public void setUserState(Short userState) {
        this.userState = userState;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill == null ? null : emaill.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Short getRealCheck() {
        return realCheck;
    }

    public void setRealCheck(Short realCheck) {
        this.realCheck = realCheck;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", payPsw=").append(payPsw);
        sb.append(", isUsePayPsw=").append(isUsePayPsw);
        sb.append(", countInvalidPwd=").append(countInvalidPwd);
        sb.append(", pwdStrength=").append(pwdStrength);
        sb.append(", payBaseKey=").append(payBaseKey);
        sb.append(", payPswType=").append(payPswType);
        sb.append(", idType=").append(idType);
        sb.append(", idNo=").append(idNo);
        sb.append(", userState=").append(userState);
        sb.append(", realName=").append(realName);
        sb.append(", emaill=").append(emaill);
        sb.append(", mobile=").append(mobile);
        sb.append(", realCheck=").append(realCheck);
        sb.append(", regIp=").append(regIp);
        sb.append(", regTime=").append(regTime);
        sb.append(", companyName=").append(companyName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String getId() {
        return userId;
    }
}