package com.jing.proxycglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName:emo
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 15:49
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        final Actor actor = new Actor();
        /**
         * 基于子类的动态代理：
         *     要求：被代理对象不是最终类，即不能被final修饰
         *     提供者：第三方cglib
         *     涉及到的类：
         *        Enhancer
         *     涉及到的方法：
         *        create
         *     方法中的参数：
         *        第一个参数：被代理对象的Class
         *        第二个参数：回调函数，它和InvocationHanlder的作用和用法是一样的
         */
        Actor actorproxy = (Actor) Enhancer.create(actor.getClass(), new MethodInterceptor() {
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object invoke = null;
                if (method.getName().equals("movie")) {
                    System.out.println("插播广告：" + args[0] + ",酒香不怕巷子深");
                    invoke = method.invoke(actor, args);
                }

                if (method.getName().equals("teleplay")) {
                    System.out.println("插播广告：" + args[0] + ",就是这么自信");
                    invoke = method.invoke(actor, args);
                }
                return invoke;
            }

        });

        actorproxy.teleplay("茅台");
        actorproxy.movie("飘然");
    }
}
