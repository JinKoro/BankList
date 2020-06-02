<%@ page import="model.Account" %>
<%@ page import="dao.AccountDao" %>
<%@ page import="dao.AccountDaoImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="java.math.BigDecimal" %><%--
  Created by IntelliJ IDEA.
  User: Jin
  Date: 31.05.2020
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@700&display=swap" rel="stylesheet">

    <style>
        <%@include file='/style/style.css' %>
    </style>
</head>
<body>
    <h1>Accounts Sum</h1>
    <%
        AccountDao<Account> dao = new AccountDaoImpl();
        List<Account> listForSum = dao.findAllAccounts();
        int sum =  0;
        for (Account a:listForSum) {
            sum+=a.getAccount();
        }
    %>
    <form>
        <input name="max" type="text" size="10" value="<%=sum%>">
        <button type="submit">get</button>
    </form>
    <div>
        <button onclick="location.href='/null'">Back to main</button>
    </div>
</body>
</html>
