package com.sinerry.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class JavaLinkedHashMap {
    /*
    * LinkedHashMap: 在HashMap的基础上做了扩展，保持了元素的添加顺序
    * LinkedHashMap在HashMap的基础上增加的内容有：
    * head指向插入的第一个元素的引用
    * tail指向插入的最后一个元素的引用
    *
    * 对每一个元素(Entry|Node)对象，增加了两个属性，
    * 1. before指向按插入顺序，前一个元素的 引用
    * 2. after指向按插入顺序，后一个元素的引用
    * */
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap();
        map.put(3,"张三");
        map.put(1,"李四");
        map.put(2,"王五");
        map.put(4,"钱六");

        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for (Map.Entry<Integer,String> entry:entries) {
            System.out.println(String.format("%d = %s",entry.getKey(),entry.getValue()));
        }

    }
}
