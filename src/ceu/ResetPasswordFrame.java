package ceu;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class ResetPasswordFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPasswordField newPasswordField;
    private JPasswordField confirmNewPasswordField;
    private ArrayList<String> passwords = new ArrayList<>();
    private JTextField EmployeeIdTextField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ResetPasswordFrame frame = new ResetPasswordFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ResetPasswordFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 259);
        
        // CONTENT PANE
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // BACKGROUND PANEL
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBounds(0, 0, 434, 261);
        contentPane.add(backgroundPanel);
        backgroundPanel.setLayout(null);
        
        //Icon
        JLabel ConfirmPassViewIcon = new JLabel("New label");
        ConfirmPassViewIcon.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		  // Toggle password visibility
        		confirmNewPasswordField.setEchoChar((confirmNewPasswordField.getEchoChar() == 0) ? '\u2022' : (char) 0);
        		ConfirmPassViewIcon.setVisible(true);
		          
        	}
        });
        ConfirmPassViewIcon.setIcon(new ImageIcon(ResetPasswordFrame.class.getResource("/images/icons8-eye-24.png")));
        ConfirmPassViewIcon.setBounds(397, 129, 24, 22);
        backgroundPanel.add(ConfirmPassViewIcon);
        
        //Icon
        JLabel NewPassViewIcon = new JLabel("New label");
        NewPassViewIcon.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		  // Toggle password visibility
        		newPasswordField.setEchoChar((newPasswordField.getEchoChar() == 0) ? '\u2022' : (char) 0);
		          NewPassViewIcon.setVisible(true);
		          
        	}
        });
        NewPassViewIcon.setIcon(new ImageIcon(ResetPasswordFrame.class.getResource("/images/icons8-eye-24.png")));
        NewPassViewIcon.setBounds(397, 97, 24, 22);
        backgroundPanel.add(NewPassViewIcon);
        
        EmployeeIdTextField = new JTextField();
        EmployeeIdTextField.addKeyListener(new KeyAdapter() {
      	  public void keyTyped(KeyEvent e) {
                char inputChar = e.getKeyChar();
                if (!Character.isDigit(inputChar) && inputChar != KeyEvent.VK_BACK_SPACE) {
                    e.consume(); // Ignore non-numeric input
                }
            }
        });
        EmployeeIdTextField.setBounds(185, 65, 202, 19);
        backgroundPanel.add(EmployeeIdTextField);
        EmployeeIdTextField.setColumns(10);

        // RESET PASSWORD LABEL
        JLabel resetPasswordLabel = new JLabel("Reset Password");
        resetPasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        resetPasswordLabel.setBounds(20, 10, 145, 14);
        backgroundPanel.add(resetPasswordLabel);

        // Employee ID
        JLabel employee_Id = new JLabel("Employee ID:");
        employee_Id.setHorizontalAlignment(SwingConstants.CENTER);
        employee_Id.setFont(new Font("Tahoma", Font.PLAIN, 14));
        employee_Id.setBounds(20, 65, 155, 14);
        backgroundPanel.add(employee_Id);

        // NEW PASSWORD LABEL
        JLabel newPasswordLabel = new JLabel("New Password:");
        newPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        newPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        newPasswordLabel.setBounds(10, 97, 165, 14);
        backgroundPanel.add(newPasswordLabel);

        // CONFIRM NEW PASSWORD LABEL
        JLabel confirmNewPasswordLabel = new JLabel("Confirm New Password:");
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
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(ResetPasswordFrame.class.getResource("/images/bbg.png")));
        lblNewLabel.setBounds(-10, 0, 493, 277);
        backgroundPanel.add(lblNewLabel);

        // FIXME: LOGIC
        passwords.add("password");

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String EmployeeID = new String(EmployeeIdTextField.getText());
                String newPassword = new String(newPasswordField.getPassword());
                String confirmNewPassword = new String(confirmNewPasswordField.getPassword());

      
//                if (oldPassword.equals(newPassword)) {
//                    JOptionPane.showMessageDialog(null, "New password should be different from the old password.");
//                    return;
//                }

                
                // Check if newPassword is null or empty
                if (newPassword == null || newPassword.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Password cannot be empty.");
                    return;
                }
                
                if (!newPassword.equals(confirmNewPassword)) {
                    JOptionPane.showMessageDialog(null, "New password and confirm password do not match.");
                    return;
                }
                updatePassword(newPassword);
                JOptionPane.showMessageDialog(null, "Password updated successfully.");
                
                Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
                if (window instanceof JDialog) {
                    JDialog dialog = (JDialog) window;
                    dialog.dispose();
                }
                
                dispose();
            }
        });
    }

    private void updatePassword(String newPassword) {
       
        // For example, you might want to update the password in a database
        // or store it in a data structure
        passwords.add(newPassword);
    }
}