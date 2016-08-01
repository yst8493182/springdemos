package net.yangst.test;

import net.yangst.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangshutao on 2016/8/1.
 */

public class UserDaoTest {

    @Test
    public void testSelectByName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.selectByName("小米");
    }

}
