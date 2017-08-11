
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class CustomerType extends JApplet{
	
	String[] c = {"Adult","Child", "Concession"};
    JFrame frame;
    JComboBox combo;
    JButton button;
    JTextField text;
    int count= 0;
	

	
	
	 public void init() {
		  
		    for (int i = 0; i < 4; i++)
		    	combo.addItem(c[count++]);
		
		    text.setEditable(false);
		    
		    button.addActionListener(new ActionListener() {
		     
		    	public void actionPerformed(ActionEvent e) {
		        if (count < c.length )
		        	 combo.addItem(c[count++]);
		      }
		    });
		    combo.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  
		  text.setText("Index :" + (combo.getSelectedIndex() + "   "
		            + ((JComboBox<?>) e.getSource()).getSelectedItem()));
		 
		      }
		    });
		    Container cp = getContentPane();
		    cp.setLayout(new FlowLayout());
		    cp.add(text);
		    cp.add(combo);
		    cp.add(button);
		    

		  }

		  
	
		  public static void main(String[] args) {
		    run(new CustomerType(), 700, 700);
		   
		  }

		  public static void run(JApplet applet, int width, int height) {
		    JFrame frame = new JFrame();
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.getContentPane().add(applet);
		    frame.setSize(width, height);
		    applet.init();
		    applet.start();
		    frame.setVisible(true);
		    
		    
		  }
		  
		}


