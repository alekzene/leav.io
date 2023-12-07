package ceu;

import java.awt.*;

import javax.swing.*;
import javax.swing.plaf.*;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.border.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;

public class LogInFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameTextField;
	private JPasswordField passwordField;
	private javax.swing.JLabel viewPassword;
	
	
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
		
		//  BACKGROUND PANEL
		JPanel backgroundPanel = new JPanel();
		backgroundPanel.setBounds(0, 0, 577, 431);
		contentPane.add(backgroundPanel);
		backgroundPanel.setLayout(null);
		
		// LOGIN PANEL
		JPanel logInPanel = new JPanel();
		logInPanel.setBackground(new Color(0, 0, 0, 1));
		logInPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		logInPanel.setBounds(42, 53, 495, 326);	
		backgroundPanel.add(logInPanel);
		logInPanel.setLayout(null);
		
		// WELCOME LABEL
		JLabel welcomeLabel = new JLabel("WELCOME");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		welcomeLabel.setBounds(0, 10, 495, 41);
		logInPanel.add(welcomeLabel);
		
		// USERNAME LABEL
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setIcon(new ImageIcon("src\\images\\icons8-username-24.png"));
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		usernameLabel.setBounds(45, 112, 150, 25);
		logInPanel.add(usernameLabel);
		
		// USERNAME TEXT FIELD
		usernameTextField = new JTextField();
		usernameTextField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		usernameTextField.setBounds(170, 114, 208, 24);
		logInPanel.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		// PASSWORD LABEL
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setIcon(new ImageIcon("src\\images\\icons8-lock-24.png"));
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		passwordLabel.setBounds(45, 159, 113, 25);
		logInPanel.add(passwordLabel);

		// PASSWORD FIELD
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(170, 161, 208, 23);
		logInPanel.add(passwordField);
		
		// VIEW PASSWORD ICON
		viewPassword = new JLabel("");
		viewPassword.addMouseListener(new MouseAdapter() {
		      @Override
		      public void mousePressed(MouseEvent e) {
		          // Toggle password visibility
		          passwordField.setEchoChar((passwordField.getEchoChar() == 0) ? '\u2022' : (char) 0);
		          viewPassword.setVisible(true);
		          
		      }
		  });
		  viewPassword.setIcon(new ImageIcon(LogInFrame.class.getResource("/images/icons8-eye-24.png")));
		  viewPassword.setBounds(388, 163, 24, 21);
		  logInPanel.add(viewPassword);
		  
		// REMEMBER ME RADIO BUTTON
        JRadioButton rememberMeRadioButton = new JRadioButton("Remember Me");
        rememberMeRadioButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		// FIXME: ADD CODE HERE. MUST REMEMBER USER WHEN CLICKED.
        	}
        });
		rememberMeRadioButton.setOpaque(false); 
		rememberMeRadioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		rememberMeRadioButton.setBounds(67, 192, 131, 21);
		logInPanel.add(rememberMeRadioButton);
		
		// RESET PASSWORD BUTTON
		JButton resetPasswordButton = new JButton("Forgot Password?");
		resetPasswordButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ResetPasswordFrame resetPasswordFrame = new ResetPasswordFrame();
				resetPasswordFrame.setVisible(true);
			}
		});
		resetPasswordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		resetPasswordButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		resetPasswordButton.setForeground(new Color(64, 64, 64));
		resetPasswordButton.setBackground(new Color(240, 240, 240));
		resetPasswordButton.setBounds(203, 195, 175, 18);
		logInPanel.add(resetPasswordButton);
		
		// LOGIN BUTTON
		JButton logInButton = new JButton("LOGIN");
		logInButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {

		        // GET ENTERED CREDENTIALS
		        String enteredUsername = usernameTextField.getText();
		        String enteredPassword = String.valueOf(passwordField.getPassword());

		        // FIXME: DATABASE DEPENDENCY. STILL HARD-CODED. ADJUST ACCORDINGLY.
		        boolean usernameFound = true; // Assume username is found for now
		        boolean passwordCorrect = true; // Assume password is correct for now

		        // VALIDATE ENTERED CREDENTIALS
		        if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Credential fields cannot be empty.");
		        } else if (!usernameFound) {
		            JOptionPane.showMessageDialog(null, "Account does not exist.");
		        } else if (!passwordCorrect) {
		            JOptionPane.showMessageDialog(null, "Incorrect Password");
		        } else {
		            // CLOSE LOG IN FRAME
		            LogInFrame.this.dispose();

		            // GET USER TYPE
		            String userType = "EMPLOYEE"; // FIXME: Modify. Must get user type from database.

		            if (userType.equals("EMPLOYEE")) {
		                // OPEN USER DASHBOARD
		                UserDashboardFrame userDashboardFrame = new UserDashboardFrame();
		                userDashboardFrame.setVisible(true);
		            } else if (userType.equals("ADMIN")) {
		                // OPEN ADMIN DASHBOARD
		                AdminDashboardFrame adminDashboardFrame = new AdminDashboardFrame();
		                adminDashboardFrame.setVisible(true);
		            }
		        }
		    }
		});
		logInButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		logInButton.setBackground(new Color(255, 128, 192));
		logInButton.setBounds(170, 244, 139, 41);
		logInPanel.add(logInButton);
		
		// WELCOME PANEL
		JPanel welcomePanel = new JPanel();
		welcomePanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		welcomePanel.setBackground(new Color(255, 128, 192));
		welcomePanel.setBounds(0, 0, 495, 62);
		logInPanel.add(welcomePanel);
		welcomePanel.setLayout(null);
		
		// BACKGROUND
		JLabel backgroundLabel = new JLabel("");
        backgroundLabel.setIcon(new ImageIcon(LogInFrame.class.getResource("/images/bbg.png")));
        backgroundLabel.setBounds(0, 0, 577, 430);
        backgroundPanel.add(backgroundLabel);
 }
}

