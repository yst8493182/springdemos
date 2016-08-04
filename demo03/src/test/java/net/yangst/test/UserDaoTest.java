package net.yangst.test;

import net.yangst.beans.User;
import net.yangst.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

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


    @Test
    public void testSingleModel(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        User user = (User) applicationContext.getBean("user");
        User user1 = (User) applicationContext.getBean("user");
        assertTrue(user == user1);

    }



    @Test
    public void testBeanLife(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        User user = (User) applicationContext.getBean("user");

        //关闭容器
        AbstractApplicationContext abstractApplicationContext=(AbstractApplicationContext) applicationContext;
        abstractApplicationContext.close();
    }
}
