<%--
  Created by IntelliJ IDEA.
  User: Jin
  Date: 30.05.2020
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <form method="post" action="/null/richest">
        <input name="max" type="text" size="10" placeholder="richest user">
        <button type="submit">get</button>
    </form>
    <div>
        <button onclick="location.href='/null'">Back to main</button>
    </div>
</body>
</html>
