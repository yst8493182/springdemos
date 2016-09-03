package net.yangst.dao;

/**
 * Created by Administrator on 2016/9/4.
 */
public interface AmountDao {

    public void in(String inner, Integer money);

    public void out(String outer, Integer money);


}
