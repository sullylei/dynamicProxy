package com.sully.biz.impl;

import com.sully.biz.IUserServ;
import com.sully.entity.User;

import java.util.List;

/**
 * Created by lei.s on 2017/2/16.
 */
public class UserServImpl implements IUserServ {
    @Override
    public List<User> findAllUser() {
        System.out.println("******执行查询方法******");
        return null;
    }

    @Override
    public int deleteUserById(User user) {
        System.out.println("******执行删除方法******");
        return 0;
    }

    @Override
    public int saveUser(User user) {
        System.out.println("******执行保存方法******");
        return 0;
    }
}
