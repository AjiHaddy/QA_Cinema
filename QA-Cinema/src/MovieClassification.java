import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MovieClassification extends JApplet {

String[] movieList = { "Dunkirk", "Valerian", "Wonder Woman", "Girls Trip", "The Hitman's Bodyguard", "Annabelle"};

  JTextField text = new JTextField(26);

  JComboBox box = new JComboBox();

  JButton button = new JButton("Add items");
  
  ImageIcon img1,img2,img3 = new ImageIcon();

 int count = 0;

  public void init() {
	  Container cp = getContentPane();
	    cp.setLayout(new FlowLayout());
	    cp.add(text);
	    cp.add(box);
	    cp.add(button);
	    
    for (int i = 0; i < 6; i++)
    box.addItem(movieList[count++]);
    text.setEditable(false);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (count < movieList.length)
          box.addItem(movieList[count++]);
        cp.add(text= new JTextField(img1));
      }
    });
    box.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	  
        text.setText("index: " + box.getSelectedIndex() + "   "
            + ((JComboBox) e.getSource()).getSelectedItem());
      }
    });
   
    img1.add("/Classification/U.png");
  }

  
  
  public static void main(String[] args) {
    run(new MovieClassification(), 700, 700);
   
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
