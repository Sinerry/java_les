package com.sinerry.thread.task;


public class NotVip implements Runnable{
    private Thread thread;

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    private Integer n;
    private Integer interval;

    public NotVip(Integer n,Integer interval) {
        this.n = n;
        this.interval = interval * 1000;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++){
            System.out.println(String.format("普通号[%d]正在选房",i));
            try {
                if(i == 10){
                    thread.join();// 线程合并 Vip独占CPU资源，并行 变 串行
                }
                Thread.currentThread().sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
