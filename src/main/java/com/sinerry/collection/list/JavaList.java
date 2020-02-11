package com.sinerry.collection.list;

import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        arrayList();

       /* List<Integer> l = new ArrayList<>();
        addTo(l,100000,3);
        List<Integer> l2 = new ArrayList<>(100000);
        addTo(l2,100000,3);*/

    }
    /*
     * Collection:
     *   List
     *       ArrayList
     *       LinkedList
     *
     *   创建
     *
     *
     *   添加
     *      add
     *
     *   删除
     *      remove
     *
     *   遍历
     *       1. for
     *       2. foreach
     *       3. 迭代器
     *              Iterator
     *              ListIterator
     *          1.  迭代器操作元素的时候，
     *              set，remove方法只和迭代器的状态有关，
     *              更新或者删除的是上一次next或previous方法返回的元素
     *
     *
     *          2.  add方法只和迭代器的位置有关，在当前迭代器位置之前添加元素
     *
     *          迭代器注意事项：
     *              在使用迭代器对列表进行遍历时，原列表不能发生结构性变化
     *              （set，remove...等操作），需要重新获取迭代器对象，否则迭代器会抛异常，
     *              。列表内部通过 modCount 计数来实现的
     *
     *       4. lambda
     *
     *
     *   底层实现原理以及只要JDK源码
     *
     *
     *   排序
     *
     * */


    /*
    * ArrayList
    * */
    public static void arrayList() {
        // 创建
        // 1.1
        List<Integer> l = new ArrayList<>();

        // 1.2 指定容量
        //List<Integer> l2 = new ArrayList<>(30);

        // 1.3 根据已存在的list创建
        //List<Integer> l3 = new ArrayList<>(l2);


        /*
         * ArrayList的扩容：
         *   数组是有容量大小限制的，当add操作是，如果数组已满，就会引发扩容，
         *   扩容会做如下的事情
         *   1. 计算新的容量大小，原来容量的1.5倍，newCapacity = oldCapacity + (oldCapacity >> 1);
         *   2. 按新的容量大小创建一个新数组
         *   3. 将旧数组的元素全部复制到新数组中
         *   4. 丢弃旧数组
         *
         *
         *   在创建ArrayList的时候，如果能预估数据规模，
         *   我们就可以指定初始化容量大小，以减少扩容操作
         *
         * */

        l.add(3);
        l.add(2);
        l.add(7);
        l.add(6);
        l.add(4);
        l.add(9);
        // System.out.printf("l = %s",l);

        ListIterator<Integer> iter = l.listIterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(",");
        }
        System.out.println();

        while (iter.hasPrevious()) {
            System.out.print(iter.previous());
            System.out.print(",");
        }
        System.out.println();
        // lambda
        l.stream().forEach(v -> {
            System.out.println(v);
        });
    }


    public static void addTo(List<Integer> l,int count,int n) {
        long start = System.currentTimeMillis();
        for(int i = 1;i <= count; i++) {
            l.add(n);
        }
        System.out.printf("耗时%dms",System.currentTimeMillis() - start);
        System.out.println();
    }



    /*
    * LinkedList
    * */
    public static void linkedList() {
        // LinkedList创建不用指定容量大小，因为它没有大小限制
        List<Integer> l = new LinkedList<>();
        l.add(4);
        l.add(9);
        l.add(3);
        l.add(5);
        System.out.println(l);
    }


    /*
    * ArrayList与LinkedList区别：
    * ArrayList：长于随机访问，删除/插入很慢
    * LinkedList：长于删除/插入，随机访问很慢
    *
    * */



}
