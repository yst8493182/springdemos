package yangst.dao.impl;


import org.apache.log4j.Logger;
import yangst.beans.User;
import yangst.dao.UserDao;

/**
 * Created by yangshutao on 2016/8/1.
 */
public class UserDaoImpl implements UserDao {

    private String name;

    private static Logger logger = Logger.getLogger(UserDaoImpl.class);

    public UserDaoImpl(String name) {
        this.name = name;
    }

    public User selectByName() {

        logger.info("根据"+name+"查询用户");

        return new User();
    }
}
