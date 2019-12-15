package com.sinerry.string;

import com.sinerry.util.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


/*
* TDD，编写测试用例
* */
public class StringUtilsTest {

    @Test
    public void testTrimAll() {
        final String STRING = "hello";
        Assert.assertEquals(StringUtils.trimAll(" hello"), STRING);
        Assert.assertEquals(StringUtils.trimAll("   hello"), STRING);
        Assert.assertEquals(StringUtils.trimAll("hello "), STRING);
        Assert.assertEquals(StringUtils.trimAll("hello   "), STRING);
        Assert.assertEquals(StringUtils.trimAll("he llo"), STRING);
        Assert.assertEquals(StringUtils.trimAll("he     llo"), STRING);
        Assert.assertEquals(StringUtils.trimAll(" he llo "), STRING);
        Assert.assertEquals(StringUtils.trimAll("  he  llo  "), STRING);
    }


    @Test
    public void testReverse() {
        Assert.assertEquals(StringUtils.reverse("abc"),"cba");
        Assert.assertEquals(StringUtils.reverse("1234"),"4321");
        Assert.assertEquals(StringUtils.reverse(" java ")," avaj ");
    }
}
