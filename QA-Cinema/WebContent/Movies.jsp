<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css" rel="stylesheet">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <link rel="stylesheet" href="Movies.css">
<link rel="stylesheet"
	href="https://bootswatch.com/cyborg/bootstrap.min.css">
<link rel="stylesheet" href="Movies.css">
<script src="Movies.js" type="text/javascript"></script>



<body>
	<div class="container">
	<div class="jumbotron" >
	<h3 class="text-center">Search for Any Movie</h3>
	<form id="SearchForm">
	<input type="text" class="form-control" id="searchText" placeholder="Serach Movie">
	</form>
	</div>
	</div>
	
	
	<div class="container">
	<div id="movies" class="row">
	</div>
	
	
	<div class="container">
	<div id="movie" class="well">
	</div>
	
	
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://unpkg.com.axios.dist/axios.min.js" type="text/javascript"></script>
	<script src="Movies.js"/></script>
	<script>getMovie();</script>
	
	
	</div>

</body>
</html>

<div class="container">

    <h2>Listings Gallery</h2>
    
	<div class="row">
		<div class="col-lg-2 col-md-4 col-sm-4">
			<article class="card">
				<header class="title-header">
					<h3>Dunkirk</h3>
				</header>
					<div class="img-card">
					<img src="Images/dunkirk mini.jpg" alt="Movie" class="w-100" />
					</div>
					
					<p class="tagline card-text text-xs-center">Allied soldiers from Belgium, the British Empire and France are surrounded by the German army and evacuated during a fierce battle in World War II.</p>
					<a href="#" class="btn btn-primary btn-block"><i class="fa fa-eye"></i> Find out more</a>
				</div>
			</article>
		
	
		
		<div class="col-lg-3 col-md-4 col-sm-6">
    		<article class="card">
				<header class="title-header">
					<h3>Movie Title</h3>
				</header>
					<div class="img-card">
						<img src="Images/dunkirk mini.jpg" alt="Movie" class="w-100" />
					</div>
					<p class="tagline card-text text-xs-center">Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
					<a href="#" class="btn btn-primary btn-block"><i class="fa fa-eye"></i> Find out more</a>
				</div>
			</article>
		
		
		
        <div class="col-lg-3 col-md-4 col-sm-6">
    		<article class="card">
				<header class="title-header">
					<h3>Movie Title</h3>
				</header>
					<div class="img-card">
						<img src="Images/dunkirk mini.jpg" alt="Movie" class="w-100" />
					</div>
					<p class="tagline card-text text-xs-center">Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
					<a href="#" class="btn btn-primary btn-block"><i class="fa fa-eye"></i> Find out more</a>
				</div>
			</article>
		
        <div class="col-lg-3 col-md-4 col-sm-6">
    		<article class="card">
				<header class="title-header">
					<h3>Movie Title</h3>
				</header>
					<div class="img-card">
						<img src="Images/dunkirk mini.jpg" alt="Movie" title="Movie" class="w-100" />
					</div>
					<p class="tagline card-text text-xs-center">Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
					<a href="#" class="btn btn-primary btn-block"><i class="fa fa-eye"></i> Watch Now</a>
				</div>
			</article>
		</div>
	</div>
</section>
</div>


</footer>
</body>
</html>