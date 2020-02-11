package com.sinerry.proxy;


public class Owner implements Sell {
    private String name;
    private Integer age;

    public Owner(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    @Override
    public void sell() {
        System.out.println(String.format("[%s]业主,销售房子",name));
    }

    @Override
    public void rent() {
        System.out.println(String.format("[%s]业主,出租房子",name));
    }
}
