package com.peaksoft.dao;

import com.peaksoft.entity.User;
import com.peaksoft.util.Util;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class UserDaoImpl implements UserDao{
    private Util util;




    public User create(User user) {

        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        System.out.println("User successfully created!");
        return user;
    }


    public User getById(int id) {

        Session session = Util.getSession().openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.getTransaction().commit();
        session.close();
        System.out.println("");
        return user;
    }


    public List<User> getAll() {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        List<User> userList = session.createQuery(" from User ").getResultList();
        session.getTransaction().commit();
        session.close();
        return userList;
    }


    public void update(int id, User newUser) {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        user.setName(newUser.getName());
        user.setLastName(newUser.getLastName());
        user.setAge(newUser.getAge());
        session.save(user);
        session.getTransaction().commit();
        session.close();

    }


    public void delete(int id) {
      Session session = Util.getSession().openSession();
      session.beginTransaction();
      session.createQuery("delete from User where id =  : id").setParameter("id", id);
      session.getTransaction().commit();
      session.close();

    }

}
