package com.sinerry.proxy;



public class Application {

    public static void main(String[] args) {
        // 1. 静态代理
        Owner owner = new Owner("老李",43);
        //Proxy proxy = new Proxy(owner);
        // proxy.sell();
        //proxy.rent();

        // 2. 动态代理


        SellInvocationHandler sellInvocationHandler = new SellInvocationHandler(owner);
        // 代理对象
        Sell proxy = (Sell)sellInvocationHandler.getProxyInstance();
        proxy.sell();

        // 3. cglib代理


    }
}
