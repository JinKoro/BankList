package servlets;

import dao.UserDao;
import dao.UserDaoImpl;
import model.User;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserDataServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer userId = Integer.parseInt(req.getParameter("userId"));

        /*List<User> users = new UserServiceImpl().findUserDataById(userId);*/

        UserDao<User> userDao = new UserDaoImpl();
        List<User> users = userDao.findUserDataById(userId);
        req.setAttribute("users", users);
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/view/userData.jsp").forward(req, resp);
    }

}
