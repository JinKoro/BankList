package service;

import dao.UserDao;
import model.User;

import java.util.List;

public class UserServiceImpl implements UserService<User>{
    private UserDao<User> userDao;

    public void setUserDao(UserDao<User> userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findUserDataById(Integer yourID) {
        return this.userDao.findUserDataById(yourID);
    }
}
