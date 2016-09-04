package net.yangst.service.impl;

import net.yangst.dao.AmountDao;
import net.yangst.service.AmountService;

/**
 * Created by Administrator on 2016/9/4.
 */
public class AmountServiceImpl  implements AmountService{

    private AmountDao amountDao;


    public void setAmountDao(AmountDao amountDao) {
        this.amountDao = amountDao;
    }

    @Override
    public void tranfer(String outer, String inner, Integer money) {

        amountDao.in(inner, money);


        int a = 1 / 0;

        amountDao.out(outer, money);



    }
}
