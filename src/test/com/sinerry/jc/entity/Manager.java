package com.sinerry.jc.entity;

public class Manager extends Employee{
    private Integer reward;

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public Manager() {
    }

    public Manager(Integer id, String name, String enTime, Integer salary, Integer reward) {
        super(id,name,enTime,salary);
        this.reward = reward;
    }
    @Override
    public Integer getSalary() {
        if(getReward() == null) {
            return super.getSalary();
        }
        return super.getSalary() + getReward();
    }
}
