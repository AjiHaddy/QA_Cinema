import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Seats extends JFrame {
	
	JPanel p= new JPanel();
	SeatButton buttons[] = new SeatButton[64];

	public static void main(String args[])
	
	{
		new Seats();
	}
	
	public Seats()
	
	{
		super("SeatSelection");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout (new GridLayout(8,8));
		
		for(int i=0; i<64; i++)
		{
		   buttons[i]= new SeatButton();
			p.add(buttons[i]);
		}
		
		add(p);
		setVisible(true);
		
	}
	
	
	
}



