package ceu;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class UserDashboardFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable approveTracker_Table;
	private JTable pendingTracker_Table;
	private JTable declinedTracker_Table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserDashboardFrame frame = new UserDashboardFrame();
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
	public UserDashboardFrame() {
		setTitle("Leave Application Form\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1222, 596);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel employeeInfoPanel = new JPanel();
		employeeInfoPanel.setBounds(22, 25, 395, 160);
		employeeInfoPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(employeeInfoPanel);
		employeeInfoPanel.setLayout(null);
		
		JLabel employeeName = new JLabel("Francisco, Earl Ace D.");
		employeeName.setBounds(93, 78, 206, 17);
		employeeName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		employeeInfoPanel.add(employeeName);
		
		JLabel employee_ID = new JLabel("136696130811\r\n");
		employee_ID.setBounds(155, 51, 265, 17);
		employee_ID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		employeeInfoPanel.add(employee_ID);
		
		JLabel employeePosition = new JLabel("Non-Teaching Library Staff");
		employeePosition.setBounds(102, 115, 265, 17);
		employeePosition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		employeeInfoPanel.add(employeePosition);
		
		JLabel Leave_RemainingLabel = new JLabel("Employee Information");
		Leave_RemainingLabel.setBounds(60, 10, 290, 25);
		employeeInfoPanel.add(Leave_RemainingLabel);
		Leave_RemainingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Leave_RemainingLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("Employee ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 45, 135, 25);
		employeeInfoPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 76, 73, 25);
		employeeInfoPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Position:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 111, 135, 25);
		employeeInfoPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(22, 25, 395, 160);
		contentPane.add(lblNewLabel_3_1);
		
		JPanel remainingLeaveCreditPanel = new JPanel();
		remainingLeaveCreditPanel.setBounds(662, 25, 197, 160);
		remainingLeaveCreditPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(remainingLeaveCreditPanel);
		remainingLeaveCreditPanel.setLayout(null);
		
		JLabel remaining_LeaveCount = new JLabel("13");
		remaining_LeaveCount.setBounds(13, 48, 158, 85);
		remainingLeaveCreditPanel.add(remaining_LeaveCount);
		remaining_LeaveCount.setHorizontalAlignment(SwingConstants.CENTER);
		remaining_LeaveCount.setFont(new Font("Tahoma", Font.BOLD, 90));
		
		JLabel Leave_RemainingLabel_1 = new JLabel("Leaves Remaining");
		Leave_RemainingLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Leave_RemainingLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		Leave_RemainingLabel_1.setBounds(5, 10, 187, 28);
		remainingLeaveCreditPanel.add(Leave_RemainingLabel_1);
		
		JPanel usedCreditsPanel = new JPanel();
		usedCreditsPanel.setBounds(464, 25, 188, 160);
		usedCreditsPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(usedCreditsPanel);
		usedCreditsPanel.setLayout(null);
		
		JLabel used_LeaveCount = new JLabel("2");
		used_LeaveCount.setBounds(10, 48, 150, 85);
		usedCreditsPanel.add(used_LeaveCount);
		used_LeaveCount.setHorizontalAlignment(SwingConstants.CENTER);
		used_LeaveCount.setFont(new Font("Tahoma", Font.BOLD, 90));
		
		JLabel used_LeaveLabel = new JLabel("Leaves Used");
		used_LeaveLabel.setBounds(5, 10, 170, 28);
		usedCreditsPanel.add(used_LeaveLabel);
		used_LeaveLabel.setHorizontalAlignment(SwingConstants.CENTER);
		used_LeaveLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel date_and_timePanel = new JPanel();
		date_and_timePanel.setBounds(908, 25, 251, 119);
		date_and_timePanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(date_and_timePanel);
		date_and_timePanel.setLayout(null);
		
		JLabel day_monthLabel = new JLabel("Date and Time");
		day_monthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		day_monthLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		day_monthLabel.setBounds(60, 0, 150, 32);
		date_and_timePanel.add(day_monthLabel);
		
		JLabel dataLabel = new JLabel("12 / 03 / 2003");
		dataLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dataLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dataLabel.setBounds(60, 60, 150, 32);
		date_and_timePanel.add(dataLabel);
		
		JLabel timeLabel = new JLabel("12 : 03");
		timeLabel.setBounds(60, 87, 150, 32);
		date_and_timePanel.add(timeLabel);
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSunday.setBounds(60, 30, 150, 32);
		date_and_timePanel.add(lblSunday);
		
		JButton fileLeaveButton = new JButton("File New Leave");
		fileLeaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeaveApplicationFormFrame2 leaveApplicationFrame = new LeaveApplicationFormFrame2();
				leaveApplicationFrame.setVisible(true);
			}
		});
		fileLeaveButton.setForeground(new Color(0, 210, 105));
		fileLeaveButton.setBounds(908, 154, 251, 31);
		contentPane.add(fileLeaveButton);
		fileLeaveButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel approveTracker_Label = new JLabel("Approved");
		approveTracker_Label.setBounds(22, 222, 395, 37);
		contentPane.add(approveTracker_Label);
		approveTracker_Label.setHorizontalAlignment(SwingConstants.LEFT);
		approveTracker_Label.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JPanel approvedTracker_Panel = new JPanel();
		approvedTracker_Panel.setBackground(new Color(255, 255, 255));
		approvedTracker_Panel.setBounds(22, 259, 395, 281);
		approvedTracker_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(approvedTracker_Panel);
		approvedTracker_Panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 395, 281);
		approvedTracker_Panel.add(scrollPane_1);
		
		approveTracker_Table = new JTable();
		scrollPane_1.setViewportView(approveTracker_Table);
		approveTracker_Table.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
			}
		});
		approveTracker_Table.setFont(new Font("Tahoma", Font.BOLD, 14));
		approveTracker_Table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Sick Leave", "12-03-23", "12-10-23", "In Effect", "View"},
				{"Annual Leave", "10-12-23", "10-15-23", "Finished", "View"},
				{"Paternity Leave", "09-16-23", "09-23-23", "Finished", "View"},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Type of Leave", "Start", "End", "Status", ""
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		approveTracker_Table.getColumnModel().getColumn(0).setResizable(false);
		approveTracker_Table.getColumnModel().getColumn(0).setMaxWidth(120);
		approveTracker_Table.getColumnModel().getColumn(1).setResizable(false);
		approveTracker_Table.getColumnModel().getColumn(1).setPreferredWidth(45);
		approveTracker_Table.getColumnModel().getColumn(1).setMinWidth(45);
		approveTracker_Table.getColumnModel().getColumn(1).setMaxWidth(70);
		approveTracker_Table.getColumnModel().getColumn(2).setResizable(false);
		approveTracker_Table.getColumnModel().getColumn(2).setPreferredWidth(45);
		approveTracker_Table.getColumnModel().getColumn(2).setMinWidth(45);
		approveTracker_Table.getColumnModel().getColumn(2).setMaxWidth(75);
		approveTracker_Table.getColumnModel().getColumn(3).setResizable(false);
		approveTracker_Table.getColumnModel().getColumn(3).setPreferredWidth(67);
		approveTracker_Table.getColumnModel().getColumn(3).setMinWidth(50);
		approveTracker_Table.getColumnModel().getColumn(3).setMaxWidth(67);
		approveTracker_Table.getColumnModel().getColumn(4).setResizable(false);
		approveTracker_Table.getColumnModel().getColumn(4).setPreferredWidth(35);
		approveTracker_Table.getColumnModel().getColumn(4).setMaxWidth(40);
		approveTracker_Table.setRowHeight(50);
		approveTracker_Table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JLabel pendingTracker_Label = new JLabel("Pending");
		pendingTracker_Label.setFont(new Font("Tahoma", Font.BOLD, 30));
		pendingTracker_Label.setBounds(451, 222, 395, 37);
		contentPane.add(pendingTracker_Label);
		
		JPanel pendingTracker_Panel = new JPanel();
		pendingTracker_Panel.setBackground(new Color(255, 255, 255));
		pendingTracker_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pendingTracker_Panel.setBounds(451, 259, 395, 281);
		contentPane.add(pendingTracker_Panel);
		pendingTracker_Panel.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 395, 281);
		pendingTracker_Panel.add(scrollPane_2);
		
		pendingTracker_Table = new JTable();
		pendingTracker_Table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Type of Leave", "Date Applied", ""
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		pendingTracker_Table.getColumnModel().getColumn(0).setResizable(false);
		pendingTracker_Table.getColumnModel().getColumn(0).setMaxWidth(120);
		pendingTracker_Table.getColumnModel().getColumn(1).setResizable(false);
		pendingTracker_Table.getColumnModel().getColumn(1).setMaxWidth(120);
		pendingTracker_Table.getColumnModel().getColumn(2).setResizable(false);
		pendingTracker_Table.getColumnModel().getColumn(2).setMaxWidth(120);
		pendingTracker_Table.setFont(new Font("Tahoma", Font.BOLD, 14));
		pendingTracker_Table.setRowHeight(50);
		pendingTracker_Table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		scrollPane_2.setViewportView(pendingTracker_Table);
		
		JLabel declinedTracker_Label = new JLabel("Declined");
		declinedTracker_Label.setFont(new Font("Tahoma", Font.BOLD, 30));
		declinedTracker_Label.setBounds(894, 222, 395, 37);
		contentPane.add(declinedTracker_Label);
		
		JPanel declinedTracker_Panel = 	new JPanel();
		declinedTracker_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		declinedTracker_Panel.setLayout(null);
		declinedTracker_Panel.setBounds(894, 259, 303, 281);
		contentPane.add(declinedTracker_Panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 302, 281);
		declinedTracker_Panel.add(scrollPane);
		
		declinedTracker_Table = new JTable();
		declinedTracker_Table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Type of Leave", "Start", "End", "View"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		declinedTracker_Table.getColumnModel().getColumn(0).setResizable(false);
		declinedTracker_Table.getColumnModel().getColumn(0).setMaxWidth(120);
		declinedTracker_Table.getColumnModel().getColumn(1).setResizable(false);
		declinedTracker_Table.getColumnModel().getColumn(1).setPreferredWidth(45);
		declinedTracker_Table.getColumnModel().getColumn(1).setMinWidth(45);
		declinedTracker_Table.getColumnModel().getColumn(1).setMaxWidth(70);
		declinedTracker_Table.getColumnModel().getColumn(2).setResizable(false);
		declinedTracker_Table.getColumnModel().getColumn(2).setPreferredWidth(45);
		declinedTracker_Table.getColumnModel().getColumn(2).setMinWidth(45);
		declinedTracker_Table.getColumnModel().getColumn(2).setMaxWidth(70);
		declinedTracker_Table.getColumnModel().getColumn(3).setResizable(false);
		declinedTracker_Table.getColumnModel().getColumn(3).setPreferredWidth(35);
		declinedTracker_Table.getColumnModel().getColumn(3).setMaxWidth(40);
		declinedTracker_Table.setRowHeight(50);
		declinedTracker_Table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		scrollPane.setViewportView(declinedTracker_Table);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(UserDashboardFrame.class.getResource("/images/bbg.png")));
		lblNewLabel_3.setBounds(0, 0, 1208, 559);
		contentPane.add(lblNewLabel_3);
	}
}
