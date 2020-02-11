package com.sinerry.proxy.repository;

import com.sinerry.proxy.entity.User;


public interface UserRepository {
    boolean save(User user);
}
