package com.payment.comm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 包      名: com.payment.comm.utils  <br>
 * 描      述:                       <br>
 * 创 建 人 : kan <br>
 */
public class DateUtils {

    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    public static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";


    public static final SimpleDateFormat _defDateTimeFmt =
            new SimpleDateFormat(DEFAULT_DATETIME_FORMAT);

    public static final SimpleDateFormat _defDateFmt =
            new SimpleDateFormat(DEFAULT_DATE_FORMAT);



    public static String toString(Date date, String format) {

        SimpleDateFormat formatter;

        if ((date == null) || (format == null) || (format.length() == 0)) {
            return null;
        }
        formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static String toString(Date date) {
        if (null == date) {
            return null;
        } else {
            return _defDateTimeFmt.format(date);
        }
    }



}
