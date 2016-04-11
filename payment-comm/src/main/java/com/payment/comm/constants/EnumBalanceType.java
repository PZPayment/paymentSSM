package com.payment.comm.constants;

public enum EnumBalanceType {
    BALANCE(1001L, "余额", true), POINT(1002L, "积分", true),
    OWB(1003L, "在途资金", false), GUARANTEE(1004L, "担保资金", true),
    FBB(1005L, "押金", true),CREDITS(1006L, "信用额度", false);

    private final Long balanceTypeId;

    private final String balanceTypeName;

    private final boolean transfer;

    EnumBalanceType(Long balanceTypeId, String balanceTypeName, boolean transfer) {
        this.balanceTypeId = balanceTypeId;
        this.balanceTypeName = balanceTypeName;
        this.transfer = transfer;
    }

    public Long getBalanceTypeId() {
        return balanceTypeId;
    }

    public String getBalanceTypeName() {
        return balanceTypeName;
    }

    public Boolean isTransfer() {
        return transfer;
    }

}
