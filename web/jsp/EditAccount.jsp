<%-- 
    Document   : EditAccount
    Created on : Dec 9, 2017, 6:39:37 PM
    Author     : Asus a455l
--%>

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
                        <a class="navbar-brand" href="index.jsp">
                            <img src="../images/Logo.png" width="250" height="80" alt="logo">
                        </a>
                    </div>
                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="#myPage">HOME</a></li>
                            <li><a href="#band">CARS</a></li>
                            <li><a href="#tour">RENT</a></li>
                            <li><a href="#contact">CONTACT</a></li>
                            <li><a href="CreateAccount.jsp"><span class="glyphicon glyphicon-user"></span> Daftar</a></li>
                            <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <br>
        <br>

        <%
            Kontrol_Customer kc = new Kontrol_Customer();
            String idCust = (String) session.getAttribute("idCust");
            kc.getByIdCustomer(idCust);
            ArrayList<Customer> custList = kc.getByIdCustomer(idCust);
            String id = null;
            String nama = null;
            String email = null;
            String alamat = null;
            String notelp = null;
            String username = null;
            String password = null;

            for (int i = 0; i < custList.size(); i++) {
                id = custList.get(i).getIdCustomer();
                nama = custList.get(i).getNama();
                email = custList.get(i).getEmail();
                alamat = custList.get(i).getAlamat();
                notelp = custList.get(i).getNoTelp();
                username = custList.get(i).getUsername();
                password = custList.get(i).getPassword();
            }%> 
        <div class="container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="row myborder">
                    <h4 style="color: #3766ab; margin: initial; margin-bottom: 10px;">Edit Account</h4><hr>
                    <form method="POST" action= "../EditAccount">
                        <div class="input-group margin-bottom-20"> 
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user" style=" color: #6699ff;"></i></span>
                            <input size="60" maxlength="255" class="form-control" placeholder="Masukkan nama" name="nama" type="text" value="<%=nama%>" style="border: 1px solid #6699ff !important; color:#000000 "></div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-envelope" style=" color: #6699ff;"></i></span>
                            <input size="60" maxlength="255" class="form-control" placeholder="Masukkan email" name="email" type="text" value="<%=email%>" style="border: 1px solid #6699ff !important; color:#000000 "></div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-home" style=" color: #6699ff;"></i></span>
                            <input size="60" maxlength="255" class="form-control" placeholder="Masukkan alamat" name="alamat" type="text" value="<%=alamat%>" style="border: 1px solid #6699ff !important; color:#000000 "></div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-phone" style=" color: #6699ff;"></i></span>
                            <input size="60" maxlength="255" class="form-control" placeholder="Masukkan notelp" name="notelp"  type="text" value="<%=notelp%>" style="border: 1px solid #6699ff !important; color:#000000 "></div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-log-in" style=" color: #6699ff;"></i></span>
                            <input size="60" maxlength="255" class="form-control" placeholder="Masukkan username" name="username"  type="text" value="<%=username%>" style="border: 1px solid #6699ff !important; color:#000000 "></div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock" style=" color: #6699ff;"></i></span>
                            <input size="60" maxlength="255" class="form-control" placeholder="Masukkan password" name="password" type="password" value="<%=password%>" style="border: 1px solid #6699ff !important; color:#000000 "></div>
                        <div class="row">
                            <div class="col-md-12">
                                <button class="btn-u pull-left btn-primary" type="submit" name="parameter2" value="<%=idCust%>">Update</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-2"></div>
            </div>
        </div>

        <br>
        <br>
        <footer class="text-center">
            <p>Copyright © 2017 RPL Kelompok 4</p>
            <p>
                Asih Sulistyani     (155314002) |
                Osmond Giovanni I   (155314024) |
                Agenda Yudha S      (155314025) |
                Yulius Elfrisa D    (155314040)
            </p>
        </footer>
    </body>
</html>
