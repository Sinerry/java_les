package com.sinerry.jc.test;

import com.sinerry.jc.entity.Calc;
import com.sinerry.jc.entity.CalcImpl;
import org.testng.annotations.Test;

public class Test3 {
    @Test
    public void testInterface() {
        Calc c = new CalcImpl();
        // 1.检测c是不是Calc、CalcImpl的实例 instanceof
        System.out.println(c instanceof Calc);
        System.out.println(c instanceof CalcImpl);
        // 2.访问接口的静态属性
        System.out.println(Calc.MAX_COUNT);
        System.out.println(CalcImpl.MAX_COUNT);
        System.out.println(c.MAX_COUNT);

    }
}
