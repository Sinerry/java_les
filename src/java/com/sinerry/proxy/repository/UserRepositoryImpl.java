package com.sinerry.proxy.repository;

import com.sinerry.proxy.entity.User;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public boolean save(User user) {
        System.out.println(String.format("用户信息如下: "));
        System.out.println(String.format("姓名 = %s, 年龄 = %d",user.getName(),user.getAge()));
        return true;
    }
}
