package net.yangst.dao.impl;

import net.yangst.beans.User;
import net.yangst.dao.UserDao;
import org.apache.log4j.Logger;

/**
 * Created by yangshutao on 2016/8/1.
 */
public class UserDaoImpl implements UserDao {

    private static Logger logger = Logger.getLogger(UserDaoImpl.class);

    public User selectByName(String username) {

        logger.info("根据"+username+"查询用户");
        return new User();
    }
}
