<%-- 
    Document   : affichMedParDep
    Created on : 15 nov. 2018, 12:36:46
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
        <table border="2px">            
            <!-- AFFICHAGE DES MEDECINS PAR DEPARTEMENT -->
            <c:forEach var="unMed" items="${tabLesMeds}">
                <tr> 
                    <td>
                <option name="unMed" value="${unMed.prenom}">
                    ${unMed.prenom}
                </option>
            </td>  
            <td>
            <option name="unMed" value="${unMed.nom}">
                ${unMed.nom} 
            </option>
        </td>
        <td>
        <option name="unMed" value="${unMed.adresse}">
            ${unMed.adresse} 
        </option>
    </td>
    <td>
    <option name="unMed" value="${unMed.tel}">
        ${unMed.tel}
    </option>
</td>
<td>
<option name="unMed" value="${unMed.spe}">
    ${unMed.spe}
</option>
</td>
</tr> 
</c:forEach>
</table> 

<!-- AFFICHAGE DES MEDECINS PAR NOM -->
<c:forEach var="unMedNom" items="${tabLesMedsNom}">   
<option name="unMedNom" value="${unMedNom.nom}">
    ${unMedNom.nom}
</option><br/>    
</c:forEach>

<!-- AFFICHAGE DES MEDECINS PAR SPECIALITE -->
<table border="2px"> 
    <c:forEach var="unMedS" items="${tabLesMedsS}">
        <tr> 
            <td>
        <option name="unMedS" value="${unMedS.prenom}">
            ${unMedS.prenom}
        </option>
    </td>  
    <td>
    <option name="unMedS" value="${unMedS.nom}">
        ${unMedS.nom} 
    </option>
</td>
<td>
<option name="unMedS" value="${unMedS.adresse}">
    ${unMedS.adresse} 
</option>
</td>
<td>
<option name="unMedS" value="${unMedS.tel}">
    ${unMedS.tel}
</option>
</td>
<td>
<option name="unMedS" value="${unMedS.spe}">
    ${unMedS.spe}
</option>
</td>
</tr> 
</c:forEach>
</table>
</body>
</html>
