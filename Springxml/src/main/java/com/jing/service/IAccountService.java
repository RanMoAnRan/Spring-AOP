package com.jing.service;

import com.jing.pojo.Account;

import java.util.List;

/**
 * @ClassName:IAccountService
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 14:46
 * @Version 1.0
 */
public interface IAccountService {
    /**
     * 保存账户
     *
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新账户
     *
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除账户
     *
     * @param accountId
     */
    void deleteAccountById(Integer accountId);

    /**
     * 根据id查询账户
     *
     * @param accountId
     * @return
     */
    Account queryAccountById(Integer accountId);

    /**
     * 查询所有账户
     *
     * @return
     */
    List<Account> queryAccountList();

}
