package model;

import java.util.Objects;

public class Account {
    private int accountId;
    private int account;
    private int userId;

    public Account(int accountId, int account, int userId) {
        this.accountId = accountId;
        this.account = account;
        this.userId = userId;
    }

    public Account(int accountId, int account) {
        this.accountId = accountId;
        this.account = account;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", account=" + account +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return accountId == account1.accountId &&
                account == account1.account &&
                userId == account1.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, account, userId);
    }
}
