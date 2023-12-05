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
    private JPasswordField oldPasswordField;
    private JPasswordField newPasswordField;
    private JPasswordField confirmNewPasswordField;
    private ArrayList<String> passwords = new ArrayList<>();

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

        // RESET PASSWORD LABEL
        JLabel resetPasswordLabel = new JLabel("Reset Password");
        resetPasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        resetPasswordLabel.setBounds(10, 11, 124, 14);
        backgroundPanel.add(resetPasswordLabel);

        // OLD PASSWORD LABEL
        JLabel employee_Id = new JLabel("Employee ID:");
        employee_Id.setHorizontalAlignment(SwingConstants.CENTER);
        employee_Id.setFont(new Font("Tahoma", Font.PLAIN, 14));
        employee_Id.setBounds(20, 80, 155, 14);
        backgroundPanel.add(employee_Id);

        // NEW PASSWORD LABEL
        JLabel newPasswordLabel = new JLabel("New Password:");
        newPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        newPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        newPasswordLabel.setBounds(10, 104, 165, 14);
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

        // OLD PASSWORD FIELD
        oldPasswordField = new JPasswordField();
        oldPasswordField.setBounds(185, 77, 239, 20);
        backgroundPanel.add(oldPasswordField);

        // NEW PASSWORD FIELD
        newPasswordField = new JPasswordField();
        newPasswordField.setBounds(185, 103, 239, 20);
        backgroundPanel.add(newPasswordField);

        // CONFIRM NEW PASSWORD FIELD
        confirmNewPasswordField = new JPasswordField();
        confirmNewPasswordField.setBounds(185, 129, 239, 20);
        backgroundPanel.add(confirmNewPasswordField);
        
        JLabel userName = new JLabel("[insert username]");
        userName.setFont(new Font("Tahoma", Font.BOLD, 14));
        userName.setBounds(10, 47, 239, 14);
        backgroundPanel.add(userName);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(ResetPasswordFrame.class.getResource("/images/bbg.png")));
        lblNewLabel.setBounds(0, 0, 434, 261);
        backgroundPanel.add(lblNewLabel);

        // FIXME: LOGIC
        passwords.add("password");

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oldPassword = new String(oldPasswordField.getPassword());
                String newPassword = new String(newPasswordField.getPassword());
                String confirmNewPassword = new String(confirmNewPasswordField.getPassword());

                if (!passwords.contains(oldPassword)) {
                    JOptionPane.showMessageDialog(null, "Incorrect old password.");
                    return;
                }

                if (oldPassword.equals(newPassword)) {
                    JOptionPane.showMessageDialog(null, "New password should be different from the old password.");
                    return;
                }

                if (!newPassword.equals(confirmNewPassword)) {
                    JOptionPane.showMessageDialog(null, "New password and confirm password do not match.");
                    return;
                }

                updatePassword(oldPassword, newPassword);
                JOptionPane.showMessageDialog(null, "Password updated successfully.");
            }
        });
    }

    private void updatePassword(String oldPassword, String newPassword) {
        passwords.remove(oldPassword);
        passwords.add(newPassword);
    }
}