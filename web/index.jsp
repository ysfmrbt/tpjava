<%--
  Created by IntelliJ IDEA.
  User: yssfm
  Date: 2/26/2022
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
  </head>
  <body>
    <%@ include file="WEB-INF/Header.jsp" %>
    <main class="container">
      <%
        String userName = "Inconnu";
        if (session.getAttribute("User") != null) {
          userName = (String) session.getAttribute("User");
        }
      %>
      <h1>Bienvenue, <%=userName%></h1>
    </main>
  </body>
</html>
