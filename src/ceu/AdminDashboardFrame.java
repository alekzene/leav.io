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
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
		panel_1.setBackground(new Color(255, 255, 255, 150));
		panel_1.setBounds(27, 109, 717, 351);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Leave Requests");
		lblNewLabel_1.setBounds(21, 17, 199, 36);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		JPanel users = new JPanel();
		users.setBackground(new Color(255, 255, 255));
		users.setBounds(21, 57, 675, 272);
		panel_1.add(users);
		users.setLayout(null);
		
		JPanel user1 = new JPanel();
		user1.setBounds(10, 11, 638, 41);
		users.add(user1);
		user1.setForeground(new Color(0, 191, 255));
		user1.setLayout(null);
		
		JButton view1 = new JButton("View");
		view1.setBounds(550, 5, 83, 30);
		view1.setForeground(new Color(0, 64, 128));
		user1.add(view1);
		
		JLabel name1 = new JLabel("Francisco, Earl Ace");
		name1.setForeground(new Color(0, 0, 0));
		name1.setBounds(10, 3, 200, 36);
		user1.add(name1);
		name1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JLabel pos1 = new JLabel("Library");
		pos1.setForeground(Color.BLACK);
		pos1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		pos1.setBounds(256, 3, 61, 36);
		user1.add(pos1);
		
		JLabel type1 = new JLabel("Vacation");
		type1.setForeground(Color.BLACK);
		type1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		type1.setBounds(396, 2, 83, 36);
		user1.add(type1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(658, 0, 17, 272);
		users.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setViewportView(scrollBar);
		scrollBar.setMaximum(15);
		scrollBar.setForeground(new Color(175, 238, 238));
		scrollBar.setBackground(new Color(173, 216, 230));
		
		JPanel user2 = new JPanel();
		user2.setBounds(10, 63, 638, 41);
		users.add(user2);
		user2.setLayout(null);
		user2.setForeground(new Color(0, 191, 255));
		
		JButton view2 = new JButton("View");
		view2.setForeground(new Color(0, 64, 128));
		view2.setBounds(550, 5, 83, 30);
		user2.add(view2);
		
		JLabel name2 = new JLabel("Gallano, Matt Joshua");
		name2.setForeground(Color.BLACK);
		name2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		name2.setBounds(10, 3, 200, 36);
		user2.add(name2);
		
		JLabel pos2 = new JLabel("Canteen");
		pos2.setForeground(Color.BLACK);
		pos2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		pos2.setBounds(256, 3, 83, 36);
		user2.add(pos2);
		
		JLabel type2 = new JLabel("Vacation");
		type2.setForeground(Color.BLACK);
		type2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		type2.setBounds(396, 2, 83, 36);
		user2.add(type2);
		
		JPanel user3 = new JPanel();
		user3.setLayout(null);
		user3.setForeground(new Color(0, 191, 255));
		user3.setBounds(10, 115, 638, 41);
		users.add(user3);
		
		JButton view3 = new JButton("View");
		view3.setForeground(new Color(0, 64, 128));
		view3.setBounds(550, 5, 83, 30);
		user3.add(view3);
		
		JLabel name3 = new JLabel("Arrojo, Jomari");
		name3.setForeground(Color.BLACK);
		name3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		name3.setBounds(10, 3, 200, 36);
		user3.add(name3);
		
		JLabel pos3 = new JLabel("Security");
		pos3.setForeground(Color.BLACK);
		pos3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		pos3.setBounds(256, 3, 83, 36);
		user3.add(pos3);
		
		JLabel type3 = new JLabel("Sick");
		type3.setForeground(Color.BLACK);
		type3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		type3.setBounds(396, 2, 83, 36);
		user3.add(type3);
		
		JPanel user4 = new JPanel();
		user4.setBounds(10, 167, 638, 41);
		users.add(user4);
		user4.setLayout(null);
		user4.setForeground(new Color(0, 191, 255));
		
		JButton view4 = new JButton("View");
		view4.setForeground(new Color(0, 64, 128));
		view4.setBounds(550, 5, 83, 30);
		user4.add(view4);
		
		JLabel name4 = new JLabel("Padilla, Daniel");
		name4.setForeground(Color.BLACK);
		name4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		name4.setBounds(10, 3, 200, 36);
		user4.add(name4);
		
		JLabel pos4 = new JLabel("HR");
		pos4.setForeground(Color.BLACK);
		pos4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		pos4.setBounds(256, 3, 83, 36);
		user4.add(pos4);
		
		JLabel type4 = new JLabel("Paternal");
		type4.setForeground(Color.BLACK);
		type4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		type4.setBounds(396, 2, 83, 36);
		user4.add(type4);
		
		JPanel user5 = new JPanel();
		user5.setLayout(null);
		user5.setForeground(new Color(0, 191, 255));
		user5.setBounds(10, 219, 638, 41);
		users.add(user5);
		
		JButton view5 = new JButton("View");
		view5.setForeground(new Color(0, 64, 128));
		view5.setBounds(550, 5, 83, 30);
		user5.add(view5);
		
		JLabel name5 = new JLabel("Brillantes, Andrea");
		name5.setForeground(Color.BLACK);
		name5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		name5.setBounds(10, 3, 200, 36);
		user5.add(name5);
		
		JLabel pos5 = new JLabel("HR");
		pos5.setForeground(Color.BLACK);
		pos5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		pos5.setBounds(256, 3, 83, 36);
		user5.add(pos5);
		
		JLabel type5 = new JLabel("Maternal");
		type5.setForeground(Color.BLACK);
		type5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		type5.setBounds(396, 2, 83, 36);
		user5.add(type5);
		
		JButton btnNewButton = new JButton("+  New Leave Type");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JTextField leaveTypeField = new JTextField();
                Object[] message = {
                        "Enter new leave type:", leaveTypeField
                };
                int option = JOptionPane.showConfirmDialog(null, message,
                        "New Leave Type", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                		//add to leaves type
                }
            }
        });
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(495, 17, 175, 29);
		panel_1.add(btnNewButton);
		
		int pendingCount= 5;
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255, 150));
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
		
		JLabel bgIMG = new JLabel("");
		bgIMG.setIcon(new ImageIcon(AdminDashboardFrame.class.getResource("/images/bbg.png")));
		bgIMG.setBounds(0, 0, 771, 481);
		contentPane.add(bgIMG);
	}
}
