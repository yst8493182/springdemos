package net.yangst.service.impl;

import net.yangst.dao.AmountDao;
import net.yangst.service.AmountService;
import org.springframework.transaction.annotation.*;

/**
 * Created by Administrator on 2016/9/4.
 */
public class AmountServiceImpl  implements AmountService{

    private AmountDao amountDao;


    public void setAmountDao(AmountDao amountDao) {
        this.amountDao = amountDao;
    }

    /**
     *  service层添加@Transactional，该注解可以用于方法，也可以用于类
     */

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    @Override
    public void tranfer(String outer, String inner, Integer money) {

        amountDao.in(inner, money);


        int a = 1 / 0;

        amountDao.out(outer, money);



    }
}
