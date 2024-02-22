package PAVAN;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecomerce {

	private JFrame frame;
	private JTable table;
	int i=0;
	int bill=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecomerce window = new ecomerce();
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
	public ecomerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.setBounds(100, 100, 745, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\gpava\\Downloads\\image.png"));
		lblNewLabel_2.setBounds(460, 100, 156, 263);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\gpava\\OneDrive\\Pictures\\Screenshots\\image3.png"));
		lblNewLabel_1.setBounds(174, 100, 175, 263);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("200/-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(232, 384, 74, 37);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("150/-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(507, 384, 62, 28);
		frame.getContentPane().add(lblNewLabel_4);
		
		table = new JTable();
		table.setBounds(641, 41, 1, 1);
		frame.getContentPane().add(table);
		
		JLabel lb1 = new JLabel("CART:0");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb1.setBounds(543, 26, 99, 28);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Bill:0");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lb2.setBounds(542, 52, 161, 33);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("ADD TO CART");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb1.setText("Cart: "+i);
				bill=bill+200;
				lb2.setText("Bill: "+bill);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(182, 415, 167, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD TO CART");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb1.setText("Cart: "+i);
				bill=bill+150;
				lb2.setText("Bill: "+bill);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(459, 415, 149, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gpava\\Downloads\\image4 (1).jpeg"));
		lblNewLabel.setBounds(345, 26, 100, 51);
		frame.getContentPane().add(lblNewLabel);

	}
}
