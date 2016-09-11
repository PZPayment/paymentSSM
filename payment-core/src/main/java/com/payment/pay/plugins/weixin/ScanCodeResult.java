package com.payment.pay.plugins.weixin;


/**
 * 微信支付返回结果
 */
public class ScanCodeResult {
    //    返回状态码 return_code 是 String(16) SUCCESS SUCCESS/FAIL     此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
    private String return_code;
    //    返回信息 return_msg 否 String(128) 签名失败 返回信息，如非空，为错误原因        签名失败    参数格式校验错误
    private String return_msg;

    /**
     * 当return_code为SUCCESS的时候，还会包括以下字段：
     */

    //    公众账号ID appid 是 String(32) wx8888888888888888 调用接口提交的公众账号ID
    private String appid;
    //    子商户公众账号ID sub_appid 是 String(32) wx8888888888888888 调用接口提交的子商户公众账号ID
    private String sub_appid;
    //    商户号 mch_id 是 String(32) 1900000109 调用接口提交的商户号
    private String mch_id;
    //    子商户号 sub_mch_id 是 String(32) 1900000109 调用接口提交的子商户号
    private String sub_mch_id;
    //    设备号 device_info 否 String(32) 013467007045764 调用接口提交的终端设备号，
    private String device_info;
    //    随机字符串 nonce_str 是 String(32) 5K8264ILTKCH16CQ2502SI8ZNMTM67VS 微信返回的随机字符串
    private String nonce_str;
    //    签名 sign 是 String(32) C380BEC2BFD727A4B6845133519F3AD6 微信返回的签名，详见签名生成算法
    private String sign;
    //    业务结果 result_code 是 String(16) SUCCESS SUCCESS/FAIL
    private String result_code;
    //    错误代码 err_code 否 String(32) SYSTEMERROR 详细参见错误列表
    private String err_code;
    //    错误代码描述 err_code_des 否 String(128) 系统错误 错误返回的信息描述
    private String err_code_des;

    /**
     * 当return_code 和result_code都为SUCCESS的时，还会包括以下字段：
     */

    //    用户标识 openid String(128) 是 Y  用户在商户appid 下的唯一标识
    private String openid;
    //    是否关注公众账号 is_subscribe String(1) 是 Y  用户是否关注公众账号，仅在公众账号类型支付有效，取值范围：Y或N;Y-关注;N-未关注
    private String is_subscribe;
    //    用户子标识 sub_openid String(128) 否 Y  用户子标识
    private String sub_openid;
    //    是否关注子公众账号 sub_is_subscribe String(1) 是 Y  用户是否关注子公众账号，仅在公众账号类型支付有效，取值范围：Y或N;Y-关注;N-未关注
    private String sub_is_subscribe;
    //    交易类型 trade_type String(16) 是 MICROPAY  支付类型为MICROPAY(即扫码支付)
    private String trade_type;
    //    付款银行 bank_type String(16) 是 CMC 银行类型，采用字符串类型的银行标识，值列表详见银行类型
    private String bank_type;
    //    货币类型 fee_type String(16) 否 CNY 符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型
    private String fee_type;
    //    总金额 total_fee Int 是 888 订单总金额，单位为分，只能为整数，详见支付金额
    private String total_fee;
    //    现金支付货币类型 cash_fee_type String(16) 否 CNY 符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型
    private String cash_fee_type;
    //    现金支付金额 cash_fee Int  是 100 订单现金支付金额，详见支付金额
    private String cash_fee;
    //    代金券或立减优惠金额 coupon_fee Int 否 100  代金券或立减优惠金额<=订单总金额，订单总金额-代金券或立减优惠金额=现金支付金额
    private String coupon_fee;
    //    微信支付订单号 transaction_id String(32) 是 1217752501201407033233368018 微信支付订单号
    private String transaction_id;
    //    商户订单号 out_trade_no String(32) 是 1217752501201407033233368018 商户系统的订单号，与请求一致。
    private String out_trade_no;
    //    商家数据包 attach String(128) 否 123456 商家数据包，原样返回
    private String attach;
    //    支付完成时间 time_end String(14) 是 20141030133525 订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。详见时间规则
    private String time_end;

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

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

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIs_subscribe() {
        return is_subscribe;
    }

    public void setIs_subscribe(String is_subscribe) {
        this.is_subscribe = is_subscribe;
    }

    public String getSub_openid() {
        return sub_openid;
    }

    public void setSub_openid(String sub_openid) {
        this.sub_openid = sub_openid;
    }

    public String getSub_is_subscribe() {
        return sub_is_subscribe;
    }

    public void setSub_is_subscribe(String sub_is_subscribe) {
        this.sub_is_subscribe = sub_is_subscribe;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getCash_fee_type() {
        return cash_fee_type;
    }

    public void setCash_fee_type(String cash_fee_type) {
        this.cash_fee_type = cash_fee_type;
    }

    public String getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(String cash_fee) {
        this.cash_fee = cash_fee;
    }

    public String getCoupon_fee() {
        return coupon_fee;
    }

    public void setCoupon_fee(String coupon_fee) {
        this.coupon_fee = coupon_fee;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }
}
