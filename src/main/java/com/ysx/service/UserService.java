package com.ysx.service;

import com.github.pagehelper.PageInfo;
import com.ysx.model.User;

import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2019/3/28 21:01
 * @Created by yangboss
 */


public interface UserService {

    int addUser(User user);

    List<User> queryAllUser();

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}