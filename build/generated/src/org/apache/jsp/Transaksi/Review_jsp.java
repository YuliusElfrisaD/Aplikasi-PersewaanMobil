package org.apache.jsp.Transaksi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Review_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery.downCount.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .navbar {\n");
      out.write("                min-height:110px !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-nav > li {\n");
      out.write("                padding-top:40px !important; \n");
      out.write("                padding-bottom:30px !important;\n");
      out.write("                padding-right: 50px !important;\n");
      out.write("                font-size: 18px !important;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                        <a class=\"navbar-brand\" href=\"#myPage\">\n");
      out.write("                            <img src=\"./images/Logo.png\" width=\"250\" height=\"80\" alt=\"logo\" style=\"position: absolute\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li style=\"color: #999999\">1. Isi Data</li>\n");
      out.write("                            <li style=\"color: #0073a4\">2. Review</li>\n");
      out.write("                            <li style=\"color: #999999\">3. Pembayaran</li>\n");
      out.write("                            <li style=\"color: #999999\">4. E-ticket Terbit</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form>            \n");
      out.write("            <div class=\"container well\" style=\"background-color: #0060e9;color: white;\">\n");
      out.write("                <h1>Mohon Review Pesanan Anda</h1>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container\" id=\"batasWaktu\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\" style=\"text-align: left;\">\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                            <div class=\"well\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-6\"><span class=\"pull-right\">\n");
      out.write("                                            <img src=\"./images/apps.png\" width=\"50\" height=\"50\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <p style=\"padding-top: 18px\"><b>Nama mobil</b></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div><br>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"form-group col-md-6\" style=\"text-align: center;\">\n");
      out.write("                                        <label for=\"jamPinjam\">Tanggal pinjam</label><br><br>\n");
      out.write("                                        <p id=\"jamPinjam\">10 December 2017</p>\n");
      out.write("                                        <p id=\"jamPinjam\">10:00</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group col-md-6\" style=\"text-align: center;\">\n");
      out.write("                                        <label for=\"jamPinjam\">Tanggal kembali</label><br><br>\n");
      out.write("                                        <p id=\"jamPinjam\">11 December 2017</p>\n");
      out.write("                                        <p id=\"jamPinjam\">10:00</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 well\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <h3 class=\"text-left\" for=\"id\">ID Pesanan</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <h3 class=\"text-right\" id=\"id\">134234253</h3>\n");
      out.write("                                </div>\n");
      out.write("                            </div><br>\n");
      out.write("                            <div class=\"row well\">\n");
      out.write("                                <h3 for=\"jamPinjam\">Lanjut ke Pembayaran</h3><br>\n");
      out.write("                                <p id=\"jamPinjam\">Dengan mengeklik tombol di bawah, Anda menyetujui Syarat & Ketentuan dan Kebijakan Privasi 4 Sekawan.</p>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-warning btn-lg btn-block\" id=\"booking\">Lanjutkan</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
