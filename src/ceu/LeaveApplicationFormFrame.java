package ceu;

import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.Date;
import javax.swing.border.*;
import javax.swing.event.*;
import com.toedter.calendar.JDateChooser;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.*;


public class LeaveApplicationFormFrame extends JFrame {
    
	// JAVA SWING RELATED ATTRIBUTES
	private JPanel contentPane;
    private JPanel commentPanel;
    private JLabel employeeIDDBLabel;
    private JLabel fullNameDBLabel;
    private JLabel campusDBLabel;
    private JLabel departmentDBLabel;
    private JTextField specificPurposeTextField;
    private JTextField contactNameTextField;
    private JTextField contactAddressTextField;
    private JTextField contactNumberTextField;
    private JDateChooser startDateChooser; 
    private JDateChooser endDateChooser;
    private JDateChooser start;
    private JComboBox<String> leaveTypeSelect; 

    // DATABASE RELATED ATTRIBUTES
    private Connection connection;
	private QueryCommands qc;
    private String employeeIDDB;
	private String fullNameDB;
	private String campusDB;
	private String departmentDB;
    private String newLeaveType;
    
    private static int realDay, realMonth, realYear, currentMonth, currentYear; // FIXME: WHAT'S THIS FOR
    private DateAndTime dateTime;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LeaveApplicationFormFrame frame = new LeaveApplicationFormFrame();
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
    public LeaveApplicationFormFrame() {
    	
    	connection = DatabaseConnection.getConnection();
    	qc = new QueryCommands();
    	
    	// CONTENT PANE
        setResizable(false);
        setTitle("Leave Application Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 100, 499, 812);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
		contentPane.setLayout(null);
        
		// FORM PANEL
        JPanel formPanel = new JPanel();
        formPanel.setBounds(10, 24, 466, 741);
        formPanel.setBackground(new Color(255, 255, 255));
        formPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        contentPane.add(formPanel);
        formPanel.setLayout(null);
        
        // SCHOOL NAME LABEL
        JLabel schoolNameLabel = new JLabel("Center Scholar University");
        schoolNameLabel.setBounds(105, 21, 266, 20);
        schoolNameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        formPanel.add(schoolNameLabel);
        
        // FORM TYPE LABEL
        JLabel formTypeLabel = new JLabel("Leave Application");
        formTypeLabel.setBounds(85, 40, 286, 25);
        formTypeLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        formTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        formTypeLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        formPanel.add(formTypeLabel);
        
        // DATE LABEL
        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setBounds(10, 97, 72, 25);
        dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(dateLabel);
        
        // PERIOD APPLIED LABEL
        JLabel periodAppliedLabel = new JLabel("Period Applied");
        periodAppliedLabel.setBounds(10, 344, 131, 20);
        periodAppliedLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        formPanel.add(periodAppliedLabel);
        
        // MEANS OF CONTACT (MOC) LABEL
        JLabel contactLabel = new JLabel("Means of Contact:");
        contactLabel.setBounds(10, 462, 139, 20);
        contactLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        formPanel.add(contactLabel);
        
        // MOC NAME LABEL 
        JLabel contactNameLabel = new JLabel("Name:");
        contactNameLabel.setBounds(10, 493, 50, 14);
        contactNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(contactNameLabel);
        
        // MOC ADDRESS LABEL
        JLabel contactAddressLabel = new JLabel("Address:");
        contactAddressLabel.setBounds(10, 528, 86, 14);
        contactAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(contactAddressLabel);
        
        // MOC NUMBER LABEL
        JLabel contactNumberLabel = new JLabel("Contact No.:");
        contactNumberLabel.setBounds(10, 567, 86, 14);
        contactNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(contactNumberLabel); 
        
        // FETCH EMPLOYEE ID FROM DATABASE BASED ON USERNAME
        try (ResultSet resultSet = qc.prepareSelectEmployeeIDStatement(connection, LogInFrame.usernameDB).executeQuery()) {
            if (resultSet.next()) {
                employeeIDDB = resultSet.getString("employee_id");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        // DISPLAY EMPLOYEE ID ON LABEL
        employeeIDDBLabel = new JLabel("Employee ID:       " + employeeIDDB);        
        employeeIDDBLabel.setBounds(10, 169, 361, 20);
        employeeIDDBLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(employeeIDDBLabel);
        
        // FETCH FULL NAME FROM DATABASE BASED ON USERNAME
        try (ResultSet resultSet = qc.prepareSelectFullNameStatement(connection, LogInFrame.usernameDB).executeQuery()) {
            if (resultSet.next()) {
                fullNameDB = resultSet.getString("full_name");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        // DISPLAY FULL NAME ON LABEL
        fullNameDBLabel = new JLabel("Name:                " + fullNameDB);        
        fullNameDBLabel.setBounds(10, 200, 361, 20);
        fullNameDBLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(fullNameDBLabel);
        
        
        // FETCH CAMPUS FROM DATABASE BASED ON USERNAME
        try (ResultSet resultSet = qc.prepareSelectCampusStatement(connection, LogInFrame.usernameDB).executeQuery()) {
            if (resultSet.next()) {
                campusDB = resultSet.getString("campus");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        // DISPLAY CAMPUS ON LABEL
        campusDBLabel = new JLabel("Campus:             " + campusDB);        
        campusDBLabel.setBounds(10, 231, 361, 20);
        campusDBLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(campusDBLabel);
        
        // FETCH DEPARTMENT FROM DATABASE BASED ON USERNAME
        try (ResultSet resultSet = qc.prepareSelectDepartmentStatement(connection, LogInFrame.usernameDB).executeQuery()) {
            if (resultSet.next()) {
                departmentDB = resultSet.getString("department");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        // DISPLAY DEPARTMENT ON LABEL
        departmentDBLabel = new JLabel("Department:        " + departmentDB);        
        departmentDBLabel.setBounds(10, 262, 361, 20);
        departmentDBLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(departmentDBLabel);
        
        // REASON TEXT FIELD
        specificPurposeTextField = new JTextField();
        specificPurposeTextField.setBounds(132, 297, 239, 20);
        specificPurposeTextField.setColumns(10);
        formPanel.add(specificPurposeTextField);
        
        // MOC NAME TEXTFIELD
        contactNameTextField = new JTextField();
        contactNameTextField.setBounds(132, 493, 239, 20);
        contactNameTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char name = e.getKeyChar();
                if (!Character.isLetter(name) && name != ' ') {
                    e.consume();
                }
            }
        });
        contactNameTextField.setColumns(10);
        formPanel.add(contactNameTextField);
        
        // MOC ADDRESS TEXT FIELD
        contactAddressTextField = new JTextField();
        contactAddressTextField.setBounds(132, 527, 239, 20);
        contactAddressTextField.setColumns(10);
        formPanel.add(contactAddressTextField);
        
        // MOC NUMBER TEXT FIELD
        contactNumberTextField = new JTextField();
        contactNumberTextField.setBounds(132, 566, 239, 20);
        contactNumberTextField.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		char inputNumber = e.getKeyChar();
        		if (!Character.isDigit(inputNumber)) {
        			e.consume();
        		}
        	}
        });
        contactNumberTextField.setColumns(10);
        formPanel.add(contactNumberTextField);
        
        // LEAVE TYPE LABEL
        JLabel leaveTypeLabel = new JLabel("Leave Type:");
        leaveTypeLabel.setBounds(10, 133, 121, 25);
        leaveTypeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(leaveTypeLabel);
        
        // SPECIFIC PURPOSE LABEL
        JLabel specificPurposeLabel = new JLabel("Specific Purpose:");
        specificPurposeLabel.setBounds(10, 293, 165, 25);
        specificPurposeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(specificPurposeLabel);
        
        // LEAVE TYPE COMBO BOX
        leaveTypeSelect = new JComboBox();
        leaveTypeSelect.setBounds(132, 136, 239, 21);
        leaveTypeSelect.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		// FIXME: ADD CODE FOR UPDATING LEAVE TYPES FROM DATABASE
        		updateDateRestrictions(); // FIXME: NOT WORKING AS PLANNED
        	}
        });      
        // FIXME: SET NEW STRING[] {} VALUES TO FLEXIBLE ENUM WHERE WE CAN ADD MORE VALUES
        leaveTypeSelect.setModel(new DefaultComboBoxModel(new String[] {"Select Type", "Sick Leave", "Emergency Leave", "Vacation Leave", "Maternity Leave", "Paternity Leave"}));
        leaveTypeSelect.setFont(new Font("Tahoma", Font.PLAIN, 12));
        leaveTypeSelect.setBackground(Color.WHITE);
        formPanel.add(leaveTypeSelect);
        
        // START DATE CHOOSER
        startDateChooser = new JDateChooser();
        startDateChooser.setBounds(132, 371, 239, 20);
        formPanel.add(startDateChooser);
        
        // END DATE CHOOOSER
        endDateChooser = new JDateChooser();
        endDateChooser.setBounds(132, 414, 239, 20);
        formPanel.add(endDateChooser);
        
        // TO LABEL (PERIOD APPLIED)
        JLabel toLabel = new JLabel("To");
        toLabel.setBounds(74, 414, 33, 14);
        toLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(toLabel);
        
        // CURRENT DATE LABEL
		JLabel currentDateLabel = new JLabel(getCurrentDate());
		currentDateLabel.setBounds(132, 97, 239, 25);
		currentDateLabel.setHorizontalAlignment(SwingConstants.LEFT);
        currentDateLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(currentDateLabel);
        
        // FOM LABEL (PERIOD APPLIED)
        JLabel fromLabel = new JLabel("From");
        fromLabel.setBounds(74, 375, 50, 14);
        fromLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(fromLabel);
       
        // SUBMIT BUTTON
        JButton submitButton = new JButton("SUBMIT\r\n");
        submitButton.setBounds(94, 699, 109, 32);
        formPanel.add(submitButton);
        
        // CANCEL BUTTON
        JButton cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(271, 699, 116, 32);
        cancelButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        formPanel.add(cancelButton);
        
        // COMMENT PANEL
        commentPanel = new JPanel();
        commentPanel.setBounds(10, 599, 446, 90);
        formPanel.add(commentPanel);
        commentPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "COMMENTS", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
        commentPanel.setLayout(null);
        
        // CLIENT COMMENTS TEXT FIELD
        JTextArea clientCommentsTextField = new JTextArea();
        clientCommentsTextField.setBounds(10, 15, 426, 65);
        commentPanel.add(clientCommentsTextField);
        clientCommentsTextField.setLineWrap(true);
        clientCommentsTextField.setWrapStyleWord(true);
        clientCommentsTextField.setColumns(10);
       
        // SUBMIT BUTTON LOGIC IMPLEMENTATION
        submitButton.addActionListener(new ActionListener() {	
        	public void actionPerformed(ActionEvent e) {
        		if (isAllFieldsFilledUP()) {
        			// FIXME: PUT ALL VALUES GATHERED FROM FORM INTO DATABASE
        			// DATE OF APPLICATION, PURPOSE, START DATE, END DATE,  MOC: NAME, ADDRESS, CONTACT NUMBER
        			JOptionPane.showMessageDialog(null, "Successfully Submitted!");
        			JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(submitButton);
		            currentFrame.dispose();
        		}
        		else {
        			JOptionPane.showMessageDialog(null, "Fill up all required fields.");
        		}        		
        	}
        });
        
        // BACKGROUND LABEL
        JLabel backgroundLabel = new JLabel("New label");
        backgroundLabel.setBounds(0, 0, 503, 774);
        backgroundLabel.setIcon(new ImageIcon(LeaveApplicationFormFrame.class.getResource("/images/bbg.png")));
        contentPane.add(backgroundLabel);       
    }
    
    // METHODS AND CONSTRUCTORS
//    private Object prepareAddLeaveTypeStatement(Connection connection2, String newLeaveType2) {
//		// TODO Auto-generated method stub
//		return null;
//	}
    
    // FIXME: LOGIC STILL FLAWEDss
    private void updateDateRestrictions() {
        String selectedLeaveType = (String) leaveTypeSelect.getSelectedItem();
        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(new Date());
        // Enable all dates by default
        startDateChooser.setEnabled(true);
        endDateChooser.setEnabled(true);       
        
        // Update date restrictions based on leave type
        if ("Sick Leave".equals(selectedLeaveType)) {
            // Disable dates on and after the current date for startDateChooser
            startDateChooser.setMaxSelectableDate(currentDate.getTime());
            endDateChooser.setMaxSelectableDate(currentDate.getTime());
            
            // Allow selecting only the previous date for endDateChooser
            startDateChooser.setMinSelectableDate(null);
            endDateChooser.setMinSelectableDate(startDateChooser.getDate());
            
        } else {
            // For other leave types, additional logic can be added here
        	currentDate.add(Calendar.DATE, 1);
            // For example, disable dates before the current date for startDateChooser
            startDateChooser.setMinSelectableDate(currentDate.getTime()); 
            endDateChooser.setMinSelectableDate(startDateChooser.getDate());

            // Optional: Allow filing leaves three days in advance
            currentDate.add(Calendar.DATE, 3);
            // Set the MaxSelectableDate for startDateChooser
            startDateChooser.setMaxSelectableDate(null);

            // Set the MaxSelectableDate for endDateChooser
            endDateChooser.setMaxSelectableDate(currentDate.getTime());
        }
    }
 
    private static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, YYYY");
        return dateFormat.format(new Date());
    }  
    
    // SUBMIT BUTTON REQUIREMENTS
    private boolean isAllFieldsFilledUP() {
        return employeeIDDB != null &&
                fullNameDB != null &&
                !specificPurposeTextField.getText().isEmpty() &&
                !contactNameTextField.getText().isEmpty() &&
                !contactNameTextField.getText().isBlank() &&
                !contactAddressTextField.getText().isEmpty() &&
                !contactNumberTextField.getText().isEmpty() &&
                campusDB != null &&
                departmentDB != null &&
                leaveTypeSelect.getSelectedIndex() != 0 &&
                startDateChooser.getDate() != null &&
                endDateChooser.getDate() != null;
    }
}