package p3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.*;
import p1.Login;
import p4.Theatre;
import p5.Restaurants;
import p7.Mall;

public class Entertainment
{
	public Entertainment()
	{
		JFrame frame2 = new JFrame("Entertainment Guidance");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(600,735);
		frame2.setLocation(300,0);
		frame2.setLayout(new FlowLayout());

		ImageIcon icon1 = new ImageIcon("E:/Mini Project/New Folder/image 2.jpg");
		ImageIcon icon2 = new ImageIcon("E:/Mini Project/New Folder/image 1.jpg");
	
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
	
		panel1.setLayout(new GridLayout(1,2));
		panel2.setLayout(new GridLayout(5,1));
		panel3.setLayout(new GridLayout(15,1));
		panel4.setLayout(new GridLayout(1,2));

		JLabel jLabel1 = new JLabel(icon1);
		JLabel jLabel2 = new JLabel(icon2);
		
		JLabel jLabel3 = new JLabel("What is Entertainment Guidance ");
		Font f = new Font("Georgia",Font.BOLD,18);
		jLabel3.setFont(f);

		JLabel jLabel4 = new JLabel("Entertainment is a form of activity that holds the attention and interest of an audience, or gives pleasure and delight ");
		JLabel jLabel5 = new JLabel(" Storytelling, music, drama, dance, and different kinds of performance exist in all cultures, were supported in royal courts, ");
		JLabel jLabel6 = new JLabel("developed into sophisticated forms and over time became available to all citizens. ");
		JLabel jLabel7 = new JLabel("1) THEATRE ");
		JLabel jLabel8 = new JLabel("          a) Chennai");
		JLabel jLabel9 = new JLabel("          b) Comibatore ");
		JLabel jLabel10= new JLabel("          c) Madurai ");
		JLabel jLabel11= new JLabel("2) RESTAURANTS ");
		JLabel jLabel12= new JLabel("          a) Chennai");
		JLabel jLabel13= new JLabel("          b) Comibatore");
		JLabel jLabel14= new JLabel("          c) Madurai");
		JLabel jLabel15= new JLabel("          d) Trichy");
		JLabel jLabel16= new JLabel("3) SHOPPING MALL ");
		JLabel jLabel17= new JLabel("          a) Chennai");
		JLabel jLabel18= new JLabel("          b) Comibatore");
		JLabel jLabel19= new JLabel("4) OTHER ENTERTAINMENT ");
		JLabel jLabel20= new JLabel("          a) Madurai");
		JLabel jLabel21= new JLabel("Enter your Choice of Entertainment : ");
		JLabel jLabel22= new JLabel("Entertainment Choices : ");
		JTextField jTextField1 = new JTextField();
		JButton select=new JButton("Select");
		JButtonlog_out=new JButton("Log Out");

		Font fa = new Font("Georgia",Font.BOLD,18);
		jLabel22.setFont(fa);

		panel1.add(jLabel1);
		panel1.add(jLabel2);
		
		panel2.add(jLabel3);
		panel2.add(jLabel4);
		panel2.add(jLabel5);
		panel2.add(jLabel6);

		panel3.add(jLabel22);
		panel3.add(jLabel7);
		panel3.add(jLabel8);
		panel3.add(jLabel9);
		panel3.add(jLabel10);
		panel3.add(jLabel11);
		panel3.add(jLabel12);
		panel3.add(jLabel13);
		panel3.add(jLabel14);
		panel3.add(jLabel15);
		panel3.add(jLabel16);
		panel3.add(jLabel17);
		panel3.add(jLabel18);
		panel3.add(jLabel19);
		panel3.add(jLabel20);


		panel4.add(jLabel21);
		panel4.add(jTextField1);

		frame2.add(panel1);
		frame2.add(panel2);
		frame2.add(panel3);
		frame2.add(panel4);
		frame2.add(select);
		frame2.add(log_out);

		panel2.setPreferredSize(new Dimension(570,95));
		panel3.setPreferredSize(new Dimension(570,300));
		panel4.setPreferredSize(new Dimension(570,30));

		select.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String str = jTextField1.getText();
				if(str.equals("1"))
				{
					frame2.dispose();
					new Theatre();
				}
				else if(str.equals("2"))
				{
					frame2.dispose();
					new Restaurants();
				}
				else if(str.equals("3"))
				{
					frame2.dispose();
					new Mall();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please Enter Valid Choice ");
				}
			}
		});
		log_out.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame2.dispose();
				JOptionPane.showMessageDialog(null,"You have Successfully Logged Out!");
				new Login();
			}
		});

		frame2.setVisible(true);
	}
	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Entertainment();
			}
		});
		
	}
}
