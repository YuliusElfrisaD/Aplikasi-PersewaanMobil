<%-- 
    Document   : EditMobil
    Created on : Dec 10, 2017, 11:28:28 AM
    Author     : Asus a455l
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Mobil"%>
<%@page import="Controller.Kontrol_Mobil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>4 Sekawan Car Rental</title>
        <link rel="icon" href="../Bahan/Gambar/Logo 4SEKAWAN.png" type="image/x-icon">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="../Bahan/cssku/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>

    </head>
    <body>
        <jsp:include page="../WEB-INF/headerStaffLogined.jsp"/>
        <p class="text-center" style="font-size: x-large; font-family: sans-serif;">Edit Data Mobil</p>
        <%
            Kontrol_Mobil k = new Kontrol_Mobil();
            ArrayList<Mobil> mobilList = k.tampilMobil();
            String id = null, nopolisi = null, nama = null, tipe = null,
                    warna = null, tglPajak = null, status = null;
            double harga = 0;

            for (int i = 0; i < mobilList.size(); i++) {
                id = mobilList.get(i).getIdKendaraan();
                nopolisi = mobilList.get(i).getNoPolisi();
                nama = mobilList.get(i).getNamaKendaraan();
                tipe = mobilList.get(i).getTipe();
                warna = mobilList.get(i).getWarna();
                tglPajak = mobilList.get(i).getTanggalPajak();
                harga = mobilList.get(i).getHarga();
                status = mobilList.get(i).getStatus();
            }%>   
        <div class="container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="row myborder">
                    <form action= "../UpdateMobil" method="POST">
                        <div class="row">
                            <div class="form-group">
                                <label for="example">ID Kendaran : <%=id%></label>
                            </div>
                            <div class="form-group">
                                <label for="example">Nama Kendaraan : <%=nama%></label>
                            </div>
                            <div class="form-group">
                                <label for="example">Tipe : <%=tipe%></label>
                            </div>
                            <div class="form-group">
                                <label for="example">Warna : <%=warna%></label>
                            </div>
                            <div class="form-group">
                                <label for="example">No Polisi :</label>
                                <input size="60" maxlength="255" class="form-control" value="<%=nopolisi%>" name="nopol"  type="text" style="border: 1px solid #6699ff !important; color:#000000 ">
                            </div>
                            <div class="form-group">
                                <label for="example">Tanggal Pajak :</label>
                                <input size="60" maxlength="255" class="form-control" value="<%=tglPajak%>" name="tglPajak"  type="text" style="border: 1px solid #6699ff !important; color:#000000 ">
                            </div>
                            <div class="form-group">
                                <label for="example">Harga : </label>
                                <input size="60" maxlength="255" class="form-control" value="<%=harga%>" name="harga"  type="text" style="border: 1px solid #6699ff !important; color:#000000 ">
                            </div>
                            <div class="form-group">
                                <label for="example">Status Mobil :</label>
                                <select class="form-control" value="<%=status%>" name="status" style="border: 1px solid #6699ff !important;">
                                    <option>BOOKED</option>
                                    <option>AVAILABLE</option>
                                </select><br>
                            </div>
                            <div class="form-group">
                                <button class="btn-u pull-left btn-primary" type="submit" name="parameter2" value="<%=id%>">UPDATE</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-2"></div>
            </div>
        </div>




    </body>
</html>
