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
                    <th scope="col"></th>
                </tr>
            </thead>
            <tbody>
                <%Kontrol_Supir k = new Kontrol_Supir();
                    ArrayList<Supir> supirList = k.tampilSupir();
                    try {
                        for (int i = 0; i < supirList.size(); i++) {
                %>
                <tr>
                    <th scope="row"><%=i + 1%></th>
                    <td ><%=supirList.get(i).getIdSupir()%></td>
                    <td><%=supirList.get(i).getNamaSupir()%></td>
                    <td><%=supirList.get(i).getAlamatSupir()%></td>
                    <td><%=supirList.get(i).getNotelpSupir()%></td>
                    <td class="actions">
                        <form action="../HapusSupir">
                            
                            <button class="btn btn-danger btn-sm" type="submit" name="hapusSupir" data-toggle="tooltip" title="Hapus supir"
                                    value="<%=supirList.get(i).getIdSupir()%>"><i class="glyphicon glyphicon-trash"></i></button>								
                        </form>
                        <form action="../UpdateSupir" method="get">
                            <button class="btn btn-success btn-sm" type="submit" name="updateSupir" data-toggle="tooltip" title="Update supir"
                                    value="<%=supirList.get(i).getIdSupir()%>"><i class="glyphicon glyphicon-pencil"></i></button>								
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
