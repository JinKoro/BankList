package service;

import dao.AccountDao;
import model.Account;
import org.jmock.Mockery;
import org.jmock.api.Expectation;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.plugins.MockMaker;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountDaoImplTest {

    Mockery ctx = new Mockery();

    @Test
    void findAllAccounts() {
        AccountDao<Account> accountDao = new AccountDaoImpl();
        accountDao = ctx.mock(AccountDao.class);

        List<Account> actual = new AccountDaoImpl().findAllAccounts();
        List<Account> expected = Arrays.asList(
                new Account(1, 12001, 1),
                new Account(2, 13456, 2),
                new Account(3, 15235, 3),
                new Account(4, 24563, 4),
                new Account(5, 22244, 5),
                new Account(6, 30864, 6),
                new Account(7, 34623, 7),
                new Account(8, 47754, 8),
                new Account(9, 33211, 9),
                new Account(10, 24678, 10),
                new Account(11, 46247, 11),
                new Account(12, 54444, 12),
                new Account(13, 57523, 13),
                new Account(14, 33332, 14),
                new Account(15, 12345, 15)
        );
        assertThat(actual, is(expected));
    }
}