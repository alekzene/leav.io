package ceu;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.border.EtchedBorder;
import com.toedter.calendar.JDateChooser;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class LeaveApplicationFormFrame2 extends JFrame {
    private JPanel contentPane;

    private static int realDay, realMonth, realYear, currentMonth, currentYear;
    private JLabel employeeIDDBLabel;
    private JLabel fullNameDBLabel;
    private JLabel campusDBLabel;
    private JLabel departmentDBLabel;

    private JTextField purposeText;
    private JTextField contactNameText;
    private JTextField contactAddressText;
    private JTextField contactNoText;
    private JTextField textField_2;
    
    private JComboBox leaveTypeSelect; 
    private JDateChooser startDateChooser; 
    private JDateChooser endDateChooser;
    private JDateChooser start;
    private JLabel lblNewLabel_2;
    
    private DateAndTime dateTime;
    private JPanel commentPanel;
    private String newLeaveType;
    
    private Connection connection;
	private QueryCommands qc;
    private String employeeIDDB;
	private String fullNameDB;
	private String campusDB;
	private String departmentDB;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LeaveApplicationFormFrame2 frame = new LeaveApplicationFormFrame2();
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
    public LeaveApplicationFormFrame2() {
    	
    	connection = DatabaseConnection.getConnection();
    	qc = new QueryCommands();
    	
        setResizable(false);
        setTitle("Leave Application Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 100, 499, 812);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
		contentPane.setLayout(null);
        
        JPanel formPanel = new JPanel();
        formPanel.setBounds(10, 24, 466, 741);
        formPanel.setBackground(new Color(255, 255, 255));
        formPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        contentPane.add(formPanel);
        formPanel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Center Scholar University");
        lblNewLabel.setBounds(105, 21, 266, 20);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        formPanel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Leave Application");
        lblNewLabel_1.setBounds(85, 40, 286, 25);
        lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        formPanel.add(lblNewLabel_1);
        
        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setBounds(10, 97, 72, 25);
        dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(dateLabel);
        
        JLabel periodApplied = new JLabel("Period Applied");
        periodApplied.setBounds(10, 344, 131, 20);
        periodApplied.setFont(new Font("Tahoma", Font.BOLD, 15));
        formPanel.add(periodApplied);
        
        JLabel contactLabel = new JLabel("Means of Contact:");
        contactLabel.setBounds(10, 462, 139, 20);
        contactLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        formPanel.add(contactLabel);
        
        JLabel contactName = new JLabel("Name:");
        contactName.setBounds(10, 493, 50, 14);
        contactName.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(contactName);
        
        JLabel contactAddress = new JLabel("Address:");
        contactAddress.setBounds(10, 528, 86, 14);
        contactAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(contactAddress);
        
        JLabel contactNumber = new JLabel("Contact no.:");
        contactNumber.setBounds(10, 567, 86, 14);
        contactNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(contactNumber); 
        
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
        
        purposeText = new JTextField();
        purposeText.setBounds(132, 297, 239, 20);
        purposeText.setColumns(10);
        formPanel.add(purposeText);
        
        contactNameText = new JTextField();
        contactNameText.setBounds(132, 493, 239, 20);
        contactNameText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char name = e.getKeyChar();
                if (!Character.isLetter(name) && name != ' ') {
                    e.consume();
                }
            }
        });
        
        contactNameText.setColumns(10);
        formPanel.add(contactNameText);
        
        contactAddressText = new JTextField();
        contactAddressText.setBounds(132, 527, 239, 20);
        contactAddressText.setColumns(10);
        formPanel.add(contactAddressText);
        
        contactNoText = new JTextField();
        contactNoText.setBounds(132, 566, 239, 20);
        contactNoText.addKeyListener(new KeyAdapter() {
        	//Logic for contactNo
        	@Override
        	public void keyTyped(KeyEvent e) {
        		char inputNumber = e.getKeyChar();
        		if (!Character.isDigit(inputNumber)) {
        			e.consume();
        		}
        	}
        });
        
        contactNoText.setColumns(10);
        formPanel.add(contactNoText);
        
        JLabel leaveTypeLabel = new JLabel("Leave Type:");
        leaveTypeLabel.setBounds(10, 133, 121, 25);
        leaveTypeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(leaveTypeLabel);
        
        JLabel purposeLabel = new JLabel("Specific Purpose:");
        purposeLabel.setBounds(10, 293, 165, 25);
        purposeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(purposeLabel);
        
        leaveTypeSelect = new JComboBox();
        leaveTypeSelect.setBounds(132, 136, 239, 21);
        leaveTypeSelect.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		updateDateRestrictions();
        	}
        });      
       
        leaveTypeSelect.setModel(new DefaultComboBoxModel(new String[] {"Select Type", "Sick Leave", "Emergency Leave", "Vacation Leave", "Maternity Leave", "Paternity Leave"}));
        leaveTypeSelect.setFont(new Font("Tahoma", Font.PLAIN, 12));
        leaveTypeSelect.setBackground(Color.WHITE);
        formPanel.add(leaveTypeSelect);
        
        
        startDateChooser = new JDateChooser();
        startDateChooser.setBounds(132, 371, 239, 20);
        formPanel.add(startDateChooser);
        
        endDateChooser = new JDateChooser();
        endDateChooser.setBounds(132, 414, 239, 20);
        formPanel.add(endDateChooser);
        
        JLabel toLabel = new JLabel("To");
        toLabel.setBounds(73, 420, 33, 14);
        toLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(toLabel);
        
		JLabel currentDateLabel = new JLabel(getCurrentDate());
		currentDateLabel.setBounds(132, 97, 239, 25);
		currentDateLabel.setHorizontalAlignment(SwingConstants.LEFT);
        currentDateLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(currentDateLabel);
        
        JLabel lblFrom = new JLabel("From");
        lblFrom.setBounds(74, 375, 50, 14);
        lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
        formPanel.add(lblFrom);
       
        
        JButton btnSubmit = new JButton("SUBMIT\r\n");
        btnSubmit.setBounds(94, 699, 109, 32);
        formPanel.add(btnSubmit);
        
        JButton btnNewButton = new JButton("CANCEL");
        btnNewButton.setBounds(271, 699, 116, 32);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        formPanel.add(btnNewButton);
        
        commentPanel = new JPanel();
        commentPanel.setBounds(10, 599, 446, 90);
        formPanel.add(commentPanel);
        commentPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "COMMENTS", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
        commentPanel.setLayout(null);
        
        JTextArea textAreaComments = new JTextArea();
        textAreaComments.setBounds(10, 15, 426, 65);
        commentPanel.add(textAreaComments);
        textAreaComments.setLineWrap(true);
        textAreaComments.setWrapStyleWord(true);
        textAreaComments.setColumns(10);
       
        btnSubmit.addActionListener(new ActionListener() {	
        	public void actionPerformed(ActionEvent e) {
        		if (isAllFieldsFilledUP()) {
        			JOptionPane.showMessageDialog(null, "Successfully Submitted!");
        			JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(btnSubmit);
		            currentFrame.dispose();
        		}
        		else {
        			JOptionPane.showMessageDialog(null, "Fill up all required fields.");
        		}        		
        	}
        });
        
        JLabel Background = new JLabel("New label");
        Background.setBounds(0, 0, 503, 774);
        Background.setIcon(new ImageIcon(LeaveApplicationFormFrame2.class.getResource("/images/bbg.png")));
        contentPane.add(Background);       
    }
    
    //Methods and Constructors
    private Object prepareAddLeaveTypeStatement(Connection connection2, String newLeaveType2) {
		// TODO Auto-generated method stub
		return null;
	}
    
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
    
    //Logic for Submit button
    private boolean isAllFieldsFilledUP() {
        return employeeIDDB != null &&
                fullNameDB != null &&
                !purposeText.getText().isEmpty() &&
                !contactNameText.getText().isEmpty() &&
                !contactNameText.getText().isBlank() &&
                !contactAddressText.getText().isEmpty() &&
                !contactNoText.getText().isEmpty() &&
                campusDB != null &&
                departmentDB != null &&
                leaveTypeSelect.getSelectedIndex() != 0 &&
                startDateChooser.getDate() != null &&
                endDateChooser.getDate() != null;
    }
}