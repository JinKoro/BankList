package service;

import java.util.List;

public interface UserService <T>{
    public abstract List<T> findUserDataById(Integer yourID);
}
