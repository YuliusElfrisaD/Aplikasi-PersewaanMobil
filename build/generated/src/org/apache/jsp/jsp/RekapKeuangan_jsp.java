package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.RekapKeuangan;
import Controller.Kontrol_RekapKeuangan;

public final class RekapKeuangan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"icon\" href=\"../Bahan/Gambar/Logo 4SEKAWAN.png\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Bahan/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <p class=\"text-center\" style=\"font-size: x-large; font-family: sans-serif; font: bold\">Rekap Keuangan</p>\n");
      out.write("\n");
      out.write("        <table class=\"table table-hover table-striped \">\n");
      out.write("            <thead style=\"background: #3766ab ; color: #ffffff\">\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">No.</th>\n");
      out.write("                    <th scope=\"col\">Biaya Pemasukan</th>\n");
      out.write("                    <th scope=\"col\">Tanggal Pemasukan</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
 Kontrol_RekapKeuangan rk = new Kontrol_RekapKeuangan();
                    RekapKeuangan r = new RekapKeuangan();
                    ArrayList<RekapKeuangan> rekapList = rk.tampilRekapKeuangan();
                    try {
                        for (int i = 0; i < rekapList.size(); i++) {

                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">");
      out.print(i + 1);
      out.write("</th>\n");
      out.write("                    <td>Rp.");
      out.print(rekapList.get(i).getP().getBiaya());
      out.write(",-</td>\n");
      out.write("                    <td >");
      out.print(rekapList.get(i).getP().getTanggalKembali());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("            ");
}
                } catch (Exception ex) {
                    ex.getMessage();
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4\"></div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <label for=\"dpd3\">Pilih Bulan</label>\n");
      out.write("                <select name=\"jamPinjam\" class=\"form-control\" id=\"dpd3\">\n");
      out.write("                    <option value=\"January\">00</option>\n");
      out.write("                    <option value=\"February\">01</option>\n");
      out.write("                    <option value=\"March\">02</option>\n");
      out.write("                    <option value=\"April\">03</option>\n");
      out.write("                    <option value=\"May\">04</option>\n");
      out.write("                    <option value=\"June\">05</option>\n");
      out.write("                    <option value=\"July\">06</option>\n");
      out.write("                    <option value=\"August\">07</option>\n");
      out.write("                    <option value=\"September\">08</option>\n");
      out.write("                    <option value=\"October\">09</option>\n");
      out.write("                    <option value=\"November\" selected=\"selected\">10</option>\n");
      out.write("                    <option value=\"December\">11</option>\n");
      out.write("                </select>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\" id=\"booking\">CARI</button>                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\"></div>\n");
      out.write("        </div>\n");
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
