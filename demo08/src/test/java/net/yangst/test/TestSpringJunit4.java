package net.yangst.test;

import net.yangst.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*
 * Created by yangshutao on 2016/8/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationcontext.xml")
public class TestSpringJunit4 {


    @Autowired
    @Qualifier(value = "userServiceImpl1")
    public UserService userService;

    @Test
    public void testResource(){

        userService.saveUser();
    }

}
