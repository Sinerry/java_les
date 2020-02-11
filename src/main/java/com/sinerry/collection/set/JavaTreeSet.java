package com.sinerry.collection.set;

import java.util.TreeSet;

public class JavaTreeSet {
    /*
    * 集合类
    * Collection
    *   List 列表
    *   Set 集
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *   Queue  队列
    *
    * 键值对，散列集
    * Map
    *   HashMap  -->  HashSet
    *   TreeMap  -->  TreeSet
    *   LinkedHashMap --> LinkedHashSet
    *
    *
    *
    * Set内部使用的是对应的Map来实现的，
           Map的key存放set的值，value存放一个固定值(static new Object())
           Map中的key不可以重复。可以是null。
           所以Set的值不可以重复。可以是null？
    *
    * 1.创建
    *
    * 2.添加
    *   add()， 内部调用的是put（key，PRESENT）
    *   TreeSet有序，根TreeMap的有序一样，TreeMap/TreeSet的排序规则：
    *   1. 在创建实例的时候，指定Comparator接口的排序器实例，compare(Object o1,Object o2)
    *   2. 存放的元素或key必须实现Comparable接口，重写compareTo(Object o)
    *
    *
    *   TreeSet是否可以存放null，分两种情况：
    *   1. 如果在创建TreeSet的时候指定了Comparator，则可以存放null
    *   2. 如果在创建TreeSet的时候没有指定Comparator，则不可以存放null，因为这时候需要调用存放元素的compareTo方法，
    *      而null.compareTo就会报空指针异常的错误
    * 3.删除
    *   remove()， 内部调用的是map.remove(key)
    * 4.遍历
    *   foreach
    *   迭代器
    *
    * 5.应用场景
    *   检测某个元素在集中是否存在
    *
    *
    *
    * */

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>(){
            {
                add("java");
                add("hello");
                add("spring");
                add("mysql");
            }
        };

        System.out.println(treeSet);

    }
}
