package com.sinerry.innerclass;

public class OuterClass {
    private int index;
    private String name;

    public OuterClass(String name) {
        this.name = name;
    }

    // 内部类
    public class InnerClass {
        private String name;
        public InnerClass() {

        }
        public InnerClass(String name) {
            this.name = name;
        }
        public void printInfo() {
            // System.out.println(String.format("name = %s",name));
            System.out.println(String.format("name = %s",this.name));
        }

    }
    // 在外部类中定义创建内部类实例对方法  支持重载
    public InnerClass createInnerClassInstance(String name) {
        return new InnerClass(name);
    }
    public InnerClass createInnerClassInstance() {
        return new InnerClass();
    }
}
