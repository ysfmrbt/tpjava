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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@shoelace-style/shoelace@2.0.0-beta.73/dist/themes/light.css" />
    <script type="module" src="https://cdn.jsdelivr.net/npm/@shoelace-style/shoelace@2.0.0-beta.73/dist/shoelace.js"></script>
    <style rel="stylesheet">
        :root {
            /* Changes the primary theme color to purple using primitives */
            --sl-color-primary-50: var(--sl-color-blue-50);
            --sl-color-primary-100: var(--sl-color-blue-100);
            --sl-color-primary-200: var(--sl-color-blue-200);
            --sl-color-primary-300: var(--sl-color-blue-300);
            --sl-color-primary-400: var(--sl-color-blue-400);
            --sl-color-primary-500: var(--sl-color-blue-500);
            --sl-color-primary-600: var(--sl-color-blue-600);
            --sl-color-primary-700: var(--sl-color-blue-700);
            --sl-color-primary-800: var(--sl-color-blue-800);
            --sl-color-primary-900: var(--sl-color-blue-900);
            --sl-color-primary-950: var(--sl-color-blue-950);
        }
        html {
            font-family: var(--sl-font-sans);
            font-size: var(--sl-font-size-medium);
            background: #F2F8FF;
        }
    </style>
</head>
<body>
<sl-button-group>
    <sl-button href="/" variant="default" size="large" style="width: 100%; margin-bottom: 1rem;">Accueil</sl-button>
    <sl-button href="/Lister" variant="default" size="large" style="width: 100%; margin-bottom: 1rem;">Lister</sl-button>
    <sl-button href="/Creer" variant="default" size="large" style="width: 100%; margin-bottom: 1rem;">Créer</sl-button>
    <%
        String logInOut = "";
        if (session.getAttribute("User") != null) {
            logInOut = "Logout";
        } else {
            logInOut = "Login";
        }
    %>
    <sl-button href="/<%=logInOut%>" variant="default" size="large" style="width: 100%; margin-bottom: 1rem;"><%=logInOut%></sl-button>
</sl-button-group>
</body>
</html>
