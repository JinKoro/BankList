package dao;

import dao.UserDao;
import dao.UserDaoImpl;
import model.User;
import org.jmock.Mockery;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class UserDaoImplTest {

    Mockery ctx = new Mockery();

    @Test
    void findUserDataById() {
        UserDao<User> userDao = new UserDaoImpl();
        userDao = ctx.mock(UserDao.class);

        List<User> actual = userDao.findUserDataById(7);
        List<User> expected = Arrays.asList(
                new User(7,"Igor","Sergienya")
        );
        assertThat(actual, is(expected));

    }
}