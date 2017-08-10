<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> <%@include file="./navbar.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="Navigation.css">
  <link rel= "stylesheet" href="Carousel.css">
  <link rel="stylesheet" href="QA.css">

</head>
<body>

<div>


<div class="container">
	<div class="row">
    	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
			<ol class="carousel-indicators">
			  	<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
			     <li data-target="#carousel-example-generic" data-slide-to="3"></li>
			</ol>
		
			<div class="carousel-inner">
			    <div class="item active">
			    	<img src="Images/dunkirk 2.jpg" alt="First slide">    
                    <div class="header-text hidden-xs">
                        <div class="col-lg-12 text-center">
                              <div class=row>
                           <a href="#" class="btn btn-primary">
                           <i class="fa fa-eye"></i> Find out more</a>
                              </div>
                        </div>
                    </div>
			    </div>
			
			    
	<div class="item">
			    	<img src="Images/wonderwoman2.jpg" alt="Second slide">
      </div>
			 
			 
	<div class="item">
		<img src="Images/Valerian.jpg" alt="Third slide">
	 </div>
	 
			    
	<div class="item">
			    	<img src="Images/Justice league.jpg" alt="Fourth slide">
	 </div>
			</div>
	
			<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
		    	<span class="glyphicon glyphicon-chevron-left"></span>
			</a>
			<a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
		    	<span class="glyphicon glyphicon-chevron-right"></span>
			</a>
		</div>
	</div>
  </div>
 
 <br><br>
<br><br> 
<div class="container">
  <h2>Screens</h2>
  <a href="Screen.html">
  <button type="button" class="btn btn-primary" style="width:350px;height:50px;"><strong>Standard</strong></button>
  <button type="button" class="btn btn-success" style="width:350px;height:50px;"><strong>IMAX</strong></button>
  <button type="button" class="btn btn-warning" style="width:350px;height:50px;"><strong>3D</strong></button>
  </a>
</div>
<div>
<div>
</div>

<br><br>
<br><br>
<br><br>

<div class= gettingthere>
<h2>Getting There</h2>
<a href ="GettingThere.html">
<button type= "button" class= "glyphicon glyphicon-triangle-right">GET THERE</button>
</a>

</div>


<div class="container text-center">
    <div class="row">
        <div class="col-lg-12">
            <ul class="nav nav-pills nav-justified">
               <li><a href="About Us.jsp">About us</a></li>
           
            <li><a href="ContactUs.jsp">Contact Us</a></li>
                <li><a href="#">Terms of Service</a></li>
                <li><a href="#">Privacy</a></li>
            </ul>
        </div>
    </div>
</div>
</div>
</div>
</body>
</html>
    