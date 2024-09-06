<%-- 
    Document   : Form
    Created on : 13 nov. 2018, 17:46:03
    Author     : sio
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Control?action=affichLesMeds" method="POST">
            <select name="unDep">
                <c:forEach var="unDep" items="${tabLesDeps}">
                    <option name="unDep" value="${unDep.num}">
                        ${unDep.num} 
                    </option>
                </c:forEach>
            </select>  
            <br/> <br/> <br/>
            <input type="submit" value="validDep"/>
        </form>
    </body>
</html>
