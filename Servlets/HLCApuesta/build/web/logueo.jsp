<%-- 
    Document   : logueo
    Created on : 30-oct-2020, 11:07:47
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="loguear" method="post" >
            <p>Nombre de usuario: <input type="text" name="usuario" placeholder="Usuario para acceder"></p>
            <p>Contraseña: <input type="password" name="pass" placeholder="Elije una contraseña fuerte"></p>
            <p><input type="submit" value="Entrar"></p>
        </form>
        <%
        if(session.getAttribute("mensaje")!=null) out.println(session.getAttribute("mensaje"));            
        %>
    </body>
</html>
