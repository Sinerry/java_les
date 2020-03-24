package com.sinerry.thread.task;
/*
* 多线程 模拟 两个人 跑步
* */
public class Running implements Runnable{
    // 每跑100需要的时间 单位 秒
    private int time;
    // 要跑的公里数 单位 千米
    private int target;
    private int c;

    public Running(int time, int target){
        this.time = time;
        this.target = target * 10;
    }
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        while (target > 0){
            c++;
            System.out.println(thread.getName() + "跑第" + c + "个100米");
            try {
                thread.sleep(time * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            target--;
        }
        System.out.println(thread.getName() + "达到了终点");
    }

}
