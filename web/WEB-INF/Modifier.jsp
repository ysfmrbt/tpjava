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
    <title>Modifier un compte client</title>
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
    <h1>Modifier un compte client existant</h1>
    <h2>${sessId}</h2>
    <form method="post" action="Modifier">
        <p>
            <sl-input class="label-on-left" label="Identifiant" size="large" type="text" name="idClient" value="${valId}" id="idClient" placeholder="Identifiant" filled readonly>
                <sl-icon name="person" slot="prefix"></sl-icon>
            </sl-input>
        </p>
        <p>
            <sl-input class="label-on-left" label="Numéro" size="large" type="text" name="numero" id="numero" value="${valNum}" placeholder="Numéro de télephone" filled>
                <sl-icon name="telephone" slot="prefix"></sl-icon>
            </sl-input>
        </p>
        <p>
            <sl-input class="label-on-left" label="Date création" size="large" type="date" name="dateCreation" value="${valDc}" id="dateCreation" filled>
                <sl-icon name="calendar4" slot="prefix"></sl-icon>
            </sl-input>
        </p>
        <p>
            <sl-input class="label-on-left" label="Chiffre d'affaire" size="large" type="text" name="chiffreAffaire" value="${valCa}" id="chiffreAffaire" placeholder="Chiffre d'affaire" filled>
                <sl-icon name="cash" slot="prefix"></sl-icon>
            </sl-input>
        </p>
        <sl-button style="width:100%;" size="medium" variant="primary" type="submit">Modifier</sl-button>
    </form>
</main>
</body>
</html>
