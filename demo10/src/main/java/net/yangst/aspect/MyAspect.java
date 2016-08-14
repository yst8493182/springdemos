package net.yangst.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Administrator on 2016/8/14.
 */

public class MyAspect implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("前");

        //手动执行目标的方法
        methodInvocation.proceed();

        System.out.println("后");
        return null;
    }
}
