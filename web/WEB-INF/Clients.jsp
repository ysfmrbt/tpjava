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
    <title>Nos clients</title>
    <style rel="stylesheet">
        #header {
            justify-content: space-between;
        }
        #liste {
            background: #e6e6ff;
            justify-content: space-evenly;
        }
        .tg  {border-collapse:collapse;border-spacing:.3em;margin:0px auto;}
        .tg td{border-color:#A1A1B3;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
            overflow:hidden;padding:1em;word-break:normal;color:#00001a;}
        .tg th{border-color:#A1A1B3;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
            font-weight:bold;overflow:hidden;padding:1em;word-break:normal;color:#00001a;}
        .tg .tg-0lax{text-align:center;vertical-align:top}
        .tg .tg-0pky{border-color:#A1A1B3;text-align:center;vertical-align:top}
    </style>
</head>
<body>
<%@ include file="Header.jsp" %>
<div class="container" id="liste">
    <h1>Liste des clients</h1>
    <table class="tg">
        <thead>
        <tr>
            <th class="tg-0lax">NOM</th>
            <th class="tg-0lax">PRENOM</th>
            <th class="tg-0lax">EMAIL</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td class="tg-0pky">Youssef</td>
            <td class="tg-0lax">Mrabet</td>
            <td class="tg-0lax">yssfmrbt@gmail.com</td>
        </tr>
        <tr>
            <td class="tg-0lax">Mohammed Sadak</td>
            <td class="tg-0lax">Naifar</td>
            <td class="tg-0lax">sadaknaifar@gmail.com</td>
        </tr>
        <tr>
            <td class="tg-0lax">Foulen</td>
            <td class="tg-0lax">Foulen</td>
            <td class="tg-0lax">foulen@gmail.com</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
