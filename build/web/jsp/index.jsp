<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>4 Sekawan Car Rental</title>
       <link rel="icon" href="../Bahan/Gambar/Logo 4SEKAWAN.png" type="image/x-icon">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
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

        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
            </ol>
            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <center><img src="../Bahan/Gambar/promo1.1.png" alt="promo1" width="1000" height="500"></center>
                </div>
                <div class="item">
                    <center><img src="../Bahan/Gambar/promo2.2.jpg" alt="promo2" width="1000" height="500"></center>
                </div>
            </div>
            <!-- Left and right controls -->
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>



        <form action="../Pencarian" method="get" class="form-horizontal"> 
            <div class="row" id="Rent" style="padding-top: 34px; padding-bottom: 34px;">
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
                                        <option value="00" selected="selected">00</option>
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
                                        <option value="00" selected="selected">00</option>
                                        <option value="15">15</option>
                                        <option value="30">30</option>
                                        <option value="45">45</option>
                                    </select>
                                </div>
                            </div>                            
                        </div>
                    </div>
                </div>
                <div class="form-group" style="padding-top: 32px;">
                    <div class="col-sm-12">
                        <button type="submit" class="btn btn-primary btn-lg btn-block" id="booking">CARI</button>
                    </div>
                </div> 
            </div>
        </form>
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
    </div>

</div>

<jsp:include page="../WEB-INF/footer.jsp"/>
</body>
</html>

