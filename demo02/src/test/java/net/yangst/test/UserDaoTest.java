package net.yangst.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yangst.dao.UserDao;

/**
 * Created by yangshutao on 2016/8/1.
 */

public class UserDaoTest {

    @Test
    public void testSelectByName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.selectByName();
    }

}
