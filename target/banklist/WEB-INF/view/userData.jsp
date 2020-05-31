<%--
  Created by IntelliJ IDEA.
  User: Jin
  Date: 30.05.2020
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="model.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User Data</title>
    <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@700&display=swap" rel="stylesheet">

    <style>
        <%@include file='/style/style.css' %>
    </style>
</head>
<body>
    <form method="post">
        <input type="number" name="userId" placeholder="Enter ID from 1 to 15" required >
        <button type="submit">send</button>
    </form>
    <h1>User Data By ID</h1>
    <table border="1">
        <tr>
            <td>UserId</td>
            <td>Name</td>
            <td>Surname</td>
        </tr>
        <c:forEach items="${users}" var = "user">
            <tr>
                <td>${user.getUserId()}</td>
                <td>${user.getName()}</td>
                <td>${user.getSurname()}</td>
            </tr>
        </c:forEach>
    </table>
    <div>
        <button onclick="location.href='/null'">Back to main</button>
    </div>
</body>
</html>
