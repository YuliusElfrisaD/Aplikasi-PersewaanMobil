<%-- 
    Document   : Persewaan
    Created on : Dec 1, 2017, 8:28:33 PM
    Author     : Asus a455l
--%>

<%@page import="Model.Mobil"%>
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
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
        <style>
            .actions .btn{
                width:36%;
                margin:auto;
            }

            .actions .btn-info{
                float:left;
            }
            .actions .btn-danger{
                float:right;
            }
        </style>
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

        <p class="text-center" style="font-size: x-large; font-family: sans-serif;">Daftar Persewaan</p>

        <table class="table table-hover table-striped ">
            <thead style="background: #3766ab ; color: #ffffff">
                <tr>
                    <th scope="col">No.</th>
                    <th scope="col">ID Persewaan</th>
                    <th scope="col">ID Customer</th>
                    <th scope="col">ID Kendaraan</th>
                    <th scope="col">Tanggal Pinjam</th>
                    <th scope="col">Tanggal Kembali</th>
                    <th scope="col">Biaya</th>
                    <th scope="col"></th>
                </tr>
            </thead>
            <tbody>
                <% Kontrol_Persewaan p = new Kontrol_Persewaan();
                    Persewaan s = new Persewaan();
                    ArrayList<Persewaan> sewaList = p.tampilPersewaan();
                    try {
                        for (int i = 0; i < sewaList.size(); i++) {
                %>
                <tr>
                    <th scope="row"><%=i + 1%></th>
                    <td><%=sewaList.get(i).getIdPersewaan()%></td>
                    <td ><%=sewaList.get(i).getC().getIdCustomer()%></td>
                    <td ><%=sewaList.get(i).getM().getIdKendaraan()%></td>
                    <td><%=sewaList.get(i).getTanggalPinjam()%></td>
                    <td><%=sewaList.get(i).getTanggalKembali()%></td>
                    <td><%=sewaList.get(i).getBiaya()%></td>
                    <td class="actions">
                        <form action="../HapusPersewaan">

                            <button class="btn btn-danger btn-sm" type="submit" name="hapusPersewaan" data-toggle="tooltip" title="Hapus Persewaan"
                                    value="<%=sewaList.get(i).getIdPersewaan()%>"><i class="glyphicon glyphicon-trash"></i></button>								
                        </form>
                        <form action="../EditPersewaan" method="get">
                            <button class="btn btn-success btn-sm" type="submit" name="updatePersewaan" data-toggle="tooltip" title="Update Persewaan"
                                    value="<%=sewaList.get(i).getIdPersewaan()%>"><i class="glyphicon glyphicon-pencil"></i></button>								
                        </form>
                    </td>
                </tr>
            </tbody>
            <%}
                } catch (Exception ex) {
                    ex.getMessage();
                }
            %>

        </table>
    </body>
</html>
