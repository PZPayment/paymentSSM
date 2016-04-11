package com.payment.trade.bo;

import com.payment.comm.base.bean.BaseBean;
import com.payment.comm.constants.EnumTransferType;
import com.payment.generator.domain.AcctUser;
import lombok.Data;

/**
 * Created by fangchao on 15/12/25.
 */

public class TransferBO extends BaseBean {
    private static final long serialVersionUID = 4107304367123463493L;

    /**
     * 转出
     */
    private AcctUser fromUser;
    /**
     * 转入
     */
    private AcctUser toUser;
    /**
     * 转出金额
     */
    private Long fromAmount;
    /**
     * 转入金额
     */
    private Long toAmount;

    /**
     * 业务类型编号
     */
    private EnumTransferType transferType;

    public AcctUser getFromUser() {
        return fromUser;
    }

    public void setFromUser(AcctUser fromUser) {
        this.fromUser = fromUser;
    }

    public AcctUser getToUser() {
        return toUser;
    }

    public void setToUser(AcctUser toUser) {
        this.toUser = toUser;
    }

    public Long getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(Long fromAmount) {
        this.fromAmount = fromAmount;
    }

    public Long getToAmount() {
        return toAmount;
    }

    public void setToAmount(Long toAmount) {
        this.toAmount = toAmount;
    }

    public EnumTransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(EnumTransferType transferType) {
        this.transferType = transferType;
    }
}
