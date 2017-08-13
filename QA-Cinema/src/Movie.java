
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Movie extends JFrame implements ActionListener
{

	JLabel LmID,LmTitle,LmActor,LmDirector;
	JTextField TmID,TmTitle,TmActor,TmDirector;
	JButton btn_search;
	
	
	public Movie ()
	{
		
		super("Search Movie");
		
		LmID= new JLabel("Movie ID");
		LmID.setBounds(20,20,200,20);
		TmID= new JTextField(20);
		TmID.setBounds(130, 20, 350, 20);
		
		btn_search = new JButton("Search");
		btn_search.setBounds(300,200,80,100);
		btn_search.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(600,600);
		
		
		LmTitle= new JLabel("Title :");
		LmTitle.setBounds(20, 40, 200, 20);
		TmTitle= new JTextField(20);
		TmTitle.setBounds(130, 40, 350, 20);
		
		LmActor= new JLabel("Actor :");
		LmActor.setBounds(20, 60, 200, 20);
		TmActor= new JTextField(20);
		TmActor.setBounds(130, 60, 350, 20);
		///
		LmDirector= new JLabel("Director :");
		LmDirector.setBounds(20, 80, 600, 20);
		
		TmDirector= new JTextField(20);
		TmDirector.setBounds(130, 80, 350, 20);
		
		setLayout(null);
		
		add(LmID);
		add(TmID);
		
		add(LmTitle);
		add(TmTitle);
		///
		add(LmActor);
		add(TmActor);
		///
		add(LmDirector);
		add(TmDirector);
		
		add(btn_search);
	
		
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
	

