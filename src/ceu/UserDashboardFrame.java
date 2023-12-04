package ceu;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class UserDashboardFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setBounds(100, 100, 832, 563);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel employeeInfoPanel = new JPanel();
		employeeInfoPanel.setBounds(22, 25, 220, 102);
		employeeInfoPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(employeeInfoPanel);
		employeeInfoPanel.setLayout(null);
		
		JLabel employeeName = new JLabel("Francisco, Earl Ace D.");
		employeeName.setBounds(10, 56, 145, 17);
		employeeName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		employeeInfoPanel.add(employeeName);
		
		JLabel employee_ID = new JLabel("136696130811\r\n");
		employee_ID.setBounds(10, 36, 205, 17);
		employee_ID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		employeeInfoPanel.add(employee_ID);
		
		JLabel employeePosition = new JLabel("Non-Teaching Library Staff");
		employeePosition.setBounds(10, 74, 186, 17);
		employeePosition.setFont(new Font("Tahoma", Font.PLAIN, 14));
		employeeInfoPanel.add(employeePosition);
		
		JLabel Leave_RemainingLabel = new JLabel("Employee Information");
		Leave_RemainingLabel.setBounds(0, 11, 174, 17);
		employeeInfoPanel.add(Leave_RemainingLabel);
		Leave_RemainingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Leave_RemainingLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel remainingLeaveCreditPanel = new JPanel();
		remainingLeaveCreditPanel.setBounds(451, 25, 158, 102);
		remainingLeaveCreditPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(remainingLeaveCreditPanel);
		remainingLeaveCreditPanel.setLayout(null);
		
		JLabel remaining_LeaveCount = new JLabel("13");
		remaining_LeaveCount.setBounds(0, 17, 158, 85);
		remainingLeaveCreditPanel.add(remaining_LeaveCount);
		remaining_LeaveCount.setHorizontalAlignment(SwingConstants.CENTER);
		remaining_LeaveCount.setFont(new Font("Tahoma", Font.BOLD, 50));
		
		JLabel Leave_RemainingLabel_1 = new JLabel("Leaves Remaining");
		Leave_RemainingLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Leave_RemainingLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Leave_RemainingLabel_1.setBounds(0, 11, 161, 17);
		remainingLeaveCreditPanel.add(Leave_RemainingLabel_1);
		
		JPanel usedCreditsPanel = new JPanel();
		usedCreditsPanel.setBounds(290, 25, 150, 102);
		usedCreditsPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(usedCreditsPanel);
		usedCreditsPanel.setLayout(null);
		
		JLabel used_LeaveCount = new JLabel("2");
		used_LeaveCount.setBounds(0, 17, 150, 85);
		usedCreditsPanel.add(used_LeaveCount);
		used_LeaveCount.setHorizontalAlignment(SwingConstants.CENTER);
		used_LeaveCount.setFont(new Font("Tahoma", Font.BOLD, 50));
		
		JLabel used_LeaveLabel = new JLabel("Leaves Used");
		used_LeaveLabel.setBounds(0, 11, 150, 17);
		usedCreditsPanel.add(used_LeaveLabel);
		used_LeaveLabel.setHorizontalAlignment(SwingConstants.CENTER);
		used_LeaveLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel date_and_timePanel = new JPanel();
		date_and_timePanel.setBounds(645, 26, 150, 99);
		date_and_timePanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(date_and_timePanel);
		date_and_timePanel.setLayout(null);
		
		JLabel day_monthLabel = new JLabel("Date and Time");
		day_monthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		day_monthLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		day_monthLabel.setBounds(1, 2, 150, 32);
		date_and_timePanel.add(day_monthLabel);
		
		JLabel dataLabel = new JLabel("12 / 03 / 2003");
		dataLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dataLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dataLabel.setBounds(1, 45, 150, 32);
		date_and_timePanel.add(dataLabel);
		
		JLabel timeLabel = new JLabel("12 : 03");
		timeLabel.setBounds(0, 60, 150, 32);
		date_and_timePanel.add(timeLabel);
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunday.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSunday.setBounds(1, 25, 150, 32);
		date_and_timePanel.add(lblSunday);
		
		JPanel leaveRemainingTrackerPanel = new JPanel();
		leaveRemainingTrackerPanel.setBounds(22, 195, 395, 281);
		leaveRemainingTrackerPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(leaveRemainingTrackerPanel);
		leaveRemainingTrackerPanel.setLayout(null);
		
		JLabel SickLeaveLabel = new JLabel("Sick Leave :\r\n");
		SickLeaveLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		SickLeaveLabel.setBounds(8, 57, 117, 13);
		leaveRemainingTrackerPanel.add(SickLeaveLabel);
		
		JLabel AnnualLeaveLabel = new JLabel("Annual Leave :\r\n");
		AnnualLeaveLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		AnnualLeaveLabel.setBounds(7, 95, 140, 13);
		leaveRemainingTrackerPanel.add(AnnualLeaveLabel);
		
		JLabel PaternityLeaveLabel = new JLabel("Paternity Leave :");
		PaternityLeaveLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		PaternityLeaveLabel.setBounds(7, 135, 166, 13);
		leaveRemainingTrackerPanel.add(PaternityLeaveLabel);
		
		JLabel SickDuration = new JLabel("In Effect\r\n");
		SickDuration.setFont(new Font("Tahoma", Font.BOLD, 12));
		SickDuration.setBounds(264, 60, 57, 13);
		leaveRemainingTrackerPanel.add(SickDuration);
		
		JLabel AnnualDuration = new JLabel("Finished\r\n");
		AnnualDuration.setFont(new Font("Tahoma", Font.BOLD, 12));
		AnnualDuration.setBounds(264, 98, 57, 13);
		leaveRemainingTrackerPanel.add(AnnualDuration);
		
		JLabel PaternityDuration = new JLabel("Finished\r\n");
		PaternityDuration.setFont(new Font("Tahoma", Font.BOLD, 12));
		PaternityDuration.setBounds(264, 137, 57, 13);
		leaveRemainingTrackerPanel.add(PaternityDuration);
		
		JTextArea SickDateLeave = new JTextArea();
		SickDateLeave.setText("12-03-2023\r\n12-10-2023");
		SickDateLeave.setBounds(171, 42, 85, 40);
		leaveRemainingTrackerPanel.add(SickDateLeave);
		
		JTextArea AnnualLeaveDate = new JTextArea();
		AnnualLeaveDate.setText("10-12-2023\r\n10-15-2023");
		AnnualLeaveDate.setBounds(171, 80, 85, 40);
		leaveRemainingTrackerPanel.add(AnnualLeaveDate);
		
		JTextArea PaternityLeaveDate = new JTextArea();
		PaternityLeaveDate.setText("09-16-2023\r\n09-23-2023");
		PaternityLeaveDate.setBounds(171, 117, 85, 40);
		leaveRemainingTrackerPanel.add(PaternityLeaveDate);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(378, 0, 17, 281);
		leaveRemainingTrackerPanel.add(scrollBar_1);
		
		JLabel LRTracker_Label = new JLabel("Approved");
		LRTracker_Label.setBounds(22, 159, 355, 25);
		contentPane.add(LRTracker_Label);
		LRTracker_Label.setHorizontalAlignment(SwingConstants.LEFT);
		LRTracker_Label.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton fileLeaveButton = new JButton("File New Leave");
		fileLeaveButton.setForeground(new Color(0, 210, 105));
		fileLeaveButton.setBounds(645, 155, 150, 34);
		contentPane.add(fileLeaveButton);
		fileLeaveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Nathaniel Codes insert here
			}
		});
		fileLeaveButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	}
}
