package com.payment.trade.bo.payMethod;

import com.payment.comm.base.bo.BaseBean;
import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.errorCode.BaseErrorCode;
import com.payment.comm.constants.EnumPayType;
import com.payment.comm.errorCode.TradeErrorCode;
import com.payment.comm.utils.MoneyUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

/**
 * 包      名: com.payment.trade.bo  <br>
 * 描      述:                       <br>
 * 创 建 人 : kan <br>
 */
public abstract class PayMethod extends BaseBean implements Cloneable  {
    /**
     * 付款类型
     */
    protected EnumPayType payType;

    /**
     * 支付金额
     */
    private BigDecimal amount;

    /**
     * 使用的银行编码
     */
    private String bankCode;

    @Override
    public void formatAmount() {
        if (!isFormat()) {
            amount = MoneyUtils.yuanTosysUnitP(amount);
            setFormat(true);
        }
    }

    public boolean validate() throws PaymentException {
        if (amount == null) {
            throw new PaymentException(BaseErrorCode.ARGS_IS_NULL);
        }
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new PaymentException(TradeErrorCode.PAYMENT_METHOD_AMOUNT_ERROR);
        }
        return true;
    }

    @Override
    public PayMethod clone() {
        try {
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream objOut = new ObjectOutputStream(byteOut);
            objOut.writeObject(this);

            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream objIn = new ObjectInputStream(byteIn);
            return (PayMethod) objIn.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 是否是实时交易, 实时交易 true, 非实时 false
     * @return
     */
    public Boolean isAfterPay(){
        return !payType.isRealTime();
    }


    public EnumPayType getPayType() {
        return payType;
    }

    public void setPayType(EnumPayType payType) {
        this.payType = payType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
