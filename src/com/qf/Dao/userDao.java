package com.qf.Dao;

import com.qf.entity.User;

import java.util.List;

public interface userDao  {
    User getUser();
    List<User> getUserList();
}
