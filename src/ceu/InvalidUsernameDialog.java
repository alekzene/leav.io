package ceu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InvalidUsernameDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InvalidUsernameDialog dialog = new InvalidUsernameDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InvalidUsernameDialog() {
		setBounds(100, 100, 372, 211);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton okButton = new JButton("OK");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			okButton.setBounds(146, 112, 61, 31);
			okButton.setActionCommand("OK");
			contentPanel.add(okButton);
		}
		{
			JLabel lblNewLabel = new JLabel("Invalid Username");
			lblNewLabel.setBounds(78, 38, 198, 35);
			lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
			contentPanel.add(lblNewLabel);
		}
		
		JLabel lblNewLabel_1 = new JLabel("Account does not exist.");
		lblNewLabel_1.setBounds(94, 71, 166, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPanel.add(lblNewLabel_1);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon("C:\\OOP_Repo\\Leave-Application-System\\src\\images\\bbg.png"));
		Background.setBounds(0, -18, 444, 280);
		contentPanel.add(Background);
	}
}
