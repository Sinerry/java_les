package com.sinerry.string;

import org.testng.annotations.Test;

public class StringTest {
    @Test
    public void testStringCreate() {
        String str1 = "hello";
        String str2 = "hello";
        // System.out.println(str1 == str2);
        String str3 = "hello" + "world";
        String str4 = str1 + "world";
        // System.out.println(str3 == str4);
        String str5 = new String("world");
        String str6 = new String("world");
        // System.out.println(str5 == str6);
        String str7 = str1.intern();
        String str8 = new String("hello").intern();
        // System.out.println(str7 == str8);
        String str9 = new String("world").intern();
        String str10 = new String("world").intern();
         System.out.println(str9 == str10);
    }


    @Test
    public void testStringLength() {
        String str = "hello,java";
        System.out.println(str.length());

        // 代码点数
        System.out.println(str.codePointCount(0,str.length()));
    }


    @Test
    public void testSubstring() {
        String str = "hello,sinerry!";
        String str2 = str.substring(6);
        // System.out.println(str2);
        String str3= str.substring(6,str.length());
        // System.out.println(str3);
    }

    @Test
    public void testFind() {
        String str = "o,hello,javaers,today is a good day,let work together and get better job";
        // 从前往后找
        /*int index = -1;
        while(true) {
            index = str.indexOf("o",++index);
            if(index == -1){
                break;
            }
            System.out.println(String.format("下标 %d 的字符是 o%n",index));
        }*/

        // 从后往前找
        int index = str.length();
        while(true) {
            index = str.lastIndexOf("o",index - 1);
            if(index == -1) {
                break;
            }
            System.out.println(String.format("下标 %d 的字符是 o%n",index));
        }

    }

    @Test
    public void testabCountInString() {
        String str = "ab1ababadbaaba12ab9";
        int index = 0, count = 0;
        do {
            index = str.indexOf("ab",index);
            if(index == -1) {
                break;
            }
            count++;
            System.out.println(String.format("下标 %d的位置是ab",index));
            index += "ab".length();
        }while(true);
        System.out.println(String.format("ab字符串在str中出现了 %d次",count));
    }


    @Test
    public void testOptimize() {
        String str = "hello" + ",java";
        // 优化成
        String str1 = "hello,java";
    }

    @Test
    public void testOptimize2() {
        String str = "hello";
        str += ",java";
        System.out.println(str);
        // 优化成

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(",java");
        System.out.println(sb.toString());

    }



    /*
    * 需求：将1 - 10000之间的数字拼成一个字符串，分别通过String，JVM优化，自己优化的对比
    * */
    @Test
    public void testMerge() {
        String str = "";
        long start = System.currentTimeMillis();
        for(int i = 1; i <= 20000; i++) {
            str += i;
        }
        System.out.println(str.length());
        System.out.println(String.format("耗时 %d ms",System.currentTimeMillis() - start));

        // JVM对上述代码对优化
        str = "";
        start = System.currentTimeMillis();

        for(int i = 1; i <= 20000; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i);
            str = sb.toString();
        }
        System.out.println(str.length());
        System.out.println(String.format("耗时 %d ms",System.currentTimeMillis() - start));

        // 自己对上述代码进一步优化
        StringBuilder sb2 = new StringBuilder();
        start = System.currentTimeMillis();
        for(int i = 1; i <= 20000; i++) {
            sb2.append(i);
        }
        System.out.println(sb2.toString().length());
        System.out.println(String.format("耗时 %d ms",System.currentTimeMillis() - start));
    }
}
