package com.payment.comm.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * 资金流水类型
 * AcctUser: Miner
 * Date: 14-6-18
 * Time: 下午3:15
 * To change this template use File | Settings | File Templates.
 */
public enum EnumFundsType {

    //充值提现
    //income
    RECHARGE_ONLINE(EnumTradeType.RECHARGE_WITHDRAWALS, 1101, "在线充值"),
    RECHARGE_ONLINE_PAY(EnumTradeType.RECHARGE_WITHDRAWALS, 1102, "在线消费充值"),
    RECHARGE_OFFLINE(EnumTradeType.RECHARGE_WITHDRAWALS, 1103, "线下充值"),
    RECHARGE_OFFLINE_PAY(EnumTradeType.RECHARGE_WITHDRAWALS, 1104, "线下消费充值"),
    RECHARGE_AGENT(EnumTradeType.RECHARGE_WITHDRAWALS, 1105, "委托充值"),
    WITHDRAWALS_REFUND(EnumTradeType.RECHARGE_WITHDRAWALS, 1106, "提现失败退点"),
    RECHARGE_FOURTHPAY(EnumTradeType.RECHARGE_WITHDRAWALS, 1107, "第四方支付转信用点"),
    RECHARGE_ONLINE_REFUND_INCOME(EnumTradeType.RECHARGE_WITHDRAWALS, 1108, "在线充值原路退款"),
    RECHARGE_ONLINE_REFUND_FAILURE_INCOME(EnumTradeType.RECHARGE_WITHDRAWALS, 1109, "在线充值原路退款失败退点"),
    RECHARGE_ONLINE_COMMISSION_REFUND_INCOME(EnumTradeType.RECHARGE_WITHDRAWALS, 1110, "在线充值原路退手续费"),
    RECHARGE_CREDITS_REPAYMENT(EnumTradeType.RECHARGE_WITHDRAWALS, 1111, "充值额度还款"),



    //payout
    WITHDRAWALS(EnumTradeType.RECHARGE_WITHDRAWALS, 2101, "余额提现"),
    RECHARGE_FOURTHPAYREFUND(EnumTradeType.RECHARGE_WITHDRAWALS, 2107, "第四方支付退点"),
    RECHARGE_ONLINE_REFUND_PAYOUT(EnumTradeType.RECHARGE_WITHDRAWALS, 2108, "在线充值原路退款"),
    RECHARGE_ONLINE_REFUND_FAILURE_PAYOUT(EnumTradeType.RECHARGE_WITHDRAWALS, 2109, "在线充值原路退款失败退点"),
    RECHARGE_ONLINE_COMMISSION_REFUND_PAYOUT(EnumTradeType.RECHARGE_WITHDRAWALS, 2110, "在线充值原路退手续费"),



    //转账
    //income
    TRANSFER_COMMON_INCOME(EnumTradeType.TRANSFER, 1201, "转账-转入"),

    TRANSFER_DEBT_INCOME(EnumTradeType.TRANSFER, 1202, "借款-转入"),

    TRANSFER_REPAY_DEBT_INCOME(EnumTradeType.TRANSFER, 1203, "扣点还借款-转入"),

    TRANSFER_CREDIT_DEBT_INCOME(EnumTradeType.TRANSFER, 1204, "额度消费借点-转入"),

    TRANSFER_REPAY_CREDIT_DEBT_INCOME(EnumTradeType.TRANSFER, 1205, "扣点还额度欠款-转入"),

    TRANSFER_WITHDRAWALS_INCOME(EnumTradeType.TRANSFER, 1206, "提现转信用点-转入"),

    TRANSFER_FOREGIFT_BALANCE_INCOME(EnumTradeType.TRANSFER, 1207, "押金转余额-转入"),

    TRANSFER_BALANCE_FOREGIFT_INCOME(EnumTradeType.TRANSFER, 1208, "余额转押金-转入"),

    TRANSFER_RECHARGE_INCOME(EnumTradeType.TRANSFER, 1209, "充值-转入"),

    TRANSFER_MONCHANGE_INCOME(EnumTradeType.TRANSFER, 1210, "货币转换-转入"),

    TRANSFER_CREDITS_REPAYMEN_INCOME(EnumTradeType.TRANSFER, 1211, "额度还款"),



    //payout
    TRANSFER_COMMON_PAYOUT(EnumTradeType.TRANSFER, 2201, "转账-转出"),

    TRANSFER_DEBT_PAYOUT(EnumTradeType.TRANSFER, 2202, "借款-转出"),

    TRANSFER_REPAY_DEBT_PAYOUT(EnumTradeType.TRANSFER, 2203, "扣点还借款-转出"),

    TRANSFER_CREDIT_DEBT_PAYOUT(EnumTradeType.TRANSFER, 2204, "额度消费借点-转出"),

    TRANSFER_REPAY_CREDIT_DEBT_PAYOUT(EnumTradeType.TRANSFER, 2205, "扣点还额度欠款-转出"),

    TRANSFER_WITHDRAWALS_PAYOUT(EnumTradeType.TRANSFER, 2206, "提现转信用点-转出"),

    TRANSFER_FOREGIFT_BALANCE_PAYOUT(EnumTradeType.TRANSFER, 2207, "押金转余额-转出"),

    TRANSFER_BALANCE_FOREGIFT_PAYOUT(EnumTradeType.TRANSFER, 2208, "余额转押金-转出"),

    TRANSFER_RECHARGE_PAYOUT(EnumTradeType.TRANSFER, 2209, "充值-转出"),

    TRANSFER_MONCHANGE_PAYOUT(EnumTradeType.TRANSFER, 2210, "货币转换-转出"),

    TRANSFER_CREDITS_REPAYMEN_PAYOUT(EnumTradeType.TRANSFER, 2211, "额度还款"),


    //订单相关
    //income
    ORDER_SETTLE(EnumTradeType.ORDER_CONSUMER, 1301, "订单结算"),

    ORDER_PROFIT(EnumTradeType.ORDER_CONSUMER, 1302, "订单分润"),

    ORDER_CANCEL_REFUND(EnumTradeType.ORDER_CONSUMER, 1303, "订单撤销退点"),

    ORDER_BACK_SALE(EnumTradeType.ORDER_CONSUMER, 1304, "订单回款"),

    ORDER_GUARANTEE_SETTLE(EnumTradeType.ORDER_CONSUMER, 1305, "资金担保"),

    ORDER_CREDITS_REFUND(EnumTradeType.ORDER_CONSUMER, 1306, "信用退款"),

    ORDER_ADMIN_CREDITS_REFUND(EnumTradeType.ORDER_CONSUMER, 1307, "授信退款"),


    //payout
    ORDER_CONSUMER(EnumTradeType.ORDER_CONSUMER, 2301, "订单扣款"),

    ORDER_PROFIT_CANCEL(EnumTradeType.ORDER_CONSUMER, 2302, "分润撤销"),

    ORDER_CANCEL_PAYOUT(EnumTradeType.ORDER_CONSUMER, 2303, "订单撤销扣点"),

    ORDER_CANCEL_BACK_SALE(EnumTradeType.ORDER_CONSUMER, 2304, "订单回款撤销"),

    ORDER_PROFIT_NEGATIVE(EnumTradeType.ORDER_CONSUMER, 2305, "负利润"),

    ORDER_GUARANTEE_CONSUMER(EnumTradeType.ORDER_CONSUMER, 2306, "担保结算"),

    ORDER_GUARANTEE_REFUND(EnumTradeType.ORDER_CONSUMER, 2307, "担保退款"),

    ORDER_CREDITS_CONSUMER(EnumTradeType.ORDER_CONSUMER, 2308, "信用消费"),

    ORDER_ADMIN_CREDITS_CONSUMER(EnumTradeType.ORDER_CONSUMER, 2309, "授信消费"),

    //调账
    //income
    ADJUST_ADD_BANK_REMIT(EnumTradeType.ADJUST, 1401, "银行汇款加点"),

    ADJUST_ADD_REFUND_PART(EnumTradeType.ADJUST, 1402, "订单部分退款"),

    ADJUST_ADD_CREDIT_WITHDRAWALS(EnumTradeType.ADJUST, 1403, "信用点提现取消"),

    ADJUST_ADD_DEBT_TEMP(EnumTradeType.ADJUST, 1404, "借款"),

    ADJUST_ADD_COMMISSION(EnumTradeType.ADJUST, 1405, "手续费加点"),

    ADJUST_ADD_CUSTOM_FEE(EnumTradeType.ADJUST, 1406, "客户费用加点"),

    ADJUST_ADD_OFFLINE_GOODS(EnumTradeType.ADJUST, 1407, "线下发货加点"),

    ADJUST_ADD_DEBT_BAR(EnumTradeType.ADJUST, 1408, "网吧借款"),

    ADJUST_ADD_CREDITS(EnumTradeType.ADJUST, 1409, "额度调整"),

    ADJUST_ADD_OTHER(EnumTradeType.ADJUST, 1499, "其他加点"),


    //payout
    ADJUST_SUB_BANK_REMIT(EnumTradeType.ADJUST, 2401, "银行汇款扣点"),

    ADJUST_SUB_REFUND_PART(EnumTradeType.ADJUST, 2402, "订单部分退款取消"),

    ADJUST_SUB_CREDIT_WITHDRAWALS(EnumTradeType.ADJUST, 2403, "信用点提现"),

    ADJUST_SUB_DEBT_TEMP(EnumTradeType.ADJUST, 2404, "还款"),

    ADJUST_SUB_COMMISSION(EnumTradeType.ADJUST, 2405, "手续费扣点"),

    ADJUST_SUB_CUSTOM_FEE(EnumTradeType.ADJUST, 2406, "客户费用扣点"),

    ADJUST_SUB_DEBT_BAR(EnumTradeType.ADJUST, 2404, "网吧还款"),

    ADJUST_SUB_OFFLINE_GOODS(EnumTradeType.ADJUST, 2407, "线下发货扣点"),

    ADJUST_SUB_SYSTEM_FEE(EnumTradeType.ADJUST, 2408, "系统服务费"),

    ADJUST_SUB_CREDITS(EnumTradeType.ADJUST, 2409, "额度调整"),

    //手续费
    //income
    COMMISSION_ADD_ONLINE(EnumTradeType.COMMISSION, 1501, "在线支付手续费"),
    //payout
    COMMISSION_SUB_ONLINE(EnumTradeType.COMMISSION, 2501, "在线支付手续费"),

    ADJUST_SUB_OTHER(EnumTradeType.ADJUST, 2499, "其他扣点"),

    /**活动类 操作小类 begin*/
    PROMOTION_POINT_JION_INCOME(EnumTradeType.PROMOTION, 1698, "积分消费收入"),
    PROMOTION_POINT_ADD_REFUND(EnumTradeType.PROMOTION, 1601, "积分消费撤销"),
    PROMOTION_POINT_ADD_REGISTER(EnumTradeType.PROMOTION, 1602, "积分奖励(注册)"),
    PROMOTION_POINT_ADD_LOGIN(EnumTradeType.PROMOTION, 1603, "积分奖励(登录)"),
    PROMOTION_POINT_ADD_TRADE(EnumTradeType.PROMOTION, 1604, "积分奖励(交易)"),
    PROMOTION_POINT_ADD_ACCRUAL(EnumTradeType.PROMOTION, 1605, "积分奖励(余额)"),
    PROMOTION_POINT_ADD(EnumTradeType.PROMOTION, 1606, "积分奖励"),
    PROMOTION_POINT_ADD_ADJUST(EnumTradeType.PROMOTION, 1699, "积分调账"),

    PROMOTION_POINT_SUB_CONSUME(EnumTradeType.ORDER_CONSUMER, 2601, "积分消费"),
    PROMOTION_POINT_SUB_CANCEL(EnumTradeType.ORDER_CONSUMER, 2604, "积分奖励撤销"),
    PROMOTION_POINT_SUB_RESET(EnumTradeType.PROMOTION, 2609, "积分清零"),
    // Boss发行积分扣余额
    PROMOTION_POINT_ISSUANCE(EnumTradeType.PROMOTION, 2698, "发行积分"),
    PROMOTION_POINT_SUB_ADJUST(EnumTradeType.PROMOTION, 2699, "积分调账");
    /**活动类 操作小类 end*/

    EnumFundsType(EnumTradeType enumTradeType, Integer busiTypeId, String busiTypeName) {
        this.enumTradeType = enumTradeType;
        this.busiTypeId = busiTypeId;
        this.busiTypeName = busiTypeName;
    }

    private EnumTradeType enumTradeType;
    private Integer busiTypeId;
    private String busiTypeName;

    public EnumTradeType getEnumTradeType() {
        return enumTradeType;
    }

    public Integer getBusiTypeId() {
        return busiTypeId;
    }

    public String getBusiTypeName() {
        return busiTypeName;
    }

    public static List<EnumFundsType> getBusiTypeByTradeType(Integer tradeTypeId) {
        List<EnumFundsType> enumFundsTypes = new ArrayList<EnumFundsType>();
        for (EnumFundsType enumFundsType : EnumFundsType.values()) {
            //遍历枚举
            if (enumFundsType.getEnumTradeType().getTradeTypeId()==tradeTypeId) {
                //FundsType的大类和传的大类相同
                enumFundsTypes.add(enumFundsType);
            }
        }
        return enumFundsTypes;
    }
}
