package com.jing.impl;

import com.jing.IAccountService;
import com.jing.SpringConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class AccountServiceImplTest {
    private IAccountService accountService;

    @Before
    public void setUp() throws Exception {
        /*ApplicationContext ap=new ClassPathXmlApplicationContext("application.xml");
        accountService = (IAccountService) ap.getBean("accountservice");*/
        //用注解类代替xml
        ApplicationContext ap = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        accountService = (IAccountService) ap.getBean("accountservice");
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
        accountService.deleteAccount();
    }
}