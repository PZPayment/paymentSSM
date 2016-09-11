package com.payment.comm.utils;

/**
 * DES 加解密工具类
 * 目前主要用于支付key的加密入库，程序中解密使用。
 * @version 1.0
 */
import org.apache.commons.lang3.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;

public class Des3Utils {

    private static final String Algorithm = "DESede"; // 定义 加密算法,可用
    // DES,DESede,Blowfish
    private static final byte[] keyBytes = "rtfGt67893DF45777YUJ73!9".getBytes();

    public static byte[] encryptMode(byte[] src) {
        return encryptMode(keyBytes, src);
    }

    public static byte[] decryptMode(byte[] src) {
        return decryptMode(keyBytes, src);
    }

    public static String encryptMode(String src) {
        byte[] strbyt = encryptMode(Des3Utils.str2byteArr(src));
        String certstr = Base64Utils.encodeBytes(strbyt);
        return certstr;

    }

    public static String decryptMode(String src) {
        byte[] strbyt = Des3Utils.decryptMode(Base64Utils.decode(src.getBytes()));
        if (null == strbyt || StringUtils.isBlank(new String(strbyt))) {
            return src;
        } else {
            return new String(strbyt).trim();
        }
    }

    // keybyte为加密密钥，长度为24字节
    // src为被加密的数据缓冲区（源）
    public static byte[] encryptMode(byte[] keybyte, byte[] src) {
        try {

            // 生成密钥
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);
            // KeyGenerator kg = KeyGenerator.getInstance("DESede",keybyte);

            // 加密
            Cipher c1 = Cipher.getInstance(Algorithm + "/ECB/NoPadding");
            c1.init(Cipher.ENCRYPT_MODE, deskey);
            return c1.doFinal(src);

        } catch (NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }

    // keybyte为加密密钥，长度为24字节
    // src为加密后的缓冲区
    public static byte[] decryptMode(byte[] keybyte, byte[] src) {
        try {
            // 生成密钥
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

            // 解密
            Cipher c1 = Cipher.getInstance(Algorithm + "/ECB/NoPadding");
            c1.init(Cipher.DECRYPT_MODE, deskey);
            return c1.doFinal(src);
        } catch (NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }

    // 转换成十六进制字符串
    public static String byte2hex(byte[] b) {
        String hs = "";
        String stmp = "";

        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1) {
                hs = hs + "0" + stmp;
            } else {
                hs = hs + stmp;
            }
            if (n < b.length - 1) {
                hs = hs;
            }
        }
        return hs;
    }

    public static String getBASE64(String s) {
        if (s == null) {
            return null;
        }
        return Base64Utils.encode(s);
    }

    // 将 BASE64 编码的字符串 s 进行解码
    public static String getFromBASE64(String s) {
        if (s == null) {
            return null;
        }
        try {
            return Base64Utils.decode(s);
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] getFromBASE642byte(String s) {
        if (s == null) {
            return null;
        }
        try {
            byte[] b = Base64Utils.decode(s.getBytes());
            return b;
        } catch (Exception e) {
            return null;
        }
    }

    public static String byteArr2HexStr(byte[] arrB) throws Exception {
        int iLen = arrB.length;
        // 每个byte用两个字符才能表示，所以字符串的长度是数组长度的两倍
        StringBuffer sb = new StringBuffer(iLen * 2);
        for (int i = 0; i < iLen; i++) {
            int intTmp = arrB[i];
            // 把负数转换为正数
            while (intTmp < 0) {
                intTmp = intTmp + 256;
            }
            // 小于0F的数需要在前面补0
            if (intTmp < 16) {
                sb.append("0");
            }
            sb.append(Integer.toString(intTmp, 16));
        }
        return sb.toString();
    }

    /**
     * 将表示16进制值的字符串转换为byte数组， 和public static String byteArr2HexStr(byte[] arrB)
     * 互为可逆的转换过程
     *
     * @param strIn 需要转换的字符串
     * @return 转换后的byte数组
     * @throws Exception 本方法不处理任何异常，所有异常全部抛出
     */
    public static byte[] hexStr2ByteArr(String strIn) throws Exception {
        byte[] arrB = strIn.getBytes();
        int iLen = arrB.length;

        // 两个字符表示一个字节，所以字节数组长度是字符串长度除以2
        byte[] arrOut = new byte[iLen / 2];
        for (int i = 0; i < iLen; i = i + 2) {
            String strTmp = new String(arrB, i, 2);
            arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
        }
        return arrOut;
    }

    public static byte[] str2byteArr(String str) {
        byte[] srcbyte = str.getBytes();
        int y = srcbyte.length;
        int i = 8 - y % 8;
        i = y + i;
        byte[] tempbyte = new byte[i];
        System.arraycopy(srcbyte, 0, tempbyte, 0, y);
        return tempbyte;

    }

}
