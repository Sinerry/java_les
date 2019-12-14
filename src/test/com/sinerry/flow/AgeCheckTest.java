package com.sinerry.flow;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckTest {
    @Test
    public void test() {

        /*
        * 写测试三段式，测试用例
        * 1. given：给出的条件
        * 2. when：什么条件
        * 3. then：输出什么结果
        * */

        Assert.assertEquals(AgeCheck.doCheck(5),"儿童");
        Assert.assertEquals(AgeCheck.doCheck(17),"少年");
        Assert.assertEquals(AgeCheck.doCheck(32),"青年");
        Assert.assertEquals(AgeCheck.doCheck(48),"中年");
        Assert.assertEquals(AgeCheck.doCheck(60),"老年");
    }
}
