<!DOCTYPE HTML>
<html>
    <head>
        <title>4 Sekawan Car Rental</title>
        <link rel="icon" href="Pictures/apps.png" type="image/x-icon">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="jquery.downCount.js"></script>
        <style>
            body{
                text-align: center;
            }
            .navbar {
                min-height:110px !important;
            }

            .navbar-nav > li {
                padding-top:40px !important; 
                padding-bottom:30px !important;
                padding-right: 50px !important;
                font-size: 18px !important;
            }
            .countdown {
                padding-left: 0;
                list-style: none;
                display: block;
                text-align: center;
                background-color: #0060e9;
                color: white;
            }
            .countdown li {
                display: inline-block;
            }
            .countdown li span {
                font-size: 70px;
                font-weight: 300;
                line-height: 80px;
            }
            .countdown li.seperator {
                font-size: 70px;
                line-height: 70px;
                vertical-align: top;
            }
            .countdown li p {
                color: #a7abb1;
                font-size: 14px;
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
                        <a class="navbar-brand" href="#myPage">
                            <img src="images/Logo.png" width="250" height="80" alt="logo" style="position: absolute">
                        </a>
                    </div>
                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav navbar-right">
                            <li style="color: #999999">1. Isi Data</li>
                            <li style="color: #999999">2. Review</li>
                            <li style="color: #0073a4">3. Pembayaran</li>
                            <li style="color: #999999">4. E-ticket Terbit</li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>

        <!--<form action="../testing" method="post">-->
        <div class="container well" style="background-color: #0060e9;color: white;">
            <h1>Pembayaran</h1>
        </div>

        <div class="container" id="batasWaktu">
            <div class="container">
                <div class="row">
                    <p style="text-align: center;">Sisa waktu pembayaran Anda adalah</p>                        
                </div> 
                <div class="row"><div class="col-lg-4"></div>
                    <div class="col-lg-4">
                        <ul class="countdown">
                            <li> <span class="hours" id="hours"></span>
                                <p class="hours_ref">hours</p>
                            </li>
                            <li class="seperator">:</li>
                            <li> <span class="minutes" id="minutes"></span>
                                <p class="minutes_ref">minutes</p>
                            </li>
                            <li class="seperator">:</li>
                            <li> <span class="seconds" id="seconds"></span>
                                <p class="seconds_ref">seconds</p>
                            </li>
                        </ul>                            
                    </div><div class="col-lg-4"></div>
                </div>
                <div class="row">
                    <p id="batas"></p>                       
                </div>
                <div class="row" style="text-align: left;">
                    <div class="col-lg-8">
                        <div class="well">
                            <h4 style="color: #0060e9">Informasi Penting</h4><br/>
                            <ul>
                                <li>
                                    Transaksi akan dibatalkan (berakhir) jika anda tidak melakukan pembayaran pada periode waktu yang telah ditentukan
                                </li>
                                <li>
                                    Pembayaran akan dianggap sah bila telah meng-upload bukti pembayaran
                                </li>
                                <li>
                                    E-Tiket atau Voucher akan dikirimkan melalui email setelah pembayaran selesai dilakukan
                                </li>
                            </ul>
                        </div>

                        <div class="well">
                            <h4 style="color: #0060e9">Mohon Transfer ke:</h4><br/>
                            <div class="well">                                    
                                <div class="row">
                                    <div class="form-group col-xs-6">
                                        <span>BCA</span>
                                    </div>
                                    <div class="form-group col-xs-6">
                                        <span class="pull-right"><img src="images/Logo_BRI.png" width="125" height="30"></span>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group col-xs-6">
                                        <span class="pull-right">Nomor Rekening:</span>
                                    </div>
                                    <div class="form-group col-xs-6">
                                        009-713-2848
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group col-xs-6">
                                        <span class="pull-right">Nama Penerima:</span>
                                    </div>
                                    <div class="form-group col-xs-6">
                                        4 Sekawan Car Rental
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group col-xs-6">
                                        <span class="pull-right">Jumlah Transfer:</span>
                                    </div>
                                    <div class="form-group col-xs-6">
                                        Rp. 250.000,-
                                    </div>
                                </div>
                            </div>
                            <h2 style="text-align: center">Atau</h2>
                            <div class="well">
                                <div class="row">
                                    <div class="form-group col-xs-6">
                                        <span>Mandiri</span>
                                    </div>
                                    <div class="form-group col-xs-6">
                                        <span class="pull-right"><img src="images/Bank_Mandiri_logo.svg.png" width="100" height="30"></span>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group col-xs-6">
                                        <span class="pull-right">Nomor Rekening:</span>
                                    </div>
                                    <div class="form-group col-xs-6">
                                        135-001-411-0595
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group col-xs-6">
                                        <span class="pull-right">Nama Penerima:</span>
                                    </div>
                                    <div class="form-group col-xs-6">
                                        4 Sekawan Car Rental
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group col-xs-6">
                                        <span class="pull-right">Jumlah Transfer:</span>
                                    </div>
                                    <div class="form-group col-xs-6">
                                        Rp. 250.000,-
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="well">
                            <h4 style="color: #0060e9">Anda sudah membayar?</h4><br/>  
                            <div class="form-group form-inline">
                                <label for="exampleInputFile">Upload bukti pembayaran</label>
                                <input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp" name="exampleInputFile" value="">
                                <!-- Trigger the modal with a button -->
                                <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 well">
                        <div class="well">
                            <div class="row" style="padding-left: 20px">
                                <h4><b>ID Persewaan</b></h4>
                            </div>
                            <div class="row" style="padding-left: 40px">
                                <h4>134234253</h4>
                            </div>
                        </div>
                        <div class="well">
                            <div class="row">
                                <div class="col-xs-6"><span class="pull-right">
                                        <img src="images/apps.png" width="50" height="50"></span>
                                </div>
                                <div class="col-xs-6">
                                    <p style="padding-top: 18px"><b>Nama mobil</b></p>
                                </div>
                            </div><br>
                            <div class="row">
                                <div class="form-group col-xs-6" style="text-align: center;">
                                    <label for="jamPinjam">Tanggal pinjam</label>
                                    <p id="jamPinjam">10 December 2017</p>
                                    <p id="jamPinjam">10:00</p>
                                </div>
                                <div class="form-group col-xs-6" style="text-align: center;">
                                    <label for="jamPinjam">Tanggal kembali</label>
                                    <p id="jamPinjam">11 December 2017</p>
                                    <p id="jamPinjam">10:00</p>
                                </div>
                            </div>
                        </div>
                        <div class="well">
                            <div class="row" style="padding-left: 20px">
                                <h4><b>Nama Peminjam</b></h4>
                            </div>
                            <div class="row" style="padding-left: 40px">
                                <h4>Blalalalala</h4>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>           

        <!-- Modal -->
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Modal Header</h4>
                    </div>
                    <div class="modal-body">
                        <p>Some text in the modal.</p>
                    </div>
                    <div class="modal-footer">
                        <button id="test" type="submit" class="btn btn-default" data-dismiss="modal">Close</button>
                        <script>
                            $(document).ready(function () {
                                $("#test").click(function () {
                                    var dataString = $('#exampleInputFile').val();
                                    console.log(dataString);
                                    $.ajax({
                                        type: "POST",
                                        url: "http://localhost:8084/RPL/testing",
                                        data: dataString,
                                        success: function (data) {
                                            window.location.href = 'http://localhost:8084/RPL/index.jsp';
                                        }
                                    });
                                });
                            });
                        </script>
                    </div>
                </div>
            </div>
        </div>
        <!--</form>-->



        <script class="source" type="text/javascript">
            $('.countdown').downCount({
            <a href="https://www.jqueryscript.net/time-clock/">date</a>: '09/09/2014 12:00:00',
                        offset: +10
            }, function () {
                alert('WOOT WOOT, done!');
            });
        </script>

        <script>
            // Set the date we're counting down to
            var today = new Date();
            var later = new Date();
            later.setSeconds(today.getSeconds() + 2 * 3600);

            // Update the count down every 1 second
            var x = setInterval(function () {

                // Get todays date and time
                var now = new Date().getTime();

                // Find the distance between now an the count down date
                var distance = later - now;

                // Time calculations for days, hours, minutes and seconds
                var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
                var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
                var seconds = Math.floor((distance % (1000 * 60)) / 1000);

                // Output the result in an element with id="demo"
                function addZero(i) {
                    if (i < 10) {
                        i = "0" + i;
                    }
                    return i;
                }
                var h = addZero(later.getHours());
                var m = addZero(later.getMinutes());
                document.getElementById("hours").innerHTML = addZero(hours);
                document.getElementById("minutes").innerHTML = addZero(minutes);
                document.getElementById("seconds").innerHTML = addZero(seconds);
                document.getElementById("batas").innerHTML = "sampai jam " + h + " : " + m;

                // If the count down is over, write some text 
                if (distance < 0) {
                    clearInterval(x);
                    document.getElementById("batasWaktu").innerHTML = "<h1>EXPIRED</h1>";
                }
            }, 1000);
        </script>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
