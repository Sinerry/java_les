package com.sinerry.jc.test;

import com.sinerry.jc.entity.Employee;
import com.sinerry.jc.entity.Manager;
import com.sinerry.jc.entity.MasterManager;

public class Test {
    @org.testng.annotations.Test
    public void testExtends() {
        Employee employee = new Employee(1,"lucy","2019-02-21",10000);
        employee.printInfo();
        Manager manager = new Manager(10,"sinerry","2018-04-16",20000,10000);
        System.out.println(manager.getSalary());
        manager.printInfo();
    }

    @org.testng.annotations.Test
    public void testDuoTai() {
        // 创建Employee对象
        Employee employee = new Employee(1,"rose","2019-05-14",8000);
        employee.printInfo();

        // 创建Manager对象
        Manager manager = new Manager(2,"jack","2019-03-26",24000,8000);
        manager.printInfo();


        // 创建Manager对象（子类对象）赋值给Employee类型（父类类型）
        Employee jl = new Manager(3,"herry","2018-06-03",18000,12000);
        // 调用的仍是子类方法
        System.out.println(jl.getClass().getName());
        jl.printInfo();


    }

    // 继承层次
    @org.testng.annotations.Test
    public void testExtendsHierachy() {
        MasterManager zjl = new MasterManager(3,"mary","2019-04-14",15000,20000);
        zjl.printInfo();
    }

    @org.testng.annotations.Test
    public void testTypeConvert() {
        // 类型转换
        /*
        * 1. 子类对象转换为父类类型
        * 2. 父类对象转换为子类类型
        * */
        // 子类对象转换为父类类型，自动转换，类型提升
        Employee m = new Manager();

        //  父类对象转换为子类类型，强制转换，借助instanceof
        Manager m2 = null;
        if(m instanceof Manager) {
            m2 = (Manager)m;
        }else {
            System.out.println("m can not cast to Manager");
        }
        System.out.println(m2);
    }


    @org.testng.annotations.Test
    public void testObjectClassMethod() {
        // 测试Object类的方法
        Employee e = new Employee();
        System.out.println(e.getClass().getName());
        System.out.println(e.getClass().getSimpleName());
        System.out.println(e.hashCode());
        System.out.println(e.toString());
    }

}
