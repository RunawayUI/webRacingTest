<%--
  Created by IntelliJ IDEA.
  User: Andrew
  Date: 17.03.2022
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="css.jsp" />

<header class="header">
    <div class="container">
        <a href="#" class="logo"><img src="../../static/img/f1-logo-white.png" alt="f1"></a>
        <nav class="nav">
            <ul class="nav-list">
                <li class="nav-list-item active"><a href="#">Profile</a></li>
                <li class="nav-list-item"><a href="#">Teacher</a></li>
                <li class="nav-list-item"><a href="#">Teams</a></li>
                <li class="nav-list-item"><a href="#">Chats</a></li>
                <li class="nav-list-item"><a href="#">Circuits</a></li>
                <li class="nav-list-item"><a href="#">Schedule</a></li>
            </ul>
        </nav>
        <div class="nav-list lgout">
            <p class="nav-list-item"><a href="#">Log out</a></p>
        </div>
    </div>
</header>
<%--
<jsp:include page="../section/nav.jsp" />
P.S. Учитывай путь
Ну все, все работает, заебись, вставляй куда хочешь :)
--%>