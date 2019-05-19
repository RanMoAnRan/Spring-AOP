package com.jing.dao;

import com.jing.pojo.Account;

import java.util.List;

/**
 * @ClassName:IAccountDao
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 14:49
 * @Version 1.0
 */
public interface IAccountDao {
    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccountById(Integer accountId);

    Account queryAccountById(Integer accountId);

    List<Account> queryAccountList();
}
