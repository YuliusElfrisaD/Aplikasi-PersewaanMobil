<%-- 
    Document   : contact
    Created on : Dec 1, 2017, 4:27:49 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>4 Sekawan Car Rental</title>
        <link rel="icon" href="../Bahan/Gambar/Logo 4SEKAWAN.png" type="image/x-icon">
        <link rel="stylesheet" href="../Bahan/css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            #googleMap {
                width: 100%;
                height: 400px;
            }  
        </style>
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
        <div class="container">
            <h3 class="text-center">Contact</h3>
            <div class="row well">
                <div class="col-md-4">
                    <p>Kritik dan Saran</p>
                    <p><span class="glyphicon glyphicon-map-marker"></span> Sleman, Yogyakarta</p>
                    <p><span class="glyphicon glyphicon-phone"></span> Telepon: (0274) 4340640</p>
                    <p><span class="glyphicon glyphicon-envelope"></span> Email: info@4sekawan-rent.com</p>
                </div>
                <div class="col-md-8">
                    <div class="row">
                        <div class="col-sm-6 form-group">
                            <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
                        </div>
                        <div class="col-sm-6 form-group">
                            <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
                        </div>
                    </div>
                    <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
                    <br>
                    <div class="row">
                        <div class="col-md-12 form-group">
                            <button class="btn pull-right" type="submit">Kirim</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div id="googleMap" style="width:100%;height:400px;"></div>
        <script>
            function myMap() {
                var myCenter = new google.maps.LatLng(-7.675749, 110.417426);
                var mapProp = {center: myCenter, zoom: 18, scrollwheel: false, draggable: true, mapTypeId: google.maps.MapTypeId.ROADMAP};
                var map = new google.maps.Map(document.getElementById("googleMap"), mapProp);
                var marker = new google.maps.Marker({position: myCenter});
                marker.setMap(map);
            }
        </script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDdS0_-T0-tBm_1hQP94t69z3rO4s-rq-w&callback=myMap"></script>

        <jsp:include page="../WEB-INF/footer.jsp"/>
    </body>
</html>
