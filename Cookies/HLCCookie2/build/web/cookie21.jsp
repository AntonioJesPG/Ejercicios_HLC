<%-- 
    Document   : cookie21
    Created on : 04-dic-2020, 10:36:19
    Author     : DWES
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Cookie[] cookies = request.getCookies();
            String usuario = "";
            String asiento = "";
            String menu = "";
            String[] aeropuerto = {};
            List<String> aeropuertos = new ArrayList<>();
            
            for ( int i=0; i<cookies.length; i++) {

                  Cookie cookie = cookies[i];

                  if (cookie.getName().equals("usuario")){

                    usuario = cookie.getValue();

                    }
                  
                  if (cookie.getName().equals("asiento")){

                    asiento = cookie.getValue();

                }
                  
                  if (cookie.getName().equals("menu")){

                    menu = cookie.getValue();

                }
                  
                  if (cookie.getName().equals("aeropuerto")){

                    aeropuerto = cookie.getValue().split(":");
                    aeropuertos = Arrays.asList(aeropuerto);
                }

              }
        
        %>
        
        <form action='sCookie21' method='post'>
            <label>Nombre de usuario</label>
            <input type='text' name='usuario' value='<% out.println(usuario); %>'></p>
            <label>Asiento</label>
            <select name='asiento'>
                <option value='PAS' <% if(asiento.equals("PAS"))  out.println("selected");  %> >Pasillo</option>
                <option value='CENTR'<% if(asiento.equals("CENTR"))  out.println("selected");  %>>Centro</option>
                <option value='VENT'<% if(asiento.equals("VENT"))  out.println("selected");  %>>Ventanilla</option>
            </select></p>
            <label>Menú</label>
            <select name='menu'>
                <option value='VG' <% if(menu.equals("VG"))  out.println("selected");  %>>Vegetariano</option>
                <option value='NVG' <% if(menu.equals("NVG"))  out.println("selected");  %>>No-Vegetariano</option>
                <option value='DIA' <% if(menu.equals("DIA"))  out.println("selected");  %>>Diabético</option>
                <option value='INF' <% if(menu.equals("INF"))  out.println("selected");  %>>Infantil</option>
            </select></p>
            <label>Aeropuertos</label></p>
            <input type='checkbox' name='aeropuerto[]' value='LHR' <% if(aeropuertos.contains("LHR"))  out.println("checked");  %>><label>Londres</label></p>
            <input type='checkbox' name='aeropuerto[]' value='CDG' <% if(aeropuertos.contains("CDG"))  out.println("checked");  %>><label>Páris</label></p>
            <input type='checkbox' name='aeropuerto[]' value='IBZ' <% if(aeropuertos.contains("IBZ"))  out.println("checked");  %>><label>Ibiza</label></p>
            <input type='checkbox' name='aeropuerto[]' value='SIN' <% if(aeropuertos.contains("SIN"))  out.println("checked");  %>><label>Singapur</label></p>
            <input type='checkbox' name='aeropuerto[]' value='HKG' <% if(aeropuertos.contains("HKG"))  out.println("checked");  %>><label>Hong Kong</label></p>
            <input type='checkbox' name='aeropuerto[]' value='MLA' <% if(aeropuertos.contains("MLA"))  out.println("checked");  %>><label>Malta</label></p>
            <input type='checkbox' name='aeropuerto[]' value='CIA' <% if(aeropuertos.contains("CIA"))  out.println("checked");  %>><label>Roma</label></p>
            <input type='checkbox' name='aeropuerto[]' value='BOM' <% if(aeropuertos.contains("BOM"))  out.println("checked");  %>><label>Bombay</label></p>
            <input type='submit' name='enviar' value='Enviar'>
        </form>
    </body>
</html>
