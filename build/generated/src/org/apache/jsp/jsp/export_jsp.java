package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class export_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>Export a Table to PDF Template | PrepBootstrap</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/css/bootstrap.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"font-awesome/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("<div class=\"page-header\">\n");
      out.write("    <h1>Export a Table to PDF <small>Export an HTML TABLE to PDF</small></h1>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Export a Table to PDF - START -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/Content/font-awesome/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <button id=\"exportButton\" class=\"btn btn-lg btn-danger clearfix\"><span class=\"fa fa-file-pdf-o\"></span> Export to PDF</button>\n");
      out.write("\n");
      out.write("    <table id=\"exportTable\" class=\"table table-hover\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Age</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>Sue Sharpe</td>\n");
      out.write("                <td>36</td>\n");
      out.write("                <td>suesharpe@mitroc.com</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nieves Hubbard</td>\n");
      out.write("                <td>45</td>\n");
      out.write("                <td>nieveshubbard@syntac.com</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Anastasia Underwood</td>\n");
      out.write("                <td>29</td>\n");
      out.write("                <td>anastasiaunderwood@gallaxia.com</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Maxine Haley</td>\n");
      out.write("                <td>32</td>\n");
      out.write("                <td>maxinehaley@songbird.com</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Bennett Alvarez</td>\n");
      out.write("                <td>44</td>\n");
      out.write("                <td>bennettalvarez@marvane.com</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Myrna Ellison</td>\n");
      out.write("                <td>30</td>\n");
      out.write("                <td>myrnaellison@zoxy.com</td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- you need to include the shieldui css and js assets in order for the components to work -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.shieldui.com/shared/components/latest/css/light/all.min.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"http://www.shieldui.com/shared/components/latest/js/jszip.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    jQuery(function ($) {\n");
      out.write("        $(\"#exportButton\").click(function () {\n");
      out.write("            // parse the HTML table element having an id=exportTable\n");
      out.write("            var dataSource = shield.DataSource.create({\n");
      out.write("                data: \"#exportTable\",\n");
      out.write("                schema: {\n");
      out.write("                    type: \"table\",\n");
      out.write("                    fields: {\n");
      out.write("                        Name: { type: String },\n");
      out.write("                        Age: { type: Number },\n");
      out.write("                        Email: { type: String }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            // when parsing is done, export the data to PDF\n");
      out.write("            dataSource.read().then(function (data) {\n");
      out.write("                var pdf = new shield.exp.PDFDocument({\n");
      out.write("                    author: \"PrepBootstrap\",\n");
      out.write("                    created: new Date()\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                pdf.addPage(\"a4\", \"portrait\");\n");
      out.write("\n");
      out.write("                pdf.table(\n");
      out.write("                    50,\n");
      out.write("                    50,\n");
      out.write("                    data,\n");
      out.write("                    [\n");
      out.write("                        { field: \"Name\", title: \"Person Name\", width: 200 },\n");
      out.write("                        { field: \"Age\", title: \"Age\", width: 50 },\n");
      out.write("                        { field: \"Email\", title: \"Email Address\", width: 200 }\n");
      out.write("                    ],\n");
      out.write("                    {\n");
      out.write("                        margins: {\n");
      out.write("                            top: 50,\n");
      out.write("                            left: 50\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                );\n");
      out.write("\n");
      out.write("                pdf.saveAs({\n");
      out.write("                    fileName: \"PrepBootstrapPDF\"\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    #exportButton {\n");
      out.write("        border-radius: 0;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!-- Export a Table to PDF - END -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
