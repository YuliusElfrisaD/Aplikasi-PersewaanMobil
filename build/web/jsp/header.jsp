<%-- 
    Document   : header
    Created on : Nov 4, 2017, 6:48:17 PM
    Author     : Asus a455l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../Bahan/CSS/header.css" rel="stylesheet" />
         <title>Rental Persewaan Mobil 4SEKAWAN</title>
         <link rel="shortcut icon" href="../Bahan/Gambar/LOGO tok.png"> 
    </head>
    <body>
        <header>    
            <h1> <a href="4SEKAWAN.jsp"> <img style="width: 79px" src="../Bahan/Gambar/HOME.png" > </a> </h1>
        </header>
         <nav class="navbar-inverse" role="navigation">
            <div class="container">
                <div class="navbar-header" >
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>

                    <a class="navbar-brand" href="4SEKAWAN.jsp" style="">
                        <img  src="assets/Images/LOGO tok.png" style="width: 100px;"> 
                    </a>
                </div>
                <!-- Collect the nav links for toggling -->
                <div class="collapse navbar-collapse navbar-ex1-collapse" >
                    <ul class="nav navbar-nav">
                        <li><a href="#home"></a>
                        </li>
                        <li><a href="#about">TENTANG 4SEKAWAN</a>
                        </li>                    

                        <%
                            try {
                                session = request.getSession();
                                String userAction = null;
                                if (session != null) {
                                    userAction = (String) session.getAttribute("username");
                                }

                                if (userAction == null) { %>
                        <li>

                            <a href="Login.jsp" class="navbar-left fixed btn-group-justified breadcrumb" style="text-shadow: 2px 0px 2px #333;z-index: 99; padding: 15px; margin-left: 300px; background-color: #84bd17; border-radius: 20px; opacity: 1.0; position: absolute; width: 1000px; overflow-x: hidden">
                                Login
                            </a>
                        </li>
                        <% } else {%>
<!--                        <li>
                            <form action="./AkunTes" method="post">
                            <a href="./AkunTes" class="navbar-left fixed btn-group-justified breadcrumb" style="text-shadow: 2px 0px 2px #333;z-index: 99; padding: 15px; margin-left: 300px; background-color: #84bd17; border-radius: 20px; opacity: 1.0; position: absolute; width: 1000px">
                                <input type="hidden" name="akun" value="logout">
                                Logout
                            </a>
                            </form>>
                        </li>-->
                        <%  }
                            } catch (NullPointerException npe) {
                                npe.getMessage();
                            }
                        %>
                    </ul>
                </div>

                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav> 
        <!--End Navigation -->

    </body>
</html>
