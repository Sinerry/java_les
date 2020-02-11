package com.sinerry.collection;

import org.testng.annotations.Test;

import java.util.HashMap;

public class Map {
    @Test
    public void testMap() {
        java.util.Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person(1,"lucy",18));
        map.put(2,new Person(2,"jack",20));
        map.put(3,new Person(3,"rose",19));

        //Person p = map.get(2);
        //System.out.println(p);

        for(java.util.Map.Entry<Integer,Person> entry: map.entrySet()) {
            System.out.println(String.format("%s = %s",entry.getKey(),entry.getValue()));
        }

    }
}
