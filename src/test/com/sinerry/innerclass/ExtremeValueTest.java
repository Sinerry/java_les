package com.sinerry.innerclass;


import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ExtremeValueTest {
    public void test() {
        Assert.assertEquals(ExtremeValue.calc(12,23,4,19,45).getMin(),4);
        Assert.assertEquals(ExtremeValue.calc(12,23,4,19,45).getMax(),45);
    }
}
