package com.sinerry.thread.producerconsumer;


public class Stack {
    private Drumstick[] array = new Drumstick[10];
    private int index;

    // 生产者添加
    public synchronized void push(Drumstick drumstick){
        // 如果数组已满 就不能添加 让获取到该资源的线程等待
        while (index == array.length){
            try {
                System.out.println("已满");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        array[index] = drumstick;
        index++;
        System.out.println("生产了一个鸡腿: " + drumstick);
    }

    // 消费者删除
    public synchronized Drumstick pop(){
        while (index == 0){
            try {
                this.wait();
                System.out.println("已空");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index--;
        Drumstick drumstick = array[index];
        System.out.println("消费了一个鸡腿: " + drumstick);
        return drumstick;
    }
}
