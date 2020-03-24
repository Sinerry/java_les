package com.sinerry.thread.task;


/*
*   案例：
    * 某楼盘摇号买房，分为普通号和VIP号，50个普通号，
    * 10个VIP号。VIP号的选房时间为普通号的2倍，开始
    * 普通号和VIP号并行叫号，叫到VIP号的概率比普通号
    * 更高，当普通号叫完第10号时，要求先让VIP号全部选
    * 完，再让普通号选房，用多线程模拟这个过程。
* */
public class Vip implements Runnable{

    // Vip的号数
    private Integer n;
    // 时间间隔
    private Integer interval;

    public Vip(Integer n,Integer interval) {
        this.n = n;
        this.interval = interval * 1000;
    }

    @Override
    public void run() {
        for(int i = 1; i <= n; i++){
            System.out.println(String.format("Vip[%d]正在选房",i));
            try {
                Thread.currentThread().sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
