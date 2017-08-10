import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Movie {

	
	public static void main(String[] args) {
	
		List<List<String>> myMovie = new ArrayList<List<String>>();
		myMovie.add(new ArrayList<String>());
		
		myMovie.get(0).add("Title: Dunkirk "+ "Actors: Harry Styles, Aneurin Barnard" + 
				"Director: Christopher Nolan");
		String result = myMovie.get(0).get(0);
		
		myMovie.get(1).add("Title: Valerian "+ "Actors: Rihanna, Dane Cross" +
		"Director: Luc Resson");
		
		myMovie.get(2).add("Title: Wonder Woman"+ "Actors: Gal Gadot, Chris Pine" + 
		"Director: Christopher Nolan");
		
		myMovie.get(3).add("Title: Justice League "+ "Actors: Harry Styles, Aneurin Barnard" +
		"Director: Christopher Nolan");
		
		myMovie.get(4).add("Title: The Bodyguard's Hitman "+ "Actors: Harry Styles, Aneurin Barnard" +
		"Director: Christopher Nolan");
		
		myMovie.get(5).add("Title: The Nut job 2 "+ "Actors: Harry Styles, Aneurin Barnard" + 
		"Director: Christopher Nolan");
		
	
	
	
		
	}

   
    public Movie()
    {
    	
    	List<List<String>> myMovie = new ArrayList<List<String>>();
        
       
        System.out.println("My Movie Selected " + myMovie.get(0));

    }
  
   
    }
