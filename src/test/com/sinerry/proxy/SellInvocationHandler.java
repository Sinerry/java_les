package com.sinerry.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SellInvocationHandler implements InvocationHandler {
    private Owner owner;

    public SellInvocationHandler(Owner owner) {
        this.owner = owner;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(owner.getClass().getClassLoader(),owner.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("业主信息如下: ");
        System.out.println(String.format("姓名\t\t年龄\t\t"));
        System.out.println(String.format("%s\t\t%d\t\t",owner.getName(),owner.getAge()));
        return method.invoke(owner,args);
    }
}
