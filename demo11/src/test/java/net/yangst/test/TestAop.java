package net.yangst.test;

/*
 * Created by yangshutao on 2016/8/8.
 */

import net.yangst.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    /**
     * 前置和后置通知
     */
    @Test
    public void  aopTest1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        Object object=userDao.add();
        System.out.println(object);

    }


    /**
     * 环绕通知、异常通知、最终通知
     */
    @Test
    public void  aopTest2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext1.xml");
        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        Object object=userDao.add();
        userDao.save();
        userDao.del();
        System.out.println(object);
    }
}
