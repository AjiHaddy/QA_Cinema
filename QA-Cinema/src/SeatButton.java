import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class SeatButton extends JButton {
	private static final String P = null;

	{
	JButton P, S, D = new JButton();
	byte value =0;
 }
	
	
	public SeatButton()
	{
   getButton();
   this.addActionListener(this.getClass());
	}
	
	public void getButton() 
	{
	 P.setIcon("Images/disabledSeat.png");
	 S =new ImageIcon(this.getClass().getResource("Images/premiumSeat.png"));
	 D =new ImageIcon(this.getClass().getResource("Images/standardSeat.png"));
			
	}
	

	public void actionPerformed(ActionEvent e) {
	
	byte value;
	value ++;
		value%=3;
		
		
		switch(value)
		
		{
		case 0:
		 setIcon(null);
		 break;
		 
		case 1:
			setIcon(P);
			break;
		case 2:
			setIcon(S);
			default:
				
				break;
				
		}
	}
	}
