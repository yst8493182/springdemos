package net.yangst.proxy;

import net.sf.cglib.proxy.*;
import net.yangst.aspect.MyAspect;
import net.yangst.dao.impl.UserDaoImpl;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/8/14.
 */
public class CglibProxy {


    public static UserDaoImpl create() {

//        1.目标对象
        final UserDaoImpl userDaoImpl = new UserDaoImpl();


//        2.切面类
        final MyAspect aspect = new MyAspect();

//        3.代理类：将目标类和切面类相结合

//           3.1 核心类Enhancer
        Enhancer enhancer = new Enhancer();

//            3.2 确定父类
        enhancer.setSuperclass(userDaoImpl.getClass());

//            3.3 设置回调函数，等同于Jdk动态代理的InvocationHandler
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

                aspect.before();
                System.out.println("Cglib proxy");
                Object obj = method.invoke(userDaoImpl, args);
//                执行代理类的父类，即目标类
                methodProxy.invokeSuper(object, args);
                aspect.after();
                return obj;
            }
        });

        UserDaoImpl proxyInstance = (UserDaoImpl) enhancer.create();

        return proxyInstance;

    }

}
