<%@page import="Model.Persewaan"%>
<%@page import="Controller.Kontrol_Persewaan"%>
<%@page import="Model.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Mobil"%>
<%@page import="Controller.Kontrol_Mobil"%>
<%@page import="Controller.Kontrol_Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>4 Sekawan Car Rental</title>
        <link rel="icon" href="Pictures/apps.png" type="image/x-icon">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" href="../Bahan/Gambar/Logo 4SEKAWAN.png" type="image/x-icon">
        <link rel="stylesheet" href="../Bahan/css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="jquery.downCount.js"></script>
        <style>
            .container{
                text-align: center;
            }
        </style>
    </head>
    <body>       
        <jsp:include page="../WEB-INF/headerLogined.jsp"/>     

        <div class="container well" style="background-color: #0060e9;color: white;">
            <h1>Daftar Pesanan Anda</h1>
        </div>

        <%
            String customer = (String) session.getAttribute("idCust");
            String idMobil = null;

            Kontrol_Persewaan kp = new Kontrol_Persewaan();
            ArrayList<Persewaan> p = kp.lihatPesanan(customer);
            try {
                for (int i = 0; i < p.size(); i++) {
//                    idMobil = p.get(i).getM().getIdKendaraan();
                    Kontrol_Customer kc = new Kontrol_Customer();
                    kc.getByIdCustomer(customer);
                    ArrayList<Customer> custList = kc.getByIdCustomer(customer);
                    String namaCust = null;
                    for (int j = 0; j < custList.size(); j++) {
                        namaCust = custList.get(j).getNama();
                    }
                    
                    Kontrol_Mobil m = new Kontrol_Mobil();
                    Mobil s = new Mobil();
                    ArrayList<Mobil> mobilList = m.getByIdMobil(p.get(i).getM().getIdKendaraan());
                    String namaMobil = null;
                    String gambarMobil = null;
                    for (int j = 0; j < mobilList.size(); j++) {
                        gambarMobil = mobilList.get(j).getGambar();
                        namaMobil = mobilList.get(j).getNamaKendaraan();
                            
                    }
        %>


            <div class="container">
                <div class="row" style="text-align: left;">
                    <div class="col-lg-12">
                        <div class="well">
                            <div class="row">
                                <div class="col-sm-6 well">
                                    <label for="jamPinjam">ID Pesanan</label><br><br>
                                    <p id="jamPinjam"><%=p.get(i).getIdPersewaan()%></p>
                                </div>
                                <div class="col-sm-6 well">
                                    <label for="jamPinjam">Nama Peminjam</label><br><br>
                                    <p id="jamPinjam"><%=namaCust %></p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-6"><span class="pull-right">
                                        <img src="../Bahan/Mobil/<%=gambarMobil%>" width="80" height="50"></span>
                                </div>
                                <div class="col-xs-6">
                                    <p style="padding-top: 18px"><b><%=namaMobil %></b></p>
                                </div>
                            </div><br>
                            <div class="row">
                                <div class="form-group col-md-6" style="text-align: center;">
                                    <label for="jamPinjam">Tanggal pinjam</label><br><br>
                                    <p id="jamPinjam"><%=p.get(i).getTanggalPinjam()%></p>
                                </div>
                                <div class="form-group col-md-6" style="text-align: center;">
                                    <label for="jamPinjam">Tanggal kembali</label><br><br>
                                    <p id="jamPinjam"><%=p.get(i).getTanggalKembali()%></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <%}
                } catch (Exception ex) {
                    ex.getMessage();
                }
            %>
        </div>
        <jsp:include page="../WEB-INF/footer.jsp"/>
    </body>
</html>