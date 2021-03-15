package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"../Bahan/CSS/header.css\" rel=\"stylesheet\" />\n");
      out.write("         <title>Rental Persewaan Mobil 4SEKAWAN</title>\n");
      out.write("         <link rel=\"shortcut icon\" href=\"../Bahan/Gambar/LOGO tok.png\"> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>    \n");
      out.write("            <h1> <a href=\"4SEKAWAN.jsp\"> <img style=\"width: 79px\" src=\"../Bahan/Gambar/HOME.png\" > </a> </h1>\n");
      out.write("        </header>\n");
      out.write("         <nav class=\"navbar-inverse\" role=\"navigation\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\" >\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <a class=\"navbar-brand\" href=\"4SEKAWAN.jsp\" style=\"\">\n");
      out.write("                        <img  src=\"assets/Images/LOGO tok.png\" style=\"width: 100px;\"> \n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Collect the nav links for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-ex1-collapse\" >\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"#home\"></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#about\">TENTANG 4SEKAWAN</a>\n");
      out.write("                        </li>                    \n");
      out.write("\n");
      out.write("                        ");

                            try {
                                session = request.getSession();
                                String userAction = null;
                                if (session != null) {
                                    userAction = (String) session.getAttribute("username");
                                }

                                if (userAction == null) { 
      out.write("\n");
      out.write("                        <li>\n");
      out.write("\n");
      out.write("                            <a href=\"Login.jsp\" class=\"navbar-left fixed btn-group-justified breadcrumb\" style=\"text-shadow: 2px 0px 2px #333;z-index: 99; padding: 15px; margin-left: 300px; background-color: #84bd17; border-radius: 20px; opacity: 1.0; position: absolute; width: 1000px; overflow-x: hidden\">\n");
      out.write("                                Login\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 } else {
      out.write("\n");
      out.write("<!--                        <li>\n");
      out.write("                            <form action=\"./AkunTes\" method=\"post\">\n");
      out.write("                            <a href=\"./AkunTes\" class=\"navbar-left fixed btn-group-justified breadcrumb\" style=\"text-shadow: 2px 0px 2px #333;z-index: 99; padding: 15px; margin-left: 300px; background-color: #84bd17; border-radius: 20px; opacity: 1.0; position: absolute; width: 1000px\">\n");
      out.write("                                <input type=\"hidden\" name=\"akun\" value=\"logout\">\n");
      out.write("                                Logout\n");
      out.write("                            </a>\n");
      out.write("                            </form>>\n");
      out.write("                        </li>-->\n");
      out.write("                        ");
  }
                            } catch (NullPointerException npe) {
                                npe.getMessage();
                            }
                        
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container -->\n");
      out.write("        </nav> \n");
      out.write("        <!--End Navigation -->\n");
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
