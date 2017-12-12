<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/magasinEJB-v02-war/css/votre-style.css" rel="stylesheet" type="text/css"/>
        <title>home</title>
    </head>
    <body>
        <nav>
            <c:url value="FrontControleur?section=menu-main" var="url01" />
            <c:import url="${url01}" />
        </nav>
        <div>
            <h1>accueil</h1>
            <p>Bienvenue dans votre magasin.</p>
            <p class="${dClasse}">${msg}</p>
        </div>        
    </body>
</html>
