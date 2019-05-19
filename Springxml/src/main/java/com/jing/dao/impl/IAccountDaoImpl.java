package com.jing.dao.impl;

import com.jing.dao.IAccountDao;
import com.jing.pojo.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @ClassName:IAccountDaoImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 14:51
 * @Version 1.0
 */
public class IAccountDaoImpl implements IAccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveAccount(Account account) {
        jdbcTemplate.update("insert into account values(null,?,?)",account.getName(),account.getMoney());
    }

    public void updateAccount(Account account) {
        jdbcTemplate.update("update account set name =?,money = ? where id = ?",account.getName(),account.getMoney(),account.getId());
    }

    public void deleteAccountById(Integer accountId) {
        jdbcTemplate.update("delete from account where id =?",accountId);
    }

    public Account queryAccountById(Integer accountId) {
        return jdbcTemplate.queryForObject("select * from account where id = ?",new BeanPropertyRowMapper<Account>(Account.class),accountId);
    }

    public List<Account> queryAccountList() {
        return jdbcTemplate.query("select * from account",new BeanPropertyRowMapper<Account>(Account.class));
    }

}
