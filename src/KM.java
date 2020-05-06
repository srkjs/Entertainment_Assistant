package p6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.*;
import p1.Login;
import p5.Restaurants;

public class KM
{
	public KM()
	{
		JFrame frame5 = new JFrame("KM-MADURAI");
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.setSize(670,510);
		frame5.setLocation(400,100);
		frame5.setLayout(new FlowLayout());

		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		JPanel panel6=new JPanel();
		JPanel panel7=new JPanel();
		JPanel panel8=new JPanel();
		JPanel panel9=new JPanel();
		JPanel panel10=new JPanel();

		panel1.setLayout(new GridLayout(1,2));
		panel2.setLayout(new GridLayout(2,1));
		panel3.setLayout(new GridLayout(7,3));
		panel4.setLayout(new GridLayout(2,1));
		panel5.setLayout(new GridLayout(2,1));
		panel6.setLayout(new GridLayout(4,1));
		panel7.setLayout(new GridLayout(4,1));
		panel9.setLayout(new GridLayout(1,1));

		JLabel jLabel1 = new JLabel("Kumar Mess",JLabel.CENTER);
		Font f = new Font("Georgia",Font.BOLD,22);
		jLabel1.setFont(f);

		JLabel jLabel2 = new JLabel("A restaurants or an eatery, is a business which prepares and serves food and drinks to customers in exchange for money. ");
		JLabel jLabel3 = new JLabel("Meals are generally served and eaten on the premises,");
		JLabel jLabel4 = new JLabel("but many restaurants also offer take-out and food delivery services, and some offer only take-out and delivery.  ");
		JLabel jLabel5 = new JLabel("Restaurants vary greatly in appearance and offerings, ");
		JLabel jLabel6 = new JLabel("including a wide variety of cuisines and service models ranging from inexpensive fast food restaurants and "); 
		JLabel jLabel7 = new JLabel("cafeterias to mid-priced family restaurants, to high-priced luxury establishments");
		JLabel jLabel8 = new JLabel("Some restaurants serve all the major meals, such as breakfast, lunch, and dinner ");
		JLabel jLabel9 = new JLabel("(e.g., major fast food chains, diners, hotel restaurants, and airport restaurants).");
		
		JButton view = new JButton("View Menu For This Restaurants");

		JButtonlog_out = new JButton("Log Out");
		Font fa = new Font("Georgia",Font.BOLD,14);
		log_out.setFont(fa);

		JButton back = new JButton("Back");
		Font fa1 = new Font("Georgia",Font.BOLD,14);
		back.setFont(fa1);


		String[] columnNames = {"S.no","SpiceName","Cost"};
		Object[][] data = {
					{"1","Chicken Briyani","150"},
					{"2","Grill Chicken","200"},
					{"3","Pineapple lime","45"}
				  };

		JTable table = new JTable(data,columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(600,50));
		table.setFillsViewportHeight(true);

		JScrollPanescrollpane = new JScrollPane(table);

		panel1.add(jLabel1);

		panel2.add(jLabel2);
		panel2.add(jLabel3);
		
		panel4.add(jLabel4);
		panel4.add(jLabel5);

		panel6.add(jLabel6);
		panel6.add(jLabel7);
		panel6.add(jLabel8);
		panel6.add(jLabel9);	

		panel9.add(scrollpane);	

		frame5.add(panel1);
		frame5.add(panel2);
		frame5.add(panel3);
		frame5.add(panel4);
		frame5.add(panel5);
		frame5.add(panel6);
		frame5.add(panel7);
		frame5.add(view);
		frame5.add(panel8);
		frame5.add(panel9);
		frame5.add(panel10);
		frame5.add(back);
		frame5.add(log_out);

		panel1.setPreferredSize(new Dimension(640,40));
		panel2.setPreferredSize(new Dimension(640,50));
		panel3.setPreferredSize(new Dimension(640,10));
		panel4.setPreferredSize(new Dimension(650,50));
		panel5.setPreferredSize(new Dimension(650,10));
		panel6.setPreferredSize(new Dimension(650,90));
		panel7.setPreferredSize(new Dimension(650,10));
		panel8.setPreferredSize(new Dimension(650,10));
		panel9.setPreferredSize(new Dimension(650,70));
		panel10.setPreferredSize(new Dimension(650,10));

		scrollpane.setVisible(false);

		view.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				scrollpane.setVisible(true);
			}
		});
		log_out.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame5.dispose();
				JOptionPane.showMessageDialog(null,"You have Successfully Logged Out");
				new Login();
			}
		});
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame5.dispose();
				new Restaurants();
			}
		});		

		frame5.setVisible(true);
	}
	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new KM();
			}
		});
		
	}
}
