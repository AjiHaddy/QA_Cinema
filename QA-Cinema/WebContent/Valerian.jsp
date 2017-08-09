<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://bootswatch.com/cyborg/bootstrap.min.css">
<link rel="stylesheet" href="Movies.css">
<link rel="stylesheet" href="MovieSelection.css">
<script src="Movies.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://unpkg.com.axios.dist/axios.min.js"
	type="text/javascript"></script>
<script src="Movies.js" /></script>
<script>
	getMovie();
</script>
<script
	src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://demosthenes.info/assets/scripts/extras/shapes.js'></script>

</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<img src="Images/logo2.png">

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-left">
				<li class="active"><a href="Homepage.html">Home</a></li>
				<li><a href="ListingsGallery.html">Listings Gallery</a></li>
				<li><a href="NewReleases.html">New Releases</a></li>
			</ul>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="">Snacksnmore</a></li>
					<li><a href="Login.jsp">Login</a></li>
					<li><a href="login.jsp">Register</a>
					<li>
				</ul>

			</div>
		</div>
	</nav>


	<div class="main-content">
	<div class=" valerian">
<img src="Images/Valerian.jpg"></div>
		<div class ="text">
		<h3><strong>Valerian</strong></h3>
		<h5>
		<p>A dark force threatens Alpha, a vast metropolis and home to
	species from a thousand planets. Special operatives Valerian and
	Laureline must race to identify the marauding menace and safeguard not
	just Alpha, but the future of the universe.</p>
	
	<p>Actors: Dane DeHaan, Cara Delevingne, Clive Owen, Rihanna</p>
	<p>Director: Luc Besson</p>
	<p>Classification:12A Type:Action,Adventure,Fantasy</p>
	<br><br>
	<a href="Payment.html" class="btn btn-primary"> Book Now</a>
			<a href="Classification.html" class="btn btn-info"> Movie Classification info</a>

	</h5>
		</div>

	</div>
	
		<div class="container">
			<div>
				<h1>Videos</h1>
			</div>

			<div>
				<h5>Trailer</h5>
				<ul class="list-unstyled video-list-thumbs row">
					<li class="col-lg-3 col-sm-4 col-xs-6"><a href="#"
						title="Claudio Bravo, antes su debut con el Bar�a en la Liga">
							<img src="http://i.ytimg.com/vi/ZKOtE9DOwGE/mqdefault.jpg"
							alt="Barca" class="img-responsive" height="130px" /> <52>C....
							</h5> <span class="glyphicon glyphicon-play-circle"></span> <span
							class="duration">03:15</span>
					</a></li>
					<h5>Behind the Scenes</h5>
					<li class="col-lg-3 col-sm-4 col-xs-6"><a
						href="http://www.imdb.com/video/imdb/vi2408298777?playlistId=tt2239822&ref_=tt_ov_vi"
						title="Claudio Bravo, antes su debut con el Bar�a en la Liga">
							<img src="http://i.ytimg.com/vi/ZKOtE9DOwGE/mqdefault.jpg"
							alt="Barca" class="img-responsive" height="130px" />
							<h5>C....</h5> <span class="glyphicon glyphicon-play-circle"></span>
							<span class="duration">03:15</span>
					</a></li>
				</ul>

			</div>
</body>
</html>