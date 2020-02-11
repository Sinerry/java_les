package com.sinerry.proxy;

public class Proxy implements Sell {
    private Owner owner;
    public Proxy(Owner owner) {
        this.owner = owner;
    }
    @Override
    public void sell() {
        System.out.println("业务信息如下: ");
        System.out.println(String.format("姓名\t\t年龄\t\t"));
        System.out.println(String.format("%s\t\t%d\t\t",owner.getName(),owner.getAge()));
        owner.sell();
    }

    @Override
    public void rent() {
        System.out.println("业务信息如下: ");
        System.out.println(String.format("姓名\t\t年龄\t\t"));
        System.out.println(String.format("%s\t\t%d\t\t",owner.getName(),owner.getAge()));
        owner.rent();
    }
}
