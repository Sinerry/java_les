package com.sinerry.annotation;




public class Annotation {
    /*
    * 注解：
    *   内置注解：
    *       @Override:   标注当前方法是被重写的(是否是重写方法)
    *       @Deprecated: 标注当前方法已过时
    *       @SuppressWarning: 忽略警告，可以作用在类的任何位置
    *
    *       @FunctionalInterface
    *
    *       @SafeVarargs
    *
    *   元注解：用于给注解添加的注解
    *       @Document
    *
    *       @Target
    *           ElementType: 用于提供注解的类型
    *               TYPE
    *               FIELD
    *               METHOD
    *               CONSTRUCTOR
    *               PACKAGE
    *               LOCAL_VARIABLE
    *               PARAMETER
    *
    *       @Retention
    *           RetentionPolicy：用于说明当前注解的生命周期
    *               SOURCE
    *               CLASS
    *               RUNTIME
    *
    *       @Inherited
    *
    *
    *       @Repeatable
    *
    *
    *
    *
    *
    *
    * */
    public static void main(String[] args) {

    }
}

@interface A {

}

class C<T> {
    final void test(T ...key){

    }
}













