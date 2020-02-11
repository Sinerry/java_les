package com.sinerry.innerclass;

import org.testng.annotations.Test;

public class InnerClassTest {
    @Test
    public void testInnerClass() {

        OuterClass oc = new OuterClass("outer");
        // 第一种方法创建内部类实例
        OuterClass.InnerClass ic = oc.new InnerClass("inner");
        ic.printInfo();

        // 第二种方式创建内部类实例
       OuterClass.InnerClass ic2 = oc.createInnerClassInstance("inner");
       ic2.printInfo();
    }
}
