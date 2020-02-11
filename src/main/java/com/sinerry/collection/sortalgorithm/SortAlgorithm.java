package com.sinerry.collection.sortalgorithm;

import java.util.ArrayList;
import java.util.List;

public class SortAlgorithm {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>(){
            {
                add(9);
                add(6);
                add(7);
                add(1);
                add(3);
                add(12);
                add(4);
                add(5);
            }
        };
        List<Integer> l2 = bubbleSort(l);// time = 28
        System.out.println(l2);


        List<Integer> l3 = selectionSort(l);// time = 28
        System.out.println(l3);


        List<Integer> l4 = insertionSort(l);// time = 28
        System.out.println(l4);
    }
    /*
    * 冒泡排序
    * */
    public static List<Integer> bubbleSort(List<Integer> list) {
        int size = list.size();
        int time = 0;
        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - 1 - i; j++) {
                time++;
                if(list.get(j) > list.get(j + 1)) {
                    swap(list,i,j);
                }
            }
        }
        System.out.printf("%d",time);
        return list;
    }


    /*
    * 插入排序
    * */
    public static List<Integer> insertionSort(List<Integer> list) {
        int size = list.size();
        int time = 0;
        for(int i = 1; i < size; i++) {
            for(int j = 0; j < i; j++) {
                time++;
                if(list.get(j) > list.get(i)) {
                    swap(list,i,j);
                }
            }
        }
        System.out.printf("%d",time);
        return list;
    }


    /*
    * 选择排序
    * */
    public static List<Integer> selectionSort(List<Integer> list) {
        int size = list.size();
        int time = 0;
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                time++;
                if(list.get(i) > list.get(j)) {
                    swap(list,i,j);
                }
            }
        }
        System.out.printf("%d",time);
        return list;
    }

    public static void swap(List<Integer> list,int i,int j) {
        int temp = list.get(j);
        list.set(j,list.get(i));
        list.set(i,temp);
    }
}
