package ceu;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import com.jgoodies.forms.layout.*;
import net.miginfocom.swing.*;
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
		setBounds(100, 100, 783, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel employeeInfoPanel = new JPanel();
		employeeInfoPanel.setBounds(10, 41, 223, 102);
		employeeInfoPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(employeeInfoPanel);
		employeeInfoPanel.setLayout(new MigLayout("", "[]", "[][][][][][][]"));
		
		JLabel employeeName = new JLabel("Francisco, Earl Ace D.");
		employeeName.setFont(new Font("Tahoma", Font.BOLD, 14));
		employeeInfoPanel.add(employeeName, "cell 0 1");
		
		JLabel employee_ID = new JLabel("Employee ID: 136696130811\r\n");
		employee_ID.setFont(new Font("Tahoma", Font.BOLD, 14));
		employeeInfoPanel.add(employee_ID, "cell 0 3");
		
		JLabel employeePosition = new JLabel("Non-Teaching Library Staff");
		employeePosition.setFont(new Font("Tahoma", Font.BOLD, 14));
		employeeInfoPanel.add(employeePosition, "cell 0 5");
		
		JButton menuButton = new JButton("|||");
		menuButton.setBounds(10, 4, 49, 28);
		menuButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		menuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(menuButton);
		
		JPanel remainingLeaveCreditPanel = new JPanel();
		remainingLeaveCreditPanel.setBounds(266, 41, 150, 102);
		remainingLeaveCreditPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(remainingLeaveCreditPanel);
		remainingLeaveCreditPanel.setLayout(null);
		
		JLabel Leave_RemainingLabel = new JLabel("Leaves Remaining");
		Leave_RemainingLabel.setBounds(0, 0, 150, 17);
		remainingLeaveCreditPanel.add(Leave_RemainingLabel);
		Leave_RemainingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Leave_RemainingLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel remaining_LeaveCount = new JLabel("13");
		remaining_LeaveCount.setBounds(0, 17, 150, 85);
		remainingLeaveCreditPanel.add(remaining_LeaveCount);
		remaining_LeaveCount.setHorizontalAlignment(SwingConstants.CENTER);
		remaining_LeaveCount.setFont(new Font("Tahoma", Font.BOLD, 50));
		
		JPanel usedCreditsPanel = new JPanel();
		usedCreditsPanel.setBounds(437, 41, 150, 102);
		usedCreditsPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(usedCreditsPanel);
		usedCreditsPanel.setLayout(null);
		
		JLabel used_LeaveLabel = new JLabel("Leaves Used");
		used_LeaveLabel.setBounds(0, 0, 150, 17);
		usedCreditsPanel.add(used_LeaveLabel);
		used_LeaveLabel.setHorizontalAlignment(SwingConstants.CENTER);
		used_LeaveLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel used_LeaveCount = new JLabel("2");
		used_LeaveCount.setBounds(0, 17, 150, 85);
		usedCreditsPanel.add(used_LeaveCount);
		used_LeaveCount.setHorizontalAlignment(SwingConstants.CENTER);
		used_LeaveCount.setFont(new Font("Tahoma", Font.BOLD, 50));
		
		JPanel date_and_timePanel = new JPanel();
		date_and_timePanel.setBounds(612, 41, 150, 99);
		date_and_timePanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(date_and_timePanel);
		date_and_timePanel.setLayout(null);
		
		JLabel day_monthLabel = new JLabel("SUN DECEMBER");
		day_monthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		day_monthLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		day_monthLabel.setBounds(0, 0, 150, 32);
		date_and_timePanel.add(day_monthLabel);
		
		JLabel dataLabel = new JLabel("12 / 03 / 2003");
		dataLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dataLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		dataLabel.setBounds(0, 28, 150, 32);
		date_and_timePanel.add(dataLabel);
		
		JLabel timeLabel = new JLabel("12 : 03");
		timeLabel.setBounds(0, 60, 150, 32);
		date_and_timePanel.add(timeLabel);
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel fileLeavePanel = new JPanel();
		fileLeavePanel.setBounds(612, 146, 150, 34);
		fileLeavePanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(fileLeavePanel);
		fileLeavePanel.setLayout(null);
		
		JButton fileLeaveButton = new JButton("File Leave");
		fileLeaveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Nathaniel Codes insert here
			}
		});
		fileLeaveButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		fileLeaveButton.setBounds(0, 0, 150, 34);
		fileLeavePanel.add(fileLeaveButton);
		
		JLabel label = new JLabel("New label");
		label.setBounds(95, 13, 45, 13);
		fileLeavePanel.add(label);
		
		JPanel leaveRemainingTrackerPanel = new JPanel();
		leaveRemainingTrackerPanel.setBounds(10, 190, 370, 281);
		leaveRemainingTrackerPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(leaveRemainingTrackerPanel);
		
		JLabel LRTracker_Label = new JLabel("Leaves Approved:");
		LRTracker_Label.setBounds(7, 7, 355, 25);
		LRTracker_Label.setHorizontalAlignment(SwingConstants.LEFT);
		LRTracker_Label.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton scalingButtonLR = new JButton("^");
		scalingButtonLR.setFont(new Font("Tahoma", Font.BOLD, 16));
		scalingButtonLR.setBounds(0, 249, 369, 32);
		scalingButtonLR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		leaveRemainingTrackerPanel.setLayout(null);
		leaveRemainingTrackerPanel.add(LRTracker_Label);
		leaveRemainingTrackerPanel.add(scalingButtonLR);
		
		JButton AnnualButtonView = new JButton("+");
		AnnualButtonView.setFont(new Font("Tahoma", Font.BOLD, 20));
		AnnualButtonView.setBounds(319, 80, 50, 40);
		leaveRemainingTrackerPanel.add(AnnualButtonView);
		
		JButton SickButtonView = new JButton("+");
		SickButtonView.setFont(new Font("Tahoma", Font.BOLD, 20));
		SickButtonView.setHorizontalAlignment(SwingConstants.LEFT);
		SickButtonView.setVerticalAlignment(SwingConstants.TOP);
		SickButtonView.setBounds(319, 42, 50, 40);
		leaveRemainingTrackerPanel.add(SickButtonView);
		
		JButton PaternityButtonView = new JButton("+");
		PaternityButtonView.setFont(new Font("Tahoma", Font.BOLD, 20));
		PaternityButtonView.setBounds(319, 117, 50, 40);
		leaveRemainingTrackerPanel.add(PaternityButtonView);
		
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
		
		JPanel leavePendingTrackerPanel = new JPanel();
		leavePendingTrackerPanel.setBounds(390, 190, 369, 281);
		leavePendingTrackerPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(leavePendingTrackerPanel);
		leavePendingTrackerPanel.setLayout(null);
		
		JLabel LPTracker_Label = new JLabel("Leaves Pending:");
		LPTracker_Label.setBounds(7, 7, 355, 25);
		leavePendingTrackerPanel.add(LPTracker_Label);
		LPTracker_Label.setHorizontalAlignment(SwingConstants.LEFT);
		LPTracker_Label.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton scalingButtonLP = new JButton("^");
		scalingButtonLP.setFont(new Font("Tahoma", Font.BOLD, 16));
		scalingButtonLP.setBounds(0, 249, 369, 32);
		leavePendingTrackerPanel.add(scalingButtonLP);
		scalingButtonLP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
