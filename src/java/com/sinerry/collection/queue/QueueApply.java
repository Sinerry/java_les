package com.sinerry.collection.queue;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;

public class QueueApply {
    public static void main(String[] args) {
        // taskScheduling();

        lRU();
    }

    // 任务调度
    public static void taskScheduling() {
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        final int TASK_LENGTH = 10;
        final int MAX_RANDOM = 101;
        Random random = new Random();
        for (int i = TASK_LENGTH; i >= 1; i--) {
            tasks.add(new Task(random.nextInt(MAX_RANDOM),TASK_LENGTH - i + 1 + ""));
        }

        while (!tasks.isEmpty()) {
            Task task = tasks.remove();
            System.out.println(task);
        }

    }

    // 任务类
    static class Task implements Comparable<Task> {
        private int priority;
        private String name;
        public Task(int priority,String name) {
            this.priority = priority;
            this.name = name;
        }
        @Override
        public String toString() {
            return String.format("task %s, \tpriority = %d",name,priority);
        }

        @Override
        public int compareTo(Task o) {
            if(this.priority > o.priority) {
                return 1;
            }
            if(this.priority == o.priority) {
                return 0;
            }
            return -1;
        }
    }



    // LRU
    public static void lRU() {
        LRU<Integer,String> lru = new LRU<>(10);
        lru.put(4,"李四");
        lru.put(2,"王二");
        lru.put(3,"张三");
        lru.put(7,"李七");
        lru.put(1,"刘一");
        lru.put(9,"林九");
        System.out.println(lru);
        lru.get(3);
        System.out.println(lru);
    }


    static class LRU<K,V> extends LinkedHashMap<K,V> {

        // 容量
        private int length = 6;

        // 无参构造
        public LRU() {
            super(10,.8F,true);
        }

        // 有参构造
        public LRU(int length) {
            super(10,.8F,true);
            this.length = length;
        }


        // 重写removeEldestEntry
        @Override
        public boolean removeEldestEntry(Map.Entry<K,V> eldest) {
            if(size() > length) {
                System.out.println("容量已满，需要删除 " + eldest);
                return true;
            }
            return false;
        }
    }
}
