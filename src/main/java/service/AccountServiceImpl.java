package service;

import dao.AccountDao;
import dao.AccountDaoImpl;
import model.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AccountServiceImpl implements AccountService<Account> {
    private AccountDao<Account> accountDao;

    public void setAccountDao(AccountDao<Account> accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccounts() {

        return this.accountDao.findAllAccounts();
    }
}
