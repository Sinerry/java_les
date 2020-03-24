package com.sinerry.thread.producerconsumer;

public class Test {
    public static void main(String[] args) {
        // 容器
        Stack stack = new Stack();
        // 生产者
        Producer producer = new Producer(stack);
        // 消费者
        Consumer consumer = new Consumer(stack);

        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
