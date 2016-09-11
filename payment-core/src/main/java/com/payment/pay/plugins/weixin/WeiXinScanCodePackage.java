package com.payment.pay.plugins.weixin;


import java.lang.reflect.Field;
import java.util.*;

/**
 * Description:微信支付响应包体
 * User: Miner
 * Date: 14/12/4
 * Time: 21:46
 */
public class WeiXinScanCodePackage  {
    //    公众账号ID appid String(32) 是 wx8888888888888888 微信分配的公众账号ID
    private String appid;
    //    子商户公众账号ID sub_appid String(32) 否 1900000109 微信分配的子商户公众账号ID
    private String sub_appid;
    //    商户号 mch_id String(32) 是 1900000109 微信支付分配的商户号
    private String mch_id;
    //    子商户号 sub_mch_id String(32) 是 1900000109 微信支付分配的子商户号，受理模式下必填
    private String sub_mch_id;
    //    设备号 device_info String(32) 否 013467007045764 终端设备号(商户自定义，如门店编号)
    private String device_info;
    //    随机字符串 nonce_str String(32) 是 5K8264ILTKCH16CQ2502SI8ZNMTM67VS 随机字符串，不长于32位。推荐随机数生成算法
    private String nonce_str;
    //    签名 sign String(32) 是 C380BEC2BFD727A4B6845133519F3AD6 签名，详见签名生成算法
    private String sign;
    //    商品描述 body String(32) 是 Ipad mini  16G  白色 商品或支付单简要描述
    private String body;
    //    商品详情 detail String(8192) 否 Ipad mini  16G  白色 商品名称明细列表
    private String detail;
    //    附加数据 attach String(127) 否 说明 附加数据，在查询API和支付通知中原样返回，该字段主要用于商户携带订单的自定义数据
    private String attach;
    //    商户订单号 out_trade_no String(32) 是 1217752501201407033233368018 商户系统内部的订单号,32个字符内、可包含字母, 其他说明见商户订单号
    private String out_trade_no;
    //    总金额 total_fee Int 是 888 订单总金额，单位为分，只能为整数，详见支付金额
    private String total_fee;
    //    货币类型 fee_type String(16) 否 CNY 符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型
    private String fee_type;
    //    终端IP spbill_create_ip String(16) 是 8.8.8.8 调用微信支付API的机器IP
    private String spbill_create_ip;
    //    交易起始时间 time_start String(14) 否 20091225091010 订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。详见时间规则
    private String time_start;
    //    交易失效时间 time_expire String(14) 否 20091227091010 订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。详见时间规则
    private String time_expire;
    //    商品标记 goods_tag String(32) 否   商品标记，代金券或立减优惠功能的参数，说明详见代金券或立减优惠
    private String goods_tag;
    //    授权码 auth_code String(128) 是 120061098828009406 扫码支付授权码，设备读取用户微信中的条码或者二维码信息
    private String auth_code;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSub_appid() {
        return sub_appid;
    }

    public void setSub_appid(String sub_appid) {
        this.sub_appid = sub_appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getSub_mch_id() {
        return sub_mch_id;
    }

    public void setSub_mch_id(String sub_mch_id) {
        this.sub_mch_id = sub_mch_id;
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

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
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

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }


}
