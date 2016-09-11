package com.payment.pay.plugins.weixin;


import org.apache.http.conn.ssl.SSLSocketFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;

/**
 * @author hanqingbin
 * @time 2015/04/14
 * @description TLS双向认证通道
 */
public class MyTSLSocketFactory extends SSLSocketFactory {

    private static final Logger logger = LoggerFactory.getLogger(MyTSLSocketFactory.class);

    private static MyTSLSocketFactory mySSLSocketFactory = null;

    private static SSLContext createSContext(String file, String pass) {
        //创建TLS上下文示例
        SSLContext sslcontext = null;
        try {
            sslcontext = SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        //加载私钥证书
        try {
            KeyManagerFactory tmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            FileInputStream instream = new FileInputStream(new File(file));
            try {
                keyStore.load(instream, pass.toCharArray());
            } finally {
                instream.close();
            }

            tmf.init(keyStore, pass.toCharArray());

            //初始化
            sslcontext.init(tmf.getKeyManagers(), null, null);
        } catch (Exception e) {
            logger.error("创建SSL异常", e);
            return null;
        }
        return sslcontext;
    }

    private MyTSLSocketFactory(SSLContext sslContext) {
        super(sslContext, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public static MyTSLSocketFactory getInstance(String file, String pass) {
        if (mySSLSocketFactory != null) {
            return mySSLSocketFactory;
        } else {
            return mySSLSocketFactory = new MyTSLSocketFactory(createSContext(file, pass));
        }
    }

}