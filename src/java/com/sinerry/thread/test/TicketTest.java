package com.sinerry.thread.test;

import com.sinerry.thread.task.Ticket;

public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket,"狗蛋");
        Thread t2 = new Thread(ticket,"大锤");
        Thread t3 = new Thread(ticket,"小明");
        t1.start();
        t2.start();
        t3.start();
    }
}
