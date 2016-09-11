package com.payment.pay.bankRsData;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * 包      名: com.payment.pay.bankRqData  <br>
 * 描      述:  银行回调XML转换的bean                     <br>
 * 创 建 人 : kan <br>
 */
public class BankRsData {

    public void initField(Map<String, String[]> paramMap) throws Exception {
        String[] fieldValArr = null;
        Class<? extends BankRsData> cls = getClass();
        Field[] fieldArr = cls.getDeclaredFields();
        for (int i = 0, j = fieldArr.length; i < j; i++) {
            fieldValArr = paramMap.get(fieldArr[i].getName());
            if (fieldValArr == null || fieldValArr.length != 1 || fieldValArr[0].trim().isEmpty()) {
                continue;
            }
            try {
                setFieldValue(fieldArr[i].getName(), fieldValArr[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void setFieldValue(String fieldName, String fieldValue) throws Exception {
        StringBuffer nameBuf = new StringBuffer("set");
        nameBuf.append(fieldName.substring(0, 1).toUpperCase());
        nameBuf.append(fieldName.substring(1));

        Method method = getClass().getMethod(nameBuf.toString(), String.class);
        if (method == null) {

        } else {
            method.invoke(this, fieldValue);
        }
    }


}
