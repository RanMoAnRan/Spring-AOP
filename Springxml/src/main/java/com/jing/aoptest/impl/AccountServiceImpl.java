package com.jing.aoptest.impl;

import com.jing.aoptest.IAccountService;
import com.jing.dao.IAccountDao;
import com.jing.pojo.Account;

import java.util.List;

/**
 * @ClassName:AccountServiceImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 14:47
 * @Version 1.0
 */
public class AccountServiceImpl implements IAccountService {

    public void saveAccount() {
        System.out.println("保存账户");
    }

    public void updateAccount(int i) {
        System.out.println("更新账户");
    }

    public int deleteAccount() {
        System.out.println("删除账户");
        return 0;
    }


}
