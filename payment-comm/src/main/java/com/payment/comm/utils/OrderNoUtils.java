package com.payment.comm.utils;


import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

/**
 * 包      名: com.ofpay.system.utils  <br>
 * 描      述:  字符串按格式加前缀后缀                     <br>
 * 创 建 人 : kan <br>
 */
public class OrderNoUtils {

    /**
     * 函数功能: 格式化订单编号
     *
     * @param expression 格式
     * @param value 值
     * @param prefix 前缀
     * @param suffix 后缀
     * @return String 格式化后的订单号
     * @throws
     */
    public static String fillString( String expression, long value, String prefix, String suffix) {
        StringBuffer strBuff = new StringBuffer();


        if (StringUtils.isBlank(expression)) {
            return "";
        }

        if (StringUtils.isNotBlank(prefix)) {
            strBuff.append(prefix);
        }

        strBuff.append(String.format(Locale.CHINA, expression, value));

        if (StringUtils.isNotBlank(suffix)) {
            strBuff.append(suffix);
        }

        return strBuff.toString();
    }
}
