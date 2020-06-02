<%@ page import="model.Account" %>
<%@ page import="dao.AccountDao" %>
<%@ page import="dao.AccountDaoImpl" %>
<%@ page import="java.util.Comparator" %><%--
  Created by IntelliJ IDEA.
  User: Jin
  Date: 31.05.2020
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Richest</title>
    <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@700&display=swap" rel="stylesheet">
    <style>
        <%@include file='/style/style.css' %>
    </style>
</head>
<body>
    <h1>Richest</h1>
    <%
        AccountDao<Account> dao = new AccountDaoImpl();
        Integer max = dao.findAllAccounts().stream()
                .max(Comparator.comparing(Account::getAccount))
                .orElse(null).getAccount();
    %>
    <form>
        <input name="max" type="text" size="10" value="<%=max%>">
        <button type="submit">get</button>
    </form>
    <div>
        <button onclick="location.href='/null'">Back to main</button>
    </div>
</body>
</html>
