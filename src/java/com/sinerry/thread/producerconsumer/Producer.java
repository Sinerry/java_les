package com.sinerry.thread.producerconsumer;

public class Producer implements Runnable {
    private Stack stack;

    public Producer(Stack stack) {
        this.stack = stack;
    }
    @Override
    public void run(){
        Drumstick drumstick;
        for(int i = 1; i <= 20; i++){
            drumstick = new Drumstick(i);
            stack.push(drumstick);
            try {
                Thread.currentThread().sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
