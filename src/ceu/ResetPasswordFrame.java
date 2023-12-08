package ceu;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResetPasswordFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    
    // JAVA SWING
    private JPanel contentPane;
    private JPasswordField newPasswordField;
    private JPasswordField confirmNewPasswordField;
    private ArrayList<String> passwords = new ArrayList<>();
    private JTextField employeeIDTextField;
    
    // DATABASE
    private Connection connection;
    private QueryCommands qc;
    private String employeeIDDB;
    private String passwordDB;

    // MAIN
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ResetPasswordFrame frame = new ResetPasswordFrame();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ResetPasswordFrame() {        
        // DATABASE
    	connection = DatabaseConnection.getConnection();
    	qc = new QueryCommands();
        
        // CONTENT PANE
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 259);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // BACKGROUND PANEL
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBounds(0, 0, 434, 261);
        contentPane.add(backgroundPanel);
        backgroundPanel.setLayout(null);
        
        // NEW PASSWORD VIEW ICON
        JLabel newPasswordViewIcon = new JLabel("New label");
        newPasswordViewIcon.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		// TOGGLE NEW PASSWORD VISIBILITY
        		newPasswordField.setEchoChar((newPasswordField.getEchoChar() == 0) ? '\u2022' : (char) 0);
		          newPasswordViewIcon.setVisible(true);
		          
        	}
        });
        newPasswordViewIcon.setIcon(new ImageIcon(ResetPasswordFrame.class.getResource("/images/icons8-eye-24.png")));
        newPasswordViewIcon.setBounds(397, 97, 24, 22);
        backgroundPanel.add(newPasswordViewIcon);
        
        // CONFIRM PASSWORD VIEW ICON
        JLabel confirmPasswordViewIcon = new JLabel("New label");
        confirmPasswordViewIcon.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		// TOGGLE CONFIRMED NEW PASSWORD VISIBILITY
        		confirmNewPasswordField.setEchoChar((confirmNewPasswordField.getEchoChar() == 0) ? '\u2022' : (char) 0);
        		confirmPasswordViewIcon.setVisible(true);
        	}
        });
        confirmPasswordViewIcon.setIcon(new ImageIcon(ResetPasswordFrame.class.getResource("/images/icons8-eye-24.png")));
        confirmPasswordViewIcon.setBounds(397, 129, 24, 22);
        backgroundPanel.add(confirmPasswordViewIcon);
        
        // EMPLOYEE ID TEXT FIELD
        employeeIDTextField = new JTextField();
        employeeIDTextField.addKeyListener(new KeyAdapter() {
      	  public void keyTyped(KeyEvent e) {
                char inputChar = e.getKeyChar();
                if (!Character.isDigit(inputChar) && inputChar != KeyEvent.VK_BACK_SPACE) {
                    e.consume(); // IGNORE NON-NUMERIC INPUT
                }
            }
        });
        employeeIDTextField.setBounds(185, 65, 202, 19);
        backgroundPanel.add(employeeIDTextField);
        employeeIDTextField.setColumns(10);

        // RESET PASSWORD LABEL
        JLabel resetPasswordLabel = new JLabel("Reset Password");
        resetPasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        resetPasswordLabel.setBounds(20, 10, 145, 14);
        backgroundPanel.add(resetPasswordLabel);

        // EMPLOYEE ID LABEL
        JLabel employeeIDLabel = new JLabel("Employee ID");
        employeeIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
        employeeIDLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        employeeIDLabel.setBounds(20, 65, 155, 14);
        backgroundPanel.add(employeeIDLabel);

        // NEW PASSWORD LABEL
        JLabel newPasswordLabel = new JLabel("New Password");
        newPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        newPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        newPasswordLabel.setBounds(10, 97, 165, 14);
        backgroundPanel.add(newPasswordLabel);

        // CONFIRM NEW PASSWORD LABEL
        JLabel confirmNewPasswordLabel = new JLabel("Confirm New Password");
        confirmNewPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        confirmNewPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        confirmNewPasswordLabel.setBounds(10, 130, 165, 14);
        backgroundPanel.add(confirmNewPasswordLabel);

        // OK BUTTON
        JButton okButton = new JButton("OK");
        okButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        okButton.setBackground(new Color(135, 206, 235));
        okButton.setBounds(236, 179, 89, 23);
        backgroundPanel.add(okButton);

        // CANCEL BUTTON
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(cancelButton);
                currentFrame.dispose();
        	}
        });
        
        cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cancelButton.setBounds(335, 179, 89, 23);
        backgroundPanel.add(cancelButton);

        // NEW PASSWORD FIELD
        newPasswordField = new JPasswordField();
        newPasswordField.setBounds(185, 97, 202, 20);
        backgroundPanel.add(newPasswordField);

        // CONFIRM NEW PASSWORD FIELD
        confirmNewPasswordField = new JPasswordField();
        confirmNewPasswordField.setBounds(185, 129, 202, 20);
        backgroundPanel.add(confirmNewPasswordField);
        
        // BACKGROUND (AS A LABEL)s
        JLabel backgroundLabel = new JLabel("");
        backgroundLabel.setIcon(new ImageIcon(ResetPasswordFrame.class.getResource("/images/bbg.png")));
        backgroundLabel.setBounds(-10, 0, 493, 277);
        backgroundPanel.add(backgroundLabel);

        // LOGIC FOR OK BUTTON
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String enteredEmployeeID = new String(employeeIDTextField.getText());
                String enteredNewPassword = new String(newPasswordField.getPassword());
                String enteredConfirmNewPassword = new String(confirmNewPasswordField.getPassword());
     

                // CHECK IF FIELDS ARE EMPTY
                if (enteredEmployeeID.isEmpty() || enteredNewPassword.isEmpty() || enteredConfirmNewPassword.isEmpty() )
                {
                    JOptionPane.showMessageDialog(null, "Fill all required fields.");
                    return;
                }
                else
                {
                	// CHECK IF ENTERED EMPLOYEE ID IS IN DATABASE
    	            try (ResultSet resultSet = qc.prepareSelectEmployeeIDStatement(connection, enteredEmployeeID).executeQuery()) {
    	                if (resultSet.next()) {
    	                    employeeIDDB = resultSet.getString("employee_id");
    	                }
    	            } catch (SQLException ex) {
    	                ex.printStackTrace();
    	            }
    	            
    	            if (!enteredEmployeeID.equals(employeeIDDB))
    	            {
        	            JOptionPane.showMessageDialog(null, "Account not found.");
    	            }
    	            else
    	            {
    	            	// CHECK IF NEW PASSWORD AND CONFIRMED NEW PASSWORD ARE THE SAME
    	            	if (enteredNewPassword.equals(enteredConfirmNewPassword)) {
	                        	// UPDATE PASSWORD IN DATABASE
	    	            		try {
	    	            		    int rowsAffected = qc.prepareUpdatePasswordStatement(connection, enteredConfirmNewPassword, enteredEmployeeID).executeUpdate();
	    	            		    if (rowsAffected > 0) {
	    	            		        JOptionPane.showMessageDialog(null, "Password updated successfully!");
	    	                    		JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(okButton);
	    	                            currentFrame.dispose();
	    	            		    } else {
	    	            		        JOptionPane.showMessageDialog(null, "Password update failed!");
	    	            		    }
	    	            		} catch (SQLException ex) {
	    	            		    ex.printStackTrace();
	    	            		}
    	            		}
    	            	else
    	            	{
            	            JOptionPane.showMessageDialog(null, "New password and confirm password do not match.");
    	            	}
    	            }
    	            
                }
            }
        });
    }
}