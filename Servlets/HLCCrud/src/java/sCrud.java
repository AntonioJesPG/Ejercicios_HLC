/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Modelo.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.RecuperaList;
import Modelo.AlmacenaList;
import java.util.ArrayList;

/**
 *
 * @author Drakthon
 */
@WebServlet(urlPatterns = {"/sCrud"})
public class sCrud extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            ArrayList<Persona> personas = new ArrayList<>();
            String archivo = "personas.dat";
            try{
                RecuperaList rl = new RecuperaList(archivo);
                personas = (ArrayList<Persona>) rl.get();
               
                } catch(Exception e){

            }
            if(request.getParameter("del") != null){
                
                int del = Integer.parseInt(request.getParameter("del"));
                personas.remove(del);          
            }
            
            if(request.getParameter("agregar") != null){

                String  id = String.valueOf(personas.size());  

                String nombre = (String) request.getParameter("nombre");
                String apellido = (String) request.getParameter("apellido");
                String fNac = (String) request.getParameter("fNac");
                String carrera = (String) request.getParameter("carrera");
                String semestre = (String) request.getParameter("semestre");
                String email = (String) request.getParameter("email");
                out.println("<p>adddaa</p>");
                out.println("<title>Servlet AAAAA</title>");
                Persona p = new Persona(id,nombre,apellido,fNac, carrera, semestre, email);
                personas.add(p);
            }
            
            AlmacenaList al = new AlmacenaList(archivo, personas);
            response.sendRedirect("VistaAdministrador.jsp");
                     
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
