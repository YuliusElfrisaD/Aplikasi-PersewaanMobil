<%-- 
    Document   : IsiData
    Created on : Dec 9, 2017, 11:59:41 AM
    Author     : user
--%>

<%@page import="Model.Mobil"%>
<%@page import="Controller.Kontrol_Mobil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Customer"%>
<%@page import="Controller.Kontrol_Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>4 Sekawan Car Rental</title>
        <link rel="icon" href="../Bahan/Gambar/Logo 4SEKAWAN.png" type="image/x-icon">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="jquery.downCount.js"></script>
        <style>
            body{
                text-align: center;
            }
            .navbar {
                min-height:110px !important;
            }

            .navbar-nav > li {
                padding-top:40px !important; 
                padding-bottom:30px !important;
                padding-right: 50px !important;
                font-size: 18px !important;
            }
        </style>
    </head>
    <body>
    <body>
        <header>    
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#myPage">
                            <img src="../images/Logo.png" width="250" height="80" alt="logo" style="position: absolute">
                        </a>
                    </div>
                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav navbar-right">
                            <li style="color: #0073a4">1. Isi Data</li>
                            <li style="color: #999999">2. Review</li>
                            <li style="color: #999999">3. Pembayaran</li>
                            <li style="color: #999999">4. E-ticket Terbit</li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>


        <form>
            <%
                String id = (String) session.getAttribute("transaksi");
                String customer = (String) session.getAttribute("idCust");
                String mobil = (String) session.getAttribute("mobil");
                String supir = (String) session.getAttribute("supir");
                String tglpinjam = (String) session.getAttribute("tglPinjam");
                String tglkembali = (String) session.getAttribute("tglKembali");
                String jampinjam = (String) session.getAttribute("jamPinjam");
                String jamkembali = (String) session.getAttribute("jamKembali");
                String menitpinjam = (String) session.getAttribute("menitPinjam");
                String menitkembali = (String) session.getAttribute("menitKembali");

                Kontrol_Customer kc = new Kontrol_Customer();
                kc.getByIdCustomer(customer);
                ArrayList<Customer> custList = kc.getByIdCustomer(customer);
                String namaCust = null;
                String alamatCust = null;
                String emailCust = null;
                String notelpCust = null;

                for (int i = 0; i < custList.size(); i++) {
                    namaCust = custList.get(i).getNama();
                    emailCust = custList.get(i).getEmail();
                    alamatCust = custList.get(i).getAlamat();
                    notelpCust = custList.get(i).getNoTelp();
                }
                
                Kontrol_Mobil m = new Kontrol_Mobil();
                m.getByIdMobil(mobil);
                ArrayList<Mobil> mobilList = m.getByIdMobil(mobil);
                String namaMobil = null;
                String gambarMobil = null;
                
                for (int i = 0; i < mobilList.size(); i++) {  
                    namaMobil = mobilList.get(i).getNamaKendaraan();
                    gambarMobil = mobilList.get(i).getGambar();
                }
            %>
            <div class="container well" style="background-color: #0060e9;color: white;">
                <h1>Pemesanan</h1>
            </div>

            <div class="container" id="batasWaktu">
                <div class="container">
                    <div class="row" style="text-align: left;">
                        <div class="col-lg-8">
                            <div class="well">
                                <h4 style="color: #0060e9">Data Pemesan yang Dapat Dihubungi</h4><br/>
                                <div class="form-group">
                                    <label for="usr">Nama kontak</label>
                                    <input type="text" class="form-control" id="usr" value="<%=namaCust%>">
                                </div>
                                <div class="row">
                                    <div class="form-group col-sm-6">
                                        <label for="usr">No. handphone kontak</label>
                                        <input type="text" class="form-control" id="usr" value="<%=notelpCust%>">
                                    </div>
                                    <div class="form-group col-sm-6">
                                        <label for="usr">Alamat email kontak</label>
                                        <input type="text" class="form-control" id="usr" value="<%=emailCust%>">
                                    </div>                                    
                                </div>
                                <div class="form-group">
                                    <label for="usr">Alamat pengiriman</label>
                                    <textarea class="form-control" rows="5" id="alamat"><%=alamatCust%></textarea>
                                </div>
                                <div class="row"><div class="form-group col-sm-6"></div>
                                    <div class="form-group col-sm-6">
                                        <button type="button" class="btn btn-warning btn-lg btn-block" id="booking">
                                            <a href="Review.jsp" style="text-decoration: none; color: white;">Lanjutkan</a>
                                        </button>
                                    </div>                                    
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 well">
                            <div class="row">
                                <div class="col-xs-6"><span class="pull-right">
                                        <img src="../Bahan/Mobil/<%=gambarMobil%>" width="80" height="50"></span>
                                </div>
                                <div class="col-xs-6">
                                    <p style="padding-top: 18px"><b><%=namaMobil%></b></p>
                                </div>
                            </div><br>
                            <div class="row">
                                <div class="form-group col-md-6" style="text-align: center;">
                                    <label for="jamPinjam">Tanggal pinjam</label><br><br>
                                    <p id="jamPinjam"><%=tglpinjam%></p>
                                    <p id="jamPinjam"><%=jampinjam%>:<%=menitpinjam%></p>
                                </div>
                                <div class="form-group col-md-6" style="text-align: center;">
                                    <label for="jamPinjam">Tanggal kembali</label><br><br>
                                    <p id="jamPinjam"><%=tglkembali%></p>
                                    <p id="jamPinjam"><%=jamkembali%>:<%=menitkembali%></p>
                                </div>
                            </div>
                            <div style="text-align: center;">
                                <label for="jamPinjam">Dengan supir: </label><br><br>
                                <p id="jamPinjam"><%=supir%></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
