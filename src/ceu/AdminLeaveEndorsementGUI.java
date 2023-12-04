package ceu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Choice;
import javax.swing.UIManager;

public class AdminLeaveEndorsementGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLeaveEndorsementGUI frame = new AdminLeaveEndorsementGUI();
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
	public AdminLeaveEndorsementGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 516);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0, 1));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel BGpanel = new JPanel();
		BGpanel.setBackground(new Color(0, 0, 0, 1));
		BGpanel.setBounds(0, 0, 621, 546);
		contentPane.add(BGpanel);
		BGpanel.setLayout(null);
		
		JPanel ApplicationForm = new JPanel();
		ApplicationForm.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		ApplicationForm.setBackground(new Color(0, 0 , 0, 50));
		ApplicationForm.setLayout(null);
		ApplicationForm.setBounds(10, 37, 329, 430);
		BGpanel.add(ApplicationForm);
		
		JLabel lblForm = new JLabel("Accomplished Leave Application Form");
		lblForm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblForm.setBounds(10, 11, 309, 14);
		ApplicationForm.add(lblForm);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 36, 309, 383);
		ApplicationForm.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Leave Application");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(89, 30, 117, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Center Scholar University");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(74, 11, 154, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Date:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(10, 68, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Leave Type:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(10, 89, 60, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblEmployeeNo = new JLabel("Employee No.:");
		lblEmployeeNo.setBounds(10, 111, 99, 14);
		panel.add(lblEmployeeNo);
		
		JLabel lblNewLabel_5 = new JLabel("Name:");
		lblNewLabel_5.setBounds(10, 130, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Campus & Office:");
		lblNewLabel_6.setBounds(10, 151, 99, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Specific Purpose:");
		lblNewLabel_7.setBounds(10, 171, 99, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Period Applied");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(10, 206, 99, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("From");
		lblNewLabel_9.setBounds(10, 227, 46, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("To");
		lblNewLabel_10.setBounds(119, 227, 17, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Total no. of Days:");
		lblNewLabel_11.setBounds(10, 246, 109, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Means of Contact:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12.setBounds(10, 281, 117, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Name:");
		lblNewLabel_13.setBounds(10, 306, 46, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_13_1 = new JLabel("Address:");
		lblNewLabel_13_1.setBounds(10, 326, 86, 14);
		panel.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_13_2 = new JLabel("Contact no.:");
		lblNewLabel_13_2.setBounds(10, 346, 86, 14);
		panel.add(lblNewLabel_13_2);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setBounds(119, 68, 46, 14);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_14_1 = new JLabel("New label");
		lblNewLabel_14_1.setBounds(119, 130, 46, 14);
		panel.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_14_1_1 = new JLabel("New label");
		lblNewLabel_14_1_1.setBounds(119, 151, 46, 14);
		panel.add(lblNewLabel_14_1_1);
		
		JLabel lblNewLabel_14_1_1_1 = new JLabel("New label");
		lblNewLabel_14_1_1_1.setBounds(119, 171, 46, 14);
		panel.add(lblNewLabel_14_1_1_1);
		
		JLabel lblNewLabel_14_1_2 = new JLabel("New label");
		lblNewLabel_14_1_2.setBounds(119, 111, 46, 14);
		panel.add(lblNewLabel_14_1_2);
		
		JLabel lblNewLabel_14_1_2_1 = new JLabel("New label");
		lblNewLabel_14_1_2_1.setBounds(119, 89, 46, 14);
		panel.add(lblNewLabel_14_1_2_1);
		
		JLabel lblNewLabel_14_1_1_1_1 = new JLabel("New label");
		lblNewLabel_14_1_1_1_1.setBounds(52, 227, 46, 14);
		panel.add(lblNewLabel_14_1_1_1_1);
		
		JLabel lblNewLabel_14_1_3 = new JLabel("New label");
		lblNewLabel_14_1_3.setBounds(144, 227, 46, 14);
		panel.add(lblNewLabel_14_1_3);
		
		JLabel lblNewLabel_14_1_1_1_2 = new JLabel("New label");
		lblNewLabel_14_1_1_1_2.setBounds(119, 246, 46, 14);
		panel.add(lblNewLabel_14_1_1_1_2);
		
		JLabel lblNewLabel_14_1_1_2 = new JLabel("New label");
		lblNewLabel_14_1_1_2.setBounds(119, 306, 46, 14);
		panel.add(lblNewLabel_14_1_1_2);
		
		JLabel lblNewLabel_14_1_1_2_1 = new JLabel("New label");
		lblNewLabel_14_1_1_2_1.setBounds(119, 326, 46, 14);
		panel.add(lblNewLabel_14_1_1_2_1);
		
		JLabel lblNewLabel_14_1_1_2_1_1 = new JLabel("New label");
		lblNewLabel_14_1_1_2_1_1.setBounds(119, 346, 46, 14);
		panel.add(lblNewLabel_14_1_1_2_1_1);
		
		JPanel remarksType = new JPanel();
		remarksType.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		remarksType.setBackground(new Color(0, 0, 0, 50));
		remarksType.setLayout(null);
		remarksType.setBounds(349, 37, 262, 239);
		BGpanel.add(remarksType);
		
		JLabel lblRemarks = new JLabel("Employee Remarks");
		lblRemarks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRemarks.setBounds(10, 0, 130, 39);
		remarksType.add(lblRemarks);
		
		JLabel lblNewLabel_14_2_1 = new JLabel("New label");
		lblNewLabel_14_2_1.setBounds(20, 296, 221, 164);
		remarksType.add(lblNewLabel_14_2_1);
		lblNewLabel_14_2_1.setVerticalAlignment(SwingConstants.TOP);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 36, 242, 192);
		remarksType.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_14_2 = new JLabel("New label");
		lblNewLabel_14_2.setBounds(10, 11, 222, 170);
		panel_1.add(lblNewLabel_14_2);
		lblNewLabel_14_2.setVerticalAlignment(SwingConstants.TOP);
		
		JPanel Name = new JPanel();
		Name.setBackground(new Color(0, 0, 0, 1));
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(Name, popupMenu);
		popupMenu.setBounds(-6, 0, 145, 32);
		Name.setLayout(null);
		Name.setBounds(10, 11, 329, 15);
		BGpanel.add(Name);
		
		JLabel lblNewLabel = new JLabel(">");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(140, 0, 20, 14);
		Name.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Francisco, Earl Ace");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(20, 0, 125, 14);
		Name.add(lblName);
		
		JLabel lblLeaveApplication = new JLabel("Vacation Leave");
		lblLeaveApplication.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLeaveApplication.setBounds(155, 0, 105, 14);
		Name.add(lblLeaveApplication);
		
		JButton btnApprove = new JButton("Approve");
		btnApprove.setForeground(new Color(255, 255, 255));
		btnApprove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnApprove.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		btnApprove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnApprove.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnApprove.setBackground(new Color(0, 123, 183));
		btnApprove.setBounds(349, 444, 131, 23);
		BGpanel.add(btnApprove);
		
		JButton btnReject = new JButton("Reject");
		btnReject.setForeground(new Color(255, 255, 255));
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReject.setBackground(new Color(232, 60, 94));
		btnReject.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReject.setBounds(490, 444, 121, 23);
		BGpanel.add(btnReject);
		
		JPanel commentType = new JPanel();
		commentType.setLayout(null);
		commentType.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		commentType.setBackground(new Color(0, 0, 0, 50));
		commentType.setBounds(349, 284, 262, 146);
		BGpanel.add(commentType);
		
		JLabel lblRemarks_1 = new JLabel("Comment");
		lblRemarks_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRemarks_1.setBounds(10, 0, 91, 39);
		commentType.add(lblRemarks_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBackground(new Color(240, 240, 240));
		textField.setBounds(10, 38, 242, 97);
		commentType.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBackground(UIManager.getColor("Button.background"));
		textArea_1_1.setBounds(10, 38, 242, 97);
		commentType.add(textArea_1_1);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon("E:\\desktop\\OOP BG.png"));
		lblNewLabel_15.setBounds(0, 0, 621, 480);
		BGpanel.add(lblNewLabel_15);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
