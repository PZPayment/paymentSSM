package com.payment.comm.base.bo;


import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.constants.BaseErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 非动作类，不带响应参数
 *
 * @author Miner
 */
public class BaseBean implements Serializable {
    private static final long serialVersionUID = 1951436960547420065L;

    /**
     * 是否已完成转换
     */
    private boolean isFormat = false;

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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
