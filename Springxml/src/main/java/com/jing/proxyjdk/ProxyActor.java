package com.jing.proxyjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @ClassName:ProxyActor
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 15:36
 * @Version 1.0
 */
public class ProxyActor {
    public static void main(String[] args) {
        final IActor actor = new Actor();

        IActor proxyactor = (IActor) Proxy.newProxyInstance(actor.getClass().getClassLoader(), actor.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke=null;
                if (method.getName().equals("teleplay")) {
                    System.out.println("插播广告："+args[0]+",就是这么自信");
                    invoke = method.invoke(actor, args);
                }

                if (method.getName().equals("movie")) {
                    System.out.println("插播广告："+args[0]+",好酒");
                    invoke = method.invoke(actor, args);
                }
                return invoke;
            }
        });

        proxyactor.teleplay("茅台");
        proxyactor.movie("飘柔");
    }
}
