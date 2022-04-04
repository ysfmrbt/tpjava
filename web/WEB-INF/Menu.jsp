<%--
  Created by IntelliJ IDEA.
  User: yssfm
  Date: 2/26/2022
  Time: 12:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <style rel="stylesheet">

        ul a {
            text-decoration:none;
            padding: .8em;
            margin: 0 .3em;
            background: #fff;
            border-radius: 10%;
            border: thin;
            color: #9999ff;
            font-weight: bold;
        }
        ul {list-style-type: none;margin: auto 3em;background:#e6e6ff;padding:2em;}
        ul li {display: inline;}
    </style>
</head>
<body>
    <ul>
        <a href="/"><li>Accueil</li></a>
        <a href="/Clients"><li>Clients</li></a>
        <a href="/Fournisseurs"><li>Fournisseurs</li></a>
        <a href="/Contact/?category=Client"><li>Contact</li></a>
        <a href="/ProduitSrv"><li>Produit</li></a>
        <a href="/FicheTechnique"><li>Fiche Technique</li></a>
    </ul>
</body>
</html>
