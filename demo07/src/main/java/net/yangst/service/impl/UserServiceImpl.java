package net.yangst.service.impl;

import net.yangst.dao.UserDao;
import net.yangst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by yangshutao on 2016/8/8.
 */
public class UserServiceImpl implements UserService {


    @Autowired
    @Qualifier(value = "user2Dao")//按照名称来转配注入，则需要结合@Qualifier一起使用
    private UserDao userDao1;

    @Autowired
    @Qualifier(value = "user2Dao")//在set方法上加Autowired注解
    public void setUserDao(UserDao userDao) {
        this.userDao1 = userDao1;
    }

    public void saveUser() {
        userDao1.save();
    }
}
