package com.payment.trade;

import com.payment.comm.constants.SystemConstants;
import com.payment.comm.handler.RedisHandler;
import com.payment.comm.utils.JsonUtil;
import com.payment.generator.domain.PayTradeOrder;
import com.payment.trade.bo.*;
import com.payment.trade.service.TradeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.kan.trade.payment  <br>
 * 描      述: 交易                     <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/28      <br>
 */
@Service
public class PaymentProvider {

    @Autowired
    TradeOrderService tradeOrderService;


    /**
     * 订单支付
     *
     * @param paymentBO
     * @return
     * @throws Exception
     */

    public PaymentResultBO payment(PaymentBO paymentBO) throws Exception {
        PaymentResultBO paymentResultBO = new PaymentResultBO();

        PayTradeOrder tradeOrder = tradeOrderService.findOne(paymentBO.getOrderNo());
        if (tradeOrder == null) {

            //封装支付单信息
            tradeOrder = new PayTradeOrder();
            tradeOrder.setPayUserId("13123");
            tradeOrder.setTradeNo("M12321312");
            tradeOrder.setOutTradeNo("21312312");
            tradeOrder.setPayAmount(1321L);
            tradeOrder.setCreatedTime(new Date(System.currentTimeMillis()));

            RedisHandler.set(tradeOrder.getId(),JsonUtil.convertString(tradeOrder));
            PayTradeOrder  trade = JsonUtil.convertObject( RedisHandler.get(tradeOrder.getId()),PayTradeOrder.class);
            //新增支付单
            tradeOrder = tradeOrderService.create(tradeOrder);
        }
        //判断时候是后支付
        if (isHou(paymentBO)) {
            //封装充值信息
            //生成充值
            //返回
            paymentResultBO.setTradeNo("");
            paymentResultBO.setResultCode(SystemConstants.RESULT_CODE_SUCCESS);
        }
       //支付扣款

        return paymentResultBO;
    }

    private boolean isHou(PaymentBO paymentBO) {
        return false;
    }

    /**
     * 交易退款
     *
     * @param refundBO
     * @return
     * @throws Exception
     */
    public RefundResultBO refund(RefundBO refundBO) throws Exception {
        RefundResultBO refundResultBO = new RefundResultBO();

        return refundResultBO;
    }


    /**
     * 转账方法
     *
     * @param transferBO
     * @return
     * @throws Exception
     */
    public TransferResultBO transfer(TransferBO transferBO) throws Exception {
        TransferResultBO transferResultBO = new TransferResultBO();
        return transferResultBO;
    }
}
