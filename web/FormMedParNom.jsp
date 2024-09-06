<%-- 
    Document   : FromMedParNom
    Created on : 22 nov. 2018, 11:38:33
    Author     : sio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="Control?action=affichLesMedsNom" method="POST">
              <input type="text" id="nomMed" name="nomMed"/>
            <br/> <br/> <br/>
            <input type="submit" value="validMed"/>
        </form>
    </body>
</html>
