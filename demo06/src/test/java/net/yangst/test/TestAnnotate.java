package net.yangst.test;

import net.yangst.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangshutao on 2016/8/8.
 */
public class TestAnnotate {

    /**
     * @Resource注解
     */
    @Test
    public void testResource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.saveUser();
    }

}
