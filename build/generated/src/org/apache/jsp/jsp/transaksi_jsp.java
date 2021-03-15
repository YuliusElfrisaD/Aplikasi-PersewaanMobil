package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class transaksi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>4 Sekawan Car Rental</title>\n");
      out.write("        <link rel=\"icon\" href=\"Pictures/apps.png\" type=\"image/x-icon\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Bahan/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script> \n");
      out.write("        <style>\n");
      out.write("            p {\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 60px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 style=\"text-align: center;\">BATAS WAKTU PEMBAYARAN</h1>\n");
      out.write("                <p id=\"demo\"></p> \n");
      out.write("                <h2 style=\"text-align: center;\">Total Biaya: Rp. 250.000,-</h2>\n");
      out.write("                <div class=\"form-group center-block\">\n");
      out.write("                    <label for=\"exampleInputFile\">File input</label>\n");
      out.write("                    <input type=\"file\" class=\"form-control-file\" id=\"exampleInputFile\" aria-describedby=\"fileHelp\">\n");
      out.write("                    <small id=\"fileHelp\" class=\"form-text text-muted\">This is some placeholder block-level help text for the above input. It's a bit lighter and easily wraps to a new line.</small>\n");
      out.write("                </div>\n");
      out.write("                <h1 style=\"text-align: center;\">\n");
      out.write("                    BCA: 009-713-2848<br>\n");
      out.write("                    MANDIRI: 135-001-411-0595<br>\n");
      out.write("                    A/N: 4 Sekawan Car Rental\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("        </div>    \n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            // Set the date we're counting down to\n");
      out.write("            var today = new Date();\n");
      out.write("            var later = new Date();\n");
      out.write("            later.setSeconds(today.getSeconds() + 10);\n");
      out.write("\n");
      out.write("            // Update the count down every 1 second\n");
      out.write("            var x = setInterval(function () {\n");
      out.write("\n");
      out.write("                // Get todays date and time\n");
      out.write("                var now = new Date().getTime();\n");
      out.write("\n");
      out.write("                // Find the distance between now an the count down date\n");
      out.write("                var distance = later - now;\n");
      out.write("\n");
      out.write("                // Time calculations for days, hours, minutes and seconds\n");
      out.write("                var days = Math.floor(distance / (1000 * 60 * 60 * 24));\n");
      out.write("                var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));\n");
      out.write("                var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));\n");
      out.write("                var seconds = Math.floor((distance % (1000 * 60)) / 1000);\n");
      out.write("\n");
      out.write("                // Output the result in an element with id=\"demo\"\n");
      out.write("                document.getElementById(\"demo\").innerHTML = hours + \"h \"\n");
      out.write("                        + minutes + \"m \" + seconds + \"s \";\n");
      out.write("\n");
      out.write("                // If the count down is over, write some text \n");
      out.write("                if (distance < 0) {\n");
      out.write("                    clearInterval(x);\n");
      out.write("                    document.getElementById(\"demo\").innerHTML = \"EXPIRED\";\n");
      out.write("                }\n");
      out.write("            }, 1000);\n");
      out.write("        </script>\n");
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
