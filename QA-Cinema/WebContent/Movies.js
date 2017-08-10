$(document).ready(() => {
	
$('#searchForm').on('submit', (e) =>
  {
let searchText= $('#searchText').val();
getMovies(searchText);
e.preventDefault();
});

});

function getMovies(searchText){
	
	axios.get('http://www.omdbap1.com?s='+ searchText).then((response) =>
	
	{
		console.log(response);
		let movies= response.data.Search;
		let output="";
		$.each(movies,(index,movie) =>
		
		{
			output+=
				<div class="col-md-3">
			<div class="well text-center">
			<img src="${movie.Poster}">
			<h5>${movie.Title}</h5>
			<a onclick="movieSelected('${Movie.Id}')" 
				class="btn btn-primary" href="#">Movies</a>
				</div></div>;
		});
		
		$('#movies').html(output);
	});
			
	
});
	
	.catch((err) =>
	{
		console.log(err);
	});
	
	
	
	
	function movieSelected(id)
	{
		
		sessionStorage.setItem('movieId',id);
		window.location='Movies.html';
		return false;
	}
	
	function getMovies(){
		
		let movieId= sessionStorage.getItem(movieId);
		
		axios.get('http://www.omdbap1.com?i='+ movieId).then((response) =>
		
		{
			
			console.log(response);
			let movie= response.data;
			
			let output='
				<div class="row">
			
			<div class="col-md-4>"
				<img src="$(movie.Poster" class="thumbnail">
				</div>
				
				<div class="col-md-8">
				<h2>$(movie.Title)</h2>
				<ul class="list-group">
				<li class="list-group-item"><strong>Genre:</strong> $(movie.Genre)</li>
				<li class="list-group-item"><strong>Released:</strong> $(movie.Genre)</li>
				<li class="list-group-item"><strong>Rated:</strong> $(movie.Genre)</li>
				<li class="list-group-item"><strong>Director:</strong> $(movie.Director)</li>
				<li class="list-group-item"><strong>Actor:</strong> $(movie.Actor)</li>
				</ul>

				
				</div>
				</div>
				<div class="row"
					<div class="well">
				<h3>Plot</h3>
				$(movie.Plot)
					</div>
				';
			
		$('#movie').html(output);
		});
		
		.catch((err) =>
		{
			console.log(err);
		});
		
