package com.jing;

/**
 * @ClassName:logger
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 18:43
 * @Version 1.0
 */
public class Test {
    public void before(){
        System.out.println("前置方法");
    }

    public void afterreturning(){
        System.out.println("后置方法");
    }

    public void after(){
        System.out.println("最终方法");
    }
}
