package com.jing.proxyjdk;

/**
 * @ClassName:Actor
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 15:35
 * @Version 1.0
 */
public class Actor implements IActor{
    public void movie(String name) {
        System.out.println("战狼3");
    }

    public void teleplay(String name) {
        System.out.println("权利的游戏");
    }
}
