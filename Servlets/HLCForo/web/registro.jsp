<%-- 
    Document   : VistaAdministrador
    Created on : 30-oct-2020, 11:26:57
    Author     : alex
--%>

<%@page import="Modelo.RecuperaList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action='registrar' method='POST'>
            <label>Nombre</label>
            <input type="text" name="nombre"></p>
            <label>Contraseña</label>
            <input type="text" name="pass"></p>
            <input type="submit" name="registrar" value="registrar">
        </form>
    </body>
</html>
