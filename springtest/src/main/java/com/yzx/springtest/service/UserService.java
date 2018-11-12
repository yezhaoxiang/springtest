package com.yzx.springtest.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yzx.springtest.model.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

    PageInfo<User> findByPage(int i, int i1);
}
