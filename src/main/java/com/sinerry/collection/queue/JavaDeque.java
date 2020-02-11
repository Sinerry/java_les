package com.sinerry.collection.queue;

import java.util.Deque;
import java.util.LinkedList;

public class JavaDeque {
    /*
    * 两端队列：可以在队头/队尾都能进行插入或删除
    * Deque
    *
    * 队列的操作：
    *   Queue:
    *       add/offer
    *       remove/poll
    *       element/peek
    *
    * 双端队列的操作：
    *   增：
    *       addFirst/addLast（特点跟add一致）
    *       offerFirst/offerLast（特点跟offer一致）
    *
    *   删：
    *       removeFirst/removeLast（特点跟remove一致）
    *       pollFirst/pollLast（特点跟poll一致）
    *
    *   查：
    *       getFirst/getLast (特点跟element一致）
    *       peekFirst/peekLast (特点跟peek一致）
    *
    * */
    public static void main(String[] args) {
        testDeque();
    }

    public static void testDeque() {
        Deque<String> deque = new LinkedList<String>();

    }
}
