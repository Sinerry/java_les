package com.sinerry.collection.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaCollections {
    /*
    * Collections: 集合工具类
    * */

    public static void main(String[] args) {
        testNCopies();

        testShuffle();

        testSubList();

        testBinarySearch();
    }

    // nCopies
    public static void testNCopies() {
        List<Integer> l = Collections.nCopies(10,6);
        System.out.println(l);
    }

    // shuffle
    public static void testShuffle() {
        final int SIZE = 20;
        List<Integer> l = new ArrayList<>(SIZE);
        for(int i = SIZE; i >= 1;i--) {
            l.add(i);
        }
        System.out.println(l);
        Collections.shuffle(l);
        System.out.println(l);
    }

    // subList
    public static void testSubList() {

    }



    // binarySearch
    public static void testBinarySearch() {

    }


}
