package com.jing.aoptest.impl;

import com.jing.aoptest.IAccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AccountServiceImplTest {
    private IAccountService accountService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("aop-application.xml");
        accountService = (IAccountService) applicationContext.getBean("accountService1");
    }

    @Test
    public void saveAccount() {
        accountService.saveAccount();
    }

    @Test
    public void updateAccount() {
        accountService.updateAccount(1);
    }

    @Test
    public void deleteAccount() {
        int i = accountService.deleteAccount();
    }

}