package com.payment.trade;

import com.payment.trade.service.PayService;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.util.*;

/**
 *
 * 包      名: com.payment.trade  <br>
 * 描      述:  支付
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  16/3/9
 */
public class PayProvider {

//    @Resource(name = "IPayService")
//    private PayService payService;
//    /**
//     * 确认付款
//     *
//     * @param orderCount
//     *            当前支付的订单数量
//     * @param orderId
//     *            需要支付的订单Id
//     * @param request
//     * @param payId
//     * @param response
//     * @throws UnsupportedEncodingException
//     * @throws UnknownHostException
//     */
//    @RequestMapping("/payorder")
//    public void payOrder(Long orderCount, Long orderId, HttpServletRequest request, Long payId, HttpServletResponse response) throws UnsupportedEncodingException{
//        // 获取用户id
//        Long customerId = (Long) request.getSession().getAttribute(CustomerConstantStr.CUSTOMERID);
//        // 判断用户id是否为空
//        if (customerId == null) {
//            return;
//        }
//        // 返回订单商品的商品名称，取第一个
//        String goodsName = orderser.queryGoodsInfoName(orderId);
//        // 获取订单信息
//        Order order = siteOrderService.getPayOrder(orderId);
//
//        // 查询使用的支付信息
//        Pay p = payService.findByPayId(payId);
//        if (p != null) {
//            // 多笔订单 循环生成多笔付款单信息
//            if (null != orderCount) {
//                // 根据主订单号查询所有的子订单信息
//                List<Order> orderslist = siteOrderService.getPayOrderByOldCode(order.getOrderOldCode());
//                for (int i = 0; i < orderslist.size(); i++) {
//                    // 创建单个订单对象
//                    Order childOrder = orderslist.get(i);
//                    // 如果是在线支付
//                    if ("1".equals(childOrder.getOrderLinePay())) {
//                        // 单笔订单
//                        this.getReceivables(p, request, childOrder);
//                    }
//                }
//            } else {
//                // 单笔订单 生成单笔的付款单信息
//                this.getReceivables(p, request, order);
//            }
//
//            // 支付宝支付
//            if ("1".equals(p.getPayType())) {
//                // 获取支付用的信息
//                String sHtmlText = payService.getAlipay(p, order, goodsName, orderCount);
//                // 设置编码集
//                response.setContentType("text/html;charset=UTF-8");
//                // 设置编码格式
//                response.setCharacterEncoding(ConstantUtil.UTF);
//
//                try {
//                    // 写入
//                    response.getWriter().write(sHtmlText);
//                    // 获取单个订单对象
//                    // Order orders = siteOrderService.getPayOrder(orderId);
//                    // 订单日志记录
//                    LOGGER.info("给订单号为：【" + order.getOrderCode() + "】的订单付款成功");
//                } catch (IOException e) {
//                    LOGGER.error(LOGGERINFO1 + e);
//                }
//            } else if ("2".equals(p.getPayType())) {
//                // 字符集编码
//                String encoding = ConstantUtil.UTF;
//                /**
//                 * 初始化证书
//                 */
//                //SDKConfig.getConfig().loadPropertiesFromSrc();
//                /**
//                 * 组装请求报文
//                 */
//                String requestUrl = SDKConfig.getConfig().getFrontRequestUrl();
//                Map<String, String> data = new HashMap<String, String>();
//                // 版本号
//                data.put("version", "5.0.0");
//                // 字符集编码
//                data.put("encoding", ConstantUtil.UTF);
//                // 签名方法 01 RSA
//                data.put("signMethod", "01");
//                // 交易类型
//                data.put("txnType", "01");
//                // 交易子类型 01:自助消费 02:订购 03:分期付款
//                data.put("txnSubType", "01");
//                // 业务类型
//                data.put("bizType", "000201");
//                //渠道类型
//                data.put("channelType", "07");
//                // 页面跳转同步通知页面路径
//                String returnUrl = p.getBackUrl();
//                //前台通知地址
//                data.put("frontUrl", returnUrl);
//                // 服务器异步通知页面路径
//                String notifyUrl = p.getPayUrl() + "/unionpaynotifysuccess.html";
//                // 商户/收单后台接收地址
//                data.put("backUrl", notifyUrl);
//                // 接入类型 商户:0 收单:1
//                data.put("accessType", "0");
//                // 商户号码
//                data.put("merId", p.getPayAccount());
//                // 总订单号
//                data.put(ConstantUtil.ORDERID, order.getOrderCode());
//                // 订单发送时间
//                data.put("txnTime", UtilDate.getOrderNum());
//                // 交易金额 分
//                data.put("txnAmt", order.getOrderPrice().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
//                // 交易币种
//                data.put("currencyCode", "156");
//
//                /**
//                 * 签名
//                 */
//                Map<String, String> submitFromData = signData(data);
//                /**
//                 * 创建表单
//                 */
//                String html = createHtml(requestUrl, submitFromData);
//                response.setContentType("text/html;charset=UTF-8");
//                response.setCharacterEncoding(ConstantUtil.UTF);
//
//                try {
//                    response.getWriter().write(html);
//                } catch (IOException e) {
//                    LOGGER.error(LOGGERINFO1 + e);
//                }
//            }
//        }
//
//    }
//
//    /**
//     * 支付宝回调
//     *
//     * @param request
//     * @param response
//     * @return ModelAndView
//     * @throws java.io.UnsupportedEncodingException
//     */
//    @RequestMapping("/paysucccessyb")
//    public void paySuccessyb(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // 获取支付宝信息
//        Pay p = payService.findByPayId(25L);
//
//        // 设置   商户号
//        AlipayConfig.partner = p.getApiKey();
//        // 设置商户秘钥
//        AlipayConfig.key = p.getSecretKey();
//
//        AlipayConfig.seller_email = p.getPayAccount();
//        // 获取支付宝POST过来反馈信息
//        Map<String, String> params = new HashMap<String, String>();
//        Map<?, ?> requestParams = request.getParameterMap();
//        for (Iterator<?> iter = requestParams.keySet().iterator(); iter.hasNext();) {
//            String name = (String) iter.next();
//            String[] values = (String[]) requestParams.get(name);
//            StringBuilder valueStr = new StringBuilder();
//            for (int i = 0; i < values.length; i++) {
//                if (i == values.length - 1) {
//                    valueStr.append(values[i]);
//                } else {
//                    valueStr.append(values[i]);
//                    valueStr.append(",");
//                }
//            }
//            // 乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
//            // valueStr = new String(valueStr.getBytes(ISO_8859_1), "gbk");
//            params.put(name, valueStr.toString());
//        }
//
//        // 获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以下仅供参考)//
//        // 商户订单号
//        String outTradeNo = new String(request.getParameter(OUT_TRADE_NO).getBytes(ISO_8859_1), ConstantUtil.UTF);
//        // 支付宝交易号
//        // 交易状态
//        String tradeStatus = new String(request.getParameter(TRADE_STATUS).getBytes(ISO_8859_1), ConstantUtil.UTF);
//        // 获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以上仅供参考)//
//        if (AlipayNotify.verify(params)) {// 验证成功
//            chechOrderStatus(tradeStatus, outTradeNo);
//            sendSucess(response, SUCCESS);
//        } else {// 验证失败
//            sendSucess(response, "fail");
//        }
//
//    }
//
//    /**
//     * 支付宝回调
//     *
//     * @param request
//     * @param response
//     * @return ModelAndView
//     * @throws java.io.UnsupportedEncodingException
//     */
//    @RequestMapping("/paysucccessybmulti")
//    public void paySuccessybmulti(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // 获取支付宝信息
//        Pay p = payService.findByPayId(25L);
//
//        // 设置商户号
//        AlipayConfig.partner = p.getApiKey();
//        // 设置商户秘钥
//        AlipayConfig.key = p.getSecretKey();
//
//        AlipayConfig.seller_email = p.getPayAccount();
//        // 获取支付宝POST过来反馈信息
//        Map<String, String> params = new HashMap<String, String>();
//        Map<?, ?> requestParams = request.getParameterMap();
//        for (Iterator<?> iter = requestParams.keySet().iterator(); iter.hasNext();) {
//            String name = (String) iter.next();
//            String[] values = (String[]) requestParams.get(name);
//            StringBuilder valueStr = new StringBuilder();
//            for (int i = 0; i < values.length; i++) {
//                if (i == values.length - 1) {
//                    valueStr.append(values[i]);
//                } else {
//                    valueStr.append(values[i]);
//                    valueStr.append(",");
//                }
//            }
//            // 乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
//            // valueStr = new String(valueStr.getBytes(ISO_8859_1), "gbk");
//            params.put(name, valueStr.toString());
//        }
//
//        // 获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以下仅供参考)//
//        // 商户订单号
//        String outTradeNo = new String(request.getParameter(OUT_TRADE_NO).getBytes(ISO_8859_1), ConstantUtil.UTF);
//        // 支付宝交易号
//        // 交易状态
//        String tradeStatus = new String(request.getParameter(TRADE_STATUS).getBytes(ISO_8859_1), ConstantUtil.UTF);
//        // 获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以上仅供参考)//
//        if (AlipayNotify.verify(params)) {// 验证成功
//            // ////////////////////////////////////////////////////////////////////////////////////////
//            // 请在这里加上商户的业务逻辑程序代码
//            /**
//             * 根据主订单号查询所有的子订单信息 如果能查到值证明传过来的是主订单号 如果没值证明传过来的是子订单号
//             */
//            List<Order> orderslist = siteOrderService.getPayOrderByOldCode(outTradeNo);
//            // 多笔订单支付
//            if (null != orderslist && orderslist.size() > 0) {
//                for (int i = 0; i < orderslist.size(); i++) {
//                    // 多笔订单支付
//                    Order childOrder = orderslist.get(i);
//                    // 更改订单那的支付状态
//                    chechOrderStatus(tradeStatus, childOrder.getOrderCode());
//                }
//            }
//            // ——请根据您的业务逻辑来编写程序（以上代码仅作参考）——
//
//
//            sendSucess(response, SUCCESS);
//
//            // ////////////////////////////////////////////////////////////////////////////////////////
//        } else {// 验证失败
//            sendSucess(response, "fail");
//        }
//
//    }
//
//    /**
//     *
//     * @param tradeStatus
//     *            支付宝交易号 交易状态
//     * @param outTradeNo
//     *            支付宝 支付成功 返回的订单号
//     * @return
//     */
//    public void chechOrderStatus(String tradeStatus, String outTradeNo) {
//
//        // ——请根据您的业务逻辑来编写程序（以下代码仅作参考）——
//        Receivables receivables = this.receivablesService.queryByOrderCode(outTradeNo);
//        if ("TRADE_FINISHED".equals(tradeStatus)) {
//            // 判断该笔订单是否在商户网站中已经做过处理
//            // 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
//            // 如果有做过处理，不执行商户的业务程序
//            // 重新将session登入
//            Order or = siteOrderService.getPayOrderByCode(outTradeNo);
//            if ("0".equals(or.getOrderStatus())) {
//                siteOrderService.payOrder(or.getOrderId());
//                if (null != receivables) {
//                    // 修改订单支付状态为支付成功
//                    receivables.setReceivablesTime(new Date());
//                    this.receivablesService.updatePayStatus(receivables);
//                    //直营店订单短信通知
//                    siteOrderService.paySuccessSendSms(or);
//                    // 同步E店宝
//                    synOrderService.SynOrder(or.getOrderId());
//                }
//            }
//            // 注意：
//            // 该种交易状态只在两种情况下出现
//            // 1、开通了普通即时到账，买家付款成功后。
//            // 2、开通了高级即时到账，从该笔交易成功时间算起，过了签约时的可退款时限（如：三个月以内可退款、一年以内可退款等）后。
//        } else if ("TRADE_SUCCESS".equals(tradeStatus)) {
//            // 判断该笔订单是否在商户网站中已经做过处理
//            // 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
//            // 如果有做过处理，
//            Order or = siteOrderService.getPayOrderByCode(outTradeNo);
//            if ("0".equals(or.getOrderStatus())) {
//                siteOrderService.payOrder(or.getOrderId());
//                if (null != receivables) {
//                    // 修改订单支付状态为支付成功
//                    receivables.setReceivablesTime(new Date());
//                    this.receivablesService.updatePayStatus(receivables);
//                    //直营店订单短信通知
//                    siteOrderService.paySuccessSendSms(or);
//                    // 同步E店宝
//                    synOrderService.SynOrder(or.getOrderId());
//                }
//            }
//            // 注意：
//            // 该种交易状态只在一种情况下出现——开通了高级即时到账，买家付款成功后。
//        }
//    }

}
