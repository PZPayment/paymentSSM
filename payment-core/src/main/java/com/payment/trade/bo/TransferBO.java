package com.payment.trade.bo;

import com.payment.comm.base.bean.BaseBean;
import com.payment.comm.constants.EnumTransferType;
import com.payment.generator.domain.AcctUser;
import lombok.Data;

/**
 * Created by fangchao on 15/12/25.
 */

@Data
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

}
