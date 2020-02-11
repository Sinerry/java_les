package com.sinerry.collection.queue;

import java.util.Arrays;
import java.util.List;

public class JavaArrays {
    /*
    * Arrays：数组工具类
    *
    * */
    public static void main(String[] args) {
       testAsList();

       testSort();

       testBinarySearch();
    }


    // 数组 -->  集合
    public static void testAsList() {
        int[] array1 = new int[]{5,7,9,4,6,3};
        Integer [] array2 = new Integer[]{5,7,9,4,6,3};
        List l1 = Arrays.asList(array1);
        List l2 = Arrays.asList(array2);
        System.out.println(l1);
        System.out.println(l1.size());// 1

        System.out.println(l2);
        System.out.println(l2.size());// 6
    }



    // 排序
    public static void testSort() {
        int[] array = new int[]{5, 7, 9, 4, 6, 3};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    // 二分查找，必须保证数组有序
    public static void testBinarySearch() {
        int[] array = {7,8,3,9,5,6,1,2,0};
        Arrays.sort(array);
        int index = Arrays.binarySearch(array,3);
        System.out.println(index);
    }
}
