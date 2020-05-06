package p4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.*;
import p1.Login;
import p3.Entertainment;

public class Theatre
{
	public Theatre()
	{
		JFrame frame3 = new JFrame("Theatre");
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame3.setSize(580,572);
		frame3.setLocation(400,100);
		frame3.setLayout(new FlowLayout());

		ImageIcon icon1 = new ImageIcon("E:/Mini Project/New Folder/image 2.jpg");
		ImageIcon icon2 = new ImageIcon("E:/Mini Project/New Folder/image 1.jpg");
	
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
	
		panel1.setLayout(new GridLayout(1,2));
		panel2.setLayout(new GridLayout(2,1));
		panel3.setLayout(new GridLayout(1,3)); 
		panel4.setLayout(new GridLayout(5,3));
		panel5.setLayout(new GridLayout(3,1));

		JLabel jLabel1 = new JLabel(icon1);
		JLabel jLabel2 = new JLabel(icon2);
		JLabel jLabel3 = new JLabel("YOU CAN SEARCH FOR THEATRE IN THREE CITES : ");
		JLabel jLabel4 = new JLabel("So, Click any of the three choices to know the Theatre Name ");
		JRadioButton jRadioButton1 = new JRadioButton("Chennai");
		JRadioButton jRadioButton2 = new JRadioButton("Coimbatore");
		JRadioButton jRadioButton3 = new JRadioButton("Madurai");

		JLabel jLabel5 = new JLabel("Baba Cinemas");
		JLabel jLabel6 = new JLabel("BIG Cinemas");
		JLabel jLabel7 = new JLabel("The Cinemas Brookefields");
		JLabel jLabel8 = new JLabel("Krithika Cinemas");
		JLabel jLabel9 = new JLabel(" Priya Complex");
		
		JLabel jLabel10 = new JLabel("Sathyam Cinemas");
		JLabel jLabel11 = new JLabel("Luxe Cinemas");
		JLabel jLabel12 = new JLabel("S2 Cinemas");
		JLabel jLabel13 = new JLabel("PVR Cinemas");
		JLabel jLabel14 = new JLabel("Vetri Cinemas");
		
		JLabel jLabel15 = new JLabel("Vetri Cinemas");
		JLabel jLabel16 = new JLabel("Guru Theatre");
		JLabel jLabel17 = new JLabel("Ambiga Cinemas");
		JLabel jLabel18 = new JLabel("Tamil Jaya Cinemas");
		JLabel jLabel19 = new JLabel("Sri Meenakshi Cinemas");

		JLabel jLabel20 = new JLabel("Note:-");
		JLabel jLabel21 = new JLabel("These Theatre are based upon our wishes ");
		JLabel jLabel22 = new JLabel("Just silly Things ");

		Font f = new Font("Georgia",Font.BOLD,16);
		jLabel20.setFont(f);

		JButtonlog_out = new JButton("Log Out");
		Font fa = new Font("Georgia",Font.BOLD,14);
		log_out.setFont(fa);

		JButton back = new JButton("Back");
		Font fa1 = new Font("Georgia",Font.BOLD,14);
		back.setFont(fa1);

		ButtonGroupbg = new ButtonGroup();
		bg.add(jRadioButton1);
		bg.add(jRadioButton2);
		bg.add(jRadioButton3);

		panel1.add(jLabel1);
		panel1.add(jLabel2);
		
		panel2.add(jLabel3);
		panel2.add(jLabel4);

		panel3.add(jRadioButton1);
		panel3.add(jRadioButton2);
		panel3.add(jRadioButton3);
	
		panel4.add(jLabel10);
		panel4.add(jLabel5);
		panel4.add(jLabel15);
		panel4.add(jLabel11);
		panel4.add(jLabel6);
		panel4.add(jLabel16);
		panel4.add(jLabel12);
		panel4.add(jLabel7);
		panel4.add(jLabel17);
		panel4.add(jLabel13);
		panel4.add(jLabel8);
		panel4.add(jLabel18);
		panel4.add(jLabel14);
		panel4.add(jLabel9);
		panel4.add(jLabel19);

		panel5.add(jLabel20);
		panel5.add(jLabel21);
		panel5.add(jLabel22);

		frame3.add(panel1);
		frame3.add(panel2);
		frame3.add(panel3);
		frame3.add(panel4);
		frame3.add(panel5);
		frame3.add(back);
		frame3.add(log_out);


		jLabel5.setVisible(false);
		jLabel6.setVisible(false);
		jLabel7.setVisible(false);
		jLabel8.setVisible(false);
		jLabel9.setVisible(false);

		jLabel10.setVisible(false);
		jLabel11.setVisible(false);
		jLabel12.setVisible(false);
		jLabel13.setVisible(false);
		jLabel14.setVisible(false);

		jLabel15.setVisible(false);
		jLabel16.setVisible(false);
		jLabel17.setVisible(false);
		jLabel18.setVisible(false);
		jLabel19.setVisible(false);

		jLabel20.setVisible(false);
		jLabel21.setVisible(false);
		jLabel22.setVisible(false);

		jRadioButton1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				jLabel5.setVisible(false);
				jLabel6.setVisible(false);
				jLabel7.setVisible(false);
				jLabel8.setVisible(false);
				jLabel9.setVisible(false);
				jLabel15.setVisible(false);
				jLabel16.setVisible(false);
				jLabel17.setVisible(false);
				jLabel18.setVisible(false);
				jLabel19.setVisible(false);
				jLabel10.setVisible(true);
				jLabel11.setVisible(true);
				jLabel12.setVisible(true);
				jLabel13.setVisible(true);
				jLabel14.setVisible(true);
				jLabel20.setVisible(true);
				jLabel21.setVisible(true);
				jLabel22.setVisible(true);
			}
		});
		jRadioButton2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				jLabel15.setVisible(false);
				jLabel16.setVisible(false);
				jLabel17.setVisible(false);
				jLabel18.setVisible(false);
				jLabel19.setVisible(false);
				jLabel5.setVisible(true);
				jLabel6.setVisible(true);
				jLabel7.setVisible(true);
				jLabel8.setVisible(true);
				jLabel9.setVisible(true);
				jLabel10.setVisible(false);
				jLabel11.setVisible(false);
				jLabel12.setVisible(false);
				jLabel13.setVisible(false);
				jLabel14.setVisible(false);
				jLabel20.setVisible(true);
				jLabel21.setVisible(true);
				jLabel22.setVisible(true);
			}
		});
		jRadioButton3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				jLabel10.setVisible(false);
				jLabel11.setVisible(false);
				jLabel12.setVisible(false);
				jLabel13.setVisible(false);
				jLabel14.setVisible(false);
				jLabel5.setVisible(false);
				jLabel6.setVisible(false);
				jLabel7.setVisible(false);
				jLabel8.setVisible(false);
				jLabel9.setVisible(false);
				jLabel15.setVisible(true);
				jLabel16.setVisible(true);
				jLabel17.setVisible(true);
				jLabel18.setVisible(true);
				jLabel19.setVisible(true);
				jLabel20.setVisible(true);
				jLabel21.setVisible(true);
				jLabel22.setVisible(true);
			}
		});
		
		
		log_out.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame3.dispose();
				JOptionPane.showMessageDialog(null,"You have Successfully Logged Out");
				new Login();
			}
		});
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame3.dispose();
				new Entertainment();
			}
		});


		panel2.setPreferredSize(new Dimension(500,50));
		panel3.setPreferredSize(new Dimension(500,30));
		panel4.setPreferredSize(new Dimension(500,120));
		panel5.setPreferredSize(new Dimension(500,50));

		frame3.setVisible(true);
	}
	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Theatre();
			}
		});
		
	}
}
