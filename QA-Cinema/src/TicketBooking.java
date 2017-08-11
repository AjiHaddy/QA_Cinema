import java.util.Scanner;


public class TicketBooking {
	
	static Scanner scan= new Scanner(System.in);
	static String name;
	static Movie [] movieLists;
    static int number;
			
	public static void getName()
	{
		System.out.println("Enter your name");
		name=scan.nextLine();
		System.out.println("Hello " + name);
		getMovie();
		
		
		//get customer to store in array . Store in Customer Class.
	}
	
	
	public static void getMovie()
	{
		System.out.println("Select your movie");
		for(int i= 0; i<movieLists.length; i++)
		{
			System.out.println(movieLists[i]);
		}
		
		number = scan.nextInt();
		System.out.println("You have selected the movie " 
		+ movieLists[number-1].substring(3, movieLists[number-1].length()));
		getSeats();
	}
	

	
	public static void getSeats()
	{
		System.out.println("");
		String seats=scan.next();
		System.out.println("");
	}
	
	
			

	public static void main(String[] args) {
		
       getName();
	}

}
