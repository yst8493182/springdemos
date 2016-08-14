package net.yangst.test;

/*
 * Created by yangshutao on 2016/8/8.
 */

import net.yangst.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void  aopTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        userDao.add();

    }
}
