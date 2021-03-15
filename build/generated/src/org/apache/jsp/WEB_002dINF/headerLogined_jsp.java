package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class headerLogined_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            #login {\n");
      out.write("                padding-top:40px !important; \n");
      out.write("                padding-bottom:30px !important;\n");
      out.write("                font-size: 18px !important;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            #login-dp{\n");
      out.write("                min-width: 250px;\n");
      out.write("                padding: 14px 14px 0;\n");
      out.write("                overflow:hidden;\n");
      out.write("                background-color:rgba(255,255,255,8);\n");
      out.write("            }            \n");
      out.write("            @media(max-width:768px){\n");
      out.write("                #login-dp{\n");
      out.write("                    background-color: inherit;\n");
      out.write("                    color: #fff;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>    \n");
      out.write("            <nav class=\"navbar navbar-default\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("                            <img src=\"../Bahan/Gambar/Logo.png\" width=\"250\" height=\"80\" alt=\"logo\" style=\"position: absolute\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"#myPage\">HOME</a></li>\n");
      out.write("                            <li><a href=\"#band\">CARS</a></li>\n");
      out.write("                            <li><a href=\"#Rent\">RENT</a></li>\n");
      out.write("                            <li><a href=\"contact.jsp\">CONTACT</a></li>\n");
      out.write("                            <li>\n");
      out.write("                                ");

                                    String user = (String) session.getAttribute("username");
                                
      out.write("\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link\" id=\"login\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-user\"></span> Loggged as ");
      out.print( user);
      out.write("<span class=\"caret\"></span></button>\n");
      out.write("                                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"menu1\" id=\"login-dp\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <button class=\"btn btn-link btn-block\"  data-toggle=\"tooltip\" title=\"Logout\">\n");
      out.write("                                                    <a><span class=\"glyphicon glyphicon-list-alt\" style=\"text-decoration: none !important;\"></span> Lihat Pesanan</a>\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <button class=\"btn btn-danger btn-block\" data-toggle=\"tooltip\" title=\"Logout\">\n");
      out.write("                                                    <a href=\"../Logout\" style=\"color: white !important; text-decoration: none;\"><span class=\"glyphicon glyphicon-log-out\"></span> LOGOUT</a>\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>    \n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>                   \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
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
