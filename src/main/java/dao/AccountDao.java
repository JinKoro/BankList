package dao;

import java.util.List;

public interface AccountDao<T> {
    public abstract List<T> findAllAccounts();
}