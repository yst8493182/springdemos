package net.yangst.beans;

import org.apache.log4j.Logger;

/**
 * Created by yangshutao on 2016/8/1.
 */
public class User {

    private static Logger logger = Logger.getLogger(User.class);

    //用户名
    private String username;

    //密码
    private String password;

    //创建日期
    private String createTime;

    //积分
    private float score;

    //等级
    private int level;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createTime='" + createTime + '\'' +
                ", score=" + score +
                ", level=" + level +
                '}';
    }

    public void initMethod(){
        logger.info("类的生命周期开始");
    }

    public void destroyMethod(){
        logger.info("类的生命周期结束");
    }
}
