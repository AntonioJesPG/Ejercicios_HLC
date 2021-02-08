/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DWES
 */
@WebServlet(name = "sCookie21", urlPatterns = {"/sCookie21"})
public class sCookie21 extends HttpServlet {

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
            if(request.getParameter("enviar") != null){
                Cookie preferencias;
                if(request.getParameter("usuario") != null){
                    preferencias = new Cookie("usuario",request.getParameter("usuario"));
                    response.addCookie(preferencias);
                }
                preferencias = new Cookie("asiento", request.getParameter("asiento"));
                response.addCookie(preferencias);
                preferencias = new Cookie("menu", request.getParameter("menu"));
                response.addCookie(preferencias);
                if(request.getParameter("aeropuerto[]") != null){
                    String[] aeropuerto = request.getParameterValues("aeropuerto[]");
                    ArrayList<String> aeropuertosSeleccionados = new ArrayList<String>();
                    String aeroStr = "";
                    for(int i = 0; i < aeropuerto.length; i++){
                        aeroStr+= aeropuerto[i] + ":";
                    }
                    preferencias = new Cookie("aeropuerto",aeroStr);
                    response.addCookie(preferencias);
                }
                
                
                
            }
            response.sendRedirect("cookie21.jsp");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet sCookie21</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet sCookie21 at " + request.getContextPath() + "</h1>");
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
