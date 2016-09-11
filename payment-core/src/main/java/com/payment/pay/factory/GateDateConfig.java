package com.payment.pay.factory;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 网关配制信息解析类，类加载时自动解析 网关配制信息存放在payGateMap中
 *
 * @version v1.0
 */
public class GateDateConfig {
    private static final Logger logger = LoggerFactory.getLogger(GateDateConfig.class);

    private static InputStream xmlStream = null;

    private static final Map<String, Map<String,String>> payGateMap = new HashMap<String, Map<String,String>>();

    public static String xmlPath = "META-INF/payGate/payData.xml";

    static {
        init();
    }

    public static boolean init() {
        try {
            xmlStream = Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream(xmlPath);

            SAXReader reader = new SAXReader();
            Document doc = reader.read(xmlStream);
            if (doc == null || doc.getRootElement() == null) {
                logger.error("网关配制，解析配制文件失败");
                return false;
            }

            Element root = doc.getRootElement();
            @SuppressWarnings("unchecked")
            List<Element> list = root.elements();
            Map<String, String> gateDate;
            for (Element e : list) {
                String title= null;
                gateDate = new TreeMap<String, String>();
                for (Object obj:  e.content()){
                    if (obj instanceof Element){
                        Element f = (Element)obj;
                        if ("code".equals(f.getName())){
                            title=f.getText();
                        }
                        gateDate.put(f.getName(),f.getText());
                    }
                }
                payGateMap.put(title,gateDate);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("网关配制，解析配制文件出错", e);
            return false;
        } finally {
            if (xmlStream != null) {
                try {
                    xmlStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Map<String,String> getPayGate(String payGateCode) {
        Map<String,String> handler = payGateMap.get(payGateCode);
        if (handler == null) {
            return null;
        }

        return handler;
    }

    public static void setXmlPath(String xmlPath) {
        GateDateConfig.xmlPath = xmlPath;
    }
}
