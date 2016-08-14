package net.yangst.proxy;

import net.yangst.aspect.MyAspect;
import net.yangst.dao.UserDao;
import net.yangst.dao.impl.UserDaoImpl;

import java.lang.reflect.*;

/**
 * Created by Administrator on 2016/8/14.
 */
public class JdkProxy {


    public static UserDao create() {

//        1.目标对象
        final UserDao userDao = new UserDaoImpl();


//        2.切面类
        final MyAspect aspect = new MyAspect();

//        3.代理类：将目标类和切面类相结合

        /**
         *  Proxy.newProxyInstance
         *  参数1：loader，类加载器，动态代理类 运行时创建，任何类都需要加载器将其加载到内存中（可以参考张龙的javase的最后一部分教程）
         *  参数2：Class[] interface 代理类需要实现的所有接口
         *      方式1：目标实例.getClass.getInterfaces();只能获取自己的接口，不能获取父元素接口
         *      方式2:
         *
         *  参数3：InvocationHandler 处理类，接口，必须进行实现类，一般采用匿名内部类
         *      invoke 方法，代理类的每一个方法执行，都会调用一次invoke
         *          参数：Object proxy 代理对象
         *          参数：Method method 代理对象当前执行的方法的描述方法（反射）
         *          参数：Object[] args 方法的实际参数方法
         *
         *
         */

        UserDao proxyInstance = (UserDao) Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), userDao.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                aspect.before();
                Object obj = method.invoke(userDao, args);
                aspect.after();
                return obj;
            }
        });

        return proxyInstance;
    }

}
