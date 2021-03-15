package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Mobil;
import java.util.ArrayList;

public final class pencarian_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>4 Sekawan Car Rental</title>\n");
      out.write("        <link rel=\"icon\" href=\"Pictures/apps.png\" type=\"image/x-icon\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Bahan/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js\"></script>       \n");
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
      out.write("<!--        <form action=\"../Pencarian\" method=\"get\" class=\"form-horizontal\">  \n");
      out.write("            <div class=\"container well\" id=\"Rent\">\n");
      out.write("                <div class=\"col-lg-12\">                \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label for=\"sel2\">Supir:</label><br>                      \n");
      out.write("                            <label class=\"radio-inline\" id=\"true\"><input type=\"radio\" name=\"radioSupir\" value=\"YA\">YA</label>\n");
      out.write("                            <label class=\"radio-inline\" id=\"false\"><input type=\"radio\" name=\"radioSupir\" value=\"TIDAK\">TIDAK</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label for=\"dpd1\">Tanggal Pinjam:</label>\n");
      out.write("                            <div class=\"input-group input-append date\" id=\"dpd1\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"dpd1\" name=\"tglPinjam\" value=\"\"/>\n");
      out.write("                                <span class=\"input-group-addon add-on\"><span class=\"glyphicon glyphicon-calendar\" id=\"dpd1\"></span></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label for=\"dpd2\">Tanggal Kembali:</label> \n");
      out.write("                            <div class=\"input-group input-append date\" id=\"dpd2\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"dpd2\" name=\"tglKembali\" value=\"\"/>\n");
      out.write("                                <span class=\"input-group-addon add-on\"><span class=\"glyphicon glyphicon-calendar\" id=\"dpd2\"></span></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label for=\"dpd3\">Jam Pinjam:</label>\n");
      out.write("                            <div class=\"row\" id=\"dpd3\">\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <select name=\"jamPinjam\" class=\"form-control\" id=\"dpd3\">\n");
      out.write("                                        <option value=\"0\">00</option>\n");
      out.write("                                        <option value=\"1\">01</option>\n");
      out.write("                                        <option value=\"2\">02</option>\n");
      out.write("                                        <option value=\"3\">03</option>\n");
      out.write("                                        <option value=\"4\">04</option>\n");
      out.write("                                        <option value=\"5\">05</option>\n");
      out.write("                                        <option value=\"6\">06</option>\n");
      out.write("                                        <option value=\"7\">07</option>\n");
      out.write("                                        <option value=\"8\">08</option>\n");
      out.write("                                        <option value=\"9\">09</option>\n");
      out.write("                                        <option value=\"10\" selected=\"selected\">10</option>\n");
      out.write("                                        <option value=\"11\">11</option>\n");
      out.write("                                        <option value=\"12\">12</option>\n");
      out.write("                                        <option value=\"13\">13</option>\n");
      out.write("                                        <option value=\"14\">14</option>\n");
      out.write("                                        <option value=\"15\">15</option>\n");
      out.write("                                        <option value=\"16\">16</option>\n");
      out.write("                                        <option value=\"17\">17</option>\n");
      out.write("                                        <option value=\"18\">18</option>\n");
      out.write("                                        <option value=\"19\">19</option>\n");
      out.write("                                        <option value=\"20\">20</option>\n");
      out.write("                                        <option value=\"21\">21</option>\n");
      out.write("                                        <option value=\"22\">22</option>\n");
      out.write("                                        <option value=\"23\">23</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\" id=\"dpd1\">\n");
      out.write("                                    <select name=\"menitPinjam\" id=\"puMinute\" class=\"form-control\">\n");
      out.write("                                        <option value=\"0\" selected=\"selected\">00</option>\n");
      out.write("                                        <option value=\"15\">15</option>\n");
      out.write("                                        <option value=\"30\">30</option>\n");
      out.write("                                        <option value=\"45\">45</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label for=\"dpd4\">Jam Kembali</label>\n");
      out.write("                            <div class=\"row\" id=\"dpd4\">\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <select name=\"jamKembali\" class=\"form-control\" id=\"dpd3\">\n");
      out.write("                                        <option value=\"0\">00</option>\n");
      out.write("                                        <option value=\"1\">01</option>\n");
      out.write("                                        <option value=\"2\">02</option>\n");
      out.write("                                        <option value=\"3\">03</option>\n");
      out.write("                                        <option value=\"4\">04</option>\n");
      out.write("                                        <option value=\"5\">05</option>\n");
      out.write("                                        <option value=\"6\">06</option>\n");
      out.write("                                        <option value=\"7\">07</option>\n");
      out.write("                                        <option value=\"8\">08</option>\n");
      out.write("                                        <option value=\"9\">09</option>\n");
      out.write("                                        <option value=\"10\" selected=\"selected\">10</option>\n");
      out.write("                                        <option value=\"11\">11</option>\n");
      out.write("                                        <option value=\"12\">12</option>\n");
      out.write("                                        <option value=\"13\">13</option>\n");
      out.write("                                        <option value=\"14\">14</option>\n");
      out.write("                                        <option value=\"15\">15</option>\n");
      out.write("                                        <option value=\"16\">16</option>\n");
      out.write("                                        <option value=\"17\">17</option>\n");
      out.write("                                        <option value=\"18\">18</option>\n");
      out.write("                                        <option value=\"19\">19</option>\n");
      out.write("                                        <option value=\"20\">20</option>\n");
      out.write("                                        <option value=\"21\">21</option>\n");
      out.write("                                        <option value=\"22\">22</option>\n");
      out.write("                                        <option value=\"23\">23</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\" id=\"dpd1\">\n");
      out.write("                                    <select name=\"menitKembali\" id=\"puMinute\" class=\"form-control\">\n");
      out.write("                                        <option value=\"0\" selected=\"selected\">00</option>\n");
      out.write("                                        <option value=\"15\">15</option>\n");
      out.write("                                        <option value=\"30\">30</option>\n");
      out.write("                                        <option value=\"45\">45</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" style=\"padding-top: 32px;\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\" id=\"booking\">CARI</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </form><br>-->\n");
      out.write("\n");
      out.write("        <div class=\"container\">    \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3 sidenav well\">                    \n");
      out.write("                    <h3>Mobil Kami</h3>\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Pick Up</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Daihatsu Luxio</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Daihatsu GrandMax</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Honda Brio</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Honda Jazz</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Honda City</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Nissan Evalia</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Suzuki Swift</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Toyota All New Avanza</label>\n");
      out.write("                        </div>                                               \n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Toyota Yaris</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Toyota Innova</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label><input type=\"checkbox\" value=\"\" name=\"showCars\" checked=\"checked\"> Toyota Agya</label>\n");
      out.write("                        </div>\n");
      out.write("                    </form>                    \n");
      out.write("                </div>\n");
      out.write("                <form action=\"../bookingServlet\" method=\"get\">\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        ");
                            
                            ArrayList<Mobil> cari = (ArrayList<Mobil>) session.getAttribute("cariMobil");

                            String id = null, nama = null, gambar = null;

                            for (int i = 0; i < cari.size(); i++) {
                                id = cari.get(i).getIdKendaraan();
                                nama = cari.get(i).getNamaKendaraan();
                                gambar = cari.get(i).getGambar();
                        
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      Model.Mobil cariMobil = null;
      synchronized (request) {
        cariMobil = (Model.Mobil) _jspx_page_context.getAttribute("cariMobil", PageContext.REQUEST_SCOPE);
        if (cariMobil == null){
          cariMobil = new Model.Mobil();
          _jspx_page_context.setAttribute("cariMobil", cariMobil, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("cariMobil"), "idKendaraan",
id);
      out.write("\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("cariMobil"), "namaKendaraan",
nama);
      out.write("\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("cariMobil"), "gambar",
gambar);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-3\" style=\"padding-left: 10px\">\n");
      out.write("                                    <img src=\"../Bahan/Mobil/");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Model.Mobil)_jspx_page_context.findAttribute("cariMobil")).getGambar())));
      out.write("\" width=\"180\" height=\"100\"> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\" style=\"padding-top: 10px;\">\n");
      out.write("                                    <h1 style=\"text-align: center\">");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Model.Mobil)_jspx_page_context.findAttribute("cariMobil")).getNamaKendaraan())));
      out.write("</h1>   \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\" style=\"padding-top: 30px; padding-right: 30px\">\n");
      out.write("                                    <button type=\"input\" class=\"btn btn-warning btn-block\" name=\"pesanMobil\" value=\"");
      out.print(id);
      out.write("\">PESAN SEKARANG</button>  \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                               \n");
      out.write("                        ");
  }
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var startDate = new Date();\n");
      out.write("            var fechaFin = new Date();\n");
      out.write("            var FromEndDate = new Date();\n");
      out.write("            var ToEndDate = new Date();\n");
      out.write("\n");
      out.write("            $('#dpd1').datepicker({\n");
      out.write("                autoclose: true,\n");
      out.write("                format: 'dd MM yyyy',\n");
      out.write("                todayBtn: \"linked\",\n");
      out.write("                clearBtn: true,\n");
      out.write("                todayHighlight: true,\n");
      out.write("                startDate: \"today\"\n");
      out.write("            }).on('changeDate', function (selected) {\n");
      out.write("                startDate = new Date(selected.date.valueOf());\n");
      out.write("                startDate.setDate(startDate.getDate(new Date(selected.date.valueOf())));\n");
      out.write("                $('#dpd2').datepicker('setStartDate', startDate);\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#dpd2').datepicker({\n");
      out.write("                autoclose: true,\n");
      out.write("                format: 'dd MM yyyy',\n");
      out.write("                todayBtn: \"linked\",\n");
      out.write("                clearBtn: true,\n");
      out.write("                todayHighlight: true,\n");
      out.write("                startDate: \"today\"\n");
      out.write("            }).on('changeDate', function (selected) {\n");
      out.write("                FromEndDate = new Date(selected.date.valueOf());\n");
      out.write("                FromEndDate.setDate(FromEndDate.getDate(new Date(selected.date.valueOf())));\n");
      out.write("                $('#dpd1').datepicker('setEndDate', FromEndDate);\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
