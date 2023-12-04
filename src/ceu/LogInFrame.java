package ceu;

import java.awt.*;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicRadioButtonUI;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicRadioButtonUI;
import java.awt.*;
import java.awt.event.*;

public class LogInFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UsernametextField;
	private JPasswordField passwordField;
	private javax.swing.JLabel viewpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInFrame frame = new LogInFrame();
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
	public LogInFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel BGpanel = new JPanel();
		BGpanel.setBounds(0, 0, 577, 496);
		contentPane.add(BGpanel);
		BGpanel.setLayout(null);
		
		JPanel Loginpanel = new JPanel();
		Loginpanel.setBackground(new Color(0, 0, 0, 1));
		Loginpanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Loginpanel.setBounds(42, 53, 495, 326);	
		BGpanel.add(Loginpanel);
		Loginpanel.setLayout(null);
		
		  viewpass = new JLabel("");
		  viewpass.addMouseListener(new MouseAdapter() {
		      @Override
		      public void mousePressed(MouseEvent e) {
		          // Toggle password visibility
		          passwordField.setEchoChar((passwordField.getEchoChar() == 0) ? '\u2022' : (char) 0);
		          viewpass.setVisible(true);
		          
		      }
		  });
		  viewpass.setIcon(new ImageIcon("src\\images\\icons8-view-24.png"));
		  viewpass.setBounds(422, 159, 24, 21);
		  Loginpanel.add(viewpass);
				
		JLabel LoginLabel = new JLabel("WELCOME");
		LoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LoginLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		LoginLabel.setBounds(0, 10, 495, 41);
		Loginpanel.add(LoginLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 128, 192));
		panel.setBounds(0, 0, 495, 62);
		Loginpanel.add(panel);
		panel.setLayout(null);
		
		JLabel UsernameLabel = new JLabel("Username");
		UsernameLabel.setIcon(new ImageIcon("src\\images\\icons8-username-24.png"));
		UsernameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		UsernameLabel.setBounds(74, 112, 113, 25);
		Loginpanel.add(UsernameLabel);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setIcon(new ImageIcon("src\\images\\icons8-lock-24.png"));
		PasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		PasswordLabel.setBounds(73, 159, 113, 25);
		Loginpanel.add(PasswordLabel);
		
		UsernametextField = new JTextField();
		UsernametextField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		UsernametextField.setBounds(204, 112, 208, 24);
		Loginpanel.add(UsernametextField);
		UsernametextField.setColumns(10);
		
		JRadioButton RememberRadioButton = new JRadioButton("Remember me") {
            @Override
            protected void paintComponent(Graphics g) {
                if (getModel().isSelected()) {
                    g.setColor(getForeground());
                    g.fillOval(4, 4, 12, 12); // Adjust the position and size as needed
                }
            }
        };
        
		RememberRadioButton = new JRadioButton("Remember me");
		RememberRadioButton.setOpaque(false); 
		RememberRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		RememberRadioButton.setBounds(71, 217, 131, 21);
		Loginpanel.add(RememberRadioButton);
		
		JButton ResetPasswordButton = new JButton("Reset Password");
		ResetPasswordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ResetPasswordButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		ResetPasswordButton.setForeground(Color.BLUE);
		ResetPasswordButton.setBackground(new Color(240, 240, 240));
		ResetPasswordButton.setBounds(291, 185, 122, 18);
		Loginpanel.add(ResetPasswordButton);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogin.setBackground(new Color(255, 128, 192));
		btnLogin.setBounds(274, 243, 139, 41);
		Loginpanel.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(204, 158, 208, 23);
		Loginpanel.add(passwordField);
		
		JLabel bglabel = new JLabel("");
        bglabel.setIcon(new ImageIcon("src\\images\\bbg.png"));
        bglabel.setBounds(0, 0, 577, 430);
        BGpanel.add(bglabel);
	       
 }
	        	
}

