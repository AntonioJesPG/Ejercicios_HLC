<%-- 
    Document   : VistaAdministrador
    Created on : 30-oct-2020, 11:26:57
    Author     : alex
--%>

<%@page import="Modelo.RecuperaList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action='sCrud' method='POST'>
            <label>Nombre</label>
            <input type="text" name="nombre"></p>
            <label>Apellido</label>
            <input type="text" name="apellido"></p>
            <label>Fecha Nacimiento</label>
            <input type="text" name="fNac"></p>
            <label>Carrera</label>
            <input type="text" name="carrera"></p>
            <label>Semestre</label>
            <input type="text" name="semestre"></p>
            <label>Email</label>
            <input type="text" name="email"></p>
            <input type="submit" name="agregar" value="agregar">
        </form>
    </body>
</html>
