package com.peaksoft.dao;

import com.peaksoft.entity.User;

import java.util.List;

public interface UserDao {

    User create(User user);

    User getById(int id);

    List<User> getAll();

    void update(int id, User newUser );

    void delete(int id );
}
