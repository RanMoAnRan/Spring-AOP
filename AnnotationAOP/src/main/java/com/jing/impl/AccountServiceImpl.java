package com.jing.impl;

import com.jing.IAccountService;
import org.springframework.stereotype.Service;


/**
 * @ClassName:AccountServiceImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 14:47
 * @Version 1.0
 */
@Service("accountservice")
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
