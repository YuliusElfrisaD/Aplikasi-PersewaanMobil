package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class headerStaffLogined_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
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
      out.write("            .dropdown-menu .sub-menu {\n");
      out.write("                left: 100%;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                visibility: hidden;\n");
      out.write("                margin-top: -1px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-menu li:hover .sub-menu {\n");
      out.write("                visibility: visible;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropdown-menu {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-tabs .dropdown-menu,\n");
      out.write("            .nav-pills .dropdown-menu,\n");
      out.write("            .navbar .dropdown-menu {\n");
      out.write("                margin-top: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar .sub-menu:before {\n");
      out.write("                border-bottom: 7px solid transparent;\n");
      out.write("                border-left: none;\n");
      out.write("                border-right: 7px solid rgba(0, 0, 0, 0.2);\n");
      out.write("                border-top: 7px solid transparent;\n");
      out.write("                left: -7px;\n");
      out.write("                top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar .sub-menu:after {\n");
      out.write("                border-top: 6px solid transparent;\n");
      out.write("                border-left: none;\n");
      out.write("                border-right: 6px solid #fff;\n");
      out.write("                border-bottom: 6px solid transparent;\n");
      out.write("                left: 10px;\n");
      out.write("                top: 11px;\n");
      out.write("                left: -6px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>    \n");
      out.write("        <nav class=\"navbar navbar-inverse\" >\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("                        <img src=\"../Bahan/Gambar/Logo.png\" width=\"250\" height=\"80\" alt=\"logo\" style=\"position: absolute\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#myPage\">HOME</a></li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">INPUT<b class=\"caret\"></b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\" id=\"menu1\">\n");
      out.write("                                <li><a href=\"#\">Input Supir</a></li>\n");
      out.write("                                <li><a href=\"#\">Input Mobil</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">VIEW<b class=\"caret\"></b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\" id=\"menu1\">\n");
      out.write("                                <li><a href=\"../jsp/Supir.jsp\">View Supir</a></li>\n");
      out.write("                                <li><a href=\"../jsp/Mobil.jsp\">View Mobil</a></li>\n");
      out.write("                                <li><a href=\"#\">View Persewaan</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-link\" id=\"login\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-user\"></span> Loggged as <span class=\"caret\"></span></button>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"menu1\" id=\"login-dp\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-danger btn-block\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>    \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("</body>\n");
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
