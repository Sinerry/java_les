package com.sinerry.jc.entity;

public class P extends G{
    private String car;

    public String getCar() {
        return car;
    }
    public void setCar(String car) {
        this.car = car;
    }
    public P() {

    }
    public P(String house,String car) {
        super(house);
        this.car = car;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(String.format("1辆%s汽车",car));
    }
}
