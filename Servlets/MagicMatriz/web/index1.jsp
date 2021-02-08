<%-- 
    Document   : index
    Created on : 23-oct-2020, 10:55:01
    Author     : DWES
--%>

<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.ObjectInputStream"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.ObjectOutputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>  
        <h1>Matriz mágica!</h1>
        <form action="sMat" method="post">
            <label>Número de la matriz mágica</label>
            <input type="text" name="n"></p>
            <input type="submit" name="enviar" value="enviar">            
        </form>
    </body>
</html>
