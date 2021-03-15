package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Supir;
import java.util.ArrayList;
import Controller.Kontrol_Supir;

public final class EditSupir_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Bahan/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../WEB-INF/headerStaffLogined.jsp", out, false);
      out.write("\n");
      out.write("        <p class=\"text-center\" style=\"font-size: x-large; font-family: sans-serif; font: bold\">Update Supir</p>\n");
      out.write("\n");
      out.write("        ");

            Kontrol_Supir k = new Kontrol_Supir();
            ArrayList<Supir> supirList = k.tampilSupir();
                    String id=null, nama=null, alamat=null, noTelp=null;   
                    
                    for (int i = 0; i < supirList.size(); i++) {
                        
                    }
      out.write("   \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-3\"></div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <div class=\"row myborder\">\n");
      out.write("                     <form action= \"../InputSupir\" method=\"GET\">\n");
      out.write("                        <div>\n");
      out.write("                            <label>Masukkan Nama :</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group margin-bottom-20\"> \n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\" style=\" color: #3d5b99;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" value=\"");
      out.print(nama);
      out.write("\" placeholder=\"Nama...\" name=\"nama\" type=\"text\" style=\"border: 1px solid #3d5b99!important; color:#000000 \"></div>\n");
      out.write("                        <div>\n");
      out.write("                            <label>Masukkan Alamat :</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group margin-bottom-20\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-home\" style=\" color: #3d5b99;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" value=\"");
      out.print(alamat);
      out.write("\" placeholder=\"Alamat...\" name=\"alamat\" type=\"text\" style=\"border: 1px solid #3d5b99!important; color:#000000 \"></div>\n");
      out.write("                        <div>\n");
      out.write("                            <label>Masukkan No. Telp :</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group margin-bottom-20\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-phone\" style=\" color: #3d5b99;\"></i></span>\n");
      out.write("                            <input size=\"60\" maxlength=\"255\" class=\"form-control\" value=\"");
      out.print(noTelp);
      out.write(" \" placeholder=\"No Telp...\" name=\"notelp\" type=\"text\" style=\"border: 1px solid #3d5b99!important; color:#000000 \"></div>\n");
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
      out.write("        \n");
      out.write("        \n");
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
