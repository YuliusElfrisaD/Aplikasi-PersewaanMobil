<%-- 
    Document   : RekapKeuangan
    Created on : Dec 9, 2017, 4:05:44 PM
    Author     : Asih
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.RekapKeuangan"%>
<%@page import="Controller.Kontrol_RekapKeuangan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

        <title>JSP Page</title>
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

        <p class="text-center" style="font-size: x-large; font-family: sans-serif; font: bold">Rekap Keuangan</p>

        <form action="../RekapServlet" method="get">
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4"></div>
                <div class="col-md-4">
                    <label for="dpd3">Pilih Bulan</label>
                    <select name="bulan" class="form-control" id="dpd3">
                        <option>---</option>
                        <option value="January">Januari</option>
                        <option value="February">Februari</option>
                        <option value="March">Maret</option>
                        <option value="April">April</option>
                        <option value="May">Mei</option>
                        <option value="June">Juni</option>
                        <option value="July">Juli</option>
                        <option value="August">Agustus</option>
                        <option value="September">September</option>
                        <option value="October">Oktober</option>
                        <option value="November">November</option>
                        <option value="December">Desember</option>
                    </select>
                    <button type="submit" class="btn btn-success btn-lg btn-block" id="booking">CARI</button> 
                </div>
            </div>
        </form>

        <br>
        <table class="table table-hover table-striped ">
            <thead style="background: #3766ab ; color: #ffffff">
                <tr>
                    <th scope="col">No.</th>
                    <th scope="col">Biaya Pemasukan</th>
                    <th scope="col">Bulan Pemasukan</th>
                </tr>
            </thead>
            <tbody>
                <%
                    String bulan = (String) session.getAttribute("bulan");
                    ArrayList<RekapKeuangan> rekapList = null;
                    if (bulan == null) {
                        Kontrol_RekapKeuangan rk = new Kontrol_RekapKeuangan();
                        RekapKeuangan r = new RekapKeuangan();
                        rekapList = rk.tampilRekapKeuangan();
                    } else {
                        Kontrol_RekapKeuangan rk = new Kontrol_RekapKeuangan();
                        RekapKeuangan r = new RekapKeuangan();
                        rekapList = rk.tampilRekapKeuanganPerBulan(bulan);
                    }

                    String harga = null;

                    try {
                        for (int i = 0; i < rekapList.size(); i++) {

                            harga = rekapList.get(i).getP().getBiaya();
                            if (harga.equals(null)) {
                                harga = "0";
                            }
                %>
                <tr>
                    <th scope="row"><%=i + 1%></th>
                    <td>Rp.<%=harga%>,-</td>
                    <td ><%=rekapList.get(i).getP().getTanggalKembali()%></td>
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
