package com.sinerry.jc.entity;

public abstract class Animal {
    public static void staticMethod() {
        System.out.println("staticproxy method in abstract class");
    }

    public abstract String yell();

    public Animal() {
        System.out.println("执行了Animal构造函数");
    }
}
