
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
		
		mymovie = new Movie();
		mymovie.add(TmTitle);
		
		classification = new MovieClassification();
		classification.add(classification);
		
	
		mySeats = new Seats();
		mySeats.equals(obj);
		
		customer = new CustomerType();
		customer.c.toString();
		
		
		date = new DatePicker();
		date.setPromptText("Date of Booking");
		date.setMaxWidth(300);
	
		
	}
	

	
	@Override
	
	public void actionPerformed(ActionEvent e)
	{
		Function f = new Function();
		ResultSet rs = null;
		String mID = "movieID";
		String mTitle ="movieTitle";
		String mActor = "movieActor";
		String mDirector= "movieDirector";
		
		rs = f.find(TmID.getText());
		try {
			if(rs.next())
			{
				TmID.setText(rs.getString(mID));
				TmTitle.setText(rs.getString(mTitle));
				TmActor.setText(rs.getString(mActor));
				TmDirector.setText(rs.getString(mDirector));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "No Data for this ID");
			}
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null,ex.getMessage());
			}
		
	}
	
	public static class Function {
		
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	
	
	public static final String URL = "jdbc:mysql://localhost:3306/qa_cinema";
	public static final  String user ="root";
	public static final String pass ="root";
	
	public ResultSet find(String search)
	{
		  
		try {
		
		con = DriverManager.getConnection(URL,user,pass);
		ps= con.prepareStatement("select * from Movie where movieID = ?");
		ps.setString(1, search);
		rs= ps.executeQuery();
	
		
	}catch(Exception ex) {
		JOptionPane.showMessageDialog(null, ex.getMessage());
	}
	return rs;  
	}
	
	 
	

	
	public static void main (String[] args)
	{
		new Movie();
	
	}
	}
}
	

