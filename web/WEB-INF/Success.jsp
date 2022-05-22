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
    <title>Cette opération a été bien effectuée</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<main class="container">
    <sl-alert variant="success" open>
        <sl-icon slot="icon" name="check2-circle"></sl-icon>
        <strong>Cette opération a été bien effectuée</strong><br />
        ${m}
    </sl-alert>
</main>
</body>
</html>
