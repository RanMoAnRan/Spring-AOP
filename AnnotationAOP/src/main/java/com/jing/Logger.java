package com.jing;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName:Logger
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 15:33
 * @Version 1.0
 */
@Component("logger")
@Aspect//表示当前类是一个切面类（也可以称之为通知类）
public class Logger {
    @Pointcut("execution(* com.jing.impl.*.*(..))")//指定切入点表达式
    public void pt1(){}

    public void printLog() {
        System.out.println("Logger类中的printLog方法开始记录日志了。。。");
    }

    public void printLog2() {
        System.out.println("Logger类中的printLog2方法开始记录日志了。。。");
    }

    public void printLog3() {
        System.out.println("Logger类中的printLog3方法开始记录日志了。。。");
    }


    //前置通知
    @Before("execution(* com.jing.impl.*.*(..))")
    public void beforePrintLog() {
        System.out.println("前置通知执行了");
    }

    //后置通知
    @AfterReturning("execution(* com.jing.impl.*.*(..))")
    public void afterReturningPrintLog() {
        System.out.println("后置通知执行了");
    }

    //异常通知
    @AfterThrowing("execution(* com.jing.impl.*.*(..))")
    public void afterThrowingPrintLog() {
        System.out.println("异常通知执行了");
    }

    //最终通知
    @After("execution(* com.jing.impl.*.*(..))")
    public void afterPrintLog() {
        System.out.println("最终通知执行了");
    }

    @Around("pt1()")
    public Object around(ProceedingJoinPoint pjp) {
        Object proceed = null;
        try {
            System.out.println("前置通知");
            proceed = pjp.proceed();
            System.out.println("后置通知");
        } catch (Throwable throwable) {
            System.out.println("异常通知");
            throwable.printStackTrace();
        } finally {
            System.out.println("最终通知");
        }

        return proceed;
    }

}
