package net.yangst.test;

/*
 * Created by yangshutao on 2016/8/8.
 */

import net.yangst.dao.UserDao;
import net.yangst.dao.impl.UserDaoImpl;
import net.yangst.proxy.CglibProxy;
import net.yangst.proxy.JdkProxy;
import org.junit.Test;

public class TestProxy {

    /**
     * 测试Jdk动态代理
     */
    @Test
    public void testJdkProxy(){
        UserDao userdao= JdkProxy.create();
        userdao.add();
        userdao.save();
        userdao.del();
    }


    /**
     * 测试Cglib代理
     */
    @Test
    public void testCglibProxy(){
        UserDaoImpl userdao= CglibProxy.create();
        userdao.add();
        userdao.save();
        userdao.del();
    }
}
