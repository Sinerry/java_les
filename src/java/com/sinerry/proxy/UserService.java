package com.sinerry.proxy;

import com.sinerry.proxy.cglibproxy.CglibProxy;
import com.sinerry.proxy.cglibproxy.UserRepository;
import com.sinerry.proxy.entity.User;
/*
import com.sinerry.proxy.jdkproxy.UserInvocationHandler;
import com.sinerry.proxy.repository.UserRepository;
import com.sinerry.proxy.repository.UserRepositoryImpl;
import com.sinerry.proxy.staticproxy.UserRepositoryProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
*/
public class UserService {
    public static void main(String[] args) {
        // 1.静态代理
        //staticProxy();

        // 2.动态代理
        // jdkProxy();

        // 3. Cglib代理 通过子类的方式实现的，也称子类代理
        cglibProxy();

    }

    // 静态代理逻辑
    /*public static void staticProxy() {
        // 1.模拟用户
        Book user = new Book("jack",18);
        // 2.创建被代理对象
        UserRepository userRepository = new UserRepositoryImpl();
        // 3.创建代理对象
        UserRepository proxy = new UserRepositoryProxy(userRepository);
        boolean flag = proxy.save(user);
        System.out.println(flag);
    }*/


    // 动态代理逻辑
    /*public static Object jdkProxy() {

        // 1. 模拟用户
        Book user = new Book("rose",21);

        // 2. 创建代理对象
        UserRepository userRepository = new UserRepositoryImpl();

        // 3. 创建事件处理器对象
        InvocationHandler handler = new UserInvocationHandler(userRepository);

        // 4. 创建代理对象
        UserRepository proxy = (UserRepository) Proxy.newProxyInstance(
                userRepository.getClass().getClassLoader(),
                userRepository.getClass().getInterfaces(),
                handler
                );

        // 5. 调用代理的方法，就会触发InvocationHandler的invoke方法，通过反射，触发被代理对象的逻辑
        return proxy.save(user);

    }
    */

    // Cglib代理逻辑
    public static void cglibProxy() {
        // 1. 模拟用户信息
        User user = new User("jennifer",19);

        // 2. 创建被代理对象
        UserRepository userRepository = new UserRepository();

        // 3. 创建代理对象
        CglibProxy proxy = new CglibProxy(userRepository);
        Object object = proxy.getProxyInstance();
        UserRepository repository = null;
        if(object instanceof UserRepository) {
           repository = (UserRepository)object;
        }
        // 4. 调用代理对象的方法
        repository.save(user);

    }

}
