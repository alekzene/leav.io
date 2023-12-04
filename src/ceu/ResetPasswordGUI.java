package ceu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class ResetPasswordGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResetPasswordGUI frame = new ResetPasswordGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ResetPasswordGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel BGpanel = new JPanel();
		BGpanel.setBounds(0, 0, 434, 261);
		contentPane.add(BGpanel);
		BGpanel.setLayout(null);
		
		JLabel resetPassword = new JLabel("Reset Password");
		resetPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		resetPassword.setBounds(10, 11, 124, 14);
		BGpanel.add(resetPassword);
		
		JLabel lblResetPassword = new JLabel("Old Password:");
		lblResetPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResetPassword.setBounds(10, 78, 165, 14);
		BGpanel.add(lblResetPassword);
		
		textField = new JTextField();
		textField.setBounds(185, 77, 239, 20);
		BGpanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewPassword.setBounds(10, 104, 165, 14);
		BGpanel.add(lblNewPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(185, 103, 239, 20);
		BGpanel.add(textField_1);
		
		JLabel lblConfirmNewPassword = new JLabel("Confirm New Password:");
		lblConfirmNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfirmNewPassword.setBounds(10, 130, 165, 14);
		BGpanel.add(lblConfirmNewPassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(185, 129, 239, 20);
		BGpanel.add(textField_2);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setBounds(236, 179, 89, 23);
		BGpanel.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBounds(335, 179, 89, 23);
		BGpanel.add(btnCancel);
		
		JLabel bgIMG = new JLabel("");
		bgIMG.setIcon(new ImageIcon("E:\\desktop\\OOP BG.png"));
		bgIMG.setBounds(0, 0, 434, 220);
		BGpanel.add(bgIMG);
	}
}
