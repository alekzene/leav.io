package ceu;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDashboardFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable approveTracker_Table;
	private JTable pendingTracker_Table;
	private JTable declinedTracker_Table;
	private JLabel Time;
	private Timer timer;
	
	// DATABASE
	private Connection connection;
	private QueryCommands qc;
	private String nameDB;
	private String departmentDB;
	private int leavesRemainingDB;
	private int leavesUsedDB;
	private String employeeIDDB;
	
	private Date_And_Time dateTime;
	private EmployeeInfo employee;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserDashboardFrame frame = new UserDashboardFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
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
		connection = DatabaseConnection.getConnection();
		qc = new QueryCommands();
		
		Date_And_Time dateTime = new Date_And_Time();
		
		// CONTENT PANE
		setTitle("Leave Application Form\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1137, 597);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// EMPLOYEE INFORMATION PANEL
		JButton LogOutbutton = new JButton("LOGOUT");
		LogOutbutton.setForeground(new Color(255, 255, 255));
		LogOutbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        int option = JOptionPane.showConfirmDialog(null, "Are you sure to Logout?", "Confirm to Logout", JOptionPane.YES_NO_OPTION);

		        if (option == JOptionPane.YES_OPTION) {
		            dispose(); // This will dispose of the UserDashboardFrame
		            LogInFrame frame = new LogInFrame();
					frame.setVisible(true);	
					frame.setLocationRelativeTo(null);
		        }
		    }
		});
		LogOutbutton.setBackground(new Color(255,108,108));
		LogOutbutton.setFont(new Font("Tahoma", Font.BOLD, 18));
		LogOutbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LogOutbutton.setBounds(523, 514, 125, 35);
		contentPane.add(LogOutbutton);
		
		
		JPanel employeeInfoPanel = new JPanel();
		employeeInfoPanel.setBackground(new Color(255, 255, 255));
		employeeInfoPanel.setBounds(22, 25, 359, 160);
		employeeInfoPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(employeeInfoPanel);
		employeeInfoPanel.setLayout(null);
		
		//INFO GETTING FROM DATABASE
		
		// EMPLOYEE NAME
		try (ResultSet resultSet = qc.prepareSelectNameStatement(connection, LogInFrame.usernameDB).executeQuery()) {
            if (resultSet.next()) {
                nameDB = resultSet.getString("full_name");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		
		// DEPARTMENT
		try (ResultSet resultSet = qc.prepareSelectDepartmentStatement(connection, LogInFrame.usernameDB).executeQuery()) {
            if (resultSet.next()) {
            	departmentDB = resultSet.getString("department");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		
		//LEAVES REMAINING
		try (ResultSet resultSet = qc.prepareLeavesRemaining(connection, LogInFrame.usernameDB).executeQuery()) {
            if (resultSet.next()) {
                leavesRemainingDB = resultSet.getInt("leaves_remaining");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		
		//LEAVES USED
		try (ResultSet resultSet = qc.prepareLeavesUsed(connection, LogInFrame.usernameDB).executeQuery()) {
            if (resultSet.next()) {
            	leavesUsedDB = resultSet.getInt("leaves_used");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		
		//EMPLOYEE ID
		try (ResultSet resultSet = qc.prepareSelectEmployeeIDStatement(connection, LogInFrame.usernameDB).executeQuery()) {
            if (resultSet.next()) {
                employeeIDDB = resultSet.getString("employee_id");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		
		
		JLabel employeeName = new JLabel(nameDB);
		employeeName.setBounds(85, 76, 206, 25);
		employeeName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		employeeInfoPanel.add(employeeName);
		
		// EMPLOYEE ID
		JLabel employee_ID = new JLabel(employeeIDDB);
		employee_ID.setBounds(155, 45, 212, 25);
		employee_ID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		employeeInfoPanel.add(employee_ID);
		
		JLabel employeeDepartment = new JLabel(departmentDB);
		employeeDepartment.setBounds(145, 111, 222, 25);
		employeeDepartment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		employeeInfoPanel.add(employeeDepartment);
		
		JLabel Leave_RemainingLabel = new JLabel("Employee Information");
		Leave_RemainingLabel.setBounds(30, 10, 290, 25);
		employeeInfoPanel.add(Leave_RemainingLabel);
		Leave_RemainingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Leave_RemainingLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("Employee ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 45, 149, 25);
		employeeInfoPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 76, 73, 25);
		employeeInfoPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Department:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 111, 135, 25);
		employeeInfoPanel.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 255));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 359, 41);
		employeeInfoPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(UserDashboardFrame.class.getResource("/images/bbg.png")));
		lblNewLabel_3_1_1.setBounds(1, 41, 357, 118);
		employeeInfoPanel.add(lblNewLabel_3_1_1);
		
		JPanel remainingLeaveCreditPanel = new JPanel();
		remainingLeaveCreditPanel.setBackground(new Color(255, 255, 255));
		remainingLeaveCreditPanel.setBounds(625, 25, 197, 160);
		remainingLeaveCreditPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(remainingLeaveCreditPanel);
		remainingLeaveCreditPanel.setLayout(null);
		
		JLabel remaining_LeaveCount = new JLabel("" + leavesRemainingDB);
		remaining_LeaveCount.setBounds(13, 48, 158, 85);
		remainingLeaveCreditPanel.add(remaining_LeaveCount);
		remaining_LeaveCount.setHorizontalAlignment(SwingConstants.CENTER);
		remaining_LeaveCount.setFont(new Font("Tahoma", Font.BOLD, 90));
		
		JLabel Leave_RemainingLabel_1 = new JLabel("Leaves Remaining");
		Leave_RemainingLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Leave_RemainingLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		Leave_RemainingLabel_1.setBounds(5, 10, 187, 28);
		remainingLeaveCreditPanel.add(Leave_RemainingLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 255));
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(0, 0, 197, 38);
		remainingLeaveCreditPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon(UserDashboardFrame.class.getResource("/images/bbg.png")));
		lblNewLabel_3_1_1_1.setBounds(1, 38, 195, 121);
		remainingLeaveCreditPanel.add(lblNewLabel_3_1_1_1);
		
		JPanel usedCreditsPanel = new JPanel();
		usedCreditsPanel.setBackground(new Color(255, 255, 255));
		usedCreditsPanel.setBounds(427, 25, 188, 160);
		usedCreditsPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(usedCreditsPanel);
		usedCreditsPanel.setLayout(null);
		
		JLabel used_LeaveCount = new JLabel("" + leavesUsedDB);
		used_LeaveCount.setBounds(15, 50, 150, 85);
		usedCreditsPanel.add(used_LeaveCount);
		used_LeaveCount.setHorizontalAlignment(SwingConstants.CENTER);
		used_LeaveCount.setFont(new Font("Tahoma", Font.BOLD, 90));
		
		JLabel used_LeaveLabel = new JLabel("Leaves Used");
		used_LeaveLabel.setBounds(5, 10, 170, 28);
		usedCreditsPanel.add(used_LeaveLabel);
		used_LeaveLabel.setHorizontalAlignment(SwingConstants.CENTER);
		used_LeaveLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 255));
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(0, 0, 188, 38);
		usedCreditsPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("New label");
		lblNewLabel_3_1_1_1_1.setIcon(new ImageIcon(UserDashboardFrame.class.getResource("/images/bbg.png")));
		lblNewLabel_3_1_1_1_1.setBounds(1, 38, 186, 121);
		usedCreditsPanel.add(lblNewLabel_3_1_1_1_1);
		
		
		JPanel date_and_timePanel = new JPanel();
		date_and_timePanel.setBackground(new Color(255, 255, 255));
		date_and_timePanel.setBounds(870, 25, 235, 119);
		date_and_timePanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(date_and_timePanel);
		date_and_timePanel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 255));
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(0, 0, 235, 38);
		date_and_timePanel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel day_monthLabel = new JLabel("Date and Time");
		day_monthLabel.setBounds(44, 6, 146, 25);
		panel_3.add(day_monthLabel);
		day_monthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		day_monthLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel Date = new JLabel(dateTime.getFormattedDate());
		Date.setHorizontalAlignment(SwingConstants.CENTER);
		Date.setFont(new Font("Tahoma", Font.BOLD, 15));
		Date.setBounds(37, 40, 170, 30);
		date_and_timePanel.add(Date);
		
		JLabel Day = new JLabel(dateTime.getFormattedDay());
		Day.setHorizontalAlignment(SwingConstants.CENTER);
		Day.setFont(new Font("Tahoma", Font.BOLD, 15));
		Day.setBounds(75, 61, 88, 30);
		date_and_timePanel.add(Day);
		
		Time = new JLabel(dateTime.getFormattedTime());
		Time.setHorizontalAlignment(SwingConstants.CENTER);
        Time.setFont(new Font("Tahoma", Font.BOLD, 15));
        Time.setBounds(75, 88, 106, 30);
        date_and_timePanel.add(Time);

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start();
        
		JLabel lblNewLabel_3_1_1_1_2 = new JLabel("New label");
		lblNewLabel_3_1_1_1_2.setIcon(new ImageIcon(UserDashboardFrame.class.getResource("/images/bbg.png")));
		lblNewLabel_3_1_1_1_2.setBounds(1, 38, 234, 80);
		date_and_timePanel.add(lblNewLabel_3_1_1_1_2);
		
		JButton fileLeaveButton = new JButton("File New Leave");
		fileLeaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeaveApplicationFormFrame2 leaveApplicationFrame = new LeaveApplicationFormFrame2();
				leaveApplicationFrame.setVisible(true);
				leaveApplicationFrame.setLocationRelativeTo(null);
			}
		});
		fileLeaveButton.setForeground(new Color(0, 210, 105));
		fileLeaveButton.setBounds(870, 154, 235, 31);
		contentPane.add(fileLeaveButton);
		fileLeaveButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel approveTracker_Label = new JLabel("Approved");
		approveTracker_Label.setBounds(22, 212, 395, 37);
		contentPane.add(approveTracker_Label);
		approveTracker_Label.setHorizontalAlignment(SwingConstants.LEFT);
		approveTracker_Label.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
		JPanel approvedTracker_Panel = new JPanel();
		approvedTracker_Panel.setBackground(new Color(255, 255, 255));
		approvedTracker_Panel.setBounds(20, 259, 430, 251);
		approvedTracker_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(approvedTracker_Panel);
		approvedTracker_Panel.setLayout(null);
		
		DefaultTableModel approveTracker_Model = new DefaultTableModel(0, 5) {
			boolean[] columnEditables = new boolean[] {
			false, false, false, false, false
		};
		@Override
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
            
            String[]approveTracker_Headers = {"ID", "Type of Leave", "Start Date", "End Date", "Status"};
            approveTracker_Model.setColumnIdentifiers(approveTracker_Headers);
            
            approveTracker_Model.addRow(new Object[] {"00001","Sick","12-03-23","12-10-23","In Effect"});
            approveTracker_Model.addRow(new Object[] {"00002","Sick","12-03-23","12-10-23","In Effect"});
            
		approveTracker_Table = new JTable(approveTracker_Model);
		approveTracker_Table.setSize(new Dimension(300, 300));
		approveTracker_Table.setRowHeight(40);
		approveTracker_Table.setCellSelectionEnabled(false);  // Disable cell selection
		approveTracker_Table.setColumnSelectionAllowed(false); // Disable column selection
		approveTracker_Table.getTableHeader().setReorderingAllowed(false); // Disable column reordering
		
		JScrollPane scrollPane = new JScrollPane(approveTracker_Table);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(0, 0, 432, 253);
        
		approvedTracker_Panel.add(scrollPane);
		
//		approveTracker_Table = new JTable();
//		scrollPane_1.setViewportView(approveTracker_Table);
//		approveTracker_Table.addMouseWheelListener(new MouseWheelListener() {
//			public void mouseWheelMoved(MouseWheelEvent e) {
//			}
//		});
//		approveTracker_Table.setFont(new Font("Tahoma", Font.BOLD, 14));
//		approveTracker_Table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{"00001", "Sick Leave", "12-03-23", "12-10-23", "In Effect"},
//				{"00002", "Annual Leave", "10-12-23", "10-15-23", "Finished"},
//				{"00003", "Paternity Leave", "09-16-23", "09-23-23", "Finished"},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//				{null, null, null, null, null},
//			},
//			new String[] {
//				"ID", "Type of Leave", "Start", "End", "Status"
//			}
//		) {
//			boolean[] columnEditables = new boolean[] {
//				false, false, false, false, false
//			};
//			public boolean isCellEditable(int row, int column) {
//				return columnEditables[column];
//			}
//		});
//		approveTracker_Table.getColumnModel().getColumn(0).setResizable(false);
//		approveTracker_Table.getColumnModel().getColumn(0).setPreferredWidth(50);
//		approveTracker_Table.getColumnModel().getColumn(0).setMaxWidth(70);
//		approveTracker_Table.getColumnModel().getColumn(1).setResizable(false);
//		approveTracker_Table.getColumnModel().getColumn(1).setMaxWidth(120);
//		approveTracker_Table.getColumnModel().getColumn(2).setResizable(false);
//		approveTracker_Table.getColumnModel().getColumn(2).setPreferredWidth(60);
//		approveTracker_Table.getColumnModel().getColumn(2).setMinWidth(45);
//		approveTracker_Table.getColumnModel().getColumn(2).setMaxWidth(75);
//		approveTracker_Table.getColumnModel().getColumn(3).setResizable(false);
//		approveTracker_Table.getColumnModel().getColumn(3).setPreferredWidth(60);
//		approveTracker_Table.getColumnModel().getColumn(3).setMinWidth(45);
//		approveTracker_Table.getColumnModel().getColumn(3).setMaxWidth(75);
//		approveTracker_Table.getColumnModel().getColumn(4).setResizable(false);
//		approveTracker_Table.getColumnModel().getColumn(4).setPreferredWidth(70);
//		approveTracker_Table.getColumnModel().getColumn(4).setMinWidth(50);
//		approveTracker_Table.getColumnModel().getColumn(4).setMaxWidth(70);
//		approveTracker_Table.setRowHeight(50);
//		approveTracker_Table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
//		
		JLabel pendingTracker_Label = new JLabel("Pending");
		pendingTracker_Label.setFont(new Font("Tahoma", Font.BOLD, 25));
		pendingTracker_Label.setBounds(490, 212, 395, 37);
		contentPane.add(pendingTracker_Label);
		
		JPanel pendingTracker_Panel = new JPanel();
		pendingTracker_Panel.setBackground(new Color(255, 255, 255));
		pendingTracker_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pendingTracker_Panel.setBounds(490, 259, 284, 245);
		contentPane.add(pendingTracker_Panel);
		pendingTracker_Panel.setLayout(null);
		
		DefaultTableModel pendingTracker_Model = new DefaultTableModel(0, 3) {
			boolean[] columnEditables = new boolean[] {
			false, false, false,
		};
		@Override
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		
		String[]pendingTracker_Headers = {"ID", "Type of Leave", "Date Applied"};
		pendingTracker_Model.setColumnIdentifiers(pendingTracker_Headers);
        
		pendingTracker_Model.addRow(new Object[]{"00004", "Vacation", "12-30-23"});
		
        pendingTracker_Table = new JTable(pendingTracker_Model);
		pendingTracker_Table.setSize(new Dimension(100, 100));
		pendingTracker_Table.setRowHeight(40);
		pendingTracker_Table.setCellSelectionEnabled(false);  // Disable cell selection
		pendingTracker_Table.setColumnSelectionAllowed(false); // Disable column selection
		pendingTracker_Table.getTableHeader().setReorderingAllowed(false); // Disable column reordering
		
		JScrollPane scrollPane_1 = new JScrollPane(pendingTracker_Table);
	    scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    
	    scrollPane_1.setBounds(0, 0, 285, 247);
		
		pendingTracker_Panel.add(scrollPane_1);
//		
//		pendingTracker_Table = new JTable();
//		pendingTracker_Table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{"00005", "Vacation Leave", "12-30-23"},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//			},
//			new String[] {
//				"ID", "Type of Leave", "Date Applied"
//			}
//		) {
//			boolean[] columnEditables = new boolean[] {
//				false, false, false
//			};
//			public boolean isCellEditable(int row, int column) {
//				return columnEditables[column];
//			}
//		});
//		pendingTracker_Table.getColumnModel().getColumn(0).setResizable(false);
//		pendingTracker_Table.getColumnModel().getColumn(0).setPreferredWidth(50);
//		pendingTracker_Table.getColumnModel().getColumn(0).setMaxWidth(70);
//		pendingTracker_Table.getColumnModel().getColumn(1).setResizable(false);
//		pendingTracker_Table.getColumnModel().getColumn(1).setMaxWidth(120);
//		pendingTracker_Table.getColumnModel().getColumn(2).setResizable(false);
//		pendingTracker_Table.getColumnModel().getColumn(2).setPreferredWidth(70);
//		pendingTracker_Table.getColumnModel().getColumn(2).setMinWidth(45);
//		pendingTracker_Table.getColumnModel().getColumn(2).setMaxWidth(75);
//		pendingTracker_Table.setFont(new Font("Tahoma", Font.BOLD, 14));
//		pendingTracker_Table.setRowHeight(50);
//		pendingTracker_Table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
//		
//		scrollPane_2.setViewportView(pendingTracker_Table);
		
		JLabel declinedTracker_Label = new JLabel("Declined");
		declinedTracker_Label.setFont(new Font("Tahoma", Font.BOLD, 25));
		declinedTracker_Label.setBounds(820, 212, 395, 37);
		contentPane.add(declinedTracker_Label);
		
		JPanel declinedTracker_Panel = 	new JPanel();
		declinedTracker_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		declinedTracker_Panel.setLayout(null);
		declinedTracker_Panel.setBounds(820, 259, 284, 245);
		contentPane.add(declinedTracker_Panel);
		
		DefaultTableModel declinedTracker_Model = new DefaultTableModel(0, 3) {
			boolean[] columnEditables = new boolean[] {
			false, false, false,
		};
		@Override
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
			
		String[]declinedTracker_Headers = {"ID", "Type of Leave", "Date Applied"};
		declinedTracker_Model.setColumnIdentifiers(declinedTracker_Headers);
		
		declinedTracker_Model.addRow(new Object[]{"00003", "Vacation", "12-20-23"});
		
		declinedTracker_Table = new JTable(declinedTracker_Model);
		declinedTracker_Table.setSize(new Dimension(100, 100));
		declinedTracker_Table.setRowHeight(40);
		declinedTracker_Table.setCellSelectionEnabled(false);  // Disable cell selection
		declinedTracker_Table.setColumnSelectionAllowed(false); // Disable column selection
		declinedTracker_Table.getTableHeader().setReorderingAllowed(false); // Disable column reordering
		
		JScrollPane scrollPane_2 = new JScrollPane(declinedTracker_Table);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    scrollPane_2.setBounds(0, 0, 286, 246);
	    
		declinedTracker_Panel.add(scrollPane_2);
		
		
//		declinedTracker_Table = new JTable();
//		declinedTracker_Table.setFont(new Font("Tahoma", Font.BOLD, 14));
//		declinedTracker_Table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{"00004", "Vacation Leave", "12-15-23"},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//				{null, null, null},
//			},
//			new String[] {
//				"ID", "Type of Leave", "Date Applied"
//			}
//		) {
//			boolean[] columnEditables = new boolean[] {
//				false, false, false
//			};
//			public boolean isCellEditable(int row, int column) {
//				return columnEditables[column];
//			}
//		});
//		declinedTracker_Table.getColumnModel().getColumn(0).setResizable(false);
//		declinedTracker_Table.getColumnModel().getColumn(0).setPreferredWidth(50);
//		declinedTracker_Table.getColumnModel().getColumn(0).setMaxWidth(70);
//		declinedTracker_Table.getColumnModel().getColumn(1).setResizable(false);
//		declinedTracker_Table.getColumnModel().getColumn(1).setMaxWidth(120);
//		declinedTracker_Table.getColumnModel().getColumn(2).setResizable(false);
//		declinedTracker_Table.getColumnModel().getColumn(2).setMinWidth(45);
//		declinedTracker_Table.getColumnModel().getColumn(2).setMaxWidth(75);
//		declinedTracker_Table.setRowHeight(50);
//		declinedTracker_Table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
//		
//		scrollPane.setViewportView(declinedTracker_Table);
//		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(UserDashboardFrame.class.getResource("/images/bbg.png")));
		lblNewLabel_3.setBounds(0, 0, 1121, 560);
		contentPane.add(lblNewLabel_3);
	}
	
	 private void updateTime() {
	        Date_And_Time dateTime = new Date_And_Time();
	        String formattedTime = dateTime.getFormattedTime();
	        Time.setText(formattedTime);
	    }
}
