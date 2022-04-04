<%--
  Created by IntelliJ IDEA.
  User: yssfm
  Date: 2/26/2022
  Time: 1:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fournisseurs</title>
</head>
<body>
    <%@ include file="Header.jsp" %>
    <main class="container">
        <h1>Liste des produits</h1>
        <p>${prd.label}</p>
        <p>${prd.disponibilite}</p>
        <p>${prd.prix}</p>
    </main>
</body>
</html>
