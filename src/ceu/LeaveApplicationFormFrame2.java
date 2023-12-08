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
    private JTextField employeeNoText;
    private JTextField nameText;
    private JTextField purposeText;
    private JTextField contactNameText;
    private JTextField contactAddressText;
    private JTextField contactNoText;
    private JLabel deptLabel;
    private JComboBox departmentSelect;
    private JTextField textField_2;
    
    private JComboBox leaveTypeSelect; 
    private JComboBox campusSelect; 
    private JDateChooser startDateChooser; 
    private JDateChooser endDateChooser;
    private JDateChooser start;
    private JLabel lblNewLabel_2;
    
    private Date_And_Time dateTime;
    private JPanel commentPanel;
    private String newLeaveType;
    
    private Connection connection;
	private QueryCommands qc;

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
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(105, 21, 266, 20);
        formPanel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Leave Application");
        lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1.setBounds(85, 40, 286, 25);
        formPanel.add(lblNewLabel_1);
        
        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        dateLabel.setBounds(10, 85, 72, 25);
        formPanel.add(dateLabel);
        
        JLabel periodApplied = new JLabel("Period Applied");
        periodApplied.setFont(new Font("Tahoma", Font.BOLD, 15));
        periodApplied.setBounds(10, 361, 131, 20);
        formPanel.add(periodApplied);
        
        JLabel contactLabel = new JLabel("Means of Contact:");
        contactLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        contactLabel.setBounds(10, 462, 139, 20);
        formPanel.add(contactLabel);
        
        JLabel contactName = new JLabel("Name:");
        contactName.setFont(new Font("Tahoma", Font.PLAIN, 15));
        contactName.setBounds(10, 493, 50, 14);
        formPanel.add(contactName);
        
        JLabel contactAddress = new JLabel("Address:");
        contactAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
        contactAddress.setBounds(10, 528, 86, 14);
        formPanel.add(contactAddress);
        
        JLabel contactNumber = new JLabel("Contact no.:");
        contactNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
        contactNumber.setBounds(10, 567, 86, 14);
        formPanel.add(contactNumber);
        
  
        
        employeeNoText = new JTextField();
        employeeNoText.addKeyListener(new KeyAdapter() {
        	//Logic for employeeNo.
        	  public void keyTyped(KeyEvent e) {
                  char inputChar = e.getKeyChar();
                  if (!Character.isDigit(inputChar) && inputChar != KeyEvent.VK_BACK_SPACE) {
                      e.consume(); // Ignore non-numeric input
                  }
              }
          });
        
        employeeNoText.setBounds(132, 156, 239, 20);
        formPanel.add(employeeNoText);
        employeeNoText.setColumns(10);
        
        nameText = new JTextField();
        nameText.addKeyListener(new KeyAdapter() {
        	//Logic for nameTe33xt.
        	@Override
            public void keyTyped(KeyEvent e) {
                char name = e.getKeyChar();
                if (!Character.isLetter(name) && name != ' ') {
                    e.consume();
                }
            }
        });
        
        nameText.setColumns(10);
        nameText.setBounds(132, 195, 239, 20);
        formPanel.add(nameText);
        
        purposeText = new JTextField();
        purposeText.setColumns(10);
        purposeText.setBounds(132, 315, 239, 20);
        formPanel.add(purposeText);
        
        contactNameText = new JTextField();
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
        contactNameText.setBounds(132, 493, 239, 20);
        formPanel.add(contactNameText);
        
        contactAddressText = new JTextField();
        contactAddressText.setColumns(10);
        contactAddressText.setBounds(132, 527, 239, 20);
        formPanel.add(contactAddressText);
        
        contactNoText = new JTextField();
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
        contactNoText.setBounds(132, 566, 239, 20);
        formPanel.add(contactNoText);
        
        JLabel leaveTypeLabel = new JLabel("Leave Type:");
        leaveTypeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        leaveTypeLabel.setBounds(10, 117, 121, 25);
        formPanel.add(leaveTypeLabel);
        
        JLabel employeeNoLabel = new JLabel("Employee No.:");
        employeeNoLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        employeeNoLabel.setBounds(10, 152, 139, 25);
        formPanel.add(employeeNoLabel);
        
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        nameLabel.setBounds(10, 191, 86, 25);
        formPanel.add(nameLabel);
        
        JLabel campusLabel = new JLabel("Campus:");
        campusLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        campusLabel.setBounds(10, 227, 99, 25);
        formPanel.add(campusLabel);
        
        JLabel purposeLabel = new JLabel("Specific Purpose:");
        purposeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        purposeLabel.setBounds(10, 311, 165, 25);
        formPanel.add(purposeLabel);
        
        campusSelect = new JComboBox();
        campusSelect.setModel(new DefaultComboBoxModel(new String[] {"Select Campus", "Manila ", "Makati ", "Malolos"}));
        campusSelect.setFont(new Font("Tahoma", Font.PLAIN, 12));
        campusSelect.setBackground(Color.WHITE);
        campusSelect.setBounds(132, 226, 239, 21);
        formPanel.add(campusSelect);
        
        deptLabel = new JLabel("Department:");
        deptLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        deptLabel.setBounds(10, 267, 99, 25);
        formPanel.add(deptLabel);
        
        departmentSelect = new JComboBox();
        departmentSelect.setModel(new DefaultComboBoxModel(new String[] {"Select Department", "Canteen", "Library", "Faculty", "Maintenance\t", "Accounting Office", "HR"}));
        departmentSelect.setFont(new Font("Tahoma", Font.PLAIN, 12));
        departmentSelect.setBackground(new Color(255, 255, 255));
        departmentSelect.setBounds(132, 270, 239, 21);
        formPanel.add(departmentSelect);
        
        leaveTypeSelect = new JComboBox();
        leaveTypeSelect.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		updateDateRestrictions();
        	}
        });
        
       
        leaveTypeSelect.setModel(new DefaultComboBoxModel(new String[] {"Select Type", "Sick Leave", "Emergency Leave", "Vacation Leave", "Maternity Leave", "Paternity Leave"}));
        leaveTypeSelect.setFont(new Font("Tahoma", Font.PLAIN, 12));
        leaveTypeSelect.setBackground(Color.WHITE);
        leaveTypeSelect.setBounds(132, 120, 239, 21);
        formPanel.add(leaveTypeSelect);
        
        
        startDateChooser = new JDateChooser();
        startDateChooser.setBounds(132, 388, 239, 20);
        formPanel.add(startDateChooser);
        
        endDateChooser = new JDateChooser();
        endDateChooser.setBounds(132, 431, 239, 20);
        formPanel.add(endDateChooser);
        
        JLabel toLabel = new JLabel("To");
        toLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        toLabel.setBounds(76, 437, 33, 14);
        formPanel.add(toLabel);
        
		JLabel currentDateLabel = new JLabel("2023-12-08\r\n");
		currentDateLabel.setHorizontalAlignment(JLabel.CENTER);
        currentDateLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        currentDateLabel.setBounds(132, 85, 239, 25);
        formPanel.add(currentDateLabel);
        
        JLabel lblFrom = new JLabel("From");
        lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblFrom.setBounds(74, 392, 50, 14);
        formPanel.add(lblFrom);
       
        
        JButton btnSubmit = new JButton("SUBMIT\r\n");
        btnSubmit.setBounds(94, 699, 109, 32);
        formPanel.add(btnSubmit);
        
        JButton btnNewButton = new JButton("CANCEL");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        btnNewButton.setBounds(271, 699, 116, 32);
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
        			JOptionPane.showMessageDialog(null, "Please fill up the required Informations.");
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
//
//	private static String getCurrentDate() {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        return dateFormat.format(new Date());
////    }
//   
//    private void refreshCalendar(int month, int year) {
//        //Variables
//        String[] months =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//        int nod, som; //Number Of Days, Start Of Month
//        
//        //Allow/disallow buttons
//        btnPrev.setEnabled(true);
//        btnNext.setEnabled(true);
//        if (month == 0 && year <= realYear-10){btnPrev.setEnabled(false);} //Too early
//        if (month == 11 && year >= realYear+100){btnNext.setEnabled(false);} //Too late
//        lblMonth.setText(months[month]); //Refresh the month label (at the top)
//        lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 25, 180, 25); //Re-align label with calendar
//        cmbYear.setSelectedItem(String.valueOf(year)); //Select the correct year in the combo box
//        
//        //Clear table
//        for (int i=0; i<6; i++){
//            for (int j=0; j<7; j++){
//                mtblCalendar.setValueAt(null, i, j);
//            }
//        }
//        
//        //Get first day of month and number of days
//        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
//        nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
//        som = cal.get(GregorianCalendar.DAY_OF_WEEK);
//        
//        //Draw calendar
//        for (int i=1; i<=nod; i++){
//            int row = new Integer((i+som-2)/7);
//            int column  =  (i+som-2)%7;
//            mtblCalendar.setValueAt(i, row, column);
//        }
//        
//        //Apply renderers
//        tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer());
    
    
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
        return !employeeNoText.getText().isEmpty() &&
                !nameText.getText().isEmpty() &&
                !nameText.getText().isBlank() &&
                !purposeText.getText().isEmpty() &&
                !contactNameText.getText().isEmpty() &&
                !contactNameText.getText().isBlank() &&
                !contactAddressText.getText().isEmpty() &&
                !contactNoText.getText().isEmpty() &&
                campusSelect.getSelectedIndex() != 0 &&
                leaveTypeSelect.getSelectedIndex() != 0 &&
                departmentSelect.getSelectedIndex() != 0 &&
                startDateChooser.getDate() != null &&
                endDateChooser.getDate() != null;
    }
}