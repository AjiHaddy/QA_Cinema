import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
class Seats extends JFrame implements ActionListener {
	JLabel l1, l2, l3, l4, l5, l6;
	JButton b1, b2;
	JPanel p;
	JButton b[] = new JButton[100];
	int select[] = new int[100];
	int i, j, k, sl;
	ImageIcon im, im1, im2;
	Container con;
	Connection con1;
	PreparedStatement ps;
	ResultSet rs;
	String a, d, c, w;
	int count = 0;

Seats (String s,String s1,String s2,String t)
{super("QA Cinema");
a=s;d=s1;c=s2;w=t;con = getContentPane();
con.setBackground(Color.black);
im = new ImageIcon("white.png");
im1 = new ImageIcon("red.png");
im2 = new ImageIcon("green.png");
l1 = new JLabel("Booked");
l2 = new JLabel(im1);
l3 = new JLabel("Vacant");l4 = new JLabel(im);
l5 = new JLabel("Your current location");
l6 = new JLabel(im2);
b1 = new JButton("Proceed to payment");
b2=new JButton("Back");
p = new JPanel();
p.setLayout(new GridLayout(10, 10));
p.setFont(new Font("SansSerif",Font.BOLD,20));
k=0;for(i = 0; i < 10; i++)
{for(j = 0; j < 10; j++){p.add(b[k]=new JButton(""+k,im));
k++;}}
for(i=0;i<100;i++){b[i].addActionListener(this);}
add(l6);
add(b1);
add(b2);
add(p);
add(l1);
add(l3);
add(l5);
add(l2);add(l4);
b1.addActionListener(this);b2.addActionListener(this);
l1.setBounds(85,50,110,30);
l2.setBounds(25,50,50,40);
l3.setBounds(260,50,100,30);
l4.setBounds(200,50,50,40);
l5.setBounds(430,50,130,30);
l6.setBounds(370,50,50,40);
b1.setBounds(600,400,190,20);
b2.setBounds(650,100,100,20);
p.setBounds(50,150,500,400);
setLayout(null);setLocation(100,100);
setSize(850,650);setVisible(true);j=0;k=0;sl=0;
}

public void actionPerformed(ActionEvent ae)
{Object o= ae.getSource();
if(o==b1)
{ System.out.println("total no of seats"+count);
setVisible(false);new total(count,a,d,c);}
if(o==b2){setVisible(false);new home();}
for(int x=0;x<100;x++){if(o==b[x]){String s = (String)ae.getActionCommand();i=Integer.parseInt(s);
}


try{String seat_no=b[i].getText();
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con1=DriverManager.getConnection("Jdbc:Odbc:tracker","system","abc");
ps=con1.prepareStatement("select * from seat whereseat_no=? and dt=? and tim=? and movi=? ");
ps.setString(1,b[i].getText());ps.setString(2,c);ps.setString(3,w);
ps.setString(4, d );rs=ps.executeQuery();b[i].setIcon(im1);
if(rs.next())
{//b[i].setIcon(im1);
System.out.println("can't be allocated ...");
JOptionPane.showMessageDialog(this," Already Booked", "sorry",JOptionPane.ERROR_MESSAGE);}
else{Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con1=DriverManager.getConnection("Jdbc:Odbc:tracker","system","abc");
ps=con1.prepareStatement("insert into seatvalues(?,?,?,?)");
ps.setString(1,seat_no);ps.setString(2,c);ps.setString(3,w);
ps.setString(4,d);ps.executeUpdate();
System.out.println("Record Inserted Successfully ...");
//System.out.println("save");
b[i].setIcon(im2);//dispose();
count++;

System.out.println(count);
}}
//new total(save);}}
//end of try
catch(Exception e)
{System.out.println("Exception Caught :"+e);
}}}}