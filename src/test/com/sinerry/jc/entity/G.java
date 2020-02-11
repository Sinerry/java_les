package com.sinerry.jc.entity;

import javax.lang.model.element.NestingKind;

public class G {
    private String house;

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public G() {

    }

    public G(String house) {
        this.house = house;
    }

    public void show() {
        System.out.println(String.format("1套%s房子",house));
    }
}
