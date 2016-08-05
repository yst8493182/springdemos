package net.yangst.test;

import net.yangst.beans.User;
import net.yangst.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangshutao on 2016/8/1.
 */

public class UserDaoTest {

    /**
     * 常量注入
     */
    @Test
    public void testSelectByName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        User user = (User) applicationContext.getBean("userWithConstant");
        System.out.println(user);

    }


    /**
     * 构造器注入
     */
    @Test
    public void testuserWithConstructure(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        User user = (User) applicationContext.getBean("userWithConstructure");
        System.out.println(user);

    }


    /**
     * 外部bean注入
     */
    @Test
    public void testWithOutBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userdaoOut");
        userDao.getUser();
    }

    /**
     * 内部bean注入
     */
    @Test
    public void testWithInnerBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDaoInner");
        userDao.getUser();
    }


}
