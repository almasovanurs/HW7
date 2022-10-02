package com.peaksoft.service;

import com.peaksoft.dao.UserDao;
import com.peaksoft.dao.UserDaoImpl;
import com.peaksoft.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    UserDaoImpl userDao = new UserDaoImpl();

    //private UserDao userDao;

    @Override
    public User create(User user) {
        return userDao.create(user);
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void update(int id, User newUser) {
        userDao.update(id, newUser);

    }

    @Override
    public void delete(int id) {
        userDao.delete(id);

    }
}
