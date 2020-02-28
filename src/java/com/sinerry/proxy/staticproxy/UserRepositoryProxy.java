package com.sinerry.proxy.staticproxy;

import com.sinerry.proxy.entity.User;
import com.sinerry.proxy.repository.UserRepository;

public class UserRepositoryProxy implements UserRepository {
    private UserRepository target;

    public UserRepositoryProxy(UserRepository target) {
        this.target = target;
    }

    @Override
    public boolean save(User user) {
        if(user == null) {
            System.out.println("参数为空,不保存");
            return false;
        }else if(user.getName() == null || user.getName().trim().equals("")) {
            System.out.println("姓名为空,不保存");
            return false;
        }else if(user.getAge() == null) {
            System.out.println("年龄为空,不保存");
            return false;
        }else if(user.getAge() < 0) {
            System.out.println("年龄小于零,不保存");
            return false;
        }
        return this.target.save(user);
    }
}
