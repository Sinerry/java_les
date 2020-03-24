package com.sinerry.thread.task;


/*
* 模拟抢票
* */
public class Ticket implements Runnable{
    // 剩余的票
    private Integer remain = 30;
    // 抢了的票
    private Integer occupy = 0;

    @Override
    public void run(){
        while (remain > 0){
            synchronized (this){
                if(remain <= 0){
                    return;
                }
                remain--;
                occupy++;
                System.out.println(Thread.currentThread().getName()+"抢到了第" + occupy + "张票");
            }
        }
    }
}
