package com.payment.pay.plugins.weixin;


import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;


public class HttpClientConnectionManager {


    /**
     * 获取SSL验证的HttpClient，支付接口使用，不需要双向证书
     *
     * @param httpClient
     * @return
     */
    public static HttpClient getSSLInstance(HttpClient httpClient) {
        ClientConnectionManager ccm = httpClient.getConnectionManager();
        SchemeRegistry sr = ccm.getSchemeRegistry();
        sr.register(new Scheme("https", 443, MySSLSocketFactory.getInstance()));
        httpClient = new DefaultHttpClient(ccm, httpClient.getParams());
        return httpClient;
    }

    /**
     * 获取双向认证的HttpClient，微信退款接口，需要双向证书
     *
     * @param httpClient
     * @param cerUrl
     * @param cerPassword
     * @return
     */
    public static HttpClient getCertSSLInstance(HttpClient httpClient, String cerUrl, String cerPassword) {
        //使用TLS工厂构建https双向认证通道
        Scheme scheme = new Scheme("https", 443, MyTSLSocketFactory.getInstance(cerUrl, cerPassword));
        httpClient.getConnectionManager().getSchemeRegistry().register(scheme);

        return httpClient;
    }

    /**
     * 模拟浏览器post提交
     *
     * @param url
     * @return
     */
    public static HttpPost getPostMethod(String url) {
        HttpPost pmethod = new HttpPost(url); // 设置响应头信息
        pmethod.addHeader("Connection", "keep-alive");
        pmethod.addHeader("Accept", "*/*");
        pmethod.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        pmethod.addHeader("Host", "api.mch.weixin.qq.com");
        pmethod.addHeader("X-Requested-With", "XMLHttpRequest");
        pmethod.addHeader("Cache-Control", "max-age=0");
        pmethod.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0) ");
        return pmethod;
    }

    /**
     * 模拟浏览器GET提交
     *
     * @param url
     * @return
     */
    public static HttpGet getGetMethod(String url) {
        HttpGet pmethod = new HttpGet(url);
        // 设置响应头信息
        pmethod.addHeader("Connection", "keep-alive");
        pmethod.addHeader("Cache-Control", "max-age=0");
        pmethod.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0) ");
        pmethod.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/;q=0.8");
        return pmethod;
    }
}
