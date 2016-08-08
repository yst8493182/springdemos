package net.yangst.service.impl;

import net.yangst.dao.UserDao;
import net.yangst.service.UserService;

import javax.annotation.Resource;

/**
 * Created by yangshutao on 2016/8/8.
 */
public class UserServiceImpl implements UserService {


//    @Resource
//    private UserDao userDao; //Resource不指定name时，默认使用userDao


//    @Resource(name = "userDao1") //指定name，则applicationcontext中的bean的id需要和name相同
//    private UserDao userDao;


/*    没有指定name，userDao2和applicationcontext中的bean的id也不匹配，
    则会根据接口对应的类型类匹配，但如果一个接口有多个实现类，则需要指定name*/
    @Resource
    private UserDao userDao2;


//    public void saveUser() {
//        userDao.save();
//    }

    public void saveUser() {
        userDao2.save();
    }

}
