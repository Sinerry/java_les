package com.sinerry.thread.task;

public class Singleton {
    private volatile static Singleton instance;
    // 构造函数私有化
    private Singleton(){
        System.out.println("创建了Singleton实例");
    }
    // 同步方法
    /*public synchronized static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }*/

    // 同步代码块
    /*public static Singleton getInstance(){
        synchronized (Singleton.class){
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }
    }*/

    // Double-Check
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }



}
