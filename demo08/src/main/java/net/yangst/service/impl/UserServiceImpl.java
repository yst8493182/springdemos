package net.yangst.service.impl;

import net.yangst.dao.UserDao;
import net.yangst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by yangshutao on 2016/8/8.
 */
@Service("userServiceImpl1")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier(value = "user2DaoImpl")
    private UserDao userDao;

    public void saveUser() {
        userDao.save();
    }
}
