package com.qf.service.serviceImpl;

import com.qf.Dao.daoImpl.userDaoImpl;
import com.qf.Dao.userDao;
import com.qf.entity.User;
import com.qf.service.userService;

import java.util.List;

public class userServiceImpl implements userService {
    userDao userDao = new userDaoImpl();
    @Override
    public User getUser() {
        return userDao.getUser();
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
