/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DWES
 */
@WebServlet(urlPatterns = {"/s21"})
public class s21 extends HttpServlet {
	
	ArrayList<Double> tamanios = new ArrayList<Double>();
	int estatuas = 0;
	double tamanio;
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
        	
        	String tamanioStr = request.getParameter("est");
            if(tamanioStr != null) {
            	tamanio = Double.parseDouble(tamanioStr);
        		tamanios.add(tamanio);
            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet s21</title>");            
            out.println("</head>");
            out.println("<body>");
            if(tamanios.size() < 15){
                out.println("<form method=\"post\" action=\"s21\">");
                out.println("<label>Estatura de la estatua en metros</label>");
                out.println("<input type=\"text\" name=\"est\"></p>");
                out.println("<input type=\"submit\" name=\"Enviar\">");
                out.println("</form>");
            }
            else{
            	
            	double media = 0;
            	int estatuasBajas = 0;
            	for(double t : tamanios) {
            		media = media + t;
            		if(t < 1.60) {
            			estatuasBajas++;
            		}
            	}
            		media = (double) media/tamanios.size();
                out.println("<p> La estatura media de las 15 estatuas es : " + media + " m </p>");
                out.println("<p> La cantidad de estatuas menores a 1.60m es : " + estatuasBajas + "</p>");
                
                out.println("<form method=\"post\" action=\"s21\">");
                out.println("<input type=\"submit\" name=\"Volver\">");
                out.println("</form>");
                tamanios.clear();
                estatuas = 0;
            }
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
