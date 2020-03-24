package com.sinerry.thread.test;

import com.sinerry.thread.task.Running;

public class RunningTest {
    public static void main(String[] args) {
        Running r1 = new Running(3,2);
        Running r2 = new Running(4,3);
        new Thread(r1,"狗蛋").start();
        new Thread(r2,"大锤").start();
    }
}
