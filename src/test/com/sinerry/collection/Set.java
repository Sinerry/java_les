package com.sinerry.collection;

import org.testng.annotations.Test;

import java.util.HashSet;

public class Set {
    @Test
    public void testSet() {
        java.util.Set<Integer> s = new HashSet<>();
        s.add(11);
        s.add(22);
        s.add(17);
        s.add(33);
        s.add(6);
        System.out.println(s);
    }
}
