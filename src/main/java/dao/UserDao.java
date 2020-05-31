package dao;

import java.util.List;

public interface UserDao<T> {
    public abstract List<T> findUserDataById(Integer yourID);
}
