package net.yangst.test;

import net.yangst.service.AmountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/8/29.
 */


public class TestApi {

    @Test
    public void testTranfer() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        AmountService amountService = (AmountService) applicationContext.getBean("amountService");
        amountService.tranfer("jack","tom",1000);

    }


}
