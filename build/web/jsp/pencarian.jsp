<%-- 
    Document   : PENCARIAN
    Created on : Dec 1, 2017, 11:34:36 AM
    Author     : user
--%>

<%@page import="Model.Mobil"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>4 Sekawan Car Rental</title>
        <link rel="icon" href="Pictures/apps.png" type="image/x-icon">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" href="../Bahan/Gambar/Logo 4SEKAWAN.png" type="image/x-icon">
        <link rel="stylesheet" href="../Bahan/css/style.css">
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

<!--        <form action="../Pencarian" method="get" class="form-horizontal">  
            <div class="container well" id="Rent">
                <div class="col-lg-12">                
                    <div class="form-group">
                        <div class="col-sm-6">
                            <label for="sel2">Supir:</label><br>                      
                            <label class="radio-inline" id="true"><input type="radio" name="radioSupir" value="YA">YA</label>
                            <label class="radio-inline" id="false"><input type="radio" name="radioSupir" value="TIDAK">TIDAK</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-6">
                            <label for="dpd1">Tanggal Pinjam:</label>
                            <div class="input-group input-append date" id="dpd1">
                                <input type="text" class="form-control" id="dpd1" name="tglPinjam" value=""/>
                                <span class="input-group-addon add-on"><span class="glyphicon glyphicon-calendar" id="dpd1"></span></span>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <label for="dpd2">Tanggal Kembali:</label> 
                            <div class="input-group input-append date" id="dpd2">
                                <input type="text" class="form-control" id="dpd2" name="tglKembali" value=""/>
                                <span class="input-group-addon add-on"><span class="glyphicon glyphicon-calendar" id="dpd2"></span></span>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-6">
                            <label for="dpd3">Jam Pinjam:</label>
                            <div class="row" id="dpd3">
                                <div class="col-sm-4">
                                    <select name="jamPinjam" class="form-control" id="dpd3">
                                        <option value="0">00</option>
                                        <option value="1">01</option>
                                        <option value="2">02</option>
                                        <option value="3">03</option>
                                        <option value="4">04</option>
                                        <option value="5">05</option>
                                        <option value="6">06</option>
                                        <option value="7">07</option>
                                        <option value="8">08</option>
                                        <option value="9">09</option>
                                        <option value="10" selected="selected">10</option>
                                        <option value="11">11</option>
                                        <option value="12">12</option>
                                        <option value="13">13</option>
                                        <option value="14">14</option>
                                        <option value="15">15</option>
                                        <option value="16">16</option>
                                        <option value="17">17</option>
                                        <option value="18">18</option>
                                        <option value="19">19</option>
                                        <option value="20">20</option>
                                        <option value="21">21</option>
                                        <option value="22">22</option>
                                        <option value="23">23</option>
                                    </select>
                                </div>
                                <div class="col-sm-4" id="dpd1">
                                    <select name="menitPinjam" id="puMinute" class="form-control">
                                        <option value="0" selected="selected">00</option>
                                        <option value="15">15</option>
                                        <option value="30">30</option>
                                        <option value="45">45</option>
                                    </select>
                                </div>
                            </div>                            
                        </div>
                        <div class="col-sm-6">
                            <label for="dpd4">Jam Kembali</label>
                            <div class="row" id="dpd4">
                                <div class="col-sm-4">
                                    <select name="jamKembali" class="form-control" id="dpd3">
                                        <option value="0">00</option>
                                        <option value="1">01</option>
                                        <option value="2">02</option>
                                        <option value="3">03</option>
                                        <option value="4">04</option>
                                        <option value="5">05</option>
                                        <option value="6">06</option>
                                        <option value="7">07</option>
                                        <option value="8">08</option>
                                        <option value="9">09</option>
                                        <option value="10" selected="selected">10</option>
                                        <option value="11">11</option>
                                        <option value="12">12</option>
                                        <option value="13">13</option>
                                        <option value="14">14</option>
                                        <option value="15">15</option>
                                        <option value="16">16</option>
                                        <option value="17">17</option>
                                        <option value="18">18</option>
                                        <option value="19">19</option>
                                        <option value="20">20</option>
                                        <option value="21">21</option>
                                        <option value="22">22</option>
                                        <option value="23">23</option>
                                    </select>
                                </div>
                                <div class="col-sm-4" id="dpd1">
                                    <select name="menitKembali" id="puMinute" class="form-control">
                                        <option value="0" selected="selected">00</option>
                                        <option value="15">15</option>
                                        <option value="30">30</option>
                                        <option value="45">45</option>
                                    </select>
                                </div>
                            </div>                            
                        </div>
                    </div>
                    <div class="form-group" style="padding-top: 32px;">
                        <div class="col-sm-6">
                        </div>
                        <div class="col-sm-6">
                            <button type="submit" class="btn btn-primary btn-lg btn-block" id="booking">CARI</button>
                        </div>
                    </div>
                </div> 
            </div>
        </form><br>-->

        <div class="container">    
            <div class="row">
                <div class="col-sm-3 sidenav well">                    
                    <h3>Mobil Kami</h3>
                    <form>
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Pick Up</label>
                        </div>
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Daihatsu Luxio</label>
                        </div>
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Daihatsu GrandMax</label>
                        </div>
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Honda Brio</label>
                        </div>
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Honda Jazz</label>
                        </div>
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Honda City</label>
                        </div>
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Nissan Evalia</label>
                        </div>
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Suzuki Swift</label>
                        </div>
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Toyota All New Avanza</label>
                        </div>                                               
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Toyota Yaris</label>
                        </div>
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Toyota Innova</label>
                        </div>
                        <div class="checkbox">
                            <label><input type="checkbox" value="" name="showCars" checked="checked"> Toyota Agya</label>
                        </div>
                    </form>                    
                </div>
                <form action="../bookingServlet" method="get">
                    <div class="col-sm-9">
                        <%                            
                            ArrayList<Mobil> cari = (ArrayList<Mobil>) session.getAttribute("cariMobil");

                            String id = null, nama = null, gambar = null;

                            for (int i = 0; i < cari.size(); i++) {
                                id = cari.get(i).getIdKendaraan();
                                nama = cari.get(i).getNamaKendaraan();
                                gambar = cari.get(i).getGambar();
                        %>

                        <jsp:useBean id="cariMobil" scope="request" class="Model.Mobil"/>
                        <jsp:setProperty name="cariMobil" property="idKendaraan" value="<%=id%>"/>
                        <jsp:setProperty name="cariMobil" property="namaKendaraan" value="<%=nama%>"/>
                        <jsp:setProperty name="cariMobil" property="gambar" value="<%=gambar%>"/>


                        <div class="panel panel-default">
                            <div class="row">
                                <div class="col-sm-3" style="padding-left: 10px">
                                    <img src="../Bahan/Mobil/<jsp:getProperty name="cariMobil" property="gambar"/>" width="180" height="100"> 
                                </div>
                                <div class="col-md-6" style="padding-top: 10px;">
                                    <h1 style="text-align: center"><jsp:getProperty name="cariMobil" property="namaKendaraan"/></h1>   
                                </div>
                                <div class="col-sm-3" style="padding-top: 30px; padding-right: 30px">
                                    <button type="input" class="btn btn-warning btn-block" name="pesanMobil" value="<jsp:getProperty name="cariMobil" property="idKendaraan"/>">PESAN SEKARANG</button>  
                                </div>
                            </div>
                        </div>                               
                        <%  }%>
                    </div>
                </form>
            </div>
        </div>
        <script type="text/javascript">
            var startDate = new Date();
            var fechaFin = new Date();
            var FromEndDate = new Date();
            var ToEndDate = new Date();

            $('#dpd1').datepicker({
                autoclose: true,
                format: 'dd MM yyyy',
                todayBtn: "linked",
                clearBtn: true,
                todayHighlight: true,
                startDate: "today"
            }).on('changeDate', function (selected) {
                startDate = new Date(selected.date.valueOf());
                startDate.setDate(startDate.getDate(new Date(selected.date.valueOf())));
                $('#dpd2').datepicker('setStartDate', startDate);
            });

            $('#dpd2').datepicker({
                autoclose: true,
                format: 'dd MM yyyy',
                todayBtn: "linked",
                clearBtn: true,
                todayHighlight: true,
                startDate: "today"
            }).on('changeDate', function (selected) {
                FromEndDate = new Date(selected.date.valueOf());
                FromEndDate.setDate(FromEndDate.getDate(new Date(selected.date.valueOf())));
                $('#dpd1').datepicker('setEndDate', FromEndDate);
            });
        </script>
        <jsp:include page="../WEB-INF/footer.jsp"/>
    </body>
</html>
