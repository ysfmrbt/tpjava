<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: yssfm
  Date: 2/26/2022
  Time: 12:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>S'authentifier</title>
    <style rel="stylesheet">
        .label-on-left::part(form-control) {
            display: flex;
            align-items: center;
            gap: 1rem;
        }

        .label-on-left::part(form-control-label) {
            font-size: 1.3em;
            flex: 0 0 auto;
            width: 200px;
            text-align: right;
        }

        .label-on-left::part(form-control-input) {
            width: 100%;
            flex: 1 1 auto;
        }
    </style>
</head>
<body>
<%@ include file="Header.jsp" %>
<main class="container">
    <h1>Se déconnecter</h1>
    <form method="post" action="Logout">
        <sl-button style="width:100%;" size="medium" variant="primary" type="submit">Déconnexion</sl-button>
    </form>
</main>
</body>
</html>
