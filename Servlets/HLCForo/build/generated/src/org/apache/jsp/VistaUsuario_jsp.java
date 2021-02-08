package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.RecuperaList;
import java.util.ArrayList;
import Modelo.Usuario;

public final class VistaUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            \n");
      out.write("               ");
 
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
                out.println("<tr><th>Nombre</th><th>Mensaje</th><th>Eliminar</th></tr>");
                ArrayList<String> mensajes = new ArrayList<String>();

                for(Usuario u : usuarios){
                    mensajes = u.getMensajes();
                    for(String s : mensajes){
                        out.println("<tr><td>" + u.getNombre() + "</td>");
                        if(uNombre == u.getNombre()){
                            out.println("<td><b>" + s + "</b></td>");
                        }
                        else{
                            out.println("<td>" + s + "</td>");
                        }

                    }
                }
                out.println("</table>");
                out.println("<form method='POST' action='sForo'>");
                out.println("<input type='text' name'comentario'>");
                out.println("<button name='comentar' value='" + uNombre  + "' type='submit'>Comentar</button>");
                out.println("</form>");
               
               
      out.write("\n");
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
