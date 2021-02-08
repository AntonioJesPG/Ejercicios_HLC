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
        <h1>Crear una cookie</h1>
        <form action="sCreaCookie" method="post" >
            <table border="1">
                <tr>
                    <td><label>Nombre para la cookie</label></td>
                    <td><input type="text" name="cookieN"></td>
                </tr><tr>
                    <td><label>Valor para la cookie</label></td>
                    <td><input type="text" name="cookieV"></td>
                </tr>
            </table>
            <input type="submit" name="crear" value="crear">
            <input type="submit" name="visualizar" value="visualizar">
            <input type="submit" name="modificar" value="modificar">
            <input type="submit" name="eliminar" value="eliminar">
        </form>
    </body>
</html>
