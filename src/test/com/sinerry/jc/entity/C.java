package com.sinerry.jc.entity;

public class C extends P{
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public C(String house,String car,String company) {
        super(house,car);
        this.company = company;
    }

//    @Override
//    public void show() {
//        super.show();
//        System.out.println(String.format("1家%s公司",company));
//    }
}
