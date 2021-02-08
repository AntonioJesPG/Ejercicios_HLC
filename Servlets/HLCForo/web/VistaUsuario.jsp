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
            
               <% 
                HttpSession userSession = request.getSession();
                ArrayList<Usuario> usuarios = new ArrayList<>();
                String archivo = "usuario.dat";
                try{
                RecuperaList rl = new RecuperaList(archivo);
                usuarios = (ArrayList<Usuario>) rl.get();
                } catch(Exception e){

                }
                
                String uNombre = (String) userSession.getAttribute("usuarioLog");
                out.println("<table border='1'>");
                out.println("<tr><th>Nombre</th><th>Mensaje</th></tr>");
                ArrayList<String> mensajes = new ArrayList<String>();

                for(Usuario u : usuarios){
                    mensajes = u.getMensajes();
                    for(String s : mensajes){
                        out.println("<tr><td>" + u.getNombre() + "</td>");
                        if(uNombre.equals(u.getNombre())){
                            out.println("<td><b>" + s + "</b></td>");
                        }
                        else{
                            out.println("<td>" + s + "</td>");
                        }

                    }
                }
                
                out.println("</table></p>");
                out.println("<h2> Comentarios </h2></p>");
                out.println("<form method='POST' action='sForo'>");
                out.println("<input type='text' name='comentario'>");
                out.println("<button name='comentar' value='" + uNombre  + "' type='submit'>Comentar</button>");
                out.println("</form>");
                
                out.println("<form method='POST' action='logueo.jsp'>");
                out.println("<button name='dc' value='Desconectarse' type='submit'>Desconectarse</button>");
                out.println("</form>");
               
               %>
    </body>
</html>
