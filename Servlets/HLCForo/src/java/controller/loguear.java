/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Modelo.Usuario;
import Modelo.RecuperaList;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alex
 */
@WebServlet(name = "loguear", urlPatterns = {"/loguear"})
public class loguear extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loguear</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loguear at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

            HttpSession userSession = request.getSession();

            ArrayList<Usuario> usuarios = new ArrayList<>();
                String archivo = "usuario.dat";
                try{
                RecuperaList rl = new RecuperaList(archivo);
                usuarios = (ArrayList<Usuario>) rl.get();
                } catch(Exception e){

                }
            
            if (request.getParameter("usuario").equals("admin")
                    && request.getParameter("pass").equals(new Administrador().getPass())) {
                userSession.setAttribute("logueado", "admin");
                response.sendRedirect("VistaAdministrador.jsp");
            } else {
                boolean existe = false;
                for(Usuario u : usuarios){
                    
                    if(request.getParameter("usuario").equals(u.getNombre()) && 
                            request.getParameter("pass").equals(u.getPassword())){
                    userSession.setAttribute("usuarioLog", u.getNombre());
                    response.sendRedirect("VistaUsuario.jsp");   
                    existe = true;
                    }
                }
                if(!existe){
                response.sendRedirect("logueo.jsp");
                userSession.setAttribute("mensaje", "Usuario incorrecto");
                }
            }

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
