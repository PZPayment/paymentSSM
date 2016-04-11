package com.payment.comm.utils.tenpay.util;

import com.payment.comm.utils.MyLogger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * xml������
 * @author miklchen
 *
 */
public class XMLUtil {

    /**
     * 日志
     * */
    public static final MyLogger LOGGER = new MyLogger(XMLUtil.class);

    private XMLUtil(){
    }
    
    /**
     * ����xml,���ص�һ��Ԫ�ؼ�ֵ�ԡ�����һ��Ԫ�����ӽڵ㣬��˽ڵ��ֵ���ӽڵ��xml��ݡ�
     * @param strxml
     * @return
     * @throws JDOMException
     * @throws IOException
     */
    public static Map doXMLParse(String strxml) throws JDOMException{
        String strxmlNew = strxml;
        strxmlNew = strxmlNew.replaceFirst("encoding=\".*\"", "encoding=\"UTF-8\"");

        if(null == strxmlNew || "".equals(strxmlNew)) {
            return null;
        }
        
        Map m = new HashMap();

        InputStream in = null;
        try {
            in = new ByteArrayInputStream(strxmlNew.getBytes("UTF-8"));
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(in);

            Element root = doc.getRootElement();
            List list = root.getChildren();
            Iterator it = list.iterator();
            while(it.hasNext()) {
                Element e = (Element) it.next();
                String k = e.getName();
                String v = "";
                List children = e.getChildren();
                if(children.isEmpty()) {
                    v = e.getTextNormalize();
                } else {
                    v = XMLUtil.getChildrenText(children);
                }

                m.put(k, v);
            }

        
            //�ر���
            in.close();
        } catch (Exception e) {
            LOGGER.error(""+e);
        }
        
        return m;
    }
    
    /**
     * ��ȡ�ӽ���xml
     * @param children
     * @return String
     */
    public static String getChildrenText(List children) {
        StringBuilder sb = new StringBuilder();
        if(!children.isEmpty()) {
            Iterator it = children.iterator();
            while(it.hasNext()) {
                Element e = (Element) it.next();
                String name = e.getName();
                String value = e.getTextNormalize();
                List list = e.getChildren();
                sb.append("<" + name + ">");
                if(!list.isEmpty()) {
                    sb.append(XMLUtil.getChildrenText(list));
                }
                sb.append(value);
                sb.append("</" + name + ">");
            }
        }
        
        return sb.toString();
    }
    
    /**
     * ��ȡxml�����ַ�
     * @param strxml
     * @return
     * @throws IOException 
     * @throws JDOMException 
     */
    public static String getXMLEncoding(String strxml) throws JDOMException {
        InputStream in = HttpClientUtil.String2Inputstream(strxml);
        SAXBuilder builder = new SAXBuilder();
        Document doc = null;
        try {
            doc = builder.build(in);
            in.close();
        } catch (IOException e) {
            LOGGER.error(""+e);
        }

        return (String)doc.getProperty("encoding");
    }
    
    
}
