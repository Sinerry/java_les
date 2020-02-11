package com.sinerry.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    /*
    * 队列 Queue：一种在队尾插入元素，在队头删除元素的数据结构
    *
    *   特点：只能对 队头或队尾对元素进行操作，而不能对 队列中间对元素进行操作
    *        先进先出  FIFO
    *        先进后出  FILO
    *
    * 队列的两个接口：Queue，Deque
    * 队列的实现类：
    *   1.LinkedList（链表），具有队列，两端队列的功能，内部使用链表实现的
    *
    *   2.ArrayQueue，具有队列，两端队列的功能，内部使用循环数组实现的
    *
    *   3.PriorityQueue，优先级队列，它内部实现结构可以快速把所有元素
    *     中的最小的元素单独放出来，最典型的应用场景就是任务调度
    *
    *
    * 增：
    *   add/offer（队尾添加）
    *   如果队列未满，将元素添加至队列尾部
    *   如果队列已满，add 抛异常，IllegalStateException
    *               offer  返回 false
    *
    * 删：
    *   remove/poll（队头删除）
    *   如果队列不为空，二者都删除队头元素并返回
    *   如果队列为空，remove  抛出异常  NoSuchElementException
    *               poll 返回 null
    *   如果使用 remove 删除队头元素，remove前需要检测队列是否为空
    *       使用 size() == 0 或 isEmpty()
    *
    *   如果使用 poll 删除队头元素，获取结果之前需要检测其是否为 null
    * 查：
    *   element/peek（只取出队头元素，不删除）
    *   如果队列不为空，二者都查看 队头元素 并返回
    *   如果队列为空，element  抛出异常  NoSuchElementException
    *               peek 返回 null
    *
    * 改：队列没有修改操作
    * 清空：
    *   clear
    * 两个应用场景：任务调度，LRU
    *
    * 两个工具：Arrays，Collections
    * */

    public static void main(String[] args) {
        testQueue();
    }


    public static void testQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("html");
        queue.add("css");
        queue.add("javascript");
        /*System.out.println(queue);

        queue.offer("jquery");
        queue.offer("vue");
        System.out.println(queue);*/

        /*String s = queue.remove();
        System.out.println(s);
        System.out.println(queue);*/

        String s = queue.element();
        System.out.println(s);
        System.out.println(queue);

    }
}
