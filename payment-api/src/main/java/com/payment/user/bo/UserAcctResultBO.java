package com.payment.user.bo;

import java.math.BigDecimal;

/**
 * 包      名: com.payment.user.bo  <br>
 * 描      述:  用户                     <br>
 * 创 建 人 : kan <br>
 */
public class UserAcctResultBO {

    /**
     * 余额
     */
    private BigDecimal balance = BigDecimal.ZERO;
    /**
     * 在途资金
     */
    private BigDecimal intransitBalance= BigDecimal.ZERO;

    /**
     * 押金、保证金
     */
    private BigDecimal foregiftBalance= BigDecimal.ZERO;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getIntransitBalance() {
        return intransitBalance;
    }

    public void setIntransitBalance(BigDecimal intransitBalance) {
        this.intransitBalance = intransitBalance;
    }

    public BigDecimal getForegiftBalance() {
        return foregiftBalance;
    }

    public void setForegiftBalance(BigDecimal foregiftBalance) {
        this.foregiftBalance = foregiftBalance;
    }
}
