
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class home extends JFrame implements ActionListener {
	JLabel l2, k1, k2, k3, k4;
	JComboBox<String> j1, j2, j3, j4, j5;
	JButton b1, b2, b3, b4, b5;
	ImageIcon i1, im, i2, i3, i4;
	Font f;
	Container con1;home(){super("Pvr cinemas");
	f = new Font("Comic Sans MS",Font.BOLD,20);
	im = new ImageIcon("paa.gif");
	i1=new ImageIcon("collage.png");
	i2=new ImageIcon("cct.png");
	i3=new ImageIcon("au.png");
	i4=new ImageIcon("site map.png");
	con1=getContentPane();k1 = new JLabel(i1);
	k2 = new JLabel(i2);
	k3 = new JLabel(i3);
	k4 = new JLabel(i4);l2 = new JLabel(im);
 
j1 = new JComboBox<String>();
j2 = new JComboBox<String>();
j3 = new JComboBox<String>();
j4 = new JComboBox<String>();
j5 = new JComboBox<String>();
b1 = new JButton("Submit");
b2 = new JButton("Contact Us");
b3 = new JButton("About Us");
b4 = new JButton("Site Map");
b5 = new JButton("Logout");
j1.addItem("PVR Chandigarh");
j1.addItem("PVR Chennai");
j1.addItem("PVR Bangalore");
j2.addItem("Ready");
j2.addItem("Pyar Ka Punchnama");
j2.addItem("Kung Fu Panda 2");
j4.addItem("Double Dhamaal");
j4.addItem("Delhi Belly");
j4.addItem("Ready");
j4.addItem("Pyar Ka Punchnama");
j5.addItem("Double Dhamaal");
j5.addItem("Pyar Ka Punchnama");
j5.addItem("Delhi Belly");
j3.addItem("17 June");
j3.addItem("18 June");j3.addItem("19 June");
j3.addItem("20 June");j3.addItem("21 June");
j3.addItem("22 June");j3.addItem("23 June");

setLayout(null);add(j1);add(j2);add(j3);add(b1);add(j4);
add(j5);add(k1);add(k2);add(k3);add(b2);add(b3);add(k4);add(b4);add(b5);add(l2);
 
b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
b4.addActionListener(this);j1.addActionListener(this);b5.addActionListener(this);
j1.setBounds(600,350,140,20);j2.setBounds(780,350,140,20);j4.setBounds(780,350,140,20);
j4.setVisible(false);j5.setBounds(780,350,140,20);j5.setVisible(false);
j3.setBounds(950,350,140,20);b1.setBounds(750,500,110,20);b2.setBounds(1000,120,110,20);
b3.setBounds(1150,120,110,20);l2.setBounds(500,60,253,160);b4.setBounds(840,120,110,20);
b5.setBounds(900,500,110,20);k1.setBounds(30,200,491,364);k2.setBounds(1020,50,66,63);
k3.setBounds(1165,50,66,62);k4.setBounds(880,50,62,68);con1.setBackground(Color.black);
setLocation(0,0);setSize(1300,750);setVisible(true);
}

	

 public void actionPerformed(ActionEvent ae)
{Object o = ae.getSource();
if(o==b5){setVisible(false);
//new movingText();}
//if(o==b4){setVisible(false);new map1();}if(o==b2){setVisible(false);
}
}}
