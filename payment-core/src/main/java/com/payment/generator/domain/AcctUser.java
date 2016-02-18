package com.payment.generator.domain;

import com.payment.comm.base.domain.AbstractEntity;

import java.io.Serializable;
import java.util.Date;

public class AcctUser extends AbstractEntity implements Serializable {
    private String userId;

    private String payPsw;

    private Short isUsePayPsw;

    private Short countInvalidPwd;

    private Short pwdStrength;

    private String payBaseKey;

    private Short payPswType;

    private String pswQuest;

    private String pswAns;

    private Short idType;

    private String idNo;

    private Short acctState;

    private String realName;

    private String emaill;

    private String mobile;

    private Short realCheck;

    private Integer creditGrade;

    private String regIp;

    private Date regTime;

    private Date lastLogTime;

    private String lastLogIp;

    private Long errLogNum;

    private Date errLogTime;

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

    public String getPswQuest() {
        return pswQuest;
    }

    public void setPswQuest(String pswQuest) {
        this.pswQuest = pswQuest == null ? null : pswQuest.trim();
    }

    public String getPswAns() {
        return pswAns;
    }

    public void setPswAns(String pswAns) {
        this.pswAns = pswAns == null ? null : pswAns.trim();
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

    public Short getAcctState() {
        return acctState;
    }

    public void setAcctState(Short acctState) {
        this.acctState = acctState;
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

    public Integer getCreditGrade() {
        return creditGrade;
    }

    public void setCreditGrade(Integer creditGrade) {
        this.creditGrade = creditGrade;
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

    public Date getLastLogTime() {
        return lastLogTime;
    }

    public void setLastLogTime(Date lastLogTime) {
        this.lastLogTime = lastLogTime;
    }

    public String getLastLogIp() {
        return lastLogIp;
    }

    public void setLastLogIp(String lastLogIp) {
        this.lastLogIp = lastLogIp == null ? null : lastLogIp.trim();
    }

    public Long getErrLogNum() {
        return errLogNum;
    }

    public void setErrLogNum(Long errLogNum) {
        this.errLogNum = errLogNum;
    }

    public Date getErrLogTime() {
        return errLogTime;
    }

    public void setErrLogTime(Date errLogTime) {
        this.errLogTime = errLogTime;
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
        sb.append(", pswQuest=").append(pswQuest);
        sb.append(", pswAns=").append(pswAns);
        sb.append(", idType=").append(idType);
        sb.append(", idNo=").append(idNo);
        sb.append(", acctState=").append(acctState);
        sb.append(", realName=").append(realName);
        sb.append(", emaill=").append(emaill);
        sb.append(", mobile=").append(mobile);
        sb.append(", realCheck=").append(realCheck);
        sb.append(", creditGrade=").append(creditGrade);
        sb.append(", regIp=").append(regIp);
        sb.append(", regTime=").append(regTime);
        sb.append(", lastLogTime=").append(lastLogTime);
        sb.append(", lastLogIp=").append(lastLogIp);
        sb.append(", errLogNum=").append(errLogNum);
        sb.append(", errLogTime=").append(errLogTime);
        sb.append(", companyName=").append(companyName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public String getId() {
        return this.userId;
    }
}