package com.sinerry.thread.test;

import com.sinerry.thread.task.NotVip;
import com.sinerry.thread.task.Vip;

public class VipTest {
    public static void main(String[] args) {
        // Vip 与 普通号 抢号
        Thread vip = new Thread(new Vip(10,2));
        NotVip notVip = new NotVip(30,1);
        // 设置vip的优先级  Priority
        vip.setPriority(Thread.MAX_PRIORITY);
        notVip.setThread(vip);
        vip.start();
        new Thread(notVip).start();
    }
}
