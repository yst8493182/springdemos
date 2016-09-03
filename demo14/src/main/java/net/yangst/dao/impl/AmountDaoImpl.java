package net.yangst.dao.impl;

import net.yangst.dao.AmountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by Administrator on 2016/9/4.
 */
public class AmountDaoImpl extends JdbcDaoSupport implements AmountDao {



    @Override
    public void in(String inner, Integer money) {
        String sql = "UPDATE amount SET money=money+? WHERE name=?";
       this. getJdbcTemplate().update(sql, money, inner);
    }

    @Override
    public void out(String outer, Integer money) {
        String sql = "UPDATE amount SET money=money-? WHERE name=?";
        this.getJdbcTemplate().update(sql, money, outer);
    }
}
