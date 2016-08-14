package net.yangst.dao.impl;

import net.yangst.dao.UserDao;

/**
 * Created by yangshutao on 2016/8/1.
 */

public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("UserDaoImpl.save");
        int a=1/0;
    }

    public Object add() {
        System.out.println("UserDaoImpl.add");
        return "添加方法的返回字符串";
    }

    public void del() {
        System.out.println("UserDaoImpl.del");

    }


}
