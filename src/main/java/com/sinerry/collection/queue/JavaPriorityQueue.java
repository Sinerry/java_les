package com.sinerry.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class JavaPriorityQueue {
    /*
    * 优先级队列：
    * 特点：内部使用了一种堆的数据结构，自我调整二叉树，
    *      当删除/添加元素的时候，它能快速的找到队列中
    *      最小的元素并且移动到树的根部，而不用对所有元素进行排序
    *
    * 对优先级队列进行遍历的时候，也是无序的
    * 遍历：
    *   1.foreach
    *   2.迭代器
    *
    * remove
    *   删除并返回队列中最小的元素
    *
    * 优先级队列如何找最小元素，构建时指定 Comparator，
    * 或者存放元素实现 Comparable 接口
    * */
    public static void main(String[] args) {
        testPriorityQueue();
    }

    public static void testPriorityQueue() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(12);
        queue.add(7);
        queue.add(26);
        queue.add(17);
        queue.add(3);
        queue.add(9);

        Iterator<Integer> iter = queue.iterator();
        while (iter.hasNext()) System.out.println(iter.next());


        Integer i = queue.remove();
        System.out.println(i);
    }
}
