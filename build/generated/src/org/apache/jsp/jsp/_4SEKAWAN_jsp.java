package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _4SEKAWAN_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
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
      out.write("                        <a class=\"navbar-brand\" href=\"#myPage\">\n");
      out.write("                            <img src=\"../Bahan/Gambar/Logo.png\" width=\"250\" height=\"80\" alt=\"logo\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"#myPage\">HOME</a></li>\n");
      out.write("                            <li><a href=\"#band\">CARS</a></li>\n");
      out.write("                            <li><a href=\"#tour\">RENT</a></li>\n");
      out.write("                            <li><a href=\"#contact\">CONTACT</a></li>\n");
      out.write("                            <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Daftar</a></li>\n");
      out.write("                            <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("    \n");
      out.write("        <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <!-- Indicators -->\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <!-- Wrapper for slides -->\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"item active\">\n");
      out.write("                    <center><img src=\"../Bahan/Gambar/promo1.png\" alt=\"promo1\" width=\"1000\" height=\"700\"></center>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <center><img src=\"../Bahan/Gambar/promo2.jpg\" alt=\"promo2\" width=\"1000\" height=\"700\"></center>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Left and right controls -->\n");
      out.write("            <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <form id=\"dateRangeForm\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-xs-3 control-label\">Tanggal Pinjam</label>\n");
      out.write("                    <div class=\"col-xs-5 date\">\n");
      out.write("                        <div class=\"input-group input-append date\" id=\"dateRangePicker\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"date\" />\n");
      out.write("                            <span class=\"input-group-addon add-on\"><span class=\"glyphicon glyphicon-calendar\"></span></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"col-xs-5 col-xs-offset-3\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Cari</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <script>\n");
      out.write("                $(document).ready(function() {\n");
      out.write("                    $('#dateRangePicker').datepicker({\n");
      out.write("                        format: 'dd/mm/yyyy',\n");
      out.write("                        startDate: '01/01/2010',\n");
      out.write("                        endDate: '12/30/2020'\n");
      out.write("                    }).on('changeDate', function(e) {\n");
      out.write("                        $('#dateRangeForm').formValidation('revalidateField', 'date');\n");
      out.write("                    });\n");
      out.write("                $('#dateRangeForm').formValidation({\n");
      out.write("                    framework: 'bootstrap',\n");
      out.write("                    icon: {\n");
      out.write("                        valid: 'glyphicon glyphicon-ok',\n");
      out.write("                        invalid: 'glyphicon glyphicon-remove',\n");
      out.write("                        validating: 'glyphicon glyphicon-refresh'},\n");
      out.write("                    fields: {\n");
      out.write("                        date: {\n");
      out.write("                            validators: {\n");
      out.write("                                notEmpty: {\n");
      out.write("                                    message: 'The date is required'\n");
      out.write("                                },\n");
      out.write("                                date: {\n");
      out.write("                                    format: 'DD/MM/YYYY',\n");
      out.write("                                    min: '01/01/2010',\n");
      out.write("                                    max: '12/30/2020',\n");
      out.write("                                    message: 'The date is not a valid'\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        </div>\n");
      out.write("                \n");
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
      out.write("\n");
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
