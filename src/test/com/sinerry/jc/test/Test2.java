package com.sinerry.jc.test;

import com.sinerry.jc.entity.Animal;
import com.sinerry.jc.entity.Cat;
import org.testng.annotations.Test;


public class Test2 {

    @Test
    public void testAbstractClass() {
        Animal animal = new Animal() {
            @Override
            public String yell() {
                return null;
            }
        };

        System.out.println(animal.yell());
        animal.staticMethod();

        Cat cat = new Cat();
        System.out.println(cat.yell());
        cat.staticMethod();
    }

}
