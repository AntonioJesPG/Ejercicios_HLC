package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.RecuperaList;
import java.util.ArrayList;
import Modelo.Persona;

public final class VistaAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action='VistaNuevo.jsp' method='POST'>\n");
      out.write("            \n");
      out.write("            <table border=\"1\">\n");
      out.write("               ");
 
                
                out.println("<input type='submit' name='agregar' value='agregar' >");
                out.println("</form>");
                out.println("<form method='POST' action='sCrud'>");
                
                ArrayList<Persona> personas = new ArrayList<>();
                String archivo = "persona.dat";
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

               
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
