package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InputSupir_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../WEB-INF/headerStaffLogined.jsp", out, false);
      out.write("\n");
      out.write("        <p class=\"text-center\" style=\"font-size: x-large; font-family: sans-serif; font: bold\">Input Supir</p>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-3\"></div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <div class=\"row myborder\">\n");
      out.write("                    <h4 style=\"color: #000000; margin: initial; margin-bottom: 10px;\">Form data supir</h4><hr>\n");
      out.write("                    <form action= \"../InputSupir\" method=\"GET\">\n");
      out.write("                        <div>\n");
      out.write("                            <label>Masukkan Nama :</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group margin-bottom-20\"> \n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\" style=\" color: #3d5b99;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" placeholder=\"Nama...\" name=\"nama\" type=\"text\" style=\"border: 1px solid #3d5b99!important; color:#000000 \"></div>\n");
      out.write("                        <div>\n");
      out.write("                            <label>Masukkan Alamat :</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group margin-bottom-20\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-home\" style=\" color: #3d5b99;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" placeholder=\"Alamat...\" name=\"alamat\" type=\"text\" style=\"border: 1px solid #322f30 !important; color:#000000 \"></div>\n");
      out.write("                        <div>\n");
      out.write("                            <label>Masukkan No. Telp :</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group margin-bottom-20\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-phone\" style=\" color: #3d5b99;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" placeholder=\"No Telp...\" name=\"notelp\" type=\"text\" style=\"border: 1px solid #322f30!important; color:#000000 \"></div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <button class=\"btn-u pull-left btn-success\" type=\"submit\">Daftar Sekarang</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--        <form action= \"../InputSupir\" method=\"GET\">\n");
      out.write("                    <center>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Nama</td>\n");
      out.write("                                <td><input type=\"text\" placeholder=\"Masukkan nama supir\" required=\"\" name=\"nama\"></td>\n");
      out.write("                            </tr>\n");
      out.write("        \n");
      out.write("                            <tr>\n");
      out.write("                                <td>Alamat</td>\n");
      out.write("                                <td><input type=\"text\" placeholder=\"Masukkan alamat\" required=\"\" name=\"alamat\"></td>\n");
      out.write("                            </tr>\n");
      out.write("        \n");
      out.write("                            <tr>\n");
      out.write("                                <td>No Telp.</td>\n");
      out.write("                                <td><input type=\"text\" placeholder=\"Masukkan no telp\" required=\"\" name=\"notelp\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td><button type=\"submit\"><a>INPUT</a></button></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </center>\n");
      out.write("                </form>-->\n");
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
