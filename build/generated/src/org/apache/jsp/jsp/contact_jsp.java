package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"../Bahan/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            #googleMap {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 400px;\n");
      out.write("            }  \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../WEB-INF/header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 class=\"text-center\">Contact</h3>\n");
      out.write("            <div class=\"row well\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <p>Kritik dan Saran</p>\n");
      out.write("                    <p><span class=\"glyphicon glyphicon-map-marker\"></span> Sleman, Yogyakarta</p>\n");
      out.write("                    <p><span class=\"glyphicon glyphicon-phone\"></span> Telepon: (0274) 4340640</p>\n");
      out.write("                    <p><span class=\"glyphicon glyphicon-envelope\"></span> Email: info@4sekawan-rent.com</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 form-group\">\n");
      out.write("                            <input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Name\" type=\"text\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6 form-group\">\n");
      out.write("                            <input class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email\" type=\"email\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <textarea class=\"form-control\" id=\"comments\" name=\"comments\" placeholder=\"Comment\" rows=\"5\"></textarea>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 form-group\">\n");
      out.write("                            <button class=\"btn pull-right\" type=\"submit\">Kirim</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"googleMap\" style=\"width:100%;height:400px;\"></div>\n");
      out.write("        <script>\n");
      out.write("            function myMap() {\n");
      out.write("                var myCenter = new google.maps.LatLng(-7.675749, 110.417426);\n");
      out.write("                var mapProp = {center: myCenter, zoom: 18, scrollwheel: false, draggable: true, mapTypeId: google.maps.MapTypeId.ROADMAP};\n");
      out.write("                var map = new google.maps.Map(document.getElementById(\"googleMap\"), mapProp);\n");
      out.write("                var marker = new google.maps.Marker({position: myCenter});\n");
      out.write("                marker.setMap(map);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDdS0_-T0-tBm_1hQP94t69z3rO4s-rq-w&callback=myMap\"></script>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../WEB-INF/footer.jsp", out, false);
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
