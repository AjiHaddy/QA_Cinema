
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
class total extends JFrame implements ActionListener {
	JLabel l1, l2, l3, l4, l5, l7, l8, l9;
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2, b3;
	ImageIcon e, f, g;
	Container con1;
	ResultSet rs;
	String s, s1, p, q, r;
	Connection con;
	PreparedStatement ps;

	total(int count, String a, String b, String c) {
		super("Total Amount");
		p = a;
		q = b;
		r = c;
		s = Integer.toString(count);
		s1 = Integer.toString(count * 150);

		e = new ImageIcon("3.jpg");
		f = new ImageIcon("13.jpg");
		g = new ImageIcon("14.jpg");
		con1 = getContentPane();
		l1 = new JLabel("Movie");
		l2 = new JLabel("Cinema");
		l3 = new JLabel("No.Of Seats");
		l4 = new JLabel("Day");
		l5 = new JLabel("Total");
		l7 = new JLabel(e);
		l8 = new JLabel(f);
		l9 = new JLabel(g);
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		t5 = new JTextField(20);
		t1.setText(a);
		t2.setText(b);
		t3.setText(s);
		t4.setText(c);
		t5.setText(s1);
		b1 = new JButton("Cancel");
		b2 = new JButton("Proceed To be Payment");
		b3 = new JButton("back");
		setLayout(null);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(l7);
		add(l8);
		add(l9);
		add(b1);
		add(b2);
		add(b3);
		l1.setBounds(250, 40, 120, 20);
		t1.setBounds(355, 40, 140, 20);

		l2.setBounds(250, 80, 120, 20);
		t2.setBounds(355, 80, 140, 20);
		l3.setBounds(250, 120, 120, 20);
		t3.setBounds(355, 120, 140, 20);
		l4.setBounds(250, 160, 120, 20);
		t4.setBounds(355, 160, 140, 20);
		l5.setBounds(250, 200, 120, 20);
		t5.setBounds(355, 200, 140, 20);
		b1.setBounds(200, 300, 100, 20);
		b2.setBounds(320, 300, 100, 20);
		b3.setBounds(440, 300, 100, 20);
		l7.setBounds(0, 0, 150, 120);
		l8.setBounds(0, 140, 150, 120);
		l9.setBounds(0, 280, 150, 120);
		b2.addActionListener(this);
		b3.addActionListener(this);
		con1.setBackground(Color.black);
		setUndecorated(true);
		setLocation(400, 100);
		setSize(550, 400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{Object o = ae.getSource();
	if(o==b2)
	{setVisible(false);
	//new last();}
	if(o==b3){setVisible(false);
	//new seat(p,q,r);}}
	
	
	}}}}