package yangst.dao.impl;

import org.apache.log4j.Logger;
import yangst.dao.UserDao;

/**
 * Created by yangshutao on 2016/8/1.
 */
public class ObjectFactory1 {
    private static Logger logger = Logger.getLogger(ObjectFactory1.class);

    public UserDao createUser() {
        logger.info("使用工厂类创建");
        return new UserDaoImpl("admin");
    }
}
