<%--
  Created by IntelliJ IDEA.
  User: Andrew
  Date: 03.06.2022
  Time: 5:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<jsp:include page="../section/css.jsp" />

<title>Registration</title>
</head>
<body>

<jsp:include page="../section/nav.jsp" />

<body>
<header class="reg-header">
    <a href="#" class="logo-red">
        <img src="../../static/img/f1-logo-red.png" alt="f1">
    </a>
</header>
<main class="reg-main">
    <div class="wrapper">
        <form action="" class="reg-form">
            <h1 class="reg-title">registration</h1>
            <input type="text" placeholder="Login">
            <input type="password" placeholder="Password">
            <div class="reg-btns">
                <button type="submit" class="reg-btn-login">Log in</button>
                <button type="submit" class="reg-btn-signin">Sign in</button>
            </div>
        </form>
    </div>
</main>
</body>
</html>
