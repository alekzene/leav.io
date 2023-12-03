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

public class AdminDashboardGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboardGUI frame = new AdminDashboardGUI();
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
	public AdminDashboardGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(53, 27, 36, 25);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(110, 56, 554, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kathryn, you have 5 leave application requests to review.");
		lblNewLabel.setBounds(0, 11, 543, 30);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBounds(53, 119, 656, 341);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Requests");
		lblNewLabel_1.setBounds(20, 11, 124, 36);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(20, 58, 626, 272);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 586, 41);
		panel_3.add(panel_2);
		panel_2.setForeground(new Color(0, 191, 255));
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("View");
		btnNewButton_1.setBounds(493, 3, 83, 30);
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Francisco, Earl Ace D.");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(10, 3, 200, 36);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JLabel lblNewLabel_2_1 = new JLabel("Library         Vacation");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1.setBounds(246, 3, 200, 36);
		panel_2.add(lblNewLabel_2_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 63, 586, 41);
		panel_3.add(panel_2_1);
		panel_2_1.setLayout(null);
		panel_2_1.setForeground(new Color(0, 191, 255));
		
		JButton btnNewButton_1_1 = new JButton("View");
		btnNewButton_1_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1_1.setBounds(493, 3, 83, 30);
		panel_2_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Gallano, Matt");
		lblNewLabel_2_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_2.setBounds(10, 3, 200, 36);
		panel_2_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Canteen       Vacation");
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1.setBounds(245, 3, 200, 36);
		panel_2_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(10, 115, 586, 41);
		panel_3.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setForeground(new Color(0, 191, 255));
		
		JButton btnNewButton_1_1_1 = new JButton("View");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1_1_1.setBounds(493, 3, 83, 30);
		panel_2_1_1.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Arrojo, Jomari");
		lblNewLabel_2_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_2_1.setBounds(10, 3, 200, 36);
		panel_2_1_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Security        Sick");
		lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1.setBounds(244, 3, 200, 36);
		panel_2_1_1.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBounds(10, 167, 586, 41);
		panel_3.add(panel_2_1_1_1);
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setForeground(new Color(0, 191, 255));
		
		JButton btnNewButton_1_1_1_1 = new JButton("View");
		btnNewButton_1_1_1_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1_1_1_1.setBounds(493, 3, 83, 30);
		panel_2_1_1_1.add(btnNewButton_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Padilla, Daniel");
		lblNewLabel_2_2_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_2_1_1.setBounds(10, 3, 200, 36);
		panel_2_1_1_1.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("HR               Paternal");
		lblNewLabel_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1_1.setBounds(243, 3, 200, 36);
		panel_2_1_1_1.add(lblNewLabel_2_1_1_1_1);
		
		JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setBounds(10, 219, 586, 41);
		panel_3.add(panel_2_1_1_1_1);
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setForeground(new Color(0, 191, 255));
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("View");
		btnNewButton_1_1_1_1_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1_1_1_1_1.setBounds(493, 3, 83, 30);
		panel_2_1_1_1_1.add(btnNewButton_1_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Brillantes, Andrea");
		lblNewLabel_2_2_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_2_1_1_1.setBounds(10, 3, 200, 36);
		panel_2_1_1_1_1.add(lblNewLabel_2_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("HR               Maternal");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1_1_1.setBounds(242, 3, 200, 36);
		panel_2_1_1_1_1.add(lblNewLabel_2_1_1_1_1_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setMaximum(15);
		scrollBar.setForeground(new Color(175, 238, 238));
		scrollBar.setBackground(new Color(173, 216, 230));
		scrollBar.setBounds(606, 11, 17, 240);
		panel_3.add(scrollBar);
	}
}
