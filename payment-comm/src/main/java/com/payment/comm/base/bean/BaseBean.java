package com.payment.comm.base.bean;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.errorCode.BaseErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 *
 * 包      名: com.payment.comm.base.bean  <br>
 * 描      述:
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/1/20
 */
public class BaseBean  implements Serializable {

    /**
     * 是否已完成转换
     */
    private boolean isFormat = false;

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /*
     * 该方法把作为查询条件的bo中的字段进行String
     */
    public String boToString() {
        Class<?> c = this.getClass();
        Field[] fields = c.getDeclaredFields();
        int iLen = fields.length;
        String result = "";
        for (int i = 0; i < iLen; i++) {
            Object o = null;
            try {
                fields[i].setAccessible(true);
                o = fields[i].get(this);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            if (o == null) {
                o = "null";
            }
            result = result + "_" + o.toString();
        }
        return c + String.valueOf(System.currentTimeMillis()) + result;
    }

    public boolean isBlank(Object obj) {
        return obj == null || StringUtils.isBlank(obj.toString());
    }

    /**
     * @return 返回 isFormat
     */
    public boolean isFormat() {
        return isFormat;
    }

    /**
     *
     * @param isFormat 对isFormat进行赋值
     */
    public void setFormat(boolean isFormat) {
        this.isFormat = isFormat;
    }

    /**
     * 格式化金额精度
     *
     * @return void [返回类型说明]
     * @throws throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public void formatAmount() {
    }

    protected boolean checkField(Object field) throws PaymentException {
        if (isBlank(field)) {
            throw new PaymentException(BaseErrorCode.ARGS_IS_NULL);
        }
        return true;
    }


}
