package com.jing.service.impl;

import com.jing.dao.IAccountDao;
import com.jing.pojo.Account;
import com.jing.service.IAccountService;

import java.util.List;

/**
 * @ClassName:AccountServiceImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 14:47
 * @Version 1.0
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccountById(Integer accountId) {
        accountDao.deleteAccountById(accountId);
    }

    public Account queryAccountById(Integer accountId) {
        return accountDao.queryAccountById(accountId);
    }

    public List<Account> queryAccountList() {
        return accountDao.queryAccountList();
    }

}
