package com.sinerry.array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

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
        int[] array = {11,22,33,44,55};
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

        Arrays.asList(array).forEach(items -> {
            for (int item:items) {
                if(item % 2 != 0) {
                    System.out.println(item);
                }
            }
        });
    }


    @Test
    public void testCopy() {
        int[] arr1 = {1,2,3,4,5};
        int[] arr11 = {9,8,8,6,5,4};
        // 拷贝arr1整个数组
        int[] arr2 = Arrays.copyOf(arr1,arr1.length);
        // System.out.println(String.format("arr2 = %s",Arrays.toString(arr2)));
        // 拷贝数组的前3项
        int[] arr3 = Arrays.copyOf(arr1,arr1.length-2);
        // System.out.println(String.format("arr3 = %s",Arrays.toString(arr3)));


        // 范围拷贝
        // 不包括结束位置
        int[] arr4 = Arrays.copyOfRange(arr1,1, arr1.length);
        System.out.println(String.format("arr4 = %s",Arrays.toString(arr4)));


        // 把原数组中指定位置的元素 拷贝到 目标数组中指定的位置

        System.arraycopy(arr1,2, arr11, arr11.length - 2,arr11.length);
    }


    @Test
    public void testFill() {
        int[] arr = new int[10];
        /*for(int i = arr.length - 1; i >= 0; i--) {
            arr[i] = 10;
        }
        System.out.println(Arrays.toString(arr));*/
        // Arrays.fill(arr,10);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,2,8,5);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void testSort() {
        int[] arr = {50,39,67,21,35,17,44};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testBinarySearch() {
        int[] arr = {50,39,67,21,35,17,44};
        // 先排序

        Arrays.sort(arr);
        // 再做二分(折半)查找
        int index = Arrays.binarySearch(arr,35);
        System.out.println(String.format("index = %d",index));
    }

}
