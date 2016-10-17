package com.payment.controller;

import com.payment.comm.utils.DateUtils;
import com.payment.trade.PayProvider;
import com.payment.trade.PaymentProvider;
import com.payment.trade.bo.PayResultBO;
import com.payment.trade.bo.PaymentBO;
import com.payment.trade.bo.RefundBO;
import com.payment.trade.bo.payMethod.PayMethodOBP;
import com.payment.trade.bo.payMethod.PayMethodOLP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Date;

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
    private PaymentProvider paymentProvider;

    @Autowired
    PayProvider payProvider;

    @RequestMapping(value="/payment",method = GET)
    String home() {
        PaymentBO paymentBO = new PaymentBO();
        paymentBO.setBuyerUserId("A882699");
        paymentBO.setSellerUserId("A882690");
        paymentBO.setBankCode("0990");
        String outderNO = "X"+ DateUtils.toString(new Date());
        paymentBO.setOrderNo(outderNO);
        paymentBO.setSettleAmount(new BigDecimal("10"));
        PayMethodOLP payMethod = new PayMethodOLP();
        payMethod.setAmount(new BigDecimal("10"));
        payMethod.setBankCode("WX001");
        RefundBO refundBO = new RefundBO();
        refundBO.setOrderNo(outderNO);
        refundBO.setRefundAmount(new BigDecimal("10"));
        try {
            System.out.println(paymentProvider.realTimePayment(paymentBO,payMethod));
            System.out.println(paymentProvider.refund(refundBO));
        } catch (Exception e) {
            System.out.println(e);
        }
        return "hellow";
    }
    @RequestMapping(value="/pay/{depositNo}",method = GET)
    String pay(HttpServletRequest httpServletRequest, @PathVariable String depositNo) {
        try {
            //PayResultBO resultBO =  payProvider.getBankDate(depositNo,"WX0002");
            //String str = resultBO.getBankDate();
            //httpServletRequest.setAttribute("date",str.substring(str.indexOf("weixin"),str.length()-2));
        } catch (Exception e) {
            System.out.println(e);
        }
        return "pay";
    }
}
