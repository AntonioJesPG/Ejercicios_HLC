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
        <form action='logueo.jsp' method='POST'>
            <input type='submit' name='desconectarse' value='desconectarse' >
        </form>
        <form action='VistaNuevo.jsp' method='POST'>
            <table border="1">
               <% 
                
                out.println("<input type='submit' name='agregar' value='agregar' >");
                out.println("</form>");
                out.println("<form method='POST' action='sCrud'>");
                
                ArrayList<Persona> personas = new ArrayList<>();
                String archivo = "personas.dat";
                try{
                RecuperaList rl = new RecuperaList(archivo);
                personas = (ArrayList<Persona>) rl.get();
                } catch(Exception e){

                }
                
                out.println("<tr><th>ID</th><th>Nombre</th><th>Apellido</th><th>Fecha Nacimiento</th><th>Carrera</th><th>Semestre</th><th>Email</th></tr>");
                

                for(Persona p : personas){
                out.println("<tr>");
                out.println("<td>" + p.getId() + "</td>");
                out.println("<td>" + p.getNombre() + "</td>");
                out.println("<td>" + p.getApellido() + "</td>");
                out.println("<td>" + p.getFechaNac() + "</td>");
                out.println("<td>" + p.getCarrera() + "</td>");
                out.println("<td>" + p.getSemestre() + "</td>");
                out.println("<td>" + p.getEmail() + "</td>");
                out.println("<td><button name='del' value='" + p.getId() + "' type='submit'>X</button></td></tr>");
                }
                
               %>
            </table>
        </form>
    </body>
</html>
