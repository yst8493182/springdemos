package net.yangst.dao.impl;

import net.yangst.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by yangshutao on 2016/8/1.
 */
@Repository
public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("UserDaoImpl.save");
    }

    public void add() {
        System.out.println("UserDaoImpl.add");

    }

    public void del() {
        System.out.println("UserDaoImpl.del");

    }


}
