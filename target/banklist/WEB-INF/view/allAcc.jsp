<%@ page import="model.Account" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; ISO-8859-1" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>All Accounts</title>
    <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@700&display=swap" rel="stylesheet">
    <style>
        <%@include file='/style/style.css' %>
    </style>
</head>
<body>
    <h1>All Accounts</h1>

    <table border="1">
        <tr>
            <td>AccountId</td>
            <td>Account</td>
            <td>UserId</td>
        </tr>
        <c:forEach items="${accounts}" var="account">
            <tr>
                <td>${account.getAccountId()}</td>
                <td>${account.getAccount()}</td>
                <td>${account.getUserId()}</td>

            </tr>
        </c:forEach>
    </table>
    <div>
        <button onclick="location.href='/null'">Back to main</button>
    </div>
</body>
</html>



