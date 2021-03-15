<%-- 
    Document   : header
    Created on : Nov 30, 2017, 11:11:23 AM
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
                padding-right: 50px !important;
                font-size: 18px !important;
                text-decoration: none;
            }
            #login-dp{
                min-width: 250px;
                padding: 14px 14px 0;
                overflow:hidden;
                background-color:rgba(255,255,255,8);
            }
            #login-dp .help-block{
                font-size:12px    
            }
            #login-dp .bottom{
                background-color:rgba(255,255,255,8);
                border-top:1px solid #ddd;
                clear:both;
                padding:14px;
            }
            #login-dp .form-group {
                margin-bottom: 10px;
            }
            @media(max-width:768px){
                #login-dp{
                    background-color: inherit;
                    color: #fff;
                }
                #login-dp .bottom{
                    background-color: inherit;
                    border-top:0 none;
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
                            <li><a href="index.jsp">HOME</a></li>
                            <li><a href="../jsp/Cars.jsp">CARS</a></li>
                            <li><a href="index.jsp#Rent">RENT</a></li>
                            <li><a href="contact.jsp">CONTACT</a></li>
                            <li><a href="CreateAccount.jsp"><span class="glyphicon glyphicon-user"></span> Daftar</a></li>
                            <li>
                                <button type="button" class="btn btn-link" id="login" data-toggle="dropdown"><span class="glyphicon glyphicon-log-in"></span> Login <span class="caret"></span></button>
                                <ul class="dropdown-menu" role="menu" aria-labelledby="menu1" id="login-dp">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <form action="../Login" method="POST">
                                                <div class="form-group">
                                                    <label>Username</label>
                                                    <input type="text" class="form-control" name="username" placeholder="Masukkan username..." required>
                                                </div>
                                                <div class="form-group">
                                                    <label>Password</label>
                                                    <input type="password" class="form-control" name="password" placeholder="Masukkan password..." required>
                                                    <div class="help-block text-right">
                                                        <jsp:useBean id="Message" class="Model.Message" scope="request" />
                                                        <span style="color: red">
                                                            <jsp:getProperty name="Message" property="pesan"/>
                                                        </span>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <button type="submit" class="btn btn-primary btn-block">MASUK</button>
                                                </div>
                                            </form>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox"> keep me logged-in
                                                </label>
                                            </div>

                                            <%try {
                                                    session = request.getSession(true);
                                                    if (session.getAttribute("username") == null) {%>

                                            <% } else if (request.getParameter("error").equals("y")) {%>


                                            <h5 style="color: #cc0000; margin: initial; margin-bottom: 10px;">Username dan password anda salah</h5><hr>
                                            <%}%>
                                            <% } catch (Exception ex) {
                                                }
                                            %>
                                        </div>
                                        <div class="bottom text-center">
                                            Belum daftar ? <a href="../jsp/CreateAccount.jsp"><b>Daftar</b></a>
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
