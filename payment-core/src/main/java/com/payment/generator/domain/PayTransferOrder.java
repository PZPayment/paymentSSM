package com.payment.generator.domain;

import com.payment.comm.base.domain.AbstractEntity;

import java.io.Serializable;
import java.util.Date;

public class PayTransferOrder extends AbstractEntity implements Serializable {
    private String tradeNo;

    private String fromUserId;

    private String toUserId;

    private Long transAmount;

    private Date createTime;

    private String operator;

    private String remark;

    private String outOrderNo;

    private String busiTypeName;

    private static final long serialVersionUID = 1L;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId == null ? null : fromUserId.trim();
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId == null ? null : toUserId.trim();
    }

    public Long getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(Long transAmount) {
        this.transAmount = transAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo == null ? null : outOrderNo.trim();
    }

    public String getBusiTypeName() {
        return busiTypeName;
    }

    public void setBusiTypeName(String busiTypeName) {
        this.busiTypeName = busiTypeName == null ? null : busiTypeName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", fromUserId=").append(fromUserId);
        sb.append(", toUserId=").append(toUserId);
        sb.append(", transAmount=").append(transAmount);
        sb.append(", createTime=").append(createTime);
        sb.append(", operator=").append(operator);
        sb.append(", remark=").append(remark);
        sb.append(", outOrderNo=").append(outOrderNo);
        sb.append(", busiTypeName=").append(busiTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public String getId() {
        return tradeNo;
    }
}