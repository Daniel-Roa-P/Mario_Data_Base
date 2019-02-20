<%-- 
    Document   : tabla_personajes
    Created on : 13/02/2019, 07:06:17 PM
    Author     : danbr
--%>

<%@page import="Datos.DBconexion"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% ResultSet tablaPersonajes = (ResultSet)session.getAttribute("personajes");%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla personajes</title>
    </head>
    <body>
        <h1>Personajes Guardados</h1>
        <table>
            <tr>
                <th>id</th><th>Protagonista</th><th>Poder</th><th>Yoshi</th>
            </tr>
            
             <% while (tablaPersonajes.next()){ %>
                    <tr>
                        <td><%= tablaPersonajes.getString("idpersonajes") %></td>
                        <td><%= tablaPersonajes.getString("protagonista") %></td>
                        <td><%= tablaPersonajes.getString("poder") %></td>
                        <td><%= tablaPersonajes.getString("yoshi") %></td>
                        
                    </tr>
                <% }%>
                
                
            
        </table>
    </body>
</html>
