package net.yangst.dao;

import net.yangst.beans.User;

/**
 * Created by yangshutao on 2016/8/1.
 */
public interface UserDao {

    public User selectByName(String username);
}
