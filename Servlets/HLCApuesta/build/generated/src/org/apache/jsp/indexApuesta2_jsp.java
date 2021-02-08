package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexApuesta2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Welcome to Spring Web MVC project</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"sApuesta\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("            <p>R.Madrid - Moñecos F.C</p>\r\n");
      out.write("            ");
 
                String cantidadT = request.getParameter("cantidad");
                String eleccion =  request.getParameter("submit");
                if(eleccion.equals("Resultado 1. Cuota 1.85")){
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <input type =\"hidden\" name=\"eleccion\" value=\"1\">\r\n");
      out.write("                <input type=\"hidden\" name=\"cuota\" value=\"1.85\">\r\n");
      out.write("                <p>Resultado 1. Cuota 1.85. Su apuesta ");
 out.println("Cantidad: " + cantidadT + "€"); 
      out.write("</p>\r\n");
      out.write("                \r\n");
      out.write("                ");

                }
                if(eleccion.equals("Resultado x. Cuota 2.0")){
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <input type =\"hidden\" name=\"eleccion\" value=\"x\">\r\n");
      out.write("                <input type=\"hidden\" name=\"cuota\" value=\"2.00\">\r\n");
      out.write("                <p>Resultado x. Cuota 2.00. Su apuesta ");
 out.println("Cantidad: " + cantidadT + "€"); 
      out.write("</p>\r\n");
      out.write("                \r\n");
      out.write("                ");

                }
                if(eleccion.equals("Resultado x. Cuota 2.0")){
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <input type =\"hidden\" name=\"eleccion\" value=\"2\">\r\n");
      out.write("                <input type=\"hidden\" name=\"cuota\" value=\"1.90\">\r\n");
      out.write("                <p>Resultado 2. Cuota 1.90. Su apuesta ");
 out.println("Cantidad: " + cantidadT + "€"); 
      out.write("</p>\r\n");
      out.write("                \r\n");
      out.write("                ");

                }
                
      out.write("\r\n");
      out.write("            <input type=\"hidden\" name=\"cantidad\" value=\"");
 out.println(cantidadT);
      out.write("\">\r\n");
      out.write("            <!--\r\n");
      out.write("            <label>Cuota</label>\r\n");
      out.write("            <label>1.25</label>\r\n");
      out.write("            <input type=\"radio\" name=\"cuota\" value=\"1.25\">\r\n");
      out.write("            <label>2</label>\r\n");
      out.write("            <input type=\"radio\" name=\"cuota\" value=\"2\">\r\n");
      out.write("            <label>4.25</label>\r\n");
      out.write("            <input type=\"radio\" name=\"cuota\" value=\"4.5\"></p>\r\n");
      out.write("            -->\r\n");
      out.write("            <input type=\"submit\" name=\"resultado\" value = \"1\" text=\"Boton1\">\r\n");
      out.write("            <button name=\"resultado\" value=\"1\" type=\"submit\">Resultado 1</button>\r\n");
      out.write("            <input type=\"submit\" name=\"resultado\" value = \"Resultado x\">\r\n");
      out.write("            <input type=\"submit\" name=\"resultado\" value=\"Resultado 2\">\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
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
