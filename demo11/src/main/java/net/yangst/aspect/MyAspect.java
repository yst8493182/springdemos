package net.yangst.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2016/8/14.
 */

public class MyAspect{


    /**
     * 不带参数的前置通知
     */
//    public void myBefore(){
//        System.out.println("前置通知");
//    }

    public void myBefore(JoinPoint joinPoint) {
        System.out.println("带参数前置通知"+joinPoint.getSignature().getName());
    }


    public void myAfter(JoinPoint joinPoint, Object returnObj){
        returnObj = ("update " + returnObj.toString());
        System.out.println("后置通知"+joinPoint.getSignature().getName()+"------------>"+returnObj);
    }

    /**
     * 返回值类型必须是Object，参数是ProceedingJoinPoint
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("前"+proceedingJoinPoint.getSignature().getName());
        //手动执行
        Object obj=proceedingJoinPoint.proceed();

        System.out.println("后"+proceedingJoinPoint.getSignature().getName());

        return obj;
    }


    /**
     * 异常通知
     * @param joinPoint
     * @param throwable
     */
    public void myThrow(JoinPoint joinPoint,Throwable throwable) {
        System.out.println("抛出异常"+throwable.getMessage());

    }


    public void myLast(JoinPoint joinPoint) {
        System.out.println("最终通知------------>"+joinPoint.getSignature().getName());
    }

}
