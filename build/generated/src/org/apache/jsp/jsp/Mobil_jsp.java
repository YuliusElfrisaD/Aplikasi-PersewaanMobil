package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.Mobil;
import Controller.Kontrol_Mobil;

public final class Mobil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.shieldui.com/shared/components/latest/css/light/all.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/Content/font-awesome/css/font-awesome.min.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jspdf.js\"></script>  \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://www.shieldui.com/shared/components/latest/js/jszip.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.5/jspdf.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                var doc = new jsPDF();\n");
      out.write("                var specialElementHandlers = {\n");
      out.write("                    '#editor': function (element, renderer) {\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                $('#cmd').click(function () {\n");
      out.write("\n");
      out.write("                    var table = tableToJson($('#StudentInfoListTable').get(0))\n");
      out.write("                    var doc = new jsPDF('p', 'pt', 'a4', true);\n");
      out.write("                    doc.cellInitialize();\n");
      out.write("                    $.each(table, function (i, row) {\n");
      out.write("                        console.debug(row);\n");
      out.write("                        $.each(row, function (j, cell) {\n");
      out.write("                            doc.cell(10, 50, 120, 50, cell, i);  // 2nd parameter=top margin,1st=left margin 3rd=row cell width 4th=Row height\n");
      out.write("                        })\n");
      out.write("                    })\n");
      out.write("\n");
      out.write("\n");
      out.write("                    doc.save('sample-file.pdf');\n");
      out.write("                });\n");
      out.write("                function tableToJson(table) {\n");
      out.write("                    var data = [];\n");
      out.write("\n");
      out.write("                    // first row needs to be headers\n");
      out.write("                    var headers = [];\n");
      out.write("                    for (var i = 0; i < table.rows[0].cells.length; i++) {\n");
      out.write("                        headers[i] = table.rows[0].cells[i].innerHTML.toLowerCase().replace(/ /gi, '');\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("                    // go through cells\n");
      out.write("                    for (var i = 0; i < table.rows.length; i++) {\n");
      out.write("\n");
      out.write("                        var tableRow = table.rows[i];\n");
      out.write("                        var rowData = {};\n");
      out.write("\n");
      out.write("                        for (var j = 0; j < tableRow.cells.length; j++) {\n");
      out.write("\n");
      out.write("                            rowData[ headers[j] ] = tableRow.cells[j].innerHTML;\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        data.push(rowData);\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    return data;\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            HttpSession username = request.getSession();
            if (username.getAttribute("username").equals("bos")) {
        
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../WEB-INF/headerPemilikLogined.jsp", out, false);
      out.write("    \n");
      out.write("        ");
} else { 
      out.write("            \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../WEB-INF/headerStaffLogined.jsp", out, false);
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        <p class=\"text-center\" style=\"font-size: x-large; font-family: sans-serif; font: bold\">Daftar Mobil</p>\n");
      out.write("        <div class=\"form-group\" style=\"padding-top: 32px\">\n");
      out.write("            <div class=\"btn-sm\">\n");
      out.write("                <button id=\"exportButton\" class=\"btn btn-lg btn-danger clearfix\"><span class=\"glyphicon glyphicon-file\" style=\"color: #ffffff\"></span>Export to PDF</button>            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <table id=\"exportTable\" class=\"table table-hover table-striped \" > \n");
      out.write("            <thead style=\"background: #3766ab ; color: #ffffff\" >\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\" >No.</th>\n");
      out.write("                    <th scope=\"col\">ID Kendaraan</th>\n");
      out.write("                    <th scope=\"col\">No. Polisi</th>\n");
      out.write("                    <th scope=\"col\">Nama Kendaran</th>\n");
      out.write("                    <th scope=\"col\">Tipe</th>\n");
      out.write("                    <th scope=\"col\">Warna</th>\n");
      out.write("                    <th scope=\"col\">Tanggal Pajak</th>\n");
      out.write("                    <th scope=\"col\">Harga</th>\n");
      out.write("                    <th scope=\"col\">Status</th>\n");
      out.write("                    <th scope=\"col\" class=\"text-center\">Gambar</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
Kontrol_Mobil m = new Kontrol_Mobil();
                    Mobil s = new Mobil();
                    ArrayList<Mobil> mobilList = m.tampilMobil();
                    try {

                        for (int i = 0; i < mobilList.size(); i++) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">");
      out.print(i + 1);
      out.write("</th>\n");
      out.write("                    <td>");
      out.print(mobilList.get(i).getIdKendaraan());
      out.write("</td>\n");
      out.write("                    <td id=\"nopol\">");
      out.print(mobilList.get(i).getNoPolisi());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(mobilList.get(i).getNamaKendaraan());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(mobilList.get(i).getTipe());
      out.write("</td>\n");
      out.write("                    <td  style=\"text-align: left\" > ");
      out.print(mobilList.get(i).getWarna());
      out.write(" </td>\n");
      out.write("                    <td style=\"text-align: left\"> ");
      out.print(mobilList.get(i).getTanggalPajak());
      out.write(" </td>\n");
      out.write("                    <td style=\"text-align: left\"> ");
      out.print(mobilList.get(i).getHarga());
      out.write(" </td>\n");
      out.write("                    <td style=\"text-align: left\"> ");
      out.print(mobilList.get(i).getStatus());
      out.write(" </td>\n");
      out.write("                    <td style=\"text-align: left\"><img src=\"../Bahan/Mobil/");
      out.print(mobilList.get(i).getGambar());
      out.write("\" width=\"180\" height=\"100\"</td>\n");
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
      out.write("        </table>  \n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(function ($) {\n");
      out.write("                $(\"#exportButton\").click(function () {\n");
      out.write("                    // parse the HTML table element having an id=exportTable\n");
      out.write("                    var dataSource = shield.DataSource.create({\n");
      out.write("                        data: \"#exportTable\",\n");
      out.write("                        schema: {\n");
      out.write("                            type: \"table\",\n");
      out.write("                            fields: {\n");
      out.write("                                no: {type: String},\n");
      out.write("                                idKendaraan: {type: String},\n");
      out.write("                                nopol: {type: String},\n");
      out.write("                                nama: {type: String},\n");
      out.write("                                tipe: {type: String},\n");
      out.write("                                warna: {type: String},\n");
      out.write("                                tanggalpajak: {type: String},\n");
      out.write("                                harga: {type: String},\n");
      out.write("                                status: {type: String},\n");
      out.write("                                gambar: {type: String}\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    // when parsing is done, export the data to PDF\n");
      out.write("                    dataSource.read().then(function (data) {\n");
      out.write("                        var pdf = new shield.exp.PDFDocument({\n");
      out.write("                            author: \"PrepBootstrap\",\n");
      out.write("                            created: new Date()\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                        pdf.addPage(\"a4\", \"landscape\");\n");
      out.write("\n");
      out.write("                        pdf.table(\n");
      out.write("                                10,\n");
      out.write("                                50,\n");
      out.write("                                data,\n");
      out.write("                                [\n");
      out.write("                                    {field: \"no\", title: \"No\", width: 30},\n");
      out.write("                                    {field: \"idKendaraan\", title: \"ID Kendaraan\", width: 80},\n");
      out.write("                                    {field: \"nopol\", title: \"No Polisi\", width: 70},\n");
      out.write("                                    {field: \"nama\", title: \"Nama\", width: 100},\n");
      out.write("                                    {field: \"tipe\", title: \"Tipe\", width: 50},\n");
      out.write("                                    {field: \"warna\", title: \"Warna\", width: 70},\n");
      out.write("                                    {field: \"tanggalpajak\", title: \"Tanggal Pajak\", width: 100},\n");
      out.write("                                    {field: \"harga\", title: \"Harga\", width: 90},\n");
      out.write("                                    {field: \"status\", title: \"Status\", width: 90},\n");
      out.write("                                    {field: \"gambar\", title: \"Gambar\", width: 100}\n");
      out.write("                                ],\n");
      out.write("                                {\n");
      out.write("                                    margins: {\n");
      out.write("                                        top: 50,\n");
      out.write("                                        left: 25,\n");
      out.write("\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                        );\n");
      out.write("\n");
      out.write("                        pdf.saveAs({\n");
      out.write("                            fileName: \"Data Mobil Terbaru\"\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            #exportButton {\n");
      out.write("                border-radius: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
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
