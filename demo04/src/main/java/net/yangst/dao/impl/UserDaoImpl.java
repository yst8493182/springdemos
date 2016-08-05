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


    public void setUser(User user) {
        this.user = user;
    }

    public UserDaoImpl() {
        logger.info("创建UserDaoImpl的实例");
    }

    public UserDaoImpl(User user) {
        this.user = user;
    }

    public void save(User user) {
        logger.info(user+"被保存了");
    }

    public void getUser() {
        logger.info("获取到的User="+user);

    }
}
