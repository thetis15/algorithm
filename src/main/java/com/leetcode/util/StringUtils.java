package com.leetcode.util;

public class StringUtils {


    public static String converterArrayString(String jsonArrayString) {
        return converterArrayString(jsonArrayString, "");
    }

    public static String converterArrayString(String jsonArrayString, String prefix) {
        if (prefix == null || prefix.trim().isEmpty()) prefix = "";

        return prefix + jsonArrayString.replace('[','{')
                .replace(']','}');
    }
}
