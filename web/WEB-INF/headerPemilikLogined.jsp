<%-- 
    Document   : headerStaffLogined
    Created on : Dec 3, 2017, 1:18:08 PM
    Author     : Asus a455l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            #login {
                padding-top:40px !important; 
                padding-bottom:30px !important;
                font-size: 18px !important;
                text-decoration: none;
            }
            #login-dp{
                min-width: 250px;
                padding: 14px 14px 0;
                overflow:hidden;
                background-color:rgba(255,255,255,8);
            }            
            @media(max-width:768px){
                #login-dp{
                    background-color: inherit;
                    color: #fff;
                }
            }
            .dropdown-menu .sub-menu {
                left: 100%;
                position: absolute;
                top: 0;
                visibility: hidden;
                margin-top: -1px;
            }

            .dropdown-menu li:hover .sub-menu {
                visibility: visible;
            }

            .dropdown:hover .dropdown-menu {
                display: block;
            }

            .nav-tabs .dropdown-menu,
            .nav-pills .dropdown-menu,
            .navbar .dropdown-menu {
                margin-top: 0;
            }

            .navbar .sub-menu:before {
                border-bottom: 7px solid transparent;
                border-left: none;
                border-right: 7px solid rgba(0, 0, 0, 0.2);
                border-top: 7px solid transparent;
                left: -7px;
                top: 10px;
            }

            .navbar .sub-menu:after {
                border-top: 6px solid transparent;
                border-left: none;
                border-right: 6px solid #fff;
                border-bottom: 6px solid transparent;
                left: 10px;
                top: 11px;
                left: -6px;
            }
        </style>
    </style>
</head>
<body>
    <header>    
        <nav class="navbar navbar-inverse" >
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="">
                        <img src="../images/Logo staff.png" width="250" height="80" alt="logo" style="position: absolute">
                    </a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">HOME</a></li>
                        <li class="dropdown">
                            <a href="#" data-toggle="dropdown" class="dropdown-toggle">VIEW<b class="caret"></b></a>
                            <ul class="dropdown-menu" id="menu1">
                                <li><a href="../jsp/Mobil.jsp">View Mobil</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" data-toggle="dropdown" class="dropdown-toggle">LAPORAN<b class="caret"></b></a>
                            <ul class="dropdown-menu" id="menu1">
                                <li><a href="../jsp/Persewaan.jsp">Data Persewaan</a></li>
                                <li><a href="../jsp/RekapKeuangan.jsp">Data Rekap Keuangan</a></li>
                            </ul>
                        </li>
                         <%
                                    String user = (String) session.getAttribute("username");
                                %>
                        <li>
                            <button type="button" class="btn btn-link" id="login" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> Loggged as <%= user%> <span class="caret"></span></button>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="menu1" id="login-dp">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <button type="submit"  class="btn btn-danger btn-block" title="Logout"> 
                                                <a href="../Logout" style="color: white !important; text-decoration: none;"><span class="glyphicon glyphicon-log-out"></span> LOGOUT</a> 
                                             </button>
                                        </div>
                                    </div>
                                </div>    
                            </ul>
                        </li>
                    </ul>                   
                </div>
            </div>
        </nav>
    </header>
</body>
</html>
