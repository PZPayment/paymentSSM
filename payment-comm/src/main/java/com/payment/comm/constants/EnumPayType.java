package com.payment.comm.constants;

public enum EnumPayType {
    OLP("OLP", "在线支付", true, false), GRP("GRP", "货到付款", false, false), BTP("BTP", "转账汇款", false, false),
    OBP("OBP", "余额支付", false, true), OCP("OCP", "积分支付", false, true), UNP("UNP", "组合支付", false, false),
    CRP("CRP", "信用支付", false, true), CAP("CAP", "现金支付", false, true);

    /**
     * 支付类型标识
     */
    private final String payTypeId;

    /**
     * 支付类型名称
     */
    private final String payTypeName;

    /**
     * 是否跳转支付
     */
    private final boolean redirect;

    /**
     * 是否是实时交易（欧飞系统资金，如信用点、积分）
     */
    private final boolean realTime;

    EnumPayType(String payTypeId, String payTypeName, boolean redirect, boolean realTime) {
        this.payTypeId = payTypeId;
        this.payTypeName = payTypeName;
        this.redirect = redirect;
        this.realTime = realTime;
    }

    public String getPayTypeId() {
        return payTypeId;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public boolean isRedirect() {
        return redirect;
    }

    public boolean isRealTime() {
        return realTime;
    }

    public static void main(String[] args) {
        System.out.println(EnumPayType.OLP.getPayTypeId());
        System.out.println(EnumPayType.OLP.payTypeId);
        System.out.println(EnumPayType.OLP.payTypeName);
    }

    public static EnumPayType getPayType(String payTypeId) {
        for (EnumPayType enumPayType : EnumPayType.values()) {
            if (enumPayType.getPayTypeId().equals(payTypeId)) {
                return enumPayType;
            }
        }
        return null;
    }
}
