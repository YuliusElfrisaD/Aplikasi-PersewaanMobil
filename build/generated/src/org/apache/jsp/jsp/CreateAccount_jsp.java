package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>4 Sekawan Car Rental</title>\n");
      out.write("        <link rel=\"icon\" href=\"Pictures/apps.png\" type=\"image/x-icon\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../Bahan/cssku/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../Bahan/cssku/signupcss.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js\"></script>\n");
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
      out.write("                            <img src=\"../images/Logo.png\" width=\"250\" height=\"80\" alt=\"logo\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"#myPage\">HOME</a></li>\n");
      out.write("                            <li><a href=\"#band\">CARS</a></li>\n");
      out.write("                            <li><a href=\"#tour\">RENT</a></li>\n");
      out.write("                            <li><a href=\"#contact\">CONTACT</a></li>\n");
      out.write("                            <li><a href=\"CreateAccount.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Daftar</a></li>\n");
      out.write("                            <li><a href=\"Login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <br>\n");
      out.write("        <br> \n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-3\"></div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <div class=\"row myborder\">\n");
      out.write("                    <h4 style=\"color: #3766ab; margin: initial; margin-bottom: 10px;\">Sign Up Now</h4><hr>\n");
      out.write("                    <form method=\"POST\" action= \"../DaftarServlet\">\n");
      out.write("                        <div class=\"input-group margin-bottom-20\"> \n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\" style=\" color: #6699ff;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" placeholder=\"Masukkan nama\" name=\"nama\" type=\"text\" style=\"border: 1px solid #6699ff !important; color:#000000 \"></div>\n");
      out.write("                        <div class=\"input-group margin-bottom-20\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-envelope\" style=\" color: #6699ff;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" placeholder=\"Masukkan email\" name=\"email\" type=\"text\" style=\"border: 1px solid #6699ff !important; color:#000000 \"></div>\n");
      out.write("                        <div class=\"input-group margin-bottom-20\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-home\" style=\" color: #6699ff;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" placeholder=\"Masukkan alamat\" name=\"alamat\" type=\"text\" style=\"border: 1px solid #6699ff !important; color:#000000 \"></div>\n");
      out.write("                        <div class=\"input-group margin-bottom-20\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-phone\" style=\" color: #6699ff;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" placeholder=\"Masukkan notelp\" name=\"notelp\"  type=\"text\" style=\"border: 1px solid #6699ff !important; color:#000000 \"></div>\n");
      out.write("                        <div class=\"input-group margin-bottom-20\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-log-in\" style=\" color: #6699ff;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" placeholder=\"Masukkan username\" name=\"username\"  type=\"text\" style=\"border: 1px solid #6699ff !important; color:#000000 \"></div>\n");
      out.write("                        <div class=\"input-group margin-bottom-20\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\" style=\" color: #6699ff;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" placeholder=\"Masukkan password\" name=\"password\" type=\"password\" style=\"border: 1px solid #6699ff !important; color:#000000 \"></div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <button class=\"btn-u pull-left btn-primary\" type=\"submit\">Daftar Sekarang</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <footer class=\"text-center\">\n");
      out.write("            <p>Copyright © 2017 RPL Kelompok 4</p>\n");
      out.write("            <p>\n");
      out.write("                Asih Sulistyani     (155314002) |\n");
      out.write("                Osmond Giovanni I   (155314024) |\n");
      out.write("                Agenda Yudha S      (155314025) |\n");
      out.write("                Yulius Elfrisa D    (155314040)\n");
      out.write("            </p>\n");
      out.write("        </footer>\n");
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
