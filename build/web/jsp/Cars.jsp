<%-- 
    Document   : Cars
    Created on : Dec 11, 2017, 10:43:24 PM
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
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
    </head>
    <body>
        <%
            HttpSession username = request.getSession();
            if (username.getAttribute("username") != null) {
        %>        
        <jsp:include page="../WEB-INF/headerLogined.jsp"/>     
        <%} else { %>            
        <jsp:include page="../WEB-INF/header.jsp"/>
        <%}%>


    <center>
        <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">DAFTAR MOBIL</h1>
        <table>
            <%Kontrol_Mobil m = new Kontrol_Mobil();
                Mobil s = new Mobil();
                ArrayList<Mobil> mobilList = m.tampilMobil();
                for (int i = 0; i < mobilList.size();) {
                    int hrg = (int) mobilList.get(i).getHarga();
            %>
            <tr>
                <%
                    for (int j = 0; j < 3; j++) {
                        if (i < mobilList.size()) {
                %>
                <td>
                    <div class="container-fluid">
                        <div class="col">
                            <div class="col-md-4 col-lg-8 col-lg-12">
                                <img src="../Bahan/Mobil/<%=mobilList.get(i).getGambar()%>" width="220" height="140">
                                <h2><%=mobilList.get(i).getNamaKendaraan()%><br><b>Rp.<%=hrg%></b></h2><br><br>
                            </div>  
                        </div>
                    </div>
                </td>
                <%
                            i++;
                        }
                    }
                %>

            </tr>
            <%
                }
            %>
        </table>
    </center>
</body>
</html>
