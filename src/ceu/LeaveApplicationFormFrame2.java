package ceu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.Box;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JList;


public class LeaveApplicationFormFrame2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveApplicationFormFrame2 frame = new LeaveApplicationFormFrame2();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //Fullscreen GUI
					frame.setVisible(true); //Fullscreen GUI
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LeaveApplicationFormFrame2() {
		setTitle("Leave Application Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 1300, 930);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton.setBounds(954, 887, 417, 142);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(330, 15, 227, 53);
		comboBox.addItem("Sick Leave");
		comboBox.addItem("Vacation Leave");
		comboBox.addItem("Maternity Leave");
		comboBox.addItem("Paternity Leave");
		comboBox.setSelectedItem(null);
		contentPane.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 79, 886, 982);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Leave Application Form");
		lblNewLabel.setBounds(255, 0, 269, 32);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Faculty Member");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(53, 49, 176, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNon = new JCheckBox("Non-Teaching Employee");
		chckbxNon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNon.setBounds(250, 49, 241, 23);
		panel.add(chckbxNon);
		
		JCheckBox chckbxTopmiddleManager = new JCheckBox("Top/Middle Manager");
		chckbxTopmiddleManager.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxTopmiddleManager.setBounds(519, 49, 209, 23);
		panel.add(chckbxTopmiddleManager);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(10, 105, 832, 73);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Leave Type (Check one): ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 11, 204, 22);
		panel_3.add(lblNewLabel_4);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Vacation");
		chckbxNewCheckBox_1.setBounds(220, 11, 97, 23);
		panel_3.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Sick");
		chckbxNewCheckBox_1_1.setBounds(220, 37, 97, 23);
		panel_3.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("Nuptial");
		chckbxNewCheckBox_1_2.setBounds(319, 14, 97, 23);
		panel_3.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("Birthday Leave");
		chckbxNewCheckBox_1_3.setBounds(319, 37, 97, 23);
		panel_3.add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("Emergency");
		chckbxNewCheckBox_1_4.setBounds(436, 14, 97, 23);
		panel_3.add(chckbxNewCheckBox_1_4);
		
		JCheckBox chckbxNewCheckBox_1_5 = new JCheckBox("Union");
		chckbxNewCheckBox_1_5.setBounds(436, 37, 97, 23);
		panel_3.add(chckbxNewCheckBox_1_5);
		
		JCheckBox chckbxNewCheckBox_1_6 = new JCheckBox("Paternity");
		chckbxNewCheckBox_1_6.setBounds(546, 14, 97, 23);
		panel_3.add(chckbxNewCheckBox_1_6);
		
		JCheckBox chckbxNewCheckBox_1_7 = new JCheckBox("Parental/Solo Parent");
		chckbxNewCheckBox_1_7.setBounds(546, 37, 125, 23);
		panel_3.add(chckbxNewCheckBox_1_7);
		
		JCheckBox chckbxNewCheckBox_1_8 = new JCheckBox("Special Leave for Women");
		chckbxNewCheckBox_1_8.setBounds(670, 14, 156, 23);
		panel_3.add(chckbxNewCheckBox_1_8);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3_1.setBounds(10, 176, 832, 48);
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Employee Number");
		lblNewLabel_5.setBounds(10, 0, 145, 21);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Name (Last Name, First Name, Middle Name) ");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_1.setBounds(225, 0, 364, 21);
		panel_3_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Signature");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_2.setBounds(662, 0, 145, 21);
		panel_3_1.add(lblNewLabel_5_2);
		
		JTextArea textArea_1_4_2 = new JTextArea();
		textArea_1_4_2.setBounds(10, 21, 202, 16);
		panel_3_1.add(textArea_1_4_2);
		
		JTextArea textArea_1_4_2_1 = new JTextArea();
		textArea_1_4_2_1.setBounds(235, 21, 413, 16);
		panel_3_1.add(textArea_1_4_2_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3_2.setBounds(10, 220, 832, 48);
		panel.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel lblNewLabel_5_3 = new JLabel("Campus & Office/School/College/Department");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3.setBounds(10, 0, 350, 21);
		panel_3_2.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("Specific Purpose of Leave");
		lblNewLabel_5_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_1.setBounds(378, 0, 350, 21);
		panel_3_2.add(lblNewLabel_5_3_1);
		
		JTextArea textArea_1_4 = new JTextArea();
		textArea_1_4.setBounds(10, 21, 398, 16);
		panel_3_2.add(textArea_1_4);
		
		JTextArea textArea_1_4_1 = new JTextArea();
		textArea_1_4_1.setBounds(424, 21, 398, 16);
		panel_3_2.add(textArea_1_4_1);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3_3.setBounds(10, 266, 832, 53);
		panel.add(panel_3_3);
		panel_3_3.setLayout(null);
		
		JLabel lblNewLabel_5_3_2 = new JLabel("PERIOD APPLIED FROM OFFICE");
		lblNewLabel_5_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_2.setBounds(10, 0, 247, 21);
		panel_3_3.add(lblNewLabel_5_3_2);
		
		JLabel lblNewLabel_5_3_2_1 = new JLabel("From");
		lblNewLabel_5_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_2_1.setBounds(10, 24, 48, 21);
		panel_3_3.add(lblNewLabel_5_3_2_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(56, 29, 131, 16);
		panel_3_3.add(textArea_1);
		
		JLabel lblNewLabel_5_3_2_1_1 = new JLabel("To");
		lblNewLabel_5_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_2_1_1.setBounds(175, 24, 48, 21);
		panel_3_3.add(lblNewLabel_5_3_2_1_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(212, 29, 131, 16);
		panel_3_3.add(textArea_1_1);
		
		JLabel lblNewLabel_5_3_2_1_1_1 = new JLabel("Total No. of Day/s");
		lblNewLabel_5_3_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_2_1_1_1.setBounds(418, 24, 144, 21);
		panel_3_3.add(lblNewLabel_5_3_2_1_1_1);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setBounds(565, 29, 131, 16);
		panel_3_3.add(textArea_1_1_1);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3_4.setBounds(10, 316, 832, 53);
		panel.add(panel_3_4);
		panel_3_4.setLayout(null);
		
		JLabel lblNewLabel_5_3_2_2 = new JLabel("PERIOD APPLIED FROM TEACHING");
		lblNewLabel_5_3_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_2_2.setBounds(10, 0, 265, 21);
		panel_3_4.add(lblNewLabel_5_3_2_2);
		
		JLabel lblNewLabel_5_3_2_1_2 = new JLabel("From");
		lblNewLabel_5_3_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_2_1_2.setBounds(10, 23, 48, 21);
		panel_3_4.add(lblNewLabel_5_3_2_1_2);
		
		JTextArea textArea_1_2 = new JTextArea();
		textArea_1_2.setBounds(56, 28, 131, 16);
		panel_3_4.add(textArea_1_2);
		
		JLabel lblNewLabel_5_3_2_1_1_2 = new JLabel("To");
		lblNewLabel_5_3_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_2_1_1_2.setBounds(175, 23, 48, 21);
		panel_3_4.add(lblNewLabel_5_3_2_1_1_2);
		
		JTextArea textArea_1_1_2 = new JTextArea();
		textArea_1_1_2.setBounds(212, 28, 131, 16);
		panel_3_4.add(textArea_1_1_2);
		
		JLabel lblNewLabel_5_3_2_1_1_1_1 = new JLabel("Total No. of Hour/s");
		lblNewLabel_5_3_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_2_1_1_1_1.setBounds(418, 23, 144, 21);
		panel_3_4.add(lblNewLabel_5_3_2_1_1_1_1);
		
		JTextArea textArea_1_1_1_1 = new JTextArea();
		textArea_1_1_1_1.setBounds(565, 28, 131, 16);
		panel_3_4.add(textArea_1_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Date: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(10, 79, 47, 14);
		panel.add(lblNewLabel_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(53, 81, 96, 16);
		panel.add(textArea);
		
		JPanel panel_3_4_1 = new JPanel();
		panel_3_4_1.setLayout(null);
		panel_3_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3_4_1.setBounds(10, 367, 832, 227);
		panel.add(panel_3_4_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 812, 208);
		panel_3_4_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Regular Load", null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{"Overload", null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Subject / Class", "Date", "Time", "No. of Hour/s", "Lecture", "Laboratory", "Clinic"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(106);
		table.setBorder(null);
		
		JPanel panel_3_4_2 = new JPanel();
		panel_3_4_2.setBounds(10, 593, 832, 59);
		panel.add(panel_3_4_2);
		panel_3_4_2.setLayout(null);
		panel_3_4_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		
		JLabel lblNewLabel_5_3_3 = new JLabel("Means of contact (Applicable only to employee on long leave):");
		lblNewLabel_5_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_3.setBounds(0, 0, 482, 21);
		panel_3_4_2.add(lblNewLabel_5_3_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Name");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_1.setBounds(10, 33, 47, 14);
		panel_3_4_2.add(lblNewLabel_3_1);
		
		JTextArea textArea_1_3 = new JTextArea();
		textArea_1_3.setBounds(56, 32, 131, 16);
		panel_3_4_2.add(textArea_1_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Address");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_1_1.setBounds(231, 33, 67, 14);
		panel_3_4_2.add(lblNewLabel_3_1_1);
		
		JTextArea textArea_1_3_1 = new JTextArea();
		textArea_1_3_1.setBounds(294, 32, 211, 16);
		panel_3_4_2.add(textArea_1_3_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Contact No.");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_1_1_1.setBounds(555, 33, 95, 14);
		panel_3_4_2.add(lblNewLabel_3_1_1_1);
		
		JTextArea textArea_1_3_2 = new JTextArea();
		textArea_1_3_2.setBounds(648, 32, 131, 16);
		panel_3_4_2.add(textArea_1_3_2);
		
		JPanel panel_3_4_3 = new JPanel();
		panel_3_4_3.setBounds(10, 716, 832, 139);
		panel.add(panel_3_4_3);
		panel_3_4_3.setLayout(null);
		panel_3_4_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		
		JLabel lblNewLabel_5_3_3_1 = new JLabel("Applicant's Leave Credits (To be filled up by Human Resource Department)");
		lblNewLabel_5_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_3_1.setBounds(10, 0, 557, 21);
		panel_3_4_3.add(lblNewLabel_5_3_3_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 26, 812, 75);
		panel_3_4_3.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Unused Leave Before this Application", null, null, null, null, null, null, null, null, null},
				{"Less: Leave Applied for", null, null, null, null, null, null, null, null, null},
				{"Total Leave Credits Available", null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"", "Vacation Leave", "Sick Leave", "Nuptial Leave", "Birthday Leave", "Emergency Leave", "Union Leave", "Paternity Leave", "Parental/Solo Leave", "Special Leave for Women"
			}
		));
		
		JCheckBox chckbxWithPay = new JCheckBox("With pay");
		chckbxWithPay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxWithPay.setBounds(90, 108, 110, 23);
		panel_3_4_3.add(chckbxWithPay);
		
		JCheckBox chckbxWithoutPay = new JCheckBox("Without pay");
		chckbxWithoutPay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxWithoutPay.setBounds(297, 108, 148, 23);
		panel_3_4_3.add(chckbxWithoutPay);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("HR Assistant/Date:");
		lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_2_1.setBounds(543, 111, 165, 20);
		panel_3_4_3.add(lblNewLabel_3_1_2_1);
		
		JTextArea textArea_1_3_3 = new JTextArea();
		textArea_1_3_3.setBounds(669, 115, 153, 16);
		panel_3_4_3.add(textArea_1_3_3);
		
		JPanel panel_3_4_2_1 = new JPanel();
		panel_3_4_2_1.setLayout(null);
		panel_3_4_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3_4_2_1.setBounds(10, 651, 832, 67);
		panel.add(panel_3_4_2_1);
		
		JLabel lblNewLabel_5_3_3_2 = new JLabel("Recommending Approval (for Faculty and Non-Teaching):");
		lblNewLabel_5_3_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_3_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_3_2.setBounds(0, 0, 482, 21);
		panel_3_4_2_1.add(lblNewLabel_5_3_3_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Head/Date");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_2.setBounds(66, 42, 74, 25);
		panel_3_4_2_1.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Dean/Date");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_1_2.setBounds(353, 42, 87, 25);
		panel_3_4_2_1.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("University Official Concerned/Date");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_1_1_1.setBounds(559, 42, 221, 25);
		panel_3_4_2_1.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_5_3_3_2_1 = new JLabel("Approved by (for Top/ Middle Manager):");
		lblNewLabel_5_3_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_3_2_1.setBounds(501, 0, 321, 21);
		panel_3_4_2_1.add(lblNewLabel_5_3_3_2_1);
		
		JTextArea textArea_1_3_2_1 = new JTextArea();
		textArea_1_3_2_1.setBounds(559, 30, 221, 16);
		panel_3_4_2_1.add(textArea_1_3_2_1);
		
		JTextArea textArea_1_3_2_1_1 = new JTextArea();
		textArea_1_3_2_1_1.setBounds(288, 30, 221, 16);
		panel_3_4_2_1.add(textArea_1_3_2_1_1);
		
		JTextArea textArea_1_3_2_1_2 = new JTextArea();
		textArea_1_3_2_1_2.setBounds(10, 30, 221, 16);
		panel_3_4_2_1.add(textArea_1_3_2_1_2);
		
		JPanel panel_3_4_4 = new JPanel();
		panel_3_4_4.setBounds(10, 851, 832, 105);
		panel.add(panel_3_4_4);
		panel_3_4_4.setLayout(null);
		panel_3_4_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		
		JLabel lblNewLabel_5_3_3_1_1 = new JLabel("Action Taken:");
		lblNewLabel_5_3_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5_3_3_1_1.setBounds(0, 0, 129, 21);
		panel_3_4_4.add(lblNewLabel_5_3_3_1_1);
		
		JLabel lblNewLabel_5_3_3_1_1_1 = new JLabel("For Faculty and Non-Teaching:");
		lblNewLabel_5_3_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_3_3_1_1_1.setBounds(10, 21, 245, 21);
		panel_3_4_4.add(lblNewLabel_5_3_3_1_1_1);
		
		JLabel lblNewLabel_5_3_3_1_1_1_1 = new JLabel("For Top/Middle Manager:");
		lblNewLabel_5_3_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_3_3_1_1_1_1.setBounds(17, 42, 193, 21);
		panel_3_4_4.add(lblNewLabel_5_3_3_1_1_1_1);
		
		JCheckBox chckbxAp = new JCheckBox("Approved");
		chckbxAp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxAp.setBounds(248, 22, 110, 23);
		panel_3_4_4.add(chckbxAp);
		
		JCheckBox chckbxNoted = new JCheckBox("Noted");
		chckbxNoted.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNoted.setBounds(248, 49, 110, 23);
		panel_3_4_4.add(chckbxNoted);
		
		JCheckBox chckbxDisspproved = new JCheckBox("Disapproved, Reason");
		chckbxDisspproved.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxDisspproved.setBounds(441, 22, 228, 23);
		panel_3_4_4.add(chckbxDisspproved);
		
		JTextArea textArea_1_3_3_1 = new JTextArea();
		textArea_1_3_3_1.setBounds(653, 26, 153, 16);
		panel_3_4_4.add(textArea_1_3_3_1);
		
		JLabel lblNewLabel_5_3_3_1_1_2 = new JLabel("Head, Human Resource Department");
		lblNewLabel_5_3_3_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_3_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_3_3_1_1_2.setBounds(40, 84, 268, 21);
		panel_3_4_4.add(lblNewLabel_5_3_3_1_1_2);
		
		JTextArea textArea_1_3_3_1_1 = new JTextArea();
		textArea_1_3_3_1_1.setBounds(102, 70, 153, 16);
		panel_3_4_4.add(textArea_1_3_3_1_1);
		
		JLabel lblNewLabel_5_3_3_1_1_2_1 = new JLabel("Date");
		lblNewLabel_5_3_3_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_3_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_3_3_1_1_2_1.setBounds(453, 84, 268, 21);
		panel_3_4_4.add(lblNewLabel_5_3_3_1_1_2_1);
		
		JTextArea textArea_1_3_3_1_1_1 = new JTextArea();
		textArea_1_3_3_1_1_1.setBounds(522, 70, 153, 16);
		panel_3_4_4.add(textArea_1_3_3_1_1_1);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(85);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(82);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(95);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(92);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(954, 428, 417, 416);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("COMMENT");
		lblNewLabel_1.setBounds(150, 11, 121, 32);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 48, 397, 357);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(954, 27, 417, 198);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("CALENDAR");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_2.setBounds(151, 11, 134, 43);
		panel_2.add(lblNewLabel_2);
	}
}
