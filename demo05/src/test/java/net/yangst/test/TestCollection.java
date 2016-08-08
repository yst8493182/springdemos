package net.yangst.test;

import net.yangst.beans.Collection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangshutao on 2016/8/8.
 */
public class TestCollection {

    /**
     * 集合注入
     */
    @Test
    public void testSelectByName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Collection collection = (Collection) applicationContext.getBean("collection");

        System.out.println(collection.getList());
        System.out.println(collection.getSet());
        System.out.println(collection.getMap());
        System.out.println(collection.getProperties());
    }

}
