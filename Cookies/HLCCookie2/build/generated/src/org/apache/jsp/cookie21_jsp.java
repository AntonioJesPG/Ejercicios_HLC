package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class cookie21_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("lop\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
 
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
        
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <form action='sCookie21' method='post'>\r\n");
      out.write("            <label>Nombre de usuario</label>\r\n");
      out.write("            <input type='text' name='usuario' value='");
 out.println(usuario); 
      out.write("'></p>\r\n");
      out.write("            <label>Asiento</label>\r\n");
      out.write("            <select name='asiento'>\r\n");
      out.write("                <option value='PAS' ");
 if(asiento.equals("PAS"))  out.println("selected");  
      out.write(" >Pasillo</option>\r\n");
      out.write("                <option value='CENTR'");
 if(asiento.equals("CENTR"))  out.println("selected");  
      out.write(">Centro</option>\r\n");
      out.write("                <option value='VENT'");
 if(asiento.equals("VENT"))  out.println("selected");  
      out.write(">Ventanilla</option>\r\n");
      out.write("            </select></p>\r\n");
      out.write("            <label>Menú</label>\r\n");
      out.write("            <select name='menu'>\r\n");
      out.write("                <option value='VG' ");
 if(menu.equals("VG"))  out.println("selected");  
      out.write(">Vegetariano</option>\r\n");
      out.write("                <option value='NVG' ");
 if(menu.equals("NVG"))  out.println("selected");  
      out.write(">No-Vegetariano</option>\r\n");
      out.write("                <option value='DIA' ");
 if(menu.equals("DIA"))  out.println("selected");  
      out.write(">Diabético</option>\r\n");
      out.write("                <option value='INF' ");
 if(menu.equals("INF"))  out.println("selected");  
      out.write(">Infantil</option>\r\n");
      out.write("            </select></p>\r\n");
      out.write("            <label>Aeropuertos</label>\r\n");
      out.write("            <input type='checkbox' name='aeropuerto[]' value='LHR' ");
 if(aeropuertos.contains("LHR"))  out.println("checked");  
      out.write("><label>Londres</label></p>\r\n");
      out.write("            <input type='checkbox' name='aeropuerto[]' value='CDG' ");
 if(aeropuertos.contains("CDG"))  out.println("checked");  
      out.write("><label>Páris</label></p>\r\n");
      out.write("            <input type='checkbox' name='aeropuerto[]' value='IBZ' ");
 if(aeropuertos.contains("IBZ"))  out.println("checked");  
      out.write("><label>Ibiza</label></p>\r\n");
      out.write("            <input type='checkbox' name='aeropuerto[]' value='SIN' ");
 if(aeropuertos.contains("SIN"))  out.println("checked");  
      out.write("><label>Singapur</label></p>\r\n");
      out.write("            <input type='checkbox' name='aeropuerto[]' value='HKG' ");
 if(aeropuertos.contains("HKG"))  out.println("checked");  
      out.write("><label>Hong Kong</label></p>\r\n");
      out.write("            <input type='checkbox' name='aeropuerto[]' value='MLA' ");
 if(aeropuertos.contains("MLA"))  out.println("checked");  
      out.write("><label>Malta</label></p>\r\n");
      out.write("            <input type='checkbox' name='aeropuerto[]' value='CIA' ");
 if(aeropuertos.contains("CIA"))  out.println("checked");  
      out.write("><label>Roma</label></p>\r\n");
      out.write("            <input type='checkbox' name='aeropuerto[]' value='BOM' ");
 if(aeropuertos.contains("BOM"))  out.println("checked");  
      out.write("><label>Bombay</label></p>\r\n");
      out.write("            <input type='submit' name='enviar' value='Enviar'>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
