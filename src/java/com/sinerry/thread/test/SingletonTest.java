package com.sinerry.thread.test;

import com.sinerry.thread.task.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--){
            new Thread(() ->{
                Singleton singleton = Singleton.getInstance();
                System.out.println(singleton);
            }).start();
        }
    }
}
