package com.sinerry.collection.list;

import java.util.*;

public class ListUse {
    public static void main(String[] args) {
        /*
        * 集合分为两大类：
        * 1. 单个元素序列，全部实现了Collection接口
        *   1.1  List，列表，有序的，按照插入顺序 排序，可以有重复元素，也可以包含null
        *   1.2  Set，集，不可以重复，可以包含null
        *   1.3  Queue，队列，按一定规则进行添加/删除
        * 2. 键值对，全部实现了Map接口
        *
        * */

    }

    public static void listUse() {

    }

    /*
    * Set：集，不可以重复，所有的集都实现了Set接口  Set接口继承Collection接口，
    * Set接口定义的方法与Collection接口定义的方法定义的完全一致，仅是做语义上的区别
    *   HashSet：无序
    *
    *   TreeSet：有序，指的是元素按照一定规则来排序，因为TreeSet实现了Comparator接口
    * */
    public static void setUse() {
        Set set = new HashSet(){
            {
                add(3);
                add(7);
                add(4);
                add(2);
                add(5);
                add(6);
            }
        };
    }


    public static void mapUse() {
        Map<Integer,String> map = new HashMap<>();
    }
}
