package p5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.*;
import p1.Login;
import p3.Entertainment;
import p6.KM;

public class Restaurants
{
	public Restaurants()
	{
		JFrame frame4 = new JFrame("Restaurants");
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.setSize(600,515);
		frame4.setLocation(400,100);
		frame4.setLocation(400,100);
		frame4.setLayout(new FlowLayout());

		ImageIcon icon1 = new ImageIcon("E:/Mini Project/New Folder/image 2.jpg");
		ImageIcon icon2 = new ImageIcon("E:/Mini Project/New Folder/image 1.jpg");
	
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();

		panel1.setLayout(new GridLayout(1,2));
		panel2.setLayout(new GridLayout(1,2));
		panel3.setLayout(new GridLayout(7,3));
		panel4.setLayout(new GridLayout(1,2));

		JLabel jLabel1 = new JLabel(icon1);
		JLabel jLabel2 = new JLabel(icon2);
		JLabel jLabel3 = new JLabel("Please Choose One Option : ",JLabel.LEFT);

		Font f = new Font("Georgia",Font.BOLD,16);
		jLabel3.setFont(f);

		String [] name = {"CHENNAI","COIMBATORE","MADURAI"};
		JComboBox jComboBox1 =  new JComboBox(name);

		JRadioButton jRadioButton1 = new JRadioButton("Famous Theory");
		JRadioButton jRadioButton2 = new JRadioButton("Guntur Gongura");
		JRadioButton jRadioButton3 = new JRadioButton("Upper Deck");
		JRadioButton jRadioButton4 = new JRadioButton("Benjarong Restaurants");
		JRadioButton jRadioButton5 = new JRadioButton("vasco's");
		JRadioButton jRadioButton6 = new JRadioButton("The Flying Elephant");
		JRadioButton jRadioButton7 = new JRadioButton("Eat Out Restaurants");

		JRadioButton jRadioButton8 = new JRadioButton("Pavilion");
		JRadioButton jRadioButton9 = new JRadioButton("On the Go");
		JRadioButton jRadioButton10 = new JRadioButton("That's Y Food");
		JRadioButton jRadioButton11 = new JRadioButton("Latest Recipe");
		JRadioButton jRadioButton12 = new JRadioButton("Annalakshmi");
		JRadioButton jRadioButton13 = new JRadioButton("Le Meridien Restaurants");
		JRadioButton jRadioButton14 = new JRadioButton("WelcomeCafeKovai");

		JRadioButton jRadioButton15 = new JRadioButton("Kumar Mess");
		JRadioButton jRadioButton16 = new JRadioButton("MuruganIdli Shop");
		JRadioButton jRadioButton17 = new JRadioButton("Phil's Bistro");
		JRadioButton jRadioButton18 = new JRadioButton("Dosa& Grill");
		JRadioButton jRadioButton19 = new JRadioButton("HaneefaJigarthanda");
		JRadioButton jRadioButton20 = new JRadioButton("Royal Court");
		JRadioButton jRadioButton21 = new JRadioButton("Modern Restaurants");

		ButtonGroup bg1  = new ButtonGroup();
		bg1.add(jRadioButton1);
		bg1.add(jRadioButton2);
		bg1.add(jRadioButton3);
		bg1.add(jRadioButton4);
		bg1.add(jRadioButton5);
		bg1.add(jRadioButton6);
		bg1.add(jRadioButton7);
		bg1.add(jRadioButton8);
		bg1.add(jRadioButton9);
		bg1.add(jRadioButton10);
		bg1.add(jRadioButton11);
		bg1.add(jRadioButton12);
		bg1.add(jRadioButton13);
		bg1.add(jRadioButton14);
		bg1.add(jRadioButton15);
		bg1.add(jRadioButton16);
		bg1.add(jRadioButton17);
		bg1.add(jRadioButton18);
		bg1.add(jRadioButton19);
		bg1.add(jRadioButton20);
		bg1.add(jRadioButton21);

		JButtonlog_out = new JButton("Log Out");
		Font fa = new Font("Georgia",Font.BOLD,14);
		log_out.setFont(fa);

		JButton back = new JButton("Back");
		Font fa1 = new Font("Georgia",Font.BOLD,14);
		back.setFont(fa1);

		panel1.add(jLabel1);
		panel1.add(jLabel2);

		panel2.add(jLabel3);
		panel2.add(jComboBox1);

		panel3.add(jRadioButton1);
		panel3.add(jRadioButton8);
		panel3.add(jRadioButton15);
		panel3.add(jRadioButton2);
		panel3.add(jRadioButton9);
		panel3.add(jRadioButton16);
		panel3.add(jRadioButton3);
		panel3.add(jRadioButton10);
		panel3.add(jRadioButton17);
		panel3.add(jRadioButton4);
		panel3.add(jRadioButton11);
		panel3.add(jRadioButton18);
		panel3.add(jRadioButton5);
		panel3.add(jRadioButton12);
		panel3.add(jRadioButton19);
		panel3.add(jRadioButton6);
		panel3.add(jRadioButton13);
		panel3.add(jRadioButton20);
		panel3.add(jRadioButton7);
		panel3.add(jRadioButton14);
		panel3.add(jRadioButton21);

		frame4.add(panel1);
		frame4.add(panel2);
		frame4.add(panel3);
		frame4.add(panel4);
		frame4.add(back);
		frame4.add(log_out);

		jRadioButton1.setVisible(false);		
		jRadioButton2.setVisible(false);
		jRadioButton3.setVisible(false);
		jRadioButton4.setVisible(false);
		jRadioButton5.setVisible(false);
		jRadioButton6.setVisible(false);
		jRadioButton7.setVisible(false);
		jRadioButton8.setVisible(false);		
		jRadioButton9.setVisible(false);
		jRadioButton10.setVisible(false);
		jRadioButton11.setVisible(false);
		jRadioButton12.setVisible(false);
		jRadioButton13.setVisible(false);
		jRadioButton14.setVisible(false);
		jRadioButton15.setVisible(false);		
		jRadioButton16.setVisible(false);
		jRadioButton17.setVisible(false);
		jRadioButton18.setVisible(false);
		jRadioButton19.setVisible(false);
		jRadioButton20.setVisible(false);
		jRadioButton21.setVisible(false);

		jComboBox1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==jComboBox1)
				{
					String msg = (String)jComboBox1.getSelectedItem();
					switch(msg)
					{
						case "CHENNAI" : jRadioButton1.setVisible(true);		
							      jRadioButton2.setVisible(true);
							      jRadioButton3.setVisible(true);
							      jRadioButton4.setVisible(true);
							      jRadioButton5.setVisible(true);
							      jRadioButton6.setVisible(true);
							      jRadioButton7.setVisible(true);
							      jRadioButton8.setVisible(false);		
							      jRadioButton9.setVisible(false);
							      jRadioButton10.setVisible(false);
							      jRadioButton11.setVisible(false);
							      jRadioButton12.setVisible(false);
							      jRadioButton13.setVisible(false);
							      jRadioButton14.setVisible(false);
							      jRadioButton15.setVisible(false);		
							      jRadioButton16.setVisible(false);
							      jRadioButton17.setVisible(false);
							      jRadioButton18.setVisible(false);
							      jRadioButton19.setVisible(false);
							      jRadioButton20.setVisible(false);
							      jRadioButton21.setVisible(false);
								break;
								
						case "COIMBATORE" : jRadioButton8.setVisible(true);		
							         jRadioButton9.setVisible(true);
							         jRadioButton10.setVisible(true);
							         jRadioButton11.setVisible(true);
							         jRadioButton12.setVisible(true);
							         jRadioButton13.setVisible(true);
							         jRadioButton14.setVisible(true);
								 jRadioButton1.setVisible(false);		
								 jRadioButton2.setVisible(false);
								 jRadioButton3.setVisible(false);
								 jRadioButton4.setVisible(false);
								 jRadioButton5.setVisible(false);
								 jRadioButton6.setVisible(false);
								 jRadioButton7.setVisible(false);
								 jRadioButton15.setVisible(false);		
							         jRadioButton16.setVisible(false);
							         jRadioButton17.setVisible(false);
							         jRadioButton18.setVisible(false);
							         jRadioButton19.setVisible(false);
							         jRadioButton20.setVisible(false);
							         jRadioButton21.setVisible(false);
								   break;
						case "MADURAI" :
								jRadioButton1.setVisible(false);		
								jRadioButton2.setVisible(false);
								jRadioButton3.setVisible(false);
								jRadioButton4.setVisible(false);
								jRadioButton5.setVisible(false);
								jRadioButton6.setVisible(false);
								jRadioButton7.setVisible(false);
								jRadioButton8.setVisible(false);		
								jRadioButton9.setVisible(false);
								jRadioButton10.setVisible(false);
								jRadioButton11.setVisible(false);
								jRadioButton12.setVisible(false);
								jRadioButton13.setVisible(false);
								jRadioButton14.setVisible(false);
								jRadioButton15.setVisible(true);		
							        jRadioButton16.setVisible(true);
							        jRadioButton17.setVisible(true);
							        jRadioButton18.setVisible(true);
							        jRadioButton19.setVisible(true);
							        jRadioButton20.setVisible(true);
							        jRadioButton21.setVisible(true);
									break;
						default : System.out.print("Error Occured");
					}
				}
			}
		});

		/*jRadioButton1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame4.dispose();
				//new BA();
			}
		});
		jRadioButton8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame4.dispose();
				//new Engineering();
			}
		});*/
		jRadioButton15.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame4.dispose();
				new KM();
			}
		});

		log_out.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame4.dispose();
				JOptionPane.showMessageDialog(null,"You have Successfully Logged Out");
				new Login();
			}
		});
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame4.dispose();
				new Entertainment();
			}
		});

		panel1.setPreferredSize(new Dimension(550,180));
		panel2.setPreferredSize(new Dimension(550,40));
		panel3.setPreferredSize(new Dimension(550,180));
		panel4.setPreferredSize(new Dimension(550,15));

		frame4.setVisible(true);
	}
	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Restaurants();
			}
		});
		
	}
}
