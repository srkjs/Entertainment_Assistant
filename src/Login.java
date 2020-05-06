package p1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import p2.Signup;
import p3.Entertainment;
public class Login
{	public Login()
	{	JFrame frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,450);
		frame.setLocation(400,100);
		frame.setLayout(new FlowLayout());
ImageIcon icon1 = new ImageIcon("2.jpg");
		ImageIconicon2 = new ImageIcon("1.jpg");
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		JPanel panel6=new JPanel();

		panel1.setLayout(new GridLayout(1,2));
		panel2.setLayout(new GridLayout(1,1));
		panel3.setLayout(new GridLayout(1,2));
		panel4.setLayout(new GridLayout(1,2));
		JLabel jLabel1 = new JLabel(icon1);
		JLabel jLabel2 = new JLabel(icon2);
		JLabel jLabel3 = new JLabel("<HTML><Font color='Black'>Login</Font></HTML>",JLabel.CENTER);
		JLabel jLabel4 = new JLabel("<HTML><Font color='Black'>User Name </Font></HTML>");
		JLabel jLabel5 = new JLabel("<HTML><Font color='Black'>Password </Font></HTML>");
		JLabel jLabel6 = new JLabel("<HTML><Font color='Black'>New Member? </Font></HTML>");
		Font f = new Font("Georgia",Font.BOLD,18);
		jLabel3.setFont(f);
		JTextField jTextField1 = new JTextField();
		JPasswordFieldjpassword = new JPasswordField();
		JButton login=new JButton("Login");
		JButton reset=new JButton("Reset");
		JButton exit= new JButton("Exit");
		JButton signup = new JButton("<HTML><Font color='Black'>Sign Up </Font></HTML>");

		Font fa = new Font("Georgia",Font.BOLD,14);
		signup.setFont(fa);
		
		panel1.add(jLabel1);
		panel1.add(jLabel2);
		
		panel2.add(jLabel3);

		panel3.add(jLabel4);
		panel3.add(jTextField1);
		panel4.add(jLabel5);
		panel4.add(jpassword);
		panel5.add(login);
		panel5.add(reset);
		panel5.add(exit);
		panel6.add(jLabel6);
		panel6.add(signup);
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);
		frame.add(panel6);
		panel6.setPreferredSize(new Dimension(550,40));
		panel2.setPreferredSize(new Dimension(500,30));
		panel3.setPreferredSize(new Dimension(500,30));
		panel4.setPreferredSize(new Dimension(500,30));
		reset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				jTextField1.setText("");
				jpassword.setText("");
			}
		});
		exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		});
		login.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String a = jTextField1.getText();
				String b = jpassword.getText();
				try
				{
					BufferedReader bf = new BufferedReader(new FileReader("login.txt"));
					String username = jTextField1.getText();
					String password = jpassword.getText();
					int flag=0;
					String read1 = bf.readLine();
					String read2;
					while(read1!=null)
					{
						if(read1.equals(username))
						{
							read2 = bf.readLine();
							if(read2.equals(password))
							{
								flag=1;
								break;
							}
							else
							{
								break;
							}
						}
						else
						{
							read1=bf.readLine();
						}
						read1=bf.readLine();
					}
					if( username.equals("")||password.equals("")||flag==0)
					{
						JOptionPane.showMessageDialog(null,"Invalid Username Or Password");
					}
					else if(flag==1)
					{
						JOptionPane.showMessageDialog(null,"You have Successfully Logged in.");
						frame.dispose();
						new Entertainment();
					}
				}
				catch(IOException e)
				{
					System.out.print("FILE NOT FOUND");
				}
			}
		});
		signup.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				frame.dispose();
				new Signup();
			}
		});
		
		frame.setVisible(true);
	}
	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Login();
			}
		});
	}
}
