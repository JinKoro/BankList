package service;

import connection.ConnectionPool;
import dao.AccountDao;
import model.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoImpl implements AccountDao<Account> {

    private final static String SQL_FIND_ALL_ACCOUNTS = "select * from account";

    @Override
    public List<Account> findAllAccounts() {
        Connection connection = ConnectionPool.getInstance().getConnection();

        List<Account> accountData = new ArrayList<>();
        try {
            ResultSet rs;
            Statement statement = connection.createStatement();
            rs = statement.executeQuery(SQL_FIND_ALL_ACCOUNTS);
            while (rs.next()) {
                Integer account = rs.getInt("account");
                Integer accountID = rs.getInt("accountID");
                Integer userId = rs.getInt("userID");
                Account accounts = new Account(accountID, account, userId);
                accountData.add(accounts);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return accountData;
    }
}