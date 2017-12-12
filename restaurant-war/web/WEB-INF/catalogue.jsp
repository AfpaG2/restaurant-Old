<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/restaurant-war/css/votre-style.css" rel="stylesheet" type="text/css"/>
        <title>catalogue</title>
    </head>
    <body>
        
        <div>
            <h1>Catalogue</h1>
            <table>
                <thead>
                    <tr>
                        <th>nom</th>
                        <th>reference</th>
                        <th>stock</th>
                        <th>prixHT</th>
                        <th>prixTTC</th>
                        <th>action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${produits}" var="p">
                        <tr>
                            <td>${p.nom}</td>
                            <td>${p.reference}</td>
                            <td>${p.qte}</td>
                            <td>${p.prixHT}</td>
                            <td>${p.prixTTC}</td>
                            <td>
                                <c:url value="FrontControleur?section=operations-panier&origine=catalogue&action=add&ref=${p.reference}" var="urlp" />
                                <a href="${urlp}">ajouter au panier</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>        
    </body>
</html>
