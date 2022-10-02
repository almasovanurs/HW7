package com.peaksoft;

import com.peaksoft.dao.UserDaoImpl;
import com.peaksoft.entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        UserDaoImpl userDao = new UserDaoImpl();

        userDao.create(new User("Aza", "Timurov", 20));
        userDao.create(new User("Aza", "Akimov", 25));
        userDao.create(new User("Nurs", "Subanov", 28));
        userDao.create(new User("Aika", "Aleksov", 18));
        userDao.create(new User("Kuttubek", "Jalalov", 19));
        userDao.create(new User("Aidana", "Akylbekov", 24));

        //userDao.update("Aza", 18);
        //userDao.delete("Aza");















    }
}
