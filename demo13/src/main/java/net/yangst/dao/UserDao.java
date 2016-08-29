package net.yangst.dao;

import net.yangst.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/8/29.
 */
@Service
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int saveUser(User user) {
        String sql = "INSERT INTO user(username, password) VALUES (?, ?);";
        Object[] args = {user.getUsername(), user.getPassword()};
        return jdbcTemplate.update(sql, args);
    }

    public int updateUser(User user) {
        String sql = "UPDATE user SET  username=?,password=? WHERE id=?";
        Object[] args = {user.getUsername(), user.getPassword(),user.getId()};
        return jdbcTemplate.update(sql, args);
    }

    public Map<String, Object> queryMapById(int id) {
        String sql = "SELECT * FROM user WHERE id=?";

        return jdbcTemplate.queryForMap(sql, new Object[]{id});

    }


    public List<Map<String, Object>> queryAll() {
        String sql = "SELECT * FROM user ";

        return jdbcTemplate.queryForList(sql);

    }




}
