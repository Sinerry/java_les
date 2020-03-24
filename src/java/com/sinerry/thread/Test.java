package com.sinerry.thread;

public class Test {
    public static void main(String[] args) {
        Thread vip = new VipThread();
        NormalThread normal = new NormalThread();
        vip.setPriority(Thread.MAX_PRIORITY);
        normal.setTarget(vip);
        vip.start();
        normal.start();
    }
}

// Vip
class VipThread extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            System.out.println(String.format("Vip[%d]正在选房",i));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Normal
class NormalThread extends Thread{
    private Thread target;

    public void setTarget(Thread target) {
        this.target = target;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 30; i++){
            System.out.println(String.format("普通号[%d]正在选房",i));
            try {
                if(i == 10 && target != null){
                    target.join();
                }
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}