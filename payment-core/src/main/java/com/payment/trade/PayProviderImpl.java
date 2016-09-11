package com.payment.trade;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.errorCode.BaseErrorCode;
import com.payment.trade.bo.PayBO;
import com.payment.trade.bo.PayResultBO;
import com.payment.trade.service.PayService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 包      名: com.payment.trade.service  <br>
 * 描      述:  支付                     <br>
 * 创 建 人 : kan <br>
 */
@Service
public class PayProviderImpl implements PayProvider {


    @Autowired
    PayService payService;

    @Override
    public PayResultBO getBankDate(PayBO payBO) throws PaymentException {
        if (!payBO.validate()) {
            throw new PaymentException(BaseErrorCode.ARGS_INVALID);
        }
        PayResultBO payResultBO = new PayResultBO();
        String html = payService.buildBankHtml(payBO);
        if (!StringUtils.isBlank(html)){
            payResultBO.setBankDate(html);
        }else{
            payResultBO.setResultCode(-1);
        }
            return payResultBO;
    }

    @Override
    public PayResultBO refund(String depositNo) throws PaymentException {
        if (StringUtils.isBlank(depositNo)) {
            throw new PaymentException(BaseErrorCode.ARGS_INVALID);
        }

        return null;
    }

    @Override
    public String callback(Map<String, String[]> paraMap, String payNo, String remoteIp, String type) throws PaymentException {
        return null;
    }
}
