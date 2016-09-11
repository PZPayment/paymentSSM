package com.payment.pay.factory;


import com.payment.trade.service.PayGateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 网关接口实例工厂
 *
 * @author chenfayong
 * @version v1.0
 */
public class PayGateFactory {
    private static final Logger logger = LoggerFactory.getLogger(PayGateFactory.class);

    public static PayGateService getInstance(String payGateCode) {
        try {
            Map<String,String> gateMap = GateDateConfig.getPayGate(payGateCode);
            if (gateMap == null) {
                return null;
            }
            PayGateService gateService = (PayGateService) Class.forName(gateMap.get("gateClass")).newInstance();
            gateService.setGateDate(gateMap);
            return gateService;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取网关失败", e);
            return null;
        }
    }
}
