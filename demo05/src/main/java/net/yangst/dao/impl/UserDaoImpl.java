package net.yangst.dao.impl;

import net.yangst.beans.User;
import net.yangst.dao.UserDao;
import org.apache.log4j.Logger;

/**
 * Created by yangshutao on 2016/8/1.
 */
public class UserDaoImpl implements UserDao {

    private User user;

    private static Logger logger = Logger.getLogger(UserDaoImpl.class);

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void save(User user) {
        logger.info("执行save方法");
    }


}
