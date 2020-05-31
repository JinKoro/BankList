<%--
  Created by IntelliJ IDEA.
  User: Jin
  Date: 30.05.2020
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@700&display=swap" rel="stylesheet">
    <!--CSS CONNECTION -->
    <style>
        <%@include file='/style/style.css' %>
    </style>
</head>
<body>
    <h1>Hello! Choose filter</h1>
    <ol>
        <li><a href="/null/show-all-accounts">All Accounts</a></li>
        <li><a href="/null/user-data">User Data By ID</a></li>
        <li><a href="/null/richest-hidden">Richest User</a></li>
        <li><a href="/null/sum-hidden">Accounts Sum</a></li>
    </ol>
</body>
</html>
