<%-- 
    Document   : EditSupir
    Created on : Dec 9, 2017, 4:22:19 PM
    Author     : Asus a455l
--%>

<%@page import="Model.Mobil"%>
<%@page import="Controller.Kontrol_Mobil"%>
<%@page import="Model.Supir"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controller.Kontrol_Supir"%>
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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
    </head>
    <body>
        <jsp:include page="../WEB-INF/headerStaffLogined.jsp"/>
        <p class="text-center" style="font-size: x-large; font-family: sans-serif; font: bold">Update Supir</p>
        <%
            Kontrol_Supir k = new Kontrol_Supir();
            ArrayList<Supir> supirList = k.tampilSupir();
            String id = null, nama = null, alamat = null, noTelp = null;

            for (int i = 0; i < supirList.size(); i++) {
                id = supirList.get(i).getIdSupir();
                nama = supirList.get(i).getNamaSupir();
                alamat = supirList.get(i).getAlamatSupir();
                noTelp = supirList.get(i).getNotelpSupir();
         }%>
        <div class="container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="row myborder">
                    <form action= "../UpdateSupir" method="POST">
                        <div>
                            <label>Masukkan Nama :</label>
                        </div>
                        <div class="input-group margin-bottom-20"> 
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user" style=" color: #3d5b99;"></i></span>
                            <input size="60" maxlength="255" class="form-control" value="<%=nama%>" placeholder="Nama..." name="nama" type="text" style="border: 1px solid #3d5b99!important; color:#000000 "></div>
                        <div>
                            <label>Masukkan Alamat :</label>
                        </div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-home" style=" color: #3d5b99;"></i></span>
                            <input size="60" maxlength="255" class="form-control" value="<%=alamat%>" placeholder="Alamat..." name="alamat" type="text" style="border: 1px solid #3d5b99!important; color:#000000 "></div>
                        <div>
                            <label>Masukkan No. Telp :</label>
                        </div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-phone" style=" color: #3d5b99;"></i></span>
                            <input size="60" maxlength="255" class="form-control" value="<%=noTelp%> " placeholder="No Telp..." name="notelp" type="text" style="border: 1px solid #3d5b99!important; color:#000000 "></div>
                        <div class="row">
                            <div class="col-md-12">
                                <button class="btn-u pull-left btn-primary" type="submit" name="parameter2" value="<%=id%>">Update Data</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-2"></div>
            </div>
        </div>


    </body>
</html>
