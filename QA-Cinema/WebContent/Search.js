
$('#searchText').keyup(function () {
	
	var searchterm = $('#searchText'.val();
	{

	if (searchterm!='')
        {
		$.post('search.jsp',{searchterm:searchterm},
				function(data)
				{
			$('#searchresults').html(data);
				});
		}
	else
	{
		$('#searchresults').html('');
	}
			
});


/*
angular.module('myApp', []).controller('Ctrl', function ($scope)
		{
  $scope.movieList = [
    'Dunkirk',
    'Valerian',
    'Justice League',
    'Wonder Woman',
    'The Nut Job 2',
    'The Hitmans bodyguard',
    'Annabelle'
  ];
});

*/
