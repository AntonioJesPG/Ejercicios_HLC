/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MagicMatrix;

/**
 *
 * @author DWES
 */
@WebServlet(urlPatterns = {"/sMat"})
public class sMat extends HttpServlet {
int n = 1;
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
            String suma = request.getParameter("+");
            String resta = request.getParameter("-");
            String tamanio = request.getParameter("n");
            if(tamanio!= null && tamanio!= ""){
                n = Integer.parseInt(tamanio);
            }
            else{
                n = -1;
            }
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet sMat</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if(n>0 && n%2 != 0){
                if(suma!= null){
                    n += 2;
                }
                if(resta != null && n > 1){
                    n -= 2;
                }
            
            MagicMatrix m = new MagicMatrix(n);
            int[][] matriz = m.devolverMatriz();
            out.println("<h1>Matriz mágica de " + n + "</h1>");
            out.println("<table border='1'>");
            if(matriz != null){
                for(int i = matriz.length-1; i >= 0; i--){
                    out.println("<tr>");
                    for(int j = 0; j < matriz.length; j++){
                        out.println("<td>" + matriz[j][i] + "</td>");
                    }
                    out.println("</tr>");
                }
            }
            out.println("</table>");
            out.println("<form action='sMat' method='POST'>");
            out.println("<input type='hidden' name='n' value='"+ n +"'>");
            out.println("<input type='submit' name='-' value='-'>");
            out.println("<input type='submit' name='+' value='+'>");
            out.println("</form>");
            }
            else{
                out.println("<h1>Matríz mágica!</h1>");
                out.println("<p style='color:red'> El valor introducido ha de ser un impar mayor a 0</p>");
                out.println("<form action='sMat' method='POST'>");
                out.println("<label>Número de la matriz mágica</label>");
                out.println("<input type='text' name='n'></p>");
                out.println("<input type='submit' name='enviar' value='enviar'>");
                out.println("</form>");
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
