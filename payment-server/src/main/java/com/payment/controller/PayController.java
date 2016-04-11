package com.payment.controller;

import com.payment.trade.bo.PaymentBO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * 包      名: com.payment.controller  <br>
 * 描      述:
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/3/30
 */
@RestController
@RequestMapping("/pay")
public class PayController {


    @RequestMapping(value="/buldHtml",method = GET)
    String buldHtml() {

    }


    /**
     * 支付宝回调
     *
     * @param request
     * @param response
     * @return ModelAndView
     * @throws java.io.UnsupportedEncodingException
     */
    @RequestMapping("/paysucccessyb")
    public void paySuccessyb(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 获取支付宝信息
        Pay p = payService.findByPayId(25L);

        // 设置   商户号
        AlipayConfig.partner = p.getApiKey();
        // 设置商户秘钥
        AlipayConfig.key = p.getSecretKey();

        AlipayConfig.seller_email = p.getPayAccount();
        // 获取支付宝POST过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<?, ?> requestParams = request.getParameterMap();
        for (Iterator<?> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            StringBuilder valueStr = new StringBuilder();
            for (int i = 0; i < values.length; i++) {
                if (i == values.length - 1) {
                    valueStr.append(values[i]);
                } else {
                    valueStr.append(values[i]);
                    valueStr.append(",");
                }
            }
            // 乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
            // valueStr = new String(valueStr.getBytes(ISO_8859_1), "gbk");
            params.put(name, valueStr.toString());
        }

        // 获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以下仅供参考)//
        // 商户订单号
        String outTradeNo = new String(request.getParameter(OUT_TRADE_NO).getBytes(ISO_8859_1), ConstantUtil.UTF);
        // 支付宝交易号
        // 交易状态
        String tradeStatus = new String(request.getParameter(TRADE_STATUS).getBytes(ISO_8859_1), ConstantUtil.UTF);
        // 获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以上仅供参考)//
        if (AlipayNotify.verify(params)) {// 验证成功
            chechOrderStatus(tradeStatus, outTradeNo);
            sendSucess(response, SUCCESS);
        } else {// 验证失败
            sendSucess(response, "fail");
        }

    }

    /**
     * 支付宝回调
     *
     * @param request
     * @param response
     * @return ModelAndView
     * @throws java.io.UnsupportedEncodingException
     */
    @RequestMapping("/paysucccessybmulti")
    public void paySuccessybmulti(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 获取支付宝信息
        Pay p = payService.findByPayId(25L);

        // 设置商户号
        AlipayConfig.partner = p.getApiKey();
        // 设置商户秘钥
        AlipayConfig.key = p.getSecretKey();

        AlipayConfig.seller_email = p.getPayAccount();
        // 获取支付宝POST过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<?, ?> requestParams = request.getParameterMap();
        for (Iterator<?> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            StringBuilder valueStr = new StringBuilder();
            for (int i = 0; i < values.length; i++) {
                if (i == values.length - 1) {
                    valueStr.append(values[i]);
                } else {
                    valueStr.append(values[i]);
                    valueStr.append(",");
                }
            }
            // 乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
            // valueStr = new String(valueStr.getBytes(ISO_8859_1), "gbk");
            params.put(name, valueStr.toString());
        }

        // 获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以下仅供参考)//
        // 商户订单号
        String outTradeNo = new String(request.getParameter(OUT_TRADE_NO).getBytes(ISO_8859_1), ConstantUtil.UTF);
        // 支付宝交易号
        // 交易状态
        String tradeStatus = new String(request.getParameter(TRADE_STATUS).getBytes(ISO_8859_1), ConstantUtil.UTF);
        // 获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以上仅供参考)//
        if (AlipayNotify.verify(params)) {// 验证成功
            // ////////////////////////////////////////////////////////////////////////////////////////
            // 请在这里加上商户的业务逻辑程序代码
            /**
             * 根据主订单号查询所有的子订单信息 如果能查到值证明传过来的是主订单号 如果没值证明传过来的是子订单号
             */
            List<Order> orderslist = siteOrderService.getPayOrderByOldCode(outTradeNo);
            // 多笔订单支付
            if (null != orderslist && orderslist.size() > 0) {
                for (int i = 0; i < orderslist.size(); i++) {
                    // 多笔订单支付
                    Order childOrder = orderslist.get(i);
                    // 更改订单那的支付状态
                    chechOrderStatus(tradeStatus, childOrder.getOrderCode());
                }
            }
            // ——请根据您的业务逻辑来编写程序（以上代码仅作参考）——


            sendSucess(response, SUCCESS);

            // ////////////////////////////////////////////////////////////////////////////////////////
        } else {// 验证失败
            sendSucess(response, "fail");
        }

    }

    /**
     *
     * @param tradeStatus
     *            支付宝交易号 交易状态
     * @param outTradeNo
     *            支付宝 支付成功 返回的订单号
     * @return
     */
    public void chechOrderStatus(String tradeStatus, String outTradeNo) {

        // ——请根据您的业务逻辑来编写程序（以下代码仅作参考）——
        Receivables receivables = this.receivablesService.queryByOrderCode(outTradeNo);
        if ("TRADE_FINISHED".equals(tradeStatus)) {
            // 判断该笔订单是否在商户网站中已经做过处理
            // 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
            // 如果有做过处理，不执行商户的业务程序
            // 重新将session登入
            Order or = siteOrderService.getPayOrderByCode(outTradeNo);
            if ("0".equals(or.getOrderStatus())) {
                siteOrderService.payOrder(or.getOrderId());
                if (null != receivables) {
                    // 修改订单支付状态为支付成功
                    receivables.setReceivablesTime(new Date());
                    this.receivablesService.updatePayStatus(receivables);
                    //直营店订单短信通知
                    siteOrderService.paySuccessSendSms(or);
                    // 同步E店宝
                    synOrderService.SynOrder(or.getOrderId());
                }
            }
            // 注意：
            // 该种交易状态只在两种情况下出现
            // 1、开通了普通即时到账，买家付款成功后。
            // 2、开通了高级即时到账，从该笔交易成功时间算起，过了签约时的可退款时限（如：三个月以内可退款、一年以内可退款等）后。
        } else if ("TRADE_SUCCESS".equals(tradeStatus)) {
            // 判断该笔订单是否在商户网站中已经做过处理
            // 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
            // 如果有做过处理，
            Order or = siteOrderService.getPayOrderByCode(outTradeNo);
            if ("0".equals(or.getOrderStatus())) {
                siteOrderService.payOrder(or.getOrderId());
                if (null != receivables) {
                    // 修改订单支付状态为支付成功
                    receivables.setReceivablesTime(new Date());
                    this.receivablesService.updatePayStatus(receivables);
                    //直营店订单短信通知
                    siteOrderService.paySuccessSendSms(or);
                    // 同步E店宝
                    synOrderService.SynOrder(or.getOrderId());
                }
            }
            // 注意：
            // 该种交易状态只在一种情况下出现——开通了高级即时到账，买家付款成功后。
        }
    }
}
