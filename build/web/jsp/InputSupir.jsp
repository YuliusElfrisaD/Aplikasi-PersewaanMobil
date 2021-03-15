<%-- 
    Document   : InputSupir
    Created on : Oct 30, 2017, 6:03:07 PM
    Author     : Asus a455l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>4 Sekawan Car Rental</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" href="../Bahan/Gambar/Logo 4SEKAWAN.png" type="image/x-icon">
        <link rel="stylesheet" type="text/css" href="../Bahan/cssku/style.css">
        <link rel="stylesheet" type="text/css" href="../Bahan/cssku/signupcss.css">
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
        <p class="text-center" style="font-size: x-large; font-family: sans-serif; font: bold">Input Supir</p>

        <div class="container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="row myborder">
                    <h4 style="color: #3d5b99; margin: initial; margin-bottom: 10px;">Form data supir</h4><hr>
                    <form action= "../InputSupir" method="GET">
                        <div>
                            <label>Masukkan Nama :</label>
                        </div>
                        <div class="input-group margin-bottom-20"> 
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user" style=" color: #3d5b99;"></i></span>
                            <input size="60" maxlength="255" class="form-control" placeholder="Nama..." name="nama" type="text" style="border: 1px solid #3d5b99!important; color:#000000 "></div>
                        <div>
                            <label>Masukkan Alamat :</label>
                        </div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-home" style=" color: #3d5b99;"></i></span>
                            <input size="60" maxlength="255" class="form-control" placeholder="Alamat..." name="alamat" type="text" style="border: 1px solid #3d5b99!important; color:#000000 "></div>
                        <div>
                            <label>Masukkan No. Telp :</label>
                        </div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-phone" style=" color: #3d5b99;"></i></span>
                            <input size="60" maxlength="255" class="form-control" placeholder="No Telp..." name="notelp" type="text" style="border: 1px solid #3d5b99!important; color:#000000 "></div>
                        <div class="row">
                            <div class="col-md-12">
                                <button class="btn-u pull-left btn-primary" type="submit">Daftar Sekarang</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-2"></div>
            </div>
        </div>

    </body>
</html>
