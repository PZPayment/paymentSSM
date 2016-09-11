package com.payment.pay.plugins;

import com.payment.comm.base.exception.PaymentException;
import com.payment.domain.PayOrder;
import com.payment.trade.service.PayGateService;

import java.util.Map;

/**
 * 包      名: com.payment.pay.plugins  <br>
 * 描      述:  插件处理基类                     <br>
 * 创 建 人 : kan <br>
 */
public abstract class PayGateServiceAbstract implements PayGateService {

    protected Map<String,String> payGateDate = null;


    @Override
   public void setGateDate(Map<String,String> gateDate){
        payGateDate = gateDate;
    }

    public String getGateDate(String parpam){
        return  payGateDate.get(parpam);
    }

}
