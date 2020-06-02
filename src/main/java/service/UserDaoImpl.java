package service;

import connection.ConnectionPool;
import dao.UserDao;
import model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao<User> {

    private final static String SQL_FIND_USERDATA_BY_ID = "select * from user where userID=? ";

    @Override
    public List<User> findUserDataById(Integer yourID) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        List<User> userData = new ArrayList<>();
        try {
            ResultSet rs;
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_FIND_USERDATA_BY_ID);
            preparedStatement.setInt(1, yourID);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                Integer userID = rs.getInt("userID");
                //Assuming you have a user object
                User user = new User(userID, name, surname);
                userData.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userData;
    }
}
