package com.sinerry.jc.entity;

public class MasterManager extends Manager {

    @Override
    public Integer getReward() {
        return super.getReward() * 2;
    }

    @Override
    public Integer getSalary() {
       return super.getSalary();
    }
    @Override
    public String getName() {
        return String.format("[%s]",super.getName());
    }

    public MasterManager(Integer id,String name,String enTime,Integer salary,Integer reward) {
        super(id,name,enTime,salary,reward);
    }
}
