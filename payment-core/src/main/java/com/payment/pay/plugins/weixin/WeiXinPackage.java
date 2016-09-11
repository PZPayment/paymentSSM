package com.payment.pay.plugins.weixin;

import com.payment.pay.bankRqData.BankRqDataUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.*;

/**
 * 包      名: com.payment.pay.plugins.weixin  <br>
 * 描      述:  微信支付JS API调用
 *               package内容                     <br>
 * 创 建 人 : kan <br>
 */
public class WeiXinPackage {

    /**
     * 公众号ID
     */
    private String appid;
    /**
     * 商户号
     */
    private String mch_id;
    /**
     * 子商户公众账号ID
     */
    private String sub_appid;
    /**
     * 子商户号
     */
    private String sub_mch_id;
    /**
     * title:商品描述
     * desc:商品描述;
     */
    private String body;
    /**
     * 设备号，可空，由微信分配的设备终端号
     */
    private String device_info;
    /**
     * 随机串 长度32位以内（包括32位）
     */
    private String nonce_str;
    /**
     * title:附加数据
     * desc:附加数据,原样返回;
     */
    private String attach;
    /**
     * title:商户订单号
     * desc:商户系统内部的订单号,32 个字符内、可包含字 母;确保在商户系统唯一,详见注意事项,第 5 项
     */
    private String out_trade_no;
    /**
     * title:订单总金额
     * desc:订单总金额,单位为分;
     */
    private String total_fee;
    /**
     * title:通知 URL
     * desc:在支付完成后,接收微信通知支付结果的 URL, 需 给 绝 对 路 径 , 255 字 符 内 , 格 式 如:http://wap.tenpay.com/tenpay.asp;
     */
    private String notify_url;
    /**
     * title:订单生成的机 器 IP
     * desc:指用户浏览器端 IP,不是商户服务器 IP,格式为 IPV4;
     */
    private String spbill_create_ip;
    /**
     * title:交易起始时间
     * desc:订单生成时间,格式为 yyyyMMddHHmmss,如 2009 年 12 月 25 日 9 点 10 分 10 秒表示为 20091225091010,时区为 GMT+8 beijing;该时 间取自商户服务器;
     */
    private String time_start;
    /**
     * title:交易结束时间
     * desc:订单失效时间,格式为 yyyyMMddHHmmss,如 2009 年 12 月 27 日 9 点 10 分 10 秒表示为 20091227091010,时区为 GMT+8 beijing;该时 间取自商户服务器;
     */
    private String time_expire;
    /**
     * title:商品标记
     * desc:商品标记,优惠券时可能用到;
     */
    private String goods_tag;
    /**
     * 交易类型
     * JSAPI、NATIVE、APP
     */
    private String trade_type;
    /**
     * title:用户标识
     * desc:用户在商户 appid 下的唯一 标识,trade_type 为 JSAPI 时,此参数必传,获取方式 见表头说明。
     */
    private String openid;
    /**
     * 用户子标识
     */
    private String sub_openid;
    /**
     * title:pakcage签名
     * desc:package签名值，规则参考接口文档
     */
    private String sign;
    /**
     * title:商户退款订单号
     * desc:商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔
     */
    private String out_refund_no;
    /**
     * title:退款金额
     * desc:退款总金额，订单总金额，单位为分，只能为整数
     */
    private String refund_fee;
    /**
     * title:操作员
     * desc:操作员账号，默认为商户号
     */
    private String op_user_id;
    /**
     * title:商品 ID
     * desc:只在 trade_type 为 NATIVE 时需要填写。此 id 为二维码 中包含的商品 ID,商户自行 维护。
     */
    private String product_id;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getSub_appid() {
        return sub_appid;
    }

    public void setSub_appid(String sub_appid) {
        this.sub_appid = sub_appid;
    }

    public String getSub_mch_id() {
        return sub_mch_id;
    }

    public void setSub_mch_id(String sub_mch_id) {
        this.sub_mch_id = sub_mch_id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSub_openid() {
        return sub_openid;
    }

    public void setSub_openid(String sub_openid) {
        this.sub_openid = sub_openid;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    public String getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(String refund_fee) {
        this.refund_fee = refund_fee;
    }

    public String getOp_user_id() {
        return op_user_id;
    }

    public void setOp_user_id(String op_user_id) {
        this.op_user_id = op_user_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }







}
