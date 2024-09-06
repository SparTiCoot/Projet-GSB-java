<%-- 
    Document   : FormMedParSpecialite
    Created on : 28 nov. 2018, 10:45:17
    Author     : sio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="Control?action=affichLesMedsParSpecialite" method="POST">
            <select name="uneSpe">
                <c:forEach var="uneSpe" items="${tabLesSpes}">
                    <option name="uneSpe" value="${uneSpe.nom}">
                        ${uneSpe.nom} 
                    </option>
                </c:forEach>
            </select>  
            <br/> <br/> <br/>
            <input type="submit" value="validDep"/>
        </form>
    </body>
</html>
