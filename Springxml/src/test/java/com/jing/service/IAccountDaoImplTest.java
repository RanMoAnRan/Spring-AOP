package com.jing.service;

import com.jing.pojo.Account;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class IAccountDaoImplTest {
    private IAccountService accountService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        accountService = (IAccountService) ac.getBean("accountService");
    }

    @Test
    public void saveAccount() {
        Account account = new Account();
        account.setName("admin");
        account.setMoney(1000f);
        accountService.saveAccount(account);

    }

    @Test
    public void updateAccount() {
        Account account = new Account();
        account.setId(7);
        account.setName("admin100");
        account.setMoney(5000f);
        accountService.updateAccount(account);
    }

    @Test
    public void deleteAccountById() {
        accountService.deleteAccountById(10);
    }

    @Test
    public void queryAccountById() {
        Account account = accountService.queryAccountById(1);
        System.out.println(account);
    }

    @Test
    public void queryAccountList() {
        List<Account> accounts = accountService.queryAccountList();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}