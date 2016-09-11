package com.payment.pay.bankRqData;

import com.payment.comm.base.exception.PaymentException;
import com.payment.comm.errorCode.PayErrorCode;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 包      名: com.payment.comm.utils  <br>
 * 描      述:                       <br>
 * 创 建 人 : kan <br>
 */
public class BankRqDataUtils {


    private static String buildHead() {
        StringBuffer headBuf = new StringBuffer();
        headBuf.append("<html>");
        headBuf.append("<head>");
        headBuf.append("<meta name=\"CMBNETPAYMENT\" content=\"China Merchants Bank\"/>");
        headBuf.append("<META HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=GBK\"/>");
        headBuf.append("<META HTTP-EQUIV=\"pragma\" CONTENT=\"no-cache\"/>");
        headBuf.append("<META HTTP-EQUIV=\"Cache-Control\" CONTENT=\"no-cache, must-revalidate\"/>");
        headBuf.append("<META HTTP-EQUIV=\"expires\" CONTENT=\"Wed, 26 Feb 1997 08:21:57 GMT\"/>");
        headBuf.append("</head>");
        return headBuf.toString();
    }

    private static String buildBody(BankRqData bankRqData) throws Exception {
        StringBuffer bodyBuf = new StringBuffer();
        bodyBuf.append("<body>");
        bodyBuf.append("<form name=\"bankapi\" action=\"");
        bodyBuf.append(bankRqData.getPayUrl());
        bodyBuf.append("\" method=\"pos\">");

        Object value = null;
        Field[] FieldArr = bankRqData.getClass().getDeclaredFields();
        for (Field field : FieldArr) {
            if ("payUrl".equals(field.getName()) || "serialVersionUID".equals(field.getName())) {
                continue;
            }
            value = getFieldValue(field.getName(), bankRqData);
            if (value == null) {
                value = "";
            }
            bodyBuf.append("<input type=\"hidden\" name=\"");
            bodyBuf.append(field.getName());
            bodyBuf.append("\" value=\"");
            bodyBuf.append(value.toString());
            bodyBuf.append("\"/>");
        }
        bodyBuf.append("</form>");
        bodyBuf.append("<script language=\"JavaScript\">{document.bankapi.submit();}</script>");
        bodyBuf.append("</body>");
        bodyBuf.append("</html>");

        return bodyBuf.toString();
    }
    public static String buildHtml(BankRqData bankRqData) throws PaymentException {
        if (bankRqData == null) {
            throw new PaymentException(PayErrorCode.PAY_ADAPTER_EXCEPTION);
        }

        try {
            StringBuffer htmlBuf = new StringBuffer();
                htmlBuf.append(buildHead());
                htmlBuf.append(buildBody(bankRqData));

            return htmlBuf.toString();
        } catch (Exception e) {
            throw new PaymentException(PayErrorCode.PAY_ADAPTER_EXCEPTION);
        }
    }

    public static Object getFieldValue(String fieldName, Object obj) throws Exception {
        StringBuffer nameBuf = new StringBuffer("get");
        nameBuf.append(fieldName.substring(0, 1).toUpperCase());
        nameBuf.append(fieldName.substring(1));

        Method method = obj.getClass().getMethod(nameBuf.toString(), null);
        if (method == null) {
            throw new Exception("方法未找到:" + nameBuf.toString());
        }
        Object result = method.invoke(obj, null);

        return result;
    }
}
