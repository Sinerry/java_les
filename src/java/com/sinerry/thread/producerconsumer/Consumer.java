package com.sinerry.thread.producerconsumer;

public class Consumer implements Runnable{
    private Stack stack;
    public Consumer(Stack stack) {
        this.stack = stack;

    }
    @Override
    public void run(){
        for(int i = 20; i >= 1; i--){
            stack.pop();
            try {
                Thread.currentThread().sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
