package com.sinerry.thread;



public class Test2 {
    public static void main(String[] args) {
        Thread t1 = new TicketThread();
        Thread t2 = new TicketThread();
        Thread t3 = new TicketThread();
        t1.setName("狗蛋");
        t2.setName("大锤");
        t3.setName("小明");
        t1.start();
        t2.start();
        t3.start();

    }
}

class TicketThread extends Thread {
    private final static int TARGET = 30;
    private static int occupied;
    @Override
    public void run(){
        while (occupied < TARGET){
            synchronized (TicketThread.class){
                if(occupied >= TARGET){
                    return;
                }
                occupied++;
                System.out.println(getName()+"抢到了第" + occupied + "张票");
            }

        }
    }
}
