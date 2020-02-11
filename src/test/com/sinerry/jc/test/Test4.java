package com.sinerry.jc.test;

import com.sinerry.jc.entity.C;
import com.sinerry.jc.entity.G;
import com.sinerry.jc.entity.P;
import org.testng.annotations.Test;

public class Test4 {
    @Test
    public void testDuiTai() {
        G g = new G("住宅");
        g.show();

        System.out.println("--------------------------------------");

        P p = new P("住宅","宝马");
        p.show();
        System.out.println("--------------------------------------");


        C c = new C("住宅","宝马","互联网教育");
        c.show();

        G c1 = new C("住宅","宝马","互联网教育");
        c1.show();
    }
}
