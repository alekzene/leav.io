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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import com.toedter.calendar.JDateChooser;
import org.eclipse.wb.swing.FocusTraversalOnArray;




public class LeaveApplicationFormFrame2 extends JFrame {
    private JPanel contentPane;
    private JLabel lblMonth, lblYear;
    private JComboBox cmbYear;
    private JButton btnPrev, btnNext;
    private DefaultTableModel mtblCalendar;
    private JTable tblCalendar;
    private JScrollPane stblCalendar;
    private JPanel pnlCalendar;

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
    private JLabel lblNewLabel_2;
    
    private Date_And_Time dateTime;
    private JPanel commentPanel;

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
        setBounds(500, 100, 976, 812);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
		contentPane.setLayout(null);
		
		commentPanel = new JPanel();
		commentPanel.setBounds(496, 481, 428, 144);
		commentPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "COMMENTS", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(commentPanel);
		commentPanel.setLayout(null);
		
		JTextArea textAreaComments = new JTextArea();
		textAreaComments.setLineWrap(true);
		textAreaComments.setWrapStyleWord(true);
		textAreaComments.setBounds(10, 23, 408, 110);
		textAreaComments.setColumns(10);
		commentPanel.add(textAreaComments);
		
		//Calendar Code
		pnlCalendar = new JPanel(null);
		pnlCalendar.setBounds(496, 24, 443, 396);
        pnlCalendar.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Calendar", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
        contentPane.add(pnlCalendar);

        lblMonth = new JLabel("January");
        lblYear = new JLabel("Change year:");
        cmbYear = new JComboBox();
        btnPrev = new JButton("<<");
        btnNext = new JButton(">>");
        mtblCalendar = new DefaultTableModel() {
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
        };
        tblCalendar = new JTable(mtblCalendar);
        stblCalendar = new JScrollPane(tblCalendar);

        // Register action listeners
        btnPrev.addActionListener(new btnPrev_Action());
        btnNext.addActionListener(new btnNext_Action());
        cmbYear.addActionListener(new cmbYear_Action());

        // Add controls to calendar panel
        pnlCalendar.add(lblMonth);
        pnlCalendar.add(lblYear);
        pnlCalendar.add(cmbYear);
        pnlCalendar.add(btnPrev);
        pnlCalendar.add(btnNext);
        pnlCalendar.add(stblCalendar);
        lblMonth.setBounds(150 - lblMonth.getPreferredSize().width / 2, 11, 120, 32);
        lblYear.setBounds(10, 365, 80, 20);
        cmbYear.setBounds(200, 365, 80, 20);
        btnPrev.setBounds(10, 11, 50, 25);
        btnNext.setBounds(380, 11, 50, 25);
        stblCalendar.setBounds(10, 50, 423, 250);

        // Make frame visible
        setVisible(true);

        // Get real month/year
        GregorianCalendar cal = new GregorianCalendar(); // Create calendar
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); // Get day
        realMonth = cal.get(GregorianCalendar.MONTH); // Get month
        realYear = cal.get(GregorianCalendar.YEAR); // Get year
        currentMonth = realMonth; // Match month and year

        // Add headers
        String[] headers = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // All headers
        for (int i = 0; i < 7; i++) {
            mtblCalendar.addColumn(headers[i]);
        }

        tblCalendar.getParent().setBackground(tblCalendar.getBackground()); // Set background

        // No resize/reorder
        tblCalendar.getTableHeader().setResizingAllowed(false);
        tblCalendar.getTableHeader().setReorderingAllowed(false);

        // Single cell selection
        tblCalendar.setColumnSelectionAllowed(true);
        tblCalendar.setRowSelectionAllowed(true);
        tblCalendar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Set row/column count
        tblCalendar.setRowHeight(38);
        
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
        	@Override
        	public void keyTyped(KeyEvent e) {
        		char name = e.getKeyChar();
        		if (!Character.isAlphabetic(name) ) {
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
        		if (!Character.isAlphabetic(name)) {
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
        campusSelect.setModel(new DefaultComboBoxModel(new String[] {"Select Campus", "Manila ", "Makati ", "Malalolos"}));
        campusSelect.setFont(new Font("Tahoma", Font.PLAIN, 12));
        campusSelect.setBackground(Color.WHITE);
        campusSelect.setBounds(132, 226, 239, 21);
        formPanel.add(campusSelect);
        
        deptLabel = new JLabel("Department:");
        deptLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        deptLabel.setBounds(10, 267, 99, 25);
        formPanel.add(deptLabel);
        
        departmentSelect = new JComboBox();
        departmentSelect.setModel(new DefaultComboBoxModel(new String[] {"Select Department", "Canteen", "Library", "Faculty", "Security", "Accounting Office"}));
        departmentSelect.setFont(new Font("Tahoma", Font.PLAIN, 12));
        departmentSelect.setBackground(new Color(255, 255, 255));
        departmentSelect.setBounds(132, 270, 239, 21);
        formPanel.add(departmentSelect);
        
        leaveTypeSelect = new JComboBox();
        leaveTypeSelect.setModel(new DefaultComboBoxModel(new String[] {"Select Type", "Emergency Leave", "Vacation Leave", "Maternity Leave", "Paternity Leave"}));
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
        
		JLabel currentDateLabel = new JLabel(getCurrentDate());
		currentDateLabel.setHorizontalAlignment(JLabel.CENTER);
		Timer timer = new Timer(1000, e -> currentDateLabel.setText(getCurrentDate()));
        timer.start();
        
        Date_And_Time dateTime = new Date_And_Time();
		
        currentDateLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        currentDateLabel.setBounds(132, 85, 239, 25);
        formPanel.add(currentDateLabel);
        
        JLabel lblFrom = new JLabel("From");
        lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblFrom.setBounds(74, 392, 50, 14);
        formPanel.add(lblFrom);
       
        
        JButton btnSubmit = new JButton("SUBMIT\r\n");
        btnSubmit.setBounds(641, 670, 150, 76);
        contentPane.add(btnSubmit);
        
        JLabel Background = new JLabel("New label");
        Background.setBounds(0, 0, 981, 774);
        Background.setIcon(new ImageIcon(LeaveApplicationFormFrame2.class.getResource("/images/bbg.png")));
        contentPane.add(Background);
        setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, commentPanel, textAreaComments, pnlCalendar, lblMonth, lblYear, cmbYear, btnPrev, btnNext, stblCalendar, tblCalendar, formPanel, lblNewLabel, lblNewLabel_1, dateLabel, periodApplied, contactLabel, contactName, contactAddress, contactNumber, employeeNoText, nameText, purposeText, contactNameText, contactAddressText, contactNoText, leaveTypeLabel, employeeNoLabel, nameLabel, campusLabel, purposeLabel, campusSelect, deptLabel, departmentSelect, leaveTypeSelect, startDateChooser, startDateChooser.getCalendarButton(), endDateChooser, endDateChooser.getCalendarButton(), toLabel, currentDateLabel, btnSubmit, Background}));
        
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
        mtblCalendar.setColumnCount(7);
        mtblCalendar.setRowCount(6);
        
        // Populate table
        for (int i = realYear - 100; i <= realYear + 100; i++) {
            cmbYear.addItem(String.valueOf(i));
        }

        // Refresh calendar
        refreshCalendar(realMonth, realYear); // Refresh calendar
    }
    
    //Methods and Constructors
    
    private static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, YYYY");
        return dateFormat.format(new Date());
    }
   
    private void refreshCalendar(int month, int year) {
        //Variables
        String[] months =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int nod, som; //Number Of Days, Start Of Month
        
        //Allow/disallow buttons
        btnPrev.setEnabled(true);
        btnNext.setEnabled(true);
        if (month == 0 && year <= realYear-10){btnPrev.setEnabled(false);} //Too early
        if (month == 11 && year >= realYear+100){btnNext.setEnabled(false);} //Too late
        lblMonth.setText(months[month]); //Refresh the month label (at the top)
        lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 25, 180, 25); //Re-align label with calendar
        cmbYear.setSelectedItem(String.valueOf(year)); //Select the correct year in the combo box
        
        //Clear table
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                mtblCalendar.setValueAt(null, i, j);
            }
        }
        
        //Get first day of month and number of days
        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
        nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        som = cal.get(GregorianCalendar.DAY_OF_WEEK);
        
        //Draw calendar
        for (int i=1; i<=nod; i++){
            int row = new Integer((i+som-2)/7);
            int column  =  (i+som-2)%7;
            mtblCalendar.setValueAt(i, row, column);
        }
        
        //Apply renderers
        tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer());
    }
    
 
    private boolean isAllFieldsFilledUP() {
        return !employeeNoText.getText().isEmpty() &&
                !nameText.getText().isEmpty() &&
                !purposeText.getText().isEmpty() &&
                !contactNameText.getText().isEmpty() &&
                !contactAddressText.getText().isEmpty() &&
                !contactNoText.getText().isEmpty() &&
                campusSelect.getSelectedIndex() != 0 &&
                leaveTypeSelect.getSelectedIndex() != 0 &&
                departmentSelect.getSelectedIndex() != 0 &&
                startDateChooser.getDate() != null &&
                endDateChooser.getDate() != null;
    }

    private class tblCalendarRenderer extends DefaultTableCellRenderer{
        public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column){
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            if (column == 0 || column == 6){ //Week-end
                setBackground(new Color(255, 220, 220));
            }
            else{ //Week
                setBackground(new Color(255, 255, 255));
            }
            if (value != null){
                if (Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear){ //Today
                    setBackground(new Color(220, 220, 255));
                }
            }
            setBorder(null);
            setForeground(Color.black);
            return this;
        }
    }
    
    private class btnPrev_Action implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent e){
            if (currentMonth == 0){ //Back one year
                currentMonth = 11;
                currentYear -= 1;
            }
            else{ //Back one month
                currentMonth -= 1;
            }
            refreshCalendar(currentMonth, currentYear);
        }
    }

    private class btnNext_Action implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent e){
            if (currentMonth == 11){ //Foward one year
                currentMonth = 0;
                currentYear += 1;
            }
            else{ //Foward one month
                currentMonth += 1;
            }
            refreshCalendar(currentMonth, currentYear);
        }
    }

    private class cmbYear_Action implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent e){
            if (cmbYear.getSelectedItem() != null){
                String b = cmbYear.getSelectedItem().toString();
                currentYear = Integer.parseInt(b);
                refreshCalendar(currentMonth, currentYear);
            }
        }
    }
}
