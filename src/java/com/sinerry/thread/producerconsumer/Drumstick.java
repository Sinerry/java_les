package com.sinerry.thread.producerconsumer;

public class Drumstick {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Drumstick(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Drumstick{" +
                "id=" + id +
                '}';
    }
}
