<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> <%@include file="./navbar.jsp" %>
    <%@ include file = "Seats.java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Seats</title>
</head>


<body>


<div class="container">
<img src="Images/plan.png">
</div>

<form class="form-vertical">
<fieldset>

<div class="form-group">
  <label class="col-md-4 control-label" for="category_name">Type of Seats</label>
  <div>
     <ul class="nav nav-pills nav-justified">
  <li><a href="#">Adult</a></li>
  <li><a href="#">Child</a></li>
 </ul>
  
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="category_name_fr">CATEGORY NAME FR</label>
  <div class="col-md-4">
    <select id="category_name_fr" name="category_name_fr" class="form-control">
    </select>
  </div>
</div>



<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for=""></label>
  <div class="col-md-4">
    <button id="" name="" class="btn btn-primary">Submit</button>
  </div>
</div>

</fieldset>
</form>




</body>
</html>