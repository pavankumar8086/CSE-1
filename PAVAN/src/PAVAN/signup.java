package PAVAN;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class signup {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JPasswordField ps1;
	private JPasswordField ps2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 778, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Sign In");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLogin.setBounds(145, 59, 233, 51);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUsername.setBounds(43, 136, 174, 51);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPassword.setBounds(43, 214, 164, 51);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblUsername_1 = new JLabel("Username:");
		lblUsername_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUsername_1.setBounds(376, 136, 233, 51);
		frame.getContentPane().add(lblUsername_1);
		
		JLabel lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPassword_1.setBounds(376, 214, 233, 51);
		frame.getContentPane().add(lblPassword_1);
		
		tb1 = new JTextField();
		tb1.setColumns(10);
		tb1.setBounds(217, 148, 126, 32);
		frame.getContentPane().add(tb1);
		
		tb2 = new JTextField();
		tb2.setColumns(10);
		tb2.setBounds(585, 154, 126, 32);
		frame.getContentPane().add(tb2);
		
		JLabel lblSignup = new JLabel("SignUp");
		lblSignup.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSignup.setBounds(495, 59, 233, 51);
		frame.getContentPane().add(lblSignup);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String p=ps1.getText();
				if (n.isEmpty() | (p.isEmpty())){
					
				}
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3310/cse","root","pavan");
					PreparedStatement stn=con.prepareStatement("select user,password from sign where user=? and password=?");
					stn.setString(1, n);
					stn.setString(2, p);
					ResultSet rs=stn.executeQuery();
					if(rs.next()) 
					{
						JOptionPane.showMessageDialog(btnSignIn, "Valid Details!\n Login Success");
					}
					else {
						JOptionPane.showMessageDialog(btnSignIn, "Invalid Username!\n Try Again");
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSignIn.setBounds(133, 305, 112, 51);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb2.getText();
				String p=ps2.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3310/cse","root","pavan");
					String q="insert into sign values('"+n+"','"+p+"')";
					Statement sta=con.createStatement();
					sta.executeLargeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnSignIn, "Done!");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSignUp.setBounds(484, 305, 112, 51);
		frame.getContentPane().add(btnSignUp);
		
		ps1 = new JPasswordField();
		ps1.setBounds(217, 225, 126, 32);
		frame.getContentPane().add(ps1);
		
		ps2 = new JPasswordField();
		ps2.setBounds(585, 225, 126, 32);
		frame.getContentPane().add(ps2);
	}
}
