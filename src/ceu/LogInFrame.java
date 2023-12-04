// FIXME:  Changes not showing when file is ran

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
		backgroundPanel.setBounds(0, 0, 577, 496);
		contentPane.add(backgroundPanel);
		backgroundPanel.setLayout(null);
		
		// LOGIN PANEL
		JPanel logInPanel = new JPanel();
		logInPanel.setBackground(new Color(0, 0, 0, 1));
		logInPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		logInPanel.setBounds(42, 53, 495, 326);	
		backgroundPanel.add(logInPanel);
		logInPanel.setLayout(null);
		
		// WELCOME PANEL
		JPanel welcomePanel = new JPanel();
		welcomePanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		welcomePanel.setBackground(new Color(255, 128, 192));
		welcomePanel.setBounds(0, 0, 495, 62);
		logInPanel.add(welcomePanel);
		welcomePanel.setLayout(null);
		
		// WELCOME LABEL
		JLabel welcomeLabel = new JLabel("WELCOME");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		welcomeLabel.setBounds(0, 10, 495, 41);
		logInPanel.add(welcomeLabel);
		
		// USERNAME LABEL
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setIcon(new ImageIcon("src\\images\\icons8-username-24.png"));
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		usernameLabel.setBounds(74, 112, 113, 25);
		logInPanel.add(usernameLabel);
		
		// USERNAME TEXT FIELD
		usernameTextField = new JTextField();
		usernameTextField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		usernameTextField.setBounds(204, 112, 208, 24);
		logInPanel.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		// PASSWORD LABEL
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setIcon(new ImageIcon("src\\images\\icons8-lock-24.png"));
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		passwordLabel.setBounds(73, 159, 113, 25);
		logInPanel.add(passwordLabel);

		// PASSWORD FIELD
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(204, 158, 208, 23);
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
		  viewPassword.setIcon(new ImageIcon("src\\images\\icons8-view-24.png"));
		  viewPassword.setBounds(422, 159, 24, 21);
		  logInPanel.add(viewPassword);
		  
		// REMEMBER ME RADIO BUTTON
        JRadioButton rememberMeRadioButton = new JRadioButton("Remember Me") {
            @Override
            protected void paintComponent(Graphics g) {
                if (getModel().isSelected()) {
                    g.setColor(getForeground());
                    g.fillOval(4, 4, 12, 12); 
                } else {
                    g.setColor(new Color(0, 0, 0, 0));
                    g.fillRect(0, 0, getWidth(), getHeight());
                }
                super.paintComponent(g);
            }
        };
        
		rememberMeRadioButton.setOpaque(false); 
		rememberMeRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		rememberMeRadioButton.setBounds(71, 217, 131, 21);
		logInPanel.add(rememberMeRadioButton);
		
		// RESET PASSWORD BUTTON
		JButton resetPasswordButton = new JButton("Reset PW");
		resetPasswordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		resetPasswordButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		resetPasswordButton.setForeground(new Color(64, 64, 64));
		resetPasswordButton.setBackground(new Color(240, 240, 240));
		resetPasswordButton.setBounds(291, 185, 122, 18);
		logInPanel.add(resetPasswordButton);
		
		// LOGIN BUTTON
		JButton logInButton = new JButton("LOGIN");
		logInButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		logInButton.setBackground(Color.BLACK);
		logInButton.setBounds(274, 243, 139, 41);
		logInPanel.add(logInButton);
		
		// BACKGROUND
		JLabel backgroundLabel = new JLabel("");
        backgroundLabel.setIcon(new ImageIcon("src\\images\\bbg.png"));
        backgroundLabel.setBounds(0, 0, 577, 430);
        backgroundPanel.add(backgroundLabel);
	       
 }
	        	
}

