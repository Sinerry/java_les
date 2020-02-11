package com.sinerry.collection;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    @Test
    public void testArrayList() {
        java.util.List<String> list = new ArrayList<>();
        list.add("H");
        list.add("E");
        list.add("L");
        list.add("L");
        list.add("O");

        // for循环
        for(int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        // foreach
        for (String s: list) {
             System.out.println(s);
        }

        // 迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
             String s = iterator.next();
             System.out.println(s);
        }

        // JDK8的lambda表达式
        list.stream().forEach(item -> {
            System.out.println(item);
        });
    }
}
