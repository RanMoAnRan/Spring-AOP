package com.jing.aoptest;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ClassName:Logger
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 15:33
 * @Version 1.0
 */
public class Logger {
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
    public void beforePrintLog() {
        System.out.println("前置通知执行了");
    }

    //后置通知
    public void afterReturningPrintLog() {
        System.out.println("后置通知执行了");
    }

    //异常通知
    public void afterThrowingPrintLog() {
        System.out.println("异常通知执行了");
    }

    //最终通知
    public void afterPrintLog() {
        System.out.println("最终通知执行了");
    }

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
