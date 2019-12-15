package com.sinerry.util;

public class StringUtils {

    /*
    * 去除字符串中对所有空格
    * @param s
    * @return string
    * */
    public static String trimAll(String s) {
        if(s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char[] chs = s.toCharArray();
        for(char c:chs) {
            if(c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /*
    * 反转字符串
    * @param s
    * @return string
    * */
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chs = s.toCharArray();
        for(int i = chs.length - 1; i >= 0; i--) {
            sb.append(chs[i]);
        }
        return sb.toString();
    }
}
