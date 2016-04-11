package com.payment.comm.utils;

import java.math.BigDecimal;

/**
 *
 * 包      名: com.payment.comm.utils  <br>
 * 描      述:
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/28
 */
public class MoneyUtils {

    /**
     * 商户金额单位对应支付定单金额单位（元对应分）比：100
     */
    public static final int SYS_MONEY_UNIT = 100;

    /**
     * 系统金额单位转到元（精确到分）
     *
     * @param amount - 金额（厘）
     * @return - 金额（元）
     */
    public static BigDecimal sysUnitToYuan(Long amount) {
        if (amount == null) {
            return BigDecimal.ZERO;
        }

        BigDecimal result = new BigDecimal(amount).divide(new BigDecimal(SYS_MONEY_UNIT));
        result = result.setScale(2, BigDecimal.ROUND_HALF_UP);
        return result;
    }
    /**
     * 系统金额单位转到元（精确到分）
     *
     * @param amount - 金额（厘）
     * @return - 金额（元）
     */
    public static Long yuanTosysUnit(BigDecimal amount) {
        if (amount == null) {
            return 0L;
        }

        BigDecimal result = amount.multiply(new BigDecimal(SYS_MONEY_UNIT));
        result = result.setScale(0, BigDecimal.ROUND_HALF_UP);
        return result.longValue();
    }

    /**
     * 系统金额单位转到元（精确到分）
     *
     * @param amount - 金额（厘）
     * @return - 金额（元）
     */
    public static BigDecimal yuanTosysUnitP(BigDecimal amount) {
        if (amount == null) {
            return BigDecimal.ZERO;
        }

        BigDecimal result = amount.multiply(new BigDecimal(SYS_MONEY_UNIT));
        result = result.setScale(0, BigDecimal.ROUND_HALF_UP);
        return result;
    }

}
