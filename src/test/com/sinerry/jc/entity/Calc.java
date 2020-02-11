package com.sinerry.jc.entity;

public interface Calc {
    class InnerClass {

    }
    interface InnerInterface {

    }

    int MAX_COUNT = 100;


    int add(int x,int y);

    // Java8新增的，接口中可以定义静态方法
    static void staticMethod() {

    }
    // Java8新增的，接口中可以定义默认实现了方法体的方法
    default void defaultMethod() {

    }
}
