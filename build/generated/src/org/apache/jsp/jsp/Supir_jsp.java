package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.Supir;
import Controller.Kontrol_Supir;

public final class Supir_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('<');
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
      out.write("        <style>\n");
      out.write("            .actions .btn{\n");
      out.write("                width:36%;\n");
      out.write("                margin:auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .actions .btn-info{\n");
      out.write("                float:left;\n");
      out.write("            }\n");
      out.write("            .actions .btn-danger{\n");
      out.write("                float:right;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../WEB-INF/headerStaffLogined.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <p class=\"text-center\" style=\"font-size: x-large; font-family: sans-serif; font: bold\">Daftar Supir</p>\n");
      out.write("\n");
      out.write("        <table class=\"table table-hover table-striped \">\n");
      out.write("            <thead style=\"background: #3766ab ; color: #ffffff\">\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">No.</th>\n");
      out.write("                    <th scope=\"col\">ID Supir</th>\n");
      out.write("                    <th scope=\"col\">Nama Supir</th>\n");
      out.write("                    <th scope=\"col\">Alamat</th>\n");
      out.write("                    <th scope=\"col\">No. Telp</th>\n");
      out.write("                    <th scope=\"col\"></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
Kontrol_Supir k = new Kontrol_Supir();
                    ArrayList<Supir> supirList = k.tampilSupir();
                    try {
                        for (int i = 0; i < supirList.size(); i++) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">");
      out.print(i + 1);
      out.write("</th>\n");
      out.write("                    <td >");
      out.print(supirList.get(i).getIdSupir());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(supirList.get(i).getNamaSupir());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(supirList.get(i).getAlamatSupir());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(supirList.get(i).getNotelpSupir());
      out.write("</td>\n");
      out.write("                    <td class=\"actions\">\n");
      out.write("                        <form action=\"../HapusSupir\">\n");
      out.write("                            \n");
      out.write("                            <button class=\"btn btn-danger btn-sm\" type=\"submit\" name=\"hapusSupir\" data-toggle=\"tooltip\" title=\"Hapus supir\"\n");
      out.write("                                    value=\"");
      out.print(supirList.get(i).getIdSupir());
      out.write("\"><i class=\"glyphicon glyphicon-trash\"></i></button>\t\t\t\t\t\t\t\t\n");
      out.write("                        </form>\n");
      out.write("                        <form action=>\n");
      out.write("                            <button class=\"btn btn-success btn-sm\" type=\"submit\" name=\"updateSupir\" data-toggle=\"tooltip\" title=\"Update supir\"><i class=\"glyphicon glyphicon-pencil\"></i></button>\t\t\t\t\t\t\t\t\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
}
                } catch (Exception ex) {
                    ex.getMessage();
                }
            
      out.write("\n");
      out.write("        </table>\n");
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
