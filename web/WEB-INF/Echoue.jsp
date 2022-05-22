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
    <title>Cette opération a échouée</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<main class="container">
    <sl-alert variant="danger" open>
        <sl-icon slot="icon" name="exclamation-octagon"></sl-icon>
        <strong>Cette opération a échouée ${idClient}</strong><br />
        ${e}
    </sl-alert>
</main>
</body>
</html>
