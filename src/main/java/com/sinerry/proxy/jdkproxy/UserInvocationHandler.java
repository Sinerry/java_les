package com.sinerry.proxy.jdkproxy;

import com.sinerry.proxy.entity.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserInvocationHandler implements InvocationHandler {
    private Object target;
    public UserInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(args == null) return false;
        if(args[0] instanceof User) {
            User user = (User)args[0];
            if(user.getName() == null || user.getName().trim().equals("")) {
                System.out.println("姓名为空,不保存");
            }else if(user.getAge() == null) {
                System.out.println("年龄为空,不保存");
            }else if(user.getAge() < 0) {
                System.out.println("年龄小于零,不保存");
            }else {
                return method.invoke(target,args);
            }
            return false;
        }
        return false;
    }
}
