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
    <title>Lister les comptes client</title>
    <style rel="stylesheet">
        #liste {
            border-collapse: collapse;
        }
        #liste tr {
            font-size: 1.3rem;
            text-align: center;
            border: 1px solid var(--sl-color-primary-200);
        }
        #liste tr td {
            padding: 1em;
            border: 1px solid var(--sl-color-primary-200);
        }
        #liste tr th {
            background: var(--sl-color-primary-50);
            padding: 2em;
            border: 1px solid var(--sl-color-primary-200);
        }

    </style>
</head>
<body>
<%@ include file="Header.jsp" %>
<main class="container">
    <h1>Liste des comptes client</h1>
        <table id="liste">
            <tr>
                <th>Identifiant</th>
                <th>Numero</th>
                <th>Date de création</th>
                <th>Chiffre d'affaire</th>
                <th>Opérations</th>
            </tr>
            <c:forEach var="compteClient" items="${ compteClients }">
                <tr>
                    <td><c:out value="${compteClient.idClient }" /></td>
                    <td><c:out value="${ compteClient.numero }" /></td>
                    <td><c:out value="${ compteClient.dateCreation }" /></td>
                    <td><c:out value="${compteClient.chiffreAffaire }" /></td>
                    <td>
                        <sl-tooltip content="Modifier">
                            <sl-button href="\Modifier?idClient=<c:out value="${compteClient.idClient }" />" variant="default">
                                <sl-icon slot="prefix" name="pencil-square"></sl-icon>
                            </sl-button>
                        </sl-tooltip>
                        <sl-tooltip content="Supprimer">
                            <sl-button href="\Supprimer?idClient=<c:out value="${compteClient.idClient }" />" variant="default">
                                <sl-icon slot="prefix" name="trash"></sl-icon>
                            </sl-button>
                        </sl-tooltip>
                    </td>
                </tr>
            </c:forEach>
        </table>
</main>
</body>
</html>
