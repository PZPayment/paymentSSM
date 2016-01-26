package com.payment.comm.constants;

/**
 * 交易类型枚举
 *
 * @author Leo
 * @date 2013-7-4 下午2:41:15
 */
public enum EnumTradeType {

    RECHARGE_WITHDRAWALS(10, new String[]{"充值", "提现"}),

    TRANSFER(20, new String[]{"转入", "转出"}),

    ORDER_CONSUMER(30, new String[]{"订单收入", "订单支出"}),

    ADJUST(40, new String[]{"手工加点", "手工减点"}),

    ORDER_PROFIT(31, new String[]{"订单分润", "分润撤销"}),

    PAY_REFUND(32, new String[]{"订单撤销", "支付退款"}),

    COMMISSION(50, new String[]{"手续费", "手续费"}),

    PROMOTION(60, new String[]{"促销", "促销"}),

    OTHER(100, new String[]{"其他", "其他"});

    /**
     * 交易类型编号
     */
    private int tradeTypeId;
    /**
     * 交易类型名称
     */
    private String[] tradeTypeName;

    EnumTradeType(int tradeTypeId, String[] tradeTypeName) {
        this.tradeTypeId = tradeTypeId;
        this.tradeTypeName = tradeTypeName;

    }

    public int getTradeTypeId() {
        return tradeTypeId;
    }

    public String[] getTradeTypeName() {
        return tradeTypeName;
    }
}
