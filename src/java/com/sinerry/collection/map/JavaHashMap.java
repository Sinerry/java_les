package com.sinerry.collection.map;



import com.sinerry.collection.entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaHashMap {
    /*
    * Map:
    *   HashMap:
    *
    *   Hashtable:
    *
    *   TreeSet:
    *
    *   TreeMap:
    *
    * 1. 创建
    *   1.1 无参构造
    *   1.2 复制已存在的map
    *   1.3 指定容量大小（桶的大小）
    * 2. 添加
    *   V put（key，value）
    *   1. key不存在，直接将key -> value的关系存储，并返回null
    *   2. key存在，将上次key对应的值替换（新值替换旧值），并返回上次的值（旧值）
    *
    * 3. 取值
    *   V get(key)
    *   1. key存在，返回key对应的值
    *   2. key不存在，返回null
    *
    * 4.是否存在
    *   1.键是否存在
    *       boolean containsKey(key)
    *   2.值是否存在
    *       boolean containsValue(value)
    *
    *       对于自定义类，两个对象在比较相等的时候，会调用Object的equals方法，比较的是引用
    *       public boolean equals(Object obj) {
                return (this == obj);
            }
            比较的是引用（双等比较的是引用），如果想做值比较，需要重写equals方法
            覆写equals方法的同需要修改hashCode方法，也就是说equals方法返回的结果与
            hashCode方法返回的结果一致
    *
    *
    *
    * 5. 遍历
    *   map可以返回三个视图，
    *   键视图(键集)   keySet   Set
    *   值视图(值集）  values   Collection
    *   键值对视图(键值对集)  entrySet   Entry
    *
    *
    * 6. 内部结构
    *   哈希表/散列表，数组链表
    *
    *
    * */
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();

        // 添加
        map.put(1,new Student("lucy",18));
        map.put(6,new Student("jack",20));
        map.put(4,new Student("rose",18));
        map.put(9,new Student("jennifer",22));
        map.put(5,new Student("peter",21));

        // 键集
        //Set<Integer> keySet = map.keySet();
        //System.out.println(keySet);

        // 值集合
        //Collection<Student> values = map.values();
        //System.out.println(values);

        // 键值对集
        //Set<Map.Entry<Integer,Student>> entrySet = map.entrySet();
        //System.out.println(entrySet);


        // 删除
        //Student s = map.remove(4);
        //System.out.println(s);


        // 是否存在

        boolean flag = map.containsValue(new Student("rose",18));
        System.out.println(flag);


        String a = "001";
        String b = "001";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());





    }


}
