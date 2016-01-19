package com.payment.comm.constants;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.kan.comm.constants  <br>
 * 描      述: 订单类型                      <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/29      <br>
 */
public enum EnumTradeType {
    PAYMENT("T",16),
    CHARGE("C",16),
    PAY("M",16);
    private String prefix;
    private int lenth;


    EnumTradeType(String prefix, int lenth) {
        this.prefix = prefix;
        this.lenth=lenth;
    }
}
