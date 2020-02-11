package com.sinerry.jc.entity;


public class Employee {
    private Integer id;
    private String name;
    private String enTime;
    private Integer salary;

    public Integer getId() {
        return id;
    }
    public Employee(){}
    public Employee(Integer id,String name,String enTime,Integer salary) {
        this.id = id;
        this.name = name;
        this.enTime = enTime;
        this.salary = salary;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getEnTime() {
        return enTime;
    }

    public void setEnTime(String enTime) {
        this.enTime = enTime;
    }

    public void printInfo() {
        System.out.println(String.format("编号\t\t姓名\t\t\t时间\t\t\t\t工资"));
        System.out.println(String.format("%d\t\t%s\t\t%s\t\t%d", id, getName(), enTime, getSalary()));
    }
}