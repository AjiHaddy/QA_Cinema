import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JTextField;

public class Screen extends JApplet {

  String[] ScreenName = {"Standard : �2.19", "3D : �2.99", "IMAX : 2.49" };
  JTextField text = new JTextField(26);
  JComboBox<String> box = new JComboBox<String>();
  JButton button = new JButton("Select your Screen type");
  int count = 0;

  
  public void init() {
	  
    for (int i = 0; i < 6; i++)
    	box.addItem(ScreenName[count++]);
    
    text.setEditable(false);
    
    button.addActionListener(new ActionListener() {
     
    	public void actionPerformed(ActionEvent e) {
        if (count < ScreenName.length )
        	 box.addItem(ScreenName[count++]);
      }
    });
    box.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	  
  text.setText("Index :" + (box.getSelectedIndex() + "   "
            + ((JComboBox<?>) e.getSource()).getSelectedItem()));
 
      }
    });
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.add(text);
    cp.add(box);
    cp.add(button);
    

  }

  
  
  public static void main(String[] args) {
    run(new Screen(), 700, 700);
   
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


