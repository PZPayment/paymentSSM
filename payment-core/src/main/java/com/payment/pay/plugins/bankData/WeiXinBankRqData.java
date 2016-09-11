package com.payment.pay.plugins.bankData;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.errorCode.PayErrorCode;
import com.payment.comm.utils.JsonUtils;
import com.payment.pay.bankRqData.BankRqData;

import java.util.SortedMap;

/**
 * 包      名: com.payment.pay.plugins.bankRqData  <br>
 * 描      述:  微信交互数据data                     <br>
 * 创 建 人 : kan <br>
 */
public class WeiXinBankRqData extends BankRqData {
    /**
     * 微信支付的参数封装到map中，统一支持jsapi   app  native
     */
    private SortedMap<String, String> packageParams;

    public SortedMap<String, String> getPackageParams() {
        return packageParams;
    }

    public void setPackageParams(SortedMap<String, String> packageParams) {
        this.packageParams = packageParams;
    }

    public String buildHtml() throws Exception {
        try {
            return JsonUtils.convertString(getPackageParams());
        } catch (Exception e) {
            throw new PaymentException(PayErrorCode.PAY_ADAPTER_EXCEPTION);
        }
    }

}
