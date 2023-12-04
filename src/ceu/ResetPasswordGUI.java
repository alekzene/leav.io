package ceu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ResetPasswordGUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;
    private JPasswordField passwordField_2;
    private ArrayList<String> passwords = new ArrayList<>();

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

        JLabel lblNewPassword = new JLabel("New Password:");
        lblNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewPassword.setBounds(10, 104, 165, 14);
        BGpanel.add(lblNewPassword);

        JLabel lblConfirmNewPassword = new JLabel("Confirm New Password:");
        lblConfirmNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblConfirmNewPassword.setBounds(10, 130, 165, 14);

        BGpanel.add(lblConfirmNewPassword);

        JButton btnNewButton = new JButton("OK");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.setBackground(new Color(135, 206, 235));
        btnNewButton.setBounds(236, 179, 89, 23);
        BGpanel.add(btnNewButton);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCancel.setBounds(335, 179, 89, 23);
        BGpanel.add(btnCancel);

        passwordField = new JPasswordField();
        passwordField.setBounds(185, 77, 239, 20);
        BGpanel.add(passwordField);

        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(185, 103, 239, 20);
        BGpanel.add(passwordField_1);

        passwordField_2 = new JPasswordField();
        passwordField_2.setBounds(185, 129, 239, 20);
        BGpanel.add(passwordField_2);

        passwords.add("samplepass");

        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oldPassword = new String(passwordField.getPassword());
                String newPassword = new String(passwordField_1.getPassword());
                String confirmNewPassword = new String(passwordField_2.getPassword());

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

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code for cancel button action, if needed
            }
        });
    }

    private void updatePassword(String oldPassword, String newPassword) {
        passwords.remove(oldPassword);
        passwords.add(newPassword);
    }
}