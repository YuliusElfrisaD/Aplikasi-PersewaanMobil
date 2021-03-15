<%-- 
    Document   : headerLogined
    Created on : Nov 30, 2017, 11:11:39 AM
    Author     : Asus a455l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        </style>
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
                            <img src="../Bahan/Gambar/Logo.png" width="250" height="80" alt="logo" style="position: absolute">
                        </a>
                    </div>
                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="../jsp/index.jsp">HOME</a></li>
                            <li><a href="../jsp/Cars.jsp">CARS</a></li>
                            <li><a href="../jsp/index.jsp#Rent">RENT</a></li>
                            <li><a href="../jsp/contact.jsp">CONTACT</a></li>
                            <li>
                                <%
                                    String user = (String) session.getAttribute("username");
                                %>
                                <button type="button" class="btn btn-link" id="login" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> Loggged as <%= user%><span class="caret"></span></button>
                                <ul class="dropdown-menu" role="menu" aria-labelledby="menu1" id="login-dp">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <button style="text-decoration: none;" class="btn btn-link btn-block"  data-toggle="tooltip" title="Logout">
                                                    <a href="../jsp/EditAccount.jsp"><span class="glyphicon glyphicon-user" ></span> Ubah data pribadi</a>
                                                </button>
                                            </div>
                                            <div class="form-group">
                                                <button style="text-decoration: none;" class="btn btn-link btn-block"  data-toggle="tooltip" title="Logout">
                                                    <a href="../jsp/LihatPesanan.jsp""><span class="glyphicon glyphicon-list" ></span> Lihat Pesanan</a>
                                                </button>
                                            </div>
                                            <div class="form-group">
                                                <button class="btn btn-danger btn-block" data-toggle="tooltip" title="Logout">
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
