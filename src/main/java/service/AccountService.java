package service;

import java.util.List;

public interface AccountService <T> {
    public abstract List<T> findAllAccounts();
}
