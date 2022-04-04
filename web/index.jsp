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
    <title>Société XYZ</title>
    <style rel="stylesheet">
      main {
        background-color: #E2CEF2;
        color: #6C468C;
        align-items: center;
        justify-content: flex-start;
      }
      main img {
        width: 15em;
        height: auto;
      }
    </style>
  </head>
  <body>
    <%@ include file="WEB-INF/Header.jsp" %>
    <main class="container">
      <div>
        <h1>Nous sommes une société spécialisée dans la distribution et la gestion d'articles d'habillement.</h1>
        <p>3 <a href="Clients">Servlets.Clients</a> travaillent pour nous, nous pensons que vous devriez aussi.</p>
      </div>
      <img src="https://weambassadors.files.wordpress.com/2014/04/xyz_logo_circle-01.png" alt="XYZ Logo">
    </main>
  </body>
</html>
