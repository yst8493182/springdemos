package net.yangst.service.impl;

import net.yangst.dao.AmountDao;
import net.yangst.service.AmountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by Administrator on 2016/9/4.
 */
public class AmountServiceImpl implements AmountService {

    private AmountDao amountDao;


    private TransactionTemplate transactionTemplate;


    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAmountDao(AmountDao amountDao) {
        this.amountDao = amountDao;
    }

    @Override
    public void tranfer(final String outer, final String inner, final Integer money) {

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                amountDao.in(inner, money);
//                int a = 1 / 0;
                amountDao.out(outer, money);

            }
        });


    }
}
