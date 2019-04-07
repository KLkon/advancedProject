package com.kl.util;

/**
 * 自定义 trim 方法
 */
public class StringUtil {

    public static String klTrim(String str) {
        if(str == null || "".equals(str))
            return "";
        return str.trim();
    }
}
