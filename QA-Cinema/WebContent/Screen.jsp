<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<link rel="stylesheet" href="Screen.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
  
  <a href="Homepage.html">
  <img src="Images/logo2.png" alt="QA Cinema">
  </a>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-left">
          <li class="active"><a href="Homepage.html">Home</a></li>
        <li><a href="ListingsGallery.html">Listings Gallery</a></li>
        <li><a href="NewReleases.html">New Releases</a></li>
      </ul>
   <div class = "collapse navbar-collapse" id="bs-example-navbar-collapse-1">
  <ul class="nav navbar-nav navbar-right">
  <li><a href="">Snacksnmore</a></li>
   <li><a href="Login.jsp">Login</a></li>
   <li><a href="login.jsp">Register</a><li>
 </ul>

	</div></div>
</nav>

 <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="well-block">
                        <div class="well-title">
                            <h2>Screen</h2>
                        </div>
                              <div class="col-md-12">
                                    <div class="form-group">
                                        <label class="control-label" for="appointmentfor">Select Layout</label>
                                        <select id="appointmentfor" name="appointmentfor" class="form-control">
                                            <option value="#">Premium</option>
                                            <option value="#">Disabled</option>
                                            <option value="#">Standard</option>
                                        </select>
                                    </div>
                                </div>
                                
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label class="control-label">Type of Screen</label>
                                        <select id="screen" name="screen">
                                            <option value="#">3D</option>
                                            <option value="#">IMAX</option>
                                            <option value="#">Standard</option>
                                        </select>
                                    </div>
                                </div>
                             
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <button id="singlebutton" name="singlebutton" class="btn btn-default">Check available seats</button>
                                    </div>
                                </div>
                            </div>  
                    </div>
                </div>
                </div>
                
                <div class="plan">
                   
                        <img src="Images/plan.png">
                 
                </div>
          
        
</body>
</html>


</body>
</html>