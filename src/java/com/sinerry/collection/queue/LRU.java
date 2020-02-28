package com.sinerry.collection.queue;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU<K,V> extends LinkedHashMap<K,V>  {
    private int MAX_SIZE;
    /*
    * LRU: Least Recently Used ，最近最少使用
    *  缓存的一种淘汰算法
    *  当缓存已满时，再向缓存中添加内容时，删除（淘汰）缓存中已存在
    *  最近最少使用的那个
    *
    *  LinkedHashMap 支持 LRU 算法
    *  LinkedHashMap = HashMap + 双向链表
    *
    *  双向链表：head/tail，after/before
    *  LinkedHashMap是有序的：
    *   1. 插入(put)顺序：
    *       accessOrder为false，按照put的顺序，
    *       每次插入元素，将插入的元素放到双向链表的末尾
    *   2. 访问(get)顺序：
    *       accessOrder为true，按照get的顺序，
    *       每次获取元素，将获取的元素放到双向链表的末尾
    *  LinkedHashMap
    *   每次put/get元素，将put/get的元素放到双向链表当末尾
    *
    *
    *  比如当LinkedHashMap超过指定的容量大小了，需要将最少使用的元素删除掉，
    *  那么需要重写一个方法removeEldestEntry(Entry eldest)
    *  参数eldest 最近最少使用的元素，当调用put方法是，会触发该方法，
    *   若该方法返回true，则删除 添加 的元素 ，否则 不删除
    *
    *
    *
    *
    *
    *
    * */
    public LRU() {
        super(6,.75F,true);
        MAX_SIZE = 5;
    }
    public LRU(int MAX_SIZE) {
        super(6,.75F,true);
        this.MAX_SIZE = MAX_SIZE;
    }
    public static void main(String[] args) {
        LRU<Integer,String> map = new LRU<>(10);

        // 添加(put)
        map.put(4,"李四");
        map.put(3,"张三");
        map.put(6,"钱六");
        map.put(5,"王五");
        map.put(2,"陈二");
        map.put(7,"刘七");
        System.out.println(map);
        String p4 = map.get(4);
        System.out.println(map);
        // 获取(get)
        //map.get(6);
        //System.out.println(map);
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
       boolean flag = size() > MAX_SIZE;
       if(flag) {
           System.out.println("超过缓存的容量了，需要删除：" + eldest);
       }
       return flag;
    }
}
