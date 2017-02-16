package com.sully.biz;

import com.sully.entity.User;

import java.util.List;

/**
 * Created by lei.s on 2017/2/16.
 */
public interface IUserServ {
    List<User> findAllUser();
    int deleteUserById(User user);
    int saveUser(User user);
}