package com.payment.comm.constants;

public enum EnumBalanceType {
    BALANCE(Short.valueOf("1001"), "余额", true), POINT(Short.valueOf("1003"), "积分", true), OWB(
            Short.valueOf("1004"), "在途资金", false), GUARANTEE(Short.valueOf("1005"), "担保资金", true),
    FBB(Short.valueOf("1006"), "押金", true),CREDITS(Short.valueOf("1007"), "信用额度", false);

    private final Short balanceTypeId;

    private final String balanceTypeName;

    private final boolean transfer;

    EnumBalanceType(Short balanceTypeId, String balanceTypeName, boolean transfer) {
        this.balanceTypeId = balanceTypeId;
        this.balanceTypeName = balanceTypeName;
        this.transfer = transfer;
    }

    public short getBalanceTypeId() {
        return balanceTypeId;
    }

    public String getBalanceTypeName() {
        return balanceTypeName;
    }

    public Boolean isTransfer() {
        return transfer;
    }

    public static void main(String[] args) {
        System.out.println(EnumBalanceType.BALANCE.getBalanceTypeId());
        System.out.println(EnumBalanceType.BALANCE.balanceTypeId);
        System.out.println(EnumBalanceType.BALANCE.getBalanceTypeName());
    }
}
