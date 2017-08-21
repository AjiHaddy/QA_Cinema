
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javafx.*;
import javafx.scene.control.DatePicker;

public class TicketBooking extends JFrame implements ActionListener
{

	DatePicker date;
	Movie mymovie;
	Seats mySeats;
	Screen myScreen;
	MovieClassification classification;
	CustomerType customer;
	JTextField TmID,TmTitle,TmActor,TmDirector;
	JButton btn_search;
	
	
	public TicketBooking ()
	{
		super("Book a ticket");
		
	}
	
	public void ticketBooked()
	{
	        mymovie = new Movie();
		mymovie.add(TmTitle);
		
		classification = new MovieClassification();
		classification.add(classification);
		
	
		mySeats = new Seats();
		Seats.add(mySeats);
		
		customer = new CustomerType();
		customer.toString();
		
		
		date = new DatePicker();
		date.setPromptText("Date of Booking");
		date.setMaxWidth(300);
	
	}
	
	
	public static void main (String[] args)
	{
		new ticketBooked();
	
	}
	}
}
	

