package com.sinerry.io.entity;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 5171213278820153899L;
    private Integer id;
    private String name;
    private String brand;

    public Car(Integer id, String name, String brand) {
        this.id = id;
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
