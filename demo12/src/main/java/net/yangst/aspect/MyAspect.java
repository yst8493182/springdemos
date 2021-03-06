package net.yangst.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/8/14.
 */


/**
 * 需要加入@Aspect
 */
@Component
@Aspect
public class MyAspect{


    /**
     * 不带参数的前置通知
     */
//    public void myBefore(){
//        System.out.println("前置通知");
//    }

    @Before(value = "myCutPoint()")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("带参数前置通知"+joinPoint.getSignature().getName());
    }

    @Pointcut(value = "execution(* net.yangst.dao..*.*(..))")
    private void myCutPoint() {

    }

    @AfterReturning(value = "myCutPoint()",returning = "returnObj")
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

    @Around(value = "myCutPoint()")
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
    @AfterThrowing(value = "myCutPoint()",throwing = "throwable")
    public void myThrow(JoinPoint joinPoint,Throwable throwable) {
        System.out.println("抛出异常"+throwable.getMessage());

    }


    @After(value = "myCutPoint()")
    public void myLast(JoinPoint joinPoint) {
        System.out.println("最终通知------------>"+joinPoint.getSignature().getName());
    }

}
