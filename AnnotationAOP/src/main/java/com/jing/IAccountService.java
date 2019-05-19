package com.jing;

/**
 * @ClassName:IAccountService
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 14:46
 * @Version 1.0
 */
public interface IAccountService {
    /**
     * 模拟保存
     */
    void saveAccount();

    /**
     * 模拟更新
     * @param i
     */
    void updateAccount(int i);

    /**
     * 模拟删除
     * @return
     */
    int deleteAccount();


}
