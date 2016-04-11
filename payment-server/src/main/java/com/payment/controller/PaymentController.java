package com.payment.controller;

import com.payment.trade.PaymentProviderImpl;
import com.payment.trade.bo.PaymentBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * 包      名: com.kan.trade.payment  <br>
 * 描      述:  支付接口请求
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/29
 */
@RestController
@RequestMapping("/trade")
public class PaymentController {

    @Autowired
    private PaymentProviderImpl paymentProvider;

    @RequestMapping(value="/payment",method = GET)
    String home() {
        System.out.println("12321");
        PaymentBO paymentBO = new PaymentBO();
        paymentBO.setBuyerUserId("A882699");
        paymentBO.setBankCode("0990");
        paymentBO.setOrderNo("YT882699");
        paymentBO.setPaymount(new BigDecimal("10"));
        try {
            System.out.println(paymentProvider.payment(paymentBO));
        } catch (Exception e) {
            System.out.println(e);
        }
        return "hellow";
    }
}
