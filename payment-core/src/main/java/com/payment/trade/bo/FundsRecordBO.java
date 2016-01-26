package com.payment.trade.bo;

import com.payment.comm.constants.EnumFundsType;
import lombok.Data;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.payment.trade.service  <br>
 * 描      述:  流水业务BO                     <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/20      <br>
 */
@Data
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

}
