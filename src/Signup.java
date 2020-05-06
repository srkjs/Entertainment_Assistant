package p2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.*;
import p1.Login;

public class Signup
{
	public Signup()
	{
		JFrame frame1 = new JFrame("Sign Up");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(560,635);
		frame1.setLocation(400,85);
		frame1.setLayout(new FlowLayout());

		ImageIcon icon1 = new ImageIcon("E:/Mini Project/New Folder/image 2.jpg");
		ImageIcon icon2 = new ImageIcon("E:/Mini Project/New Folder/image 1.jpg");

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
		JPanel panel11=new JPanel();

		panel1.setLayout(new GridLayout(1,2));
		panel2.setLayout(new GridLayout(2,1));
		panel3.setLayout(new GridLayout(1,2));
		panel4.setLayout(new GridLayout(1,2));
		panel5.setLayout(new GridLayout(1,2));
		panel6.setLayout(new GridLayout(1,2));
		panel7.setLayout(new GridLayout(1,2));
		panel8.setLayout(new GridLayout(1,2));
		panel9.setLayout(new GridLayout(1,2));
		panel10.setLayout(new GridLayout(1,2));

		JLabel jLabel1 = new JLabel(icon1);
		JLabel jLabel2 = new JLabel(icon2);
		JLabel jLabel3 = new JLabel("<HTML><Font color='Black'>Register</Font></HTML>",JLabel.CENTER);
		JLabel jLabel4 = new JLabel("<HTML><Font color='Black'> All Fields marked *  are compulsory </Font></HTML>",JLabel.LEFT);
		JLabel jLabel5 = new JLabel("<HTML><Font color='Black'>First Name </Font></HTML>");
		JLabel jLabel6 = new JLabel("<HTML><Font color='Black'>Middle Name </Font></HTML>");	
		JLabel jLabel7 = new JLabel("<HTML><Font color='Black'>Last Name </Font></HTML>");	
		JLabel jLabel8 = new JLabel("<HTML><Font color='Black'>Email id </Font></HTML>");
		JLabel jLabel9 = new JLabel("<HTML><Font color='Black'>Contact No. </Font></HTML>");
		JLabel jLabel10 = new JLabel("<HTML><Font color='Black'>Address </Font></HTML>");
		JLabel jLabel11 = new JLabel("<HTML><Font color='Black'>User Name* </Font></HTML>");
		JLabel jLabel12 = new JLabel("<HTML><Font color='Black'>Password* </Font></HTML>");

		Font f = new Font("Georgia",Font.BOLD,18);
		jLabel3.setFont(f);

		JTextField jTextField1 = new JTextField();
		JTextField jTextField2 = new JTextField();
		JTextField jTextField3 = new JTextField();
		JTextField jTextField4 = new JTextField();
		JTextField jTextField5 = new JTextField();
		JTextField jTextField6 = new JTextField();
		JTextField jTextField7 = new JTextField();
		JPasswordFieldjpassword = new JPasswordField();

		JButton submit = new JButton("Submit");
		JButton back = new JButton("Already Signed In");

		panel1.add(jLabel1);
		panel1.add(jLabel2);

		panel2.add(jLabel3);
		panel2.add(jLabel4);

		panel3.add(jLabel5);
		panel3.add(jTextField1);

		panel4.add(jLabel6);
		panel4.add(jTextField2);

		panel5.add(jLabel7);
		panel5.add(jTextField3);

		panel6.add(jLabel8);
		panel6.add(jTextField4);

		panel7.add(jLabel9);
		panel7.add(jTextField5);

		panel8.add(jLabel10);
		panel8.add(jTextField6);

		panel9.add(jLabel11);
		panel9.add(jTextField7);

		panel10.add(jLabel12);
		panel10.add(jpassword);		

		frame1.add(panel1);
		frame1.add(panel2);
		frame1.add(panel3);
		frame1.add(panel4);
		frame1.add(panel5);
		frame1.add(panel6);
		frame1.add(panel7);
		frame1.add(panel8);
		frame1.add(panel9);
		frame1.add(panel10);
		frame1.add(submit);
		frame1.add(back);		

		panel2.setPreferredSize(new Dimension(500,50));
		panel3.setPreferredSize(new Dimension(500,30));
		panel4.setPreferredSize(new Dimension(500,30));
		panel5.setPreferredSize(new Dimension(500,30));
		panel6.setPreferredSize(new Dimension(500,30));
		panel7.setPreferredSize(new Dimension(500,30));
		panel8.setPreferredSize(new Dimension(500,30));
		panel9.setPreferredSize(new Dimension(500,30));
		panel10.setPreferredSize(new Dimension(500,30));
		panel11.setPreferredSize(new Dimension(200,30));

		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String user = jTextField7.getText();
				String pass = jpassword.getText();
				int flag=0;
				
				if(user.equals("") || pass.equals(""))
				{
					JOptionPane.showMessageDialog(null,"You have not filled all mendatory fields.");
				}
				else
				{
					try
					{
						FileWriterfw = new FileWriter("login.txt", true);
						BufferedWriterbw = new BufferedWriter(fw);
						FileReaderfr = new FileReader("login.txt");
						BufferedReaderbr = new BufferedReader(fr);
						PrintWriter out = new PrintWriter(bw);
						String read=br.readLine();
						while(read != null)
						{
							if(read.equals(user))
							{
								JOptionPane.showMessageDialog(null,"This user name already exists.");
								flag=1;
								break;
							}
							read=br.readLine();
							read=br.readLine();
						}
						if(flag==0)
						{
							out.println(user);
							out.println(pass);
							bw.close();
							JOptionPane.showMessageDialog(null,"You have successfully registered.");
							frame1.dispose();
							new Login();
						}
					}
					catch(IOException e) 
					{
						System.out.print("File Not Found.");
					}
				}
			}
		});
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame1.dispose();
				new Login();
			}
		});
		
		frame1.setVisible(true);
	}
	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Signup();
			}
		});
		
	}
}
