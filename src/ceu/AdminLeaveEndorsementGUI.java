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

public class AdminLeaveEndorsementGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 585);
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
		ApplicationForm.setBounds(10, 37, 329, 487);
		BGpanel.add(ApplicationForm);
		
		JLabel lblForm = new JLabel("Accomplished Leave Application Form");
		lblForm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblForm.setBounds(10, 0, 309, 21);
		ApplicationForm.add(lblForm);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 23, 309, 453);
		ApplicationForm.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Leave Application");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(89, 21, 117, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Center Scholar University");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(70, 11, 154, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Date:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(10, 78, 46, 14);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(119, 75, 166, 20);
		panel.add(textField);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Sick");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbtnNewRadioButton_1.setBounds(135, 95, 46, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Leave Type:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(10, 99, 60, 14);
		panel.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Vacation");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbtnNewRadioButton.setBounds(70, 95, 66, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Nuptial");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbtnNewRadioButton_2.setBounds(183, 95, 55, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Emergency");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbtnNewRadioButton_3.setBounds(236, 95, 86, 23);
		panel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnUnion = new JRadioButton("Union");
		rdbtnUnion.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbtnUnion.setBounds(172, 114, 52, 23);
		panel.add(rdbtnUnion);
		
		JRadioButton rdbtnBirthdayLeave = new JRadioButton("Birthday Leave");
		rdbtnBirthdayLeave.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbtnBirthdayLeave.setBounds(80, 114, 93, 23);
		panel.add(rdbtnBirthdayLeave);
		
		JRadioButton rdbtnPaternity = new JRadioButton("Paternity");
		rdbtnPaternity.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbtnPaternity.setBounds(10, 114, 66, 23);
		panel.add(rdbtnPaternity);
		
		JRadioButton rdbtnParentalsoloParent_1 = new JRadioButton("Parental /Solo Parent");
		rdbtnParentalsoloParent_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbtnParentalsoloParent_1.setBounds(10, 135, 117, 23);
		panel.add(rdbtnParentalsoloParent_1);
		
		JRadioButton rdbtnParentalsoloParent = new JRadioButton("Special Leave for Women");
		rdbtnParentalsoloParent.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbtnParentalsoloParent.setBounds(131, 135, 131, 23);
		panel.add(rdbtnParentalsoloParent);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(119, 161, 166, 20);
		panel.add(textField_1);
		
		JLabel lblEmployeeNo = new JLabel("Employee No.:");
		lblEmployeeNo.setBounds(10, 164, 99, 14);
		panel.add(lblEmployeeNo);
		
		JLabel lblNewLabel_5 = new JLabel("Name:");
		lblNewLabel_5.setBounds(10, 186, 46, 14);
		panel.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 183, 166, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 204, 166, 20);
		panel.add(textField_3);
		
		JLabel lblNewLabel_6 = new JLabel("Campus & Office:");
		lblNewLabel_6.setBounds(10, 207, 99, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Specific Purpose:");
		lblNewLabel_7.setBounds(10, 230, 99, 14);
		panel.add(lblNewLabel_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(119, 225, 166, 22);
		panel.add(textArea);
		
		JLabel lblNewLabel_8 = new JLabel("Period Aplied");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(10, 266, 86, 14);
		panel.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(42, 284, 77, 20);
		panel.add(textField_4);
		
		JLabel lblNewLabel_9 = new JLabel("From");
		lblNewLabel_9.setBounds(10, 287, 46, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("To");
		lblNewLabel_10.setBounds(123, 287, 17, 14);
		panel.add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(138, 284, 86, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(120, 307, 86, 20);
		panel.add(textField_6);
		
		JLabel lblNewLabel_11 = new JLabel("Total no. of Days:");
		lblNewLabel_11.setBounds(10, 310, 109, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Means of Contact:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12.setBounds(10, 332, 117, 14);
		panel.add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(119, 357, 166, 20);
		panel.add(textField_7);
		
		JLabel lblNewLabel_13 = new JLabel("Name:");
		lblNewLabel_13.setBounds(10, 360, 46, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_13_1 = new JLabel("Address:");
		lblNewLabel_13_1.setBounds(10, 383, 86, 14);
		panel.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_13_2 = new JLabel("Contact no.:");
		lblNewLabel_13_2.setBounds(10, 406, 86, 14);
		panel.add(lblNewLabel_13_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(119, 403, 166, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(119, 380, 166, 20);
		panel.add(textField_9);
		
		JPanel remarksType = new JPanel();
		remarksType.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		remarksType.setBackground(new Color(0, 0, 0, 50));
		remarksType.setLayout(null);
		remarksType.setBounds(349, 37, 262, 418);
		BGpanel.add(remarksType);
		
		JLabel lblRemarks = new JLabel("Remarks:");
		lblRemarks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRemarks.setBounds(10, 0, 58, 22);
		remarksType.add(lblRemarks);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 25, 242, 382);
		remarksType.add(textArea_1);
		
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
		
		JLabel lblLeaveApplication = new JLabel("Vacation Leave Application");
		lblLeaveApplication.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLeaveApplication.setBounds(155, 0, 165, 14);
		Name.add(lblLeaveApplication);
		
		JButton btnApprove = new JButton("Approve");
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
		btnApprove.setBackground(new Color(61, 119, 254));
		btnApprove.setBounds(377, 480, 89, 23);
		BGpanel.add(btnApprove);
		
		JButton btnReject = new JButton("Reject");
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReject.setBackground(new Color(178, 34, 34));
		btnReject.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReject.setBounds(493, 480, 89, 23);
		BGpanel.add(btnReject);
		
		JLabel wowbg = new JLabel("");
		wowbg.setIcon(new ImageIcon("E:\\desktop\\OOP BG.png"));
		wowbg.setBounds(0, 0, 621, 546);
		BGpanel.add(wowbg);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
