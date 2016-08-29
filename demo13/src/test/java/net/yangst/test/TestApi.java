package net.yangst.test;

import net.yangst.dao.UserDao;
import net.yangst.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/8/29.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationcontext.xml")
public class TestApi {

    @Autowired
    private UserDao userDao;


    @Autowired
    private User user;


    @Test
    public void testSave() {
        user.setPassword("root");
        user.setUsername("root");
        System.out.println(userDao.saveUser(user));

    }


    @Test
    public void testQueryMap() {

        System.out.println(userDao.queryMapById(4));

    }


    @Test
    public void testUpdate() {

        user.setId(3);
        user.setUsername("gust");
        user.setPassword("1234");
        System.out.println(userDao.updateUser(user));
    }

    @Test
    public void testQueryAll() {

        System.out.println(userDao.queryAll());

    }





}
