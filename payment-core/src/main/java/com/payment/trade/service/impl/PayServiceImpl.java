package com.payment.trade.service.impl;

import com.payment.comm.base.exception.ExceptionHanlder;
import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.errorCode.PayErrorCode;
import com.payment.comm.errorCode.TradeErrorCode;
import com.payment.domain.DepositOrder;
import com.payment.domain.PayOrder;
import com.payment.pay.bankRqData.BankRqData;
import com.payment.pay.factory.PayGateFactory;
import com.payment.trade.bo.PayBO;
import com.payment.trade.service.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 支付实现类 修改方法时请注意（重要）qaq
 *
 * @author lih
 * @version 2.0
 * @since 2015/8/10 15:26
 */
@Service
public class PayServiceImpl implements PayService {


    @Autowired
    DepositOrderService depositOrderService;

    @Autowired
    PayOrderService payOrderService;


    public String buildBankHtml(String orderNo, String bankCode,String goodsName) throws PaymentException {
        String html = buildBankHtmlInner(orderNo, bankCode, goodsName);
        return html;

    }

    @Override
    public String callback(Map<String, String[]> paraMap, String payNo, String remoteIp, String type) throws PaymentException {

        if (paraMap == null || remoteIp == null || payNo == null) {
            throw new PaymentException(PayErrorCode.ARGS_IS_NULL);
        }

        PayOrder order = payOrderService.findOne(payNo);
        if (order == null) {
            throw new PaymentException(PayErrorCode.PAY_ORDER_NOT_EXIST);
        }

        // 生成支付跳转页面
        PayGateService payGateSer = PayGateFactory.getInstance(order.getBankCode());
        if (payGateSer == null) {
            throw new PaymentException(PayErrorCode.PAY_ADAPTER_EXCEPTION);
        }
        return payGateSer.callback(paraMap, order, type);

    }

    private String buildBankHtmlInner(String outChargeNo, String bankCode, String goodsName) throws PaymentException {

        if (outChargeNo == null) {
            throw new PaymentException(PayErrorCode.ARGS_IS_NULL);
        }

        DepositOrder depositOrder = depositOrderService.findOneByOutTradeNo(outChargeNo);

        if (null == depositOrder) {
            throw new PaymentException(TradeErrorCode.CHARGE_ORDER_NOT_EXIST);
        }

        // 构建跳转银行条件结构
        PayBO payBO = new PayBO();
        payBO.setAmount(new BigDecimal(depositOrder.getDepositAmount()));
        payBO.setBankCode(bankCode);
        payBO.setGoodsName(goodsName);
        payBO.setOrderNo(depositOrder.getDepositNo());
        return this.buildBankHtml(payBO);
    }

    /**
     * 函数功能：调用支付网关获取跳转页面
     *
     * @param payBO
     * @return
     * @author Miner 2012-5-29 下午06:46:09
     */
    @Override
    public String buildBankHtml(PayBO payBO) throws PaymentException {


        BankRqData requestHandler = doPay(payBO);

        String html = "";
        try {
            html = requestHandler.buildHtml();

            if (StringUtils.isBlank(html)) {
                throw new Exception("未获得跳转数据");
            }
        } catch (Exception e) {
            throw new PaymentException(PayErrorCode.PAY_ADAPTER_EXCEPTION);
        }

        return html;
    }

    /**
     * 根据用户支付请求参数生成支付订单，银行编号生成跳转支付页面
     *
     * @param payBO - 支付参数信息
     */
    private BankRqData doPay(PayBO payBO) throws PaymentException {
        try {

            // 创建网关订单
            PayOrder order = payOrderService.createPayOrder(payBO);

            // 生成支付跳转页面
            PayGateService payGateSer = PayGateFactory.getInstance(payBO.getBankCode());
            if (payGateSer == null) {
                throw new PaymentException(PayErrorCode.PAY_ADAPTER_EXCEPTION);
            }
            BankRqData handler = payGateSer.buildHtml(order);
            return handler;
        } catch (Exception e) {
            ExceptionHanlder.Process(e);
            return null;
        }
    }

}

