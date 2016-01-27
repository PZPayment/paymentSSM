package com.payment.comm.utils;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.constants.BaseErrorCode;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Description:
 * AcctUser: Miner
 * Date: 15/5/19
 * Time: 15:33
 */
public class JsonUtil {
    private static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, false);
    }

    public static <T> T convertObject(String content, Class<T> valueType) throws PaymentException {

        try {
            return mapper.readValue(content, valueType);
        } catch (Exception e) {
            throw new PaymentException(BaseErrorCode.SYSTEM_ERROR, "json格式的字符串无法转换为"
                    + valueType.toString() + "类型");
        }
    }


    public static String convertString(Object value) throws PaymentException {
        try {
            return mapper.writeValueAsString(value);
        } catch (Exception e) {
            throw new PaymentException(BaseErrorCode.SYSTEM_ERROR, value + "转换为json格式的字符串失败");
        }
    }


}
