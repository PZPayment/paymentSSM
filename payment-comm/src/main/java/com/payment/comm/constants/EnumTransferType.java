package com.payment.comm.constants;

public enum EnumTransferType {
    ISSUEPOINTS("1000", "发行积分"),
    DEPOSIT2OWB("1001", "充值进在途"),
    BALANCE2FOREGIFT("1040", "余额转押金"),
    FOREGIFT2BALANCE("1050", "押金转余额"),
    BALANCE2OWB("1060", "余额转在途资金"),
    OWB2BALANCE("1070", "在途资金转余额"),
    OWB2BANK("1080", "在途资金扣除"),
    POINT2BALANCE("1090", "积分转余额"),
    BALANCE2POINT("1100", "余额转积分"),
    OWBADD("1101", "在途资金增加"),
    OWBTRANSFER("2102", "在途转账"),
    POINTADD("1103", "积分增加"),
    BALANCEDEDUCT("1104", "余额扣除"),
    BALANCE2GUARANTEE("1113", "余额转担保资金"),
    CREDITSCONSUME("1111", "信用额度消费"),
    CREDITSCHARGE("1112", "信用额度还款"),
    GENERALTRANSFER("0000","普通转账"),
    GUARANTEESETTLE("2110", "担保支付"),
    GUARANTEECONSUMER("2120", "担保结算"),
    GUARANTEEREFUND("2130", "担保退款"),
    CREDITSPAYMENT("2105","信用支付_实时"),
    CREDITSGUARANTEEPAYMENT("2106","信用支付_担保"),
    CREDITSREFUND("2108","信用退款"),
    CREDITSGUARANTEEREFUND("2109","信用退款"),
    CREDITSDEPOSIT("2110","信用充值");

    /**
     * 转账类型标识
     */
    private final String transferTypeCode;
    /**
     * 转账类型名称
     */
    private final String transferTypeName;

    EnumTransferType(String transferTypeCode, String transferTypeName) {
        this.transferTypeCode = transferTypeCode;
        this.transferTypeName = transferTypeName;
    }

    public String getTransferTypeCode() {
        return transferTypeCode;
    }

    public String getTransferTypeName() {
        return transferTypeName;
    }

}
