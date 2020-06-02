package servlets;


import dao.AccountDao;
import dao.AccountDaoImpl;
import model.Account;
import service.AccountService;
import service.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class AllAccountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountDao<Account> dao = new AccountDaoImpl();
        List<Account> accounts = dao.findAllAccounts();
        req.setAttribute("accounts", accounts);
        getServletContext().getRequestDispatcher("/WEB-INF/view/allAcc.jsp").forward(req, resp);
    }
}