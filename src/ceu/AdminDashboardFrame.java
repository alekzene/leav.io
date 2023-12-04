package ceu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminDashboardFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboardFrame frame = new AdminDashboardFrame();
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
	public AdminDashboardFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBounds(27, 109, 717, 351);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Leave Requests");
		lblNewLabel_1.setBounds(21, 17, 163, 36);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(21, 57, 675, 272);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 638, 41);
		panel_3.add(panel_2);
		panel_2.setForeground(new Color(0, 191, 255));
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("View");
		btnNewButton_1.setBounds(550, 5, 83, 30);
		btnNewButton_1.setForeground(new Color(0, 64, 128));
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Francisco, Earl Ace");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(10, 3, 200, 36);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JLabel lblNewLabel_2_1 = new JLabel("Library");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1.setBounds(256, 3, 61, 36);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Vacation");
		lblNewLabel_2_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_2.setBounds(396, 2, 83, 36);
		panel_2.add(lblNewLabel_2_1_2);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setMaximum(15);
		scrollBar.setForeground(new Color(175, 238, 238));
		scrollBar.setBackground(new Color(173, 216, 230));
		scrollBar.setBounds(658, 11, 17, 240);
		panel_3.add(scrollBar);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(10, 63, 638, 41);
		panel_3.add(panel_2_2);
		panel_2_2.setLayout(null);
		panel_2_2.setForeground(new Color(0, 191, 255));
		
		JButton btnNewButton_1_2 = new JButton("View");
		btnNewButton_1_2.setForeground(new Color(0, 64, 128));
		btnNewButton_1_2.setBounds(550, 5, 83, 30);
		panel_2_2.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Gallano, Matt Joshua");
		lblNewLabel_2_3.setForeground(Color.BLACK);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_3.setBounds(10, 3, 200, 36);
		panel_2_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Canteen");
		lblNewLabel_2_1_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_3.setBounds(256, 3, 83, 36);
		panel_2_2.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Vacation");
		lblNewLabel_2_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_2_1.setBounds(396, 2, 83, 36);
		panel_2_2.add(lblNewLabel_2_1_2_1);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setForeground(new Color(0, 191, 255));
		panel_2_2_1.setBounds(10, 115, 638, 41);
		panel_3.add(panel_2_2_1);
		
		JButton btnNewButton_1_2_1 = new JButton("View");
		btnNewButton_1_2_1.setForeground(new Color(0, 64, 128));
		btnNewButton_1_2_1.setBounds(550, 5, 83, 30);
		panel_2_2_1.add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Arrojo, Jomari");
		lblNewLabel_2_3_1.setForeground(Color.BLACK);
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_3_1.setBounds(10, 3, 200, 36);
		panel_2_2_1.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Security");
		lblNewLabel_2_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_3_1.setBounds(256, 3, 83, 36);
		panel_2_2_1.add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("Sick");
		lblNewLabel_2_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_2_1_1.setBounds(396, 2, 83, 36);
		panel_2_2_1.add(lblNewLabel_2_1_2_1_1);
		
		JPanel panel_2_2_1_1 = new JPanel();
		panel_2_2_1_1.setBounds(10, 167, 638, 41);
		panel_3.add(panel_2_2_1_1);
		panel_2_2_1_1.setLayout(null);
		panel_2_2_1_1.setForeground(new Color(0, 191, 255));
		
		JButton btnNewButton_1_2_1_1 = new JButton("View");
		btnNewButton_1_2_1_1.setForeground(new Color(0, 64, 128));
		btnNewButton_1_2_1_1.setBounds(550, 5, 83, 30);
		panel_2_2_1_1.add(btnNewButton_1_2_1_1);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Padilla, Daniel");
		lblNewLabel_2_3_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_3_1_1.setBounds(10, 3, 200, 36);
		panel_2_2_1_1.add(lblNewLabel_2_3_1_1);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("HR");
		lblNewLabel_2_1_3_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_3_1_1.setBounds(256, 3, 83, 36);
		panel_2_2_1_1.add(lblNewLabel_2_1_3_1_1);
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("Paternal");
		lblNewLabel_2_1_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_2_1_1_1.setBounds(396, 2, 83, 36);
		panel_2_2_1_1.add(lblNewLabel_2_1_2_1_1_1);
		
		JPanel panel_2_2_1_1_1 = new JPanel();
		panel_2_2_1_1_1.setLayout(null);
		panel_2_2_1_1_1.setForeground(new Color(0, 191, 255));
		panel_2_2_1_1_1.setBounds(10, 219, 638, 41);
		panel_3.add(panel_2_2_1_1_1);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("View");
		btnNewButton_1_2_1_1_1.setForeground(new Color(0, 64, 128));
		btnNewButton_1_2_1_1_1.setBounds(550, 5, 83, 30);
		panel_2_2_1_1_1.add(btnNewButton_1_2_1_1_1);
		
		JLabel lblNewLabel_2_3_1_1_1 = new JLabel("Brillantes, Andrea");
		lblNewLabel_2_3_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_3_1_1_1.setBounds(10, 3, 200, 36);
		panel_2_2_1_1_1.add(lblNewLabel_2_3_1_1_1);
		
		JLabel lblNewLabel_2_1_3_1_1_1 = new JLabel("HR");
		lblNewLabel_2_1_3_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_3_1_1_1.setBounds(256, 3, 83, 36);
		panel_2_2_1_1_1.add(lblNewLabel_2_1_3_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1_1_1_1 = new JLabel("Maternal");
		lblNewLabel_2_1_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_2_1_1_1_1.setBounds(396, 2, 83, 36);
		panel_2_2_1_1_1.add(lblNewLabel_2_1_2_1_1_1_1);
		
		int pendingCount= 5;
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		panel.setBounds(27, 37, 717, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		JLabel lblNewLabel = new JLabel(String.format("Kathryn, you have %S leave application requests to review.", pendingCount));
		lblNewLabel.setBounds(10, 0, 631, 55);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
	}
}
