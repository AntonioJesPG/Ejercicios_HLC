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

            
            <table border="1">
               <% 
                
                ArrayList<Usuario> usuarios = new ArrayList<>();
                String archivo = "usuario.dat";
                try{
                RecuperaList rl = new RecuperaList(archivo);
                usuarios = (ArrayList<Usuario>) rl.get();
                } catch(Exception e){

                }
                out.println("<tr><th>Nombre</th><th>Mensaje</th><th></th></tr>");
                ArrayList<String> mensajes = new ArrayList<String>();
                for(Usuario u : usuarios){
                    mensajes = u.getMensajes();
                    for(String s : mensajes){
                        out.println("<form method='POST' action='sForo'>");
                        out.println("<tr><td>" + u.getNombre() + "</td><td>" + s + "</td>");
                        out.println("<input type='hidden' value='" + u.getNombre() + "' name='usu'>");
                        out.println("<td><button name='del' value='" + s + "' type='submit'>X</button></td></tr>");
                        out.println("</form>");
                    }
                }
               
               %>
            </table>
                
               <%
                out.println("<form method='POST' action='logueo.jsp'>");
                out.println("<input name='dc' value='Desconectarse' type='submit'>");
                out.println("</form></p>");
                   %>
    </body>
</html>
