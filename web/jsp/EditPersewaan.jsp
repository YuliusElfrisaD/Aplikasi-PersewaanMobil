<%-- 
    Document   : EditPersewaan
    Created on : Dec 10, 2017, 5:58:03 AM
    Author     : Asus a455l
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Persewaan"%>
<%@page import="Controller.Kontrol_Persewaan"%>
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
        <%
            HttpSession username = request.getSession();
            if (username.getAttribute("username").equals("bos")) {
        %>
        <jsp:include page="../WEB-INF/headerPemilikLogined.jsp"/>
        <%} else { %>            
        <jsp:include page="../WEB-INF/headerStaffLogined.jsp"/>
        <%}%>

        <p class="text-center" style="font-size: x-large; font-family: sans-serif;">Update Persewaan</p>
        <%
            Kontrol_Persewaan k = new Kontrol_Persewaan();
            ArrayList<Persewaan> rentList = k.tampilPersewaan();
            String id = null, idcustomer = null, idkendaraan = null, tglPinjam = null, tglKembali = null, biaya = null;

            for (int i = 0; i < rentList.size(); i++) {
                id = rentList.get(i).getIdPersewaan();
                idcustomer = rentList.get(i).getC().getIdCustomer();
                idkendaraan = rentList.get(i).getM().getIdKendaraan();
                tglPinjam = rentList.get(i).getTanggalPinjam();
                tglKembali = rentList.get(i).getTanggalKembali();
                biaya = rentList.get(i).getBiaya();
            }%>   

        <div class="container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="row myborder">
                    <form action= "../EditPersewaan" method="POST">
                        <div>
                            <label>ID Persewaan : <%=id%></label> 
                        </div>
                        <div>
                            <label>ID Customer : <%=idcustomer%></label> 
                        </div>
                        <div>
                            <label>ID Kendaraan : <%=idkendaraan%></label> 
                        </div>
                        <div>
                            <label>Masukkan Tanggal Pinjam :</label>
                        </div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-phone" style=" color: #3d5b99;"></i></span>
                            <input size="60" maxlength="255" class="form-control" value="<%=tglPinjam%> "  name="tglPinjam" type="text" style="border: 1px solid #3d5b99!important; color:#000000 "></div>
                        <div>
                            <label>Masukkan Tanggal Kembali :</label>
                        </div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-phone" style=" color: #3d5b99;"></i></span>
                            <input size="60" maxlength="255" class="form-control" value="<%=tglKembali%> "  name="tglKembali" type="text" style="border: 1px solid #3d5b99!important; color:#000000 "></div>
                        <div>
                            <label>Masukkan Total Biaya :</label>
                        </div>
                        <div class="input-group margin-bottom-20">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-phone" style=" color: #3d5b99;"></i></span>
                            <input size="60" maxlength="255" class="form-control" value="<%=biaya%> "  name="biaya" type="text" style="border: 1px solid #3d5b99!important; color:#000000 "></div>

                        <div class="row">
                            <div class="col-md-12">
                                <button class="btn-u pull-left btn-primary" type="submit" name="parameter2" value="<%=id%>">Update</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-2"></div>
            </div>
        </div>

    </body>
</html>
