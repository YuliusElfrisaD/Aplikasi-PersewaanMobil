<%-- 
    Document   : Mobil
    Created on : Nov 3, 2017, 11:05:56 PM
    Author     : Asus a455l
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Mobil"%>
<%@page import="Controller.Kontrol_Mobil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="icon" href="../Bahan/Gambar/Logo 4SEKAWAN.png" type="image/x-icon">
        <link rel="stylesheet" href="../Bahan/css/style.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />
        <link rel="stylesheet" type="text/css" href="http://www.shieldui.com/shared/components/latest/css/light/all.min.css" />
        <link rel="stylesheet" type="text/css" href="/Content/font-awesome/css/font-awesome.min.css" />
        <script type="text/javascript" src="js/jspdf.js"></script>  
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
        <script type="text/javascript" src="http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js"></script>
        <script type="text/javascript" src="http://www.shieldui.com/shared/components/latest/js/jszip.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.5/jspdf.min.js"></script>


    </head>
    <body>
        <%
            HttpSession username = request.getSession();
            if (username.getAttribute("username").equals("bos")) {
        %>        
        <jsp:include page="../WEB-INF/headerPemilikLogined.jsp"/>    
        <%} else { %>            
        <jsp:include page="../WEB-INF/headerStaffLogined.jsp"/>
        <%}%>

        <p class="text-center" style="font-size: x-large; font-family: sans-serif; font: bold">Daftar Mobil</p>
        <div class="form-group" style="padding-top: 32px">
            <div class="btn-sm">
                <button id="exportButton" class="btn btn-lg btn-danger clearfix"><span class="glyphicon glyphicon-file" style="color: #ffffff"></span>Export to PDF</button>            </div>
        </div>

        <table id="exportTable" class="table table-hover table-striped " > 
            <thead style="background: #3766ab ; color: #ffffff" >
                <tr>
                    <th scope="col" >No.</th>
                    <th scope="col">ID Kendaraan</th>
                    <th scope="col">No. Polisi</th>
                    <th scope="col">Nama Kendaran</th>
                    <th scope="col">Tipe</th>
                    <th scope="col">Warna</th>
                    <th scope="col">Tanggal Pajak</th>
                    <th scope="col">Harga</th>
                    <th scope="col">Status</th>
                    <th scope="col" class="text-center">Gambar</th>
                    <th scope="col"></th>
                </tr>
            </thead>
            <tbody>
                <%Kontrol_Mobil m = new Kontrol_Mobil();
                    Mobil s = new Mobil();
                    ArrayList<Mobil> mobilList = m.tampilMobil();
                    try {

                        for (int i = 0; i < mobilList.size(); i++) {
                %>
                <tr>
                    <th scope="row"><%=i + 1%></th>
                    <td><%=mobilList.get(i).getIdKendaraan()%></td>
                    <td ><%=mobilList.get(i).getNoPolisi()%></td>
                    <td><%=mobilList.get(i).getNamaKendaraan()%></td>
                    <td><%=mobilList.get(i).getTipe()%></td>
                    <td  style="text-align: left" > <%=mobilList.get(i).getWarna()%> </td>
                    <td style="text-align: left"> <%=mobilList.get(i).getTanggalPajak()%> </td>
                    <td style="text-align: left"> <%=mobilList.get(i).getHarga()%> </td>
                    <td style="text-align: left"> <%=mobilList.get(i).getStatus()%> </td>
                    <td style="text-align: left"><img src="../Bahan/Mobil/<%=mobilList.get(i).getGambar()%>" width="180" height="100"</td>
                    <td class="actions">
                        <form action="../HapusMobil">
                            <button class="btn btn-danger btn-sm" type="submit" name="hapusMobil" data-toggle="tooltip" title="Hapus supir"
                                    value="<%=mobilList.get(i).getIdKendaraan()%>"><i class="glyphicon glyphicon-trash"></i></button><br><br>								
                        </form>
                        <form action="../UpdateMobil" method="get">
                            <button class="btn btn-success btn-sm" type="submit" name="updateMobil" data-toggle="tooltip" title="Update supir"
                                    value="<%=mobilList.get(i).getIdKendaraan()%>"><i class="glyphicon glyphicon-pencil"></i></button>								
                        </form>
                    </td>
                </tr>
            </tbody>


            <%}
                } catch (Exception ex) {
                    ex.getMessage();
                }
            %>
        </table>  

        <script type="text/javascript">
            jQuery(function ($) {
                $("#exportButton").click(function () {
                    // parse the HTML table element having an id=exportTable
                    var dataSource = shield.DataSource.create({
                        data: "#exportTable",
                        schema: {
                            type: "table",
                            fields: {
                                no: {type: String},
                                idKendaraan: {type: String},
                                nopol: {type: String},
                                nama: {type: String},
                                tipe: {type: String},
                                warna: {type: String},
                                tanggalpajak: {type: String},
                                harga: {type: String},
                                status: {type: String},
                                gambar: {type: String}
                            }
                        }
                    });

                    // when parsing is done, export the data to PDF
                    dataSource.read().then(function (data) {
                        var pdf = new shield.exp.PDFDocument({
                            author: "PrepBootstrap",
                            created: new Date()
                        });

                        pdf.addPage("a4", "landscape");

                        pdf.table(
                                10,
                                50,
                                data,
                                [
                                    {field: "no", title: "No", width: 30},
                                    {field: "idKendaraan", title: "ID Kendaraan", width: 80},
                                    {field: "nopol", title: "No Polisi", width: 70},
                                    {field: "nama", title: "Nama", width: 100},
                                    {field: "tipe", title: "Tipe", width: 50},
                                    {field: "warna", title: "Warna", width: 70},
                                    {field: "tanggalpajak", title: "Tanggal Pajak", width: 100},
                                    {field: "harga", title: "Harga", width: 90},
                                    {field: "status", title: "Status", width: 90},
                                    {field: "gambar", title: "Gambar", width: 100}
                                ],
                                {
                                    margins: {
                                        top: 50,
                                        left: 25,

                                    }
                                }
                        );

                        pdf.saveAs({
                            fileName: "Data Mobil Terbaru"
                        });
                    });
                });
            });


        </script>

        <style>
            #exportButton {
                border-radius: 0;
            }
        </style>
    </body>
</html>
