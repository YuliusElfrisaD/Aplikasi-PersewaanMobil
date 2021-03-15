package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.Mobil;
import Controller.Kontrol_Mobil;

public final class Cars_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>4 Sekawan Car Rental</title>\n");
      out.write("        <link rel=\"icon\" href=\"../Bahan/Gambar/Logo 4SEKAWAN.png\" type=\"image/x-icon\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../Bahan/cssku/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
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

            HttpSession username = request.getSession();
            if (username.getAttribute("username") != null) {
        
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../WEB-INF/headerLogined.jsp", out, false);
      out.write("     \n");
      out.write("        ");
} else { 
      out.write("            \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../WEB-INF/header.jsp", out, false);
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("        <h1 class=\"w3-center w3-jumbo\" style=\"margin-bottom:64px\">DAFTAR MOBIL</h1>\n");
      out.write("    <center>\n");
      out.write("        <table>\n");
      out.write("            ");
Kontrol_Mobil m = new Kontrol_Mobil();
                Mobil s = new Mobil();
                ArrayList<Mobil> mobilList = m.tampilMobil();
                for (int i = 0; i < mobilList.size();) {
                    int hrg = (int) mobilList.get(i).getHarga();
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                ");

                    for (int j = 0; j < 3; j++) {
                        if (i < mobilList.size()) {
                
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-12 col-sm-6 col-md-8\">\n");
      out.write("                                <img src=\"../Bahan/Mobil/");
      out.print(mobilList.get(i).getGambar());
      out.write("\" width=\"220\" height=\"140\">\n");
      out.write("                                <h2>");
      out.print(mobilList.get(i).getNamaKendaraan());
      out.write("<br><b>Rp.");
      out.print(hrg);
      out.write("</b></h2>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("                ");

                            i++;
                        }
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
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
