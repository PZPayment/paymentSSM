package com.payment.pay.plugins.weixin;


import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.errorCode.BaseErrorCode;
import com.payment.comm.utils.MD5Utils;
import com.payment.pay.bankRqData.BankRqDataUtils;
import com.payment.pay.plugins.bankData.WeiXinScanCodeRqData;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.*;

public class WeiXinUtils {

    private static final Logger logger = LoggerFactory.getLogger(WeiXinUtils.class);
    public static DefaultHttpClient httpclient;

    static {
        httpclient = new DefaultHttpClient();
        httpclient = (DefaultHttpClient) HttpClientConnectionManager.getSSLInstance(httpclient);
    }

    /**
     * 微信扫码请求
     *
     * @param url
     * @param xmlParam
     * @return
     */
    public static ScanCodeResult getScanCodeResult(String url, String xmlParam) {
        logger.info("xml是:{}", xmlParam);
        HttpEntity entity = null;
        ScanCodeResult scanCodeResponse = new ScanCodeResult();
        DefaultHttpClient client = new DefaultHttpClient();
        client.getParams().setParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, true);
        HttpPost httpost = HttpClientConnectionManager.getPostMethod(url);
        HttpResponse response = null;
        synchronized (httpclient) {
            try {
                httpost.setEntity(new StringEntity(xmlParam, "UTF-8"));
                response = httpclient.execute(httpost);
                entity = response.getEntity();
                String jsonStr = EntityUtils.toString(entity, "UTF-8");

                logger.info("json是:{}", jsonStr);
                Map map = doXMLParse(jsonStr);
                scanCodeResponse.setReturn_code((String) map.get("return_code"));
                scanCodeResponse.setReturn_msg((String) map.get("return_msg"));
                //请求返回码失败
                if ("FAIL".equals(scanCodeResponse.getReturn_code())) {
                    return scanCodeResponse;
                }
                scanCodeResponse.setAppid((String) map.get("appid"));
                scanCodeResponse.setSub_appid((String) map.get("sub_appid"));
                scanCodeResponse.setMch_id((String) map.get("mch_id"));
                scanCodeResponse.setSub_mch_id((String) map.get("sub_mch_id"));
                scanCodeResponse.setDevice_info((String) map.get("device_info"));
                scanCodeResponse.setNonce_str((String) map.get("nonce_str"));
                scanCodeResponse.setSign((String) map.get("sign"));
                scanCodeResponse.setResult_code((String) map.get("result_code"));
                scanCodeResponse.setErr_code((String) map.get("err_code"));
                scanCodeResponse.setErr_code_des((String) map.get("err_code_des"));
                //交易返回码失败
                if ("FAIL".equals(scanCodeResponse.getResult_code())) {
                    return scanCodeResponse;
                }
                scanCodeResponse.setOpenid((String) map.get("openid"));
                scanCodeResponse.setIs_subscribe((String) map.get("is_subscribe"));
                scanCodeResponse.setSub_openid((String) map.get("sub_openid"));
                scanCodeResponse.setSub_is_subscribe((String) map.get("sub_is_subscribe"));
                scanCodeResponse.setTrade_type((String) map.get("trade_type"));
                scanCodeResponse.setBank_type((String) map.get("bank_type"));
                scanCodeResponse.setFee_type((String) map.get("fee_type"));
                scanCodeResponse.setTotal_fee((String) map.get("total_fee"));
                scanCodeResponse.setCash_fee_type((String) map.get("cash_fee_type"));
                scanCodeResponse.setCash_fee((String) map.get("cash_fee"));
                scanCodeResponse.setCoupon_fee((String) map.get("coupon_fee"));
                scanCodeResponse.setTransaction_id((String) map.get("transaction_id"));
                scanCodeResponse.setOut_trade_no((String) map.get("out_trade_no"));
                scanCodeResponse.setAttach((String) map.get("attach"));
                scanCodeResponse.setTime_end((String) map.get("time_end"));
                return scanCodeResponse;
            } catch (Exception e) {
                logger.error("微信后端通信出错", e);
            } finally {
                try {
                    if (entity != null) {
                        EntityUtils.consume(entity);
                    }
                } catch (Exception e) {
                    logger.error("关闭http连接出错", e);
                }
            }
        }
        return scanCodeResponse;
    }


    public static PrePayResult getPayNo(String url, String xmlParam) {
        logger.info("xml是:{}", xmlParam);
        HttpEntity entity = null;
        PrePayResult prePayResult = new PrePayResult();
        DefaultHttpClient client = new DefaultHttpClient();
        client.getParams().setParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, true);
        HttpPost httpost = HttpClientConnectionManager.getPostMethod(url);
        HttpResponse response = null;
        synchronized (httpclient) {
            try {
                httpost.setEntity(new StringEntity(xmlParam, "UTF-8"));
                response = httpclient.execute(httpost);
                entity = response.getEntity();
                String jsonStr = EntityUtils.toString(entity, "UTF-8");
                logger.info("json是:{}", jsonStr);

                Map map = doXMLParse(jsonStr);
                String return_code = (String) map.get("return_code");
                prePayResult.setRequest_code(return_code);
                prePayResult.setError_msg((String) map.get("return_msg"));

                if (jsonStr.indexOf("FAIL") != -1) {
                    prePayResult.setPrepay_id("");
                    return prePayResult;
                }

                if ("SUCCESS".equals(return_code)) {
                    prePayResult.setPrepay_id((String) map.get("prepay_id"));
                    prePayResult.setCode_url((String) map.get("code_url"));
                }

            } catch (Exception e) {
                logger.error("获取预支付ID出错", e);
            } finally {
                try {
                    if (entity != null) {
                        EntityUtils.consume(entity);
                    }
                } catch (Exception e) {
                    logger.error("关闭http连接出错", e);
                }
            }
        }
        return prePayResult;
    }

    public static String getRefundNo(String url, String xmlParam, String cerUrl, String cerPassword) {
        logger.info("退款请求xml是:{}", xmlParam);
        String refundResult = null;
        try {
            //访问https
            HttpClient httpclientCer = new DefaultHttpClient();

            httpclientCer = HttpClientConnectionManager.getCertSSLInstance(httpclientCer, cerUrl, cerPassword);
            //构造POST请求
            HttpPost httpost = new HttpPost(url);
            StringEntity reqEntity = new StringEntity(xmlParam, "UTF-8");
            reqEntity.setContentType("application/x-www-form-urlencoded");
            httpost.setEntity(reqEntity);

            //执行POST
            HttpResponse response = httpclientCer.execute(httpost);
            String jsonStr = EntityUtils.toString(response.getEntity(), "UTF-8");
            logger.info("退款响应json是:{}", jsonStr);

            Map map = doXMLParse(jsonStr);
            String return_code = (String) map.get("return_code");

            if ("SUCCESS".equals(return_code)) {
                refundResult = ((String) map.get("result_code"));
            }

        } catch (Exception e) {
            logger.error("退款请求失败", e);
        }
        return refundResult;
    }


    public static String genPackage(String key,Class t,Object object) {
        String value = "";
        Field[] FieldArr = t.getDeclaredFields();
        //生成排序MAP
        SortedMap<String, String> packageParams = new TreeMap<String, String>();
        for (Field field : FieldArr) {
            try {
                value = String.valueOf(BankRqDataUtils.getFieldValue(field.getName(), object));
            } catch (Exception e) {
                value = "";
            }
            if (!StringUtils.isBlank(value) && !"null".equals(value)) {
                packageParams.put(field.getName(), value);
            }


        }
        String sign = WeiXinUtils.createSign(packageParams, key);


        packageParams.put("sign", sign);

        Set es = packageParams.entrySet();
        Iterator it = es.iterator();
        StringBuffer xmlContent = new StringBuffer("<xml>");
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String k = (String) entry.getKey();
            String v = (String) entry.getValue();
            xmlContent.append("<").append(k).append(">").append(v).append("</").append(k).append(">");
        }
        xmlContent.append("</xml>");

        return xmlContent.toString();
    }

    /**
     * 创建md5摘要,规则是:按参数名称a-z排序,遇到空值的参数不参加签名。
     */
    public static String createSign(SortedMap<String, String> packageParams, String key) {
        StringBuffer sb = new StringBuffer();
        Set es = packageParams.entrySet();
        Iterator it = es.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String k = (String) entry.getKey();
            String v = (String) entry.getValue();
            if (null != v && !"".equals(v) && !"sign".equals(k)
                    && !"key".equals(k)) {
                sb.append(k + "=" + v + "&");
            }
        }
        sb.append("key=" + key);
        String sign = MD5Utils.MD5Encode(sb.toString(), "UTF-8").toUpperCase();
        return sign;
    }

    /**
     * 解析xml,返回第一级元素键值对。如果第一级元素有子节点，则此节点的值是子节点的xml数据。
     *
     * @param strxml
     * @return
     */
    public static Map doXMLParse(String strxml) throws Exception {
        if (null == strxml || "".equals(strxml)) {
            return null;
        }

        Map m = new HashMap();
        InputStream in = String2Inputstream(strxml);
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(in);
        Element root = doc.getRootElement();
        List list = root.getChildren();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Element e = (Element) it.next();
            String k = e.getName();
            String v = "";
            List children = e.getChildren();
            if (children.isEmpty()) {
                v = e.getTextNormalize();
            } else {
                v = getChildrenText(children);
            }

            m.put(k, v);
        }

        //关闭流
        in.close();

        return m;
    }

    /**
     * 解析xml,返回第一级元素键值对。如果第一级元素有子节点，则此节点的值是子节点的xml数据。
     *
     * @param strxml
     * @return
     */
    public static Map<String, String[]> doXMLParseForController(String strxml) throws Exception {
        if (null == strxml || "".equals(strxml)) {
            return null;
        }

        Map<String, String[]> m = new HashMap<String, String[]>();
        InputStream in = String2Inputstream(strxml);
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(in);
        Element root = doc.getRootElement();
        List list = root.getChildren();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Element e = (Element) it.next();
            String k = e.getName();
            String v = "";
            List children = e.getChildren();
            if (children.isEmpty()) {
                v = e.getTextNormalize();
            } else {
                v = getChildrenText(children);
            }

            String[] arrayValue = {v};
            m.put(k, arrayValue);
        }

        //关闭流
        in.close();

        return m;
    }

    /**
     * 获取子结点的xml
     *
     * @param children
     * @return String
     */
    public static String getChildrenText(List children) {
        StringBuffer sb = new StringBuffer();
        if (!children.isEmpty()) {
            Iterator it = children.iterator();
            while (it.hasNext()) {
                Element e = (Element) it.next();
                String name = e.getName();
                String value = e.getTextNormalize();
                List list = e.getChildren();
                sb.append("<" + name + ">");
                if (!list.isEmpty()) {
                    sb.append(getChildrenText(list));
                }
                sb.append(value);
                sb.append("</" + name + ">");
            }
        }

        return sb.toString();
    }

    public static InputStream String2Inputstream(String str) {
        return new ByteArrayInputStream(str.getBytes());
    }

    /**
     * 从给定字符串中按照指定编码截取字符串,可以避免乱码.
     * 对于截取的长度碰到中文的时候,截取前一个完整的字符,
     *
     * @param charset   字符集,例如"UTF-8"
     * @param oldString 需要截取的字符串
     * @param length    需要截取的长度
     * @return 截取后的字符串
     * @throws PaymentException 参数为空,字符集非法等异常.
     */
    public static String getSubstrByCharset(String charset, String oldString, int length) throws PaymentException {
        if (length < 0 || oldString == null || charset == null || "".equals(charset)) {
            throw new PaymentException(BaseErrorCode.ARGS_IS_NULL);
        }

        int tmpLen = 0;
        try {
            tmpLen = oldString.getBytes(charset).length;
        } catch (UnsupportedEncodingException e) {
            throw new PaymentException(BaseErrorCode.ARGS_IS_ERROR);
        }

        if (tmpLen > 128) {
            String encode = charset;
            Charset cs = Charset.forName(encode);

            // 截取length字节,不出错
            int sublen = length;
            // UTF-8字节
            String srcStr = oldString;
            // 先转化成char
            char[] srcStrChars = srcStr.toCharArray();
            int cnt = 0;

            CharBuffer cb = CharBuffer.allocate(1);
            ByteBuffer resultBuff = ByteBuffer.allocate(sublen);
            for (int i = 0; i < srcStrChars.length; i++) {
                char c = srcStrChars[i];
                cb.put(c);
                cb.flip();
                ByteBuffer bb = cs.encode(cb);
                cnt += bb.array().length;
                if (cnt > sublen) {
                    break;
                }
                resultBuff.put(bb);
                cb.clear();
            }

            String resultStr = null;
            try {
                int pos = resultBuff.position();
                byte[] dst = new byte[pos];

                System.arraycopy(resultBuff.array(), 0, dst, 0, pos);

                resultStr = new String(dst, encode);
            } catch (UnsupportedEncodingException e) {
                throw new PaymentException(BaseErrorCode.ARGS_IS_ERROR);
            }

            return resultStr + "...";
        } else {
            return oldString;
        }
    }
    public static void main(String[] args) {
        String xml = "<xml><appid>wx50f31ec99b98711c</appid><mch_id>1220219601</mch_id><nonce_str>c3d377d10b13f8b39bf1218a60fe77b1</nonce_str><op_user_id>1220219601</op_user_id><out_refund_no>E2015012200781660</out_refund_no><out_trade_no>15031412564514</out_trade_no><refund_fee>10</refund_fee><sign>AAC2F6DBE3298E906B63786E39B0DE86</sign><total_fee>10</total_fee></xml>";
        WeiXinUtils.getRefundNo("https://api.mch.weixin.qq.com/secapi/pay/refund", xml, "/Users/hanqingbin/Documents/apiclient_cert.p12", "1220219601");
    }
}