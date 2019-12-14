package com.sinerry.array;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayTest {
    @Test
    public void testArrayDeclaration() {
        // int[] array = new int[]{1,2,3,4};
        // int[] array = new int[]{4,3,2,1};
        int[] array = {4,3,2,1};
        for (int item:array) {
            System.out.println(item);
        }

    }

    @Test
    public void testTraverse() {
        int[] array = {10,20,30,40,50};
        // 1. for循环遍历
        for(int i = 0; i < array.length; i++) {
            System.out.println(String.format("下标 %d 的值是 %d",i,array[i]));
        }
        System.out.println("=============================");
        // 2. foreach
        for(int item:array) {
            System.out.println(item);
        }
        System.out.println("=============================");

        // 3. lambda表达式
        Arrays.asList(array).forEach(item -> System.out.println(Arrays.toString(item)));
    }
}
