package com.sinerry.innerclass;

import org.testng.annotations.Test;

public class SequenceTest {

    @Test
    public void test() {
        Sequence s = new Sequence(5);
        s.add(6);
        s.add(4);
        s.add(9);
        s.add(3);
        s.add(7);
        Operator operator = s.getInstance(true);
        while (!operator.end()) {
            System.out.println(operator.current());
            operator.next();
        }
    }
}
