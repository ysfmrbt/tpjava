<%--
  Created by IntelliJ IDEA.
  User: yssfm
  Date: 3/28/2022
  Time: 12:14 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ include file="Header.jsp" %>
    <main class="container">
        <h4>Description thechnique:</h4>
        <img src="${ img }" alt="image">
        <ul>
            <li>
                Méthode d'envoie : ${ methode };
            </li>
            <li>
                Resources : ${ url };
            </li>
            <li>
                Protocole : ${ protocol };
            </li>
            <li>
                Nom du Serveur : ${ name };
            </li>
            <li>
                Port du Serveur : ${ port };
            </li>
        </ul>
    </main>
</body>
</html>
