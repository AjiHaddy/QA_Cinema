import javax.swing.*;
import java.awt.*;


public class Seats{

	JFrame f;
	JPanel p;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12,b13,b14,b15,b16,b17,b18,b19,b20;
 
 
	
	public Seats() {
		Seat();
	}

	public void Seat() {
		f = new JFrame("Seat Layout");
		f.setVisible(true);
		f.setSize(800, 800);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// -----------------
		p = new JPanel();
		p.setBackground(Color.blue);
		
		//image = new ImageIcon("/Image/12.png");
		
		// ------------------

		b1 = new JButton("Row 1, Column 1 :Standard");
		b1.setBounds(300,200,80,100);
		b2 = new JButton("Row 1, Column 2 :Standard");
		b2.setBounds(300,200,80,100);
		b3 = new JButton("Row 1, Column 3 :Standard");
		b3.setBounds(300,200,80,100);
		b4 = new JButton("Row 1, Column 4 :Disabled");
		b4.setBounds(300,200,80,100);
		
		//next row
		b5 = new JButton("Row 2, Column 1 :Standard");
		b5.setBounds(300,200,80,100);
		
		
		b6 = new JButton("Row 2, Column 2 :Standard");
		b6.setBounds(300,200,80,100);
		b7 = new JButton("Row 2, Column 3 :Standard");
		b7.setBounds(300,200,80,100);
		b8 = new JButton("Row 2, Column 4 :Disabled");
		b8.setBounds(300,200,80,100);
		
		//next row
		b9 = new JButton("Row 3, Column 1 :Standard");
		b9.setBounds(300,200,80,100);
		b10 =new JButton("Row 3, Column 2 :Standard");
		b10.setBounds(300,200,80,100);
		b11 = new JButton("Row 3, Column 3 :Standard");
		b11.setBounds(300,200,80,100);
		b12 = new JButton("Row 3, Column 4 :Disabled");
		b12.setBounds(300,200,80,100);
		
        //next row
		b13 = new JButton("Row 4, Column 1 :Standard");
		b13.setBounds(300,200,80,100);
		b14 =new JButton("Row 4, Column 2 :Standard");
		b14.setBounds(300,200,80,100);
		b15 = new JButton("Row 4, Column 3 :Standard");
		b15.setBounds(300,200,80,100);
		b16 = new JButton("Row 4, Column 4 :Disabled");
		b16.setBounds(300,200,80,100);
		
		//next row for premium
		b17 = new JButton ("Row 5 @ Column 1 :Premium");
		b17.setBounds(300,200,80,100);
		b18 = new JButton("Row 5 @ Column 2 :Premium");
		b18.setBounds(300,200,80,100);
		b19 = new JButton("Row 5 @ Column 3 :Premium");
		b10.setBounds(300,200,80,100);
		b20 = new JButton("Row 5 @ Column 4 :Premium");
		b20.setBounds(300,200,80,100);
		
		
	

		// add buttons below
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);
		p.add(b17);
		p.add(b18);
		p.add(b19);
		p.add(b20);

	

		f.add(p);


	}

	public static void main(String[] args) {

		new Seats();
	}

}
