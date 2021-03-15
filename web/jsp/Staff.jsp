<%-- 
    Document   : Staff
    Created on : Nov 3, 2017, 9:35:40 PM
    Author     : Asus a455l
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Supir"%>
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
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
    </head>
    <body>
        <jsp:include page="../WEB-INF/headerStaffLogined.jsp"/>

        <p class="text-center" style="font-size: x-large; font-family: sans-serif; font: bold">Daftar Supir</p>



        <table class="table table-hover table-striped ">
            <thead style="background: #3766ab ; color: #ffffff">
                <tr>
                    <th scope="col">No.</th>
                    <th scope="col">ID Supir</th>
                    <th scope="col">Nama Supir</th>
                    <th scope="col">Alamat</th>
                    <th scope="col">No. Telp</th>
                </tr>
            </thead>
            <tbody>
                <%Kontrol_Supir k = new Kontrol_Supir();
                    Supir s = new Supir();
                    ArrayList<Supir> supirList = k.tampilSupir();
                    try {
                        for (int i = 0; i < supirList.size(); i++) {
                %>
                <tr>
                    <th scope="row"><%=i + 1%></th>
                    <td><%=supirList.get(i).getIdSupir()%>
<!--                        <form action="../ServletHapusSupir">
                            <button class="btn btn-danger btn-sm" type="submit" name="hapus" value="<%=supirList.get(i).getIdSupir()%>" data-toggle="tooltip" title="Hapus Supir">
                                <i class="fa fa-trash-o"></i></button>								
                        </form>-->
                    </td>
                    <td><%=supirList.get(i).getNamaSupir()%></td>
                    <td><%=supirList.get(i).getAlamatSupir()%></td>
                    <td><%=supirList.get(i).getNotelpSupir()%></td>
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
