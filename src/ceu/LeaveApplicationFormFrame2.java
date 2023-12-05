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
import java.util.GregorianCalendar;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import com.toedter.calendar.JDateChooser;




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
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_3;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JLabel lblNewLabel_4_1_1_3;
    private JComboBox comboBox_2;
    private JTextField textField_2;
    
    private JComboBox comboBox_1_1; 
    private JComboBox comboBox_1; 
    private JDateChooser startDateChooser; 
    private JDateChooser endDateChooser; 
    
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LeaveApplicationFormFrame2 frame = new LeaveApplicationFormFrame2();
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
    public LeaveApplicationFormFrame2() {
        setResizable(true);
        setTitle("Leave Application Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 100, 963, 812);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
		
		//Calendar Code
		pnlCalendar = new JPanel(null);
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

        // Set bounds
        pnlCalendar.setBounds(496, 24, 443, 396);
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
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        panel.setBounds(10, 24, 466, 741);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Center Scholar University");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(105, 21, 266, 20);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Leave Application");
        lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1.setBounds(85, 40, 286, 25);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_4 = new JLabel("Date:");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4.setBounds(10, 85, 72, 25);
        panel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_8 = new JLabel("Period Applied");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_8.setBounds(10, 361, 131, 20);
        panel.add(lblNewLabel_8);
        
        JLabel lblNewLabel_12 = new JLabel("Means of Contact:");
        lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_12.setBounds(10, 462, 139, 20);
        panel.add(lblNewLabel_12);
        
        JLabel lblNewLabel_13 = new JLabel("Name:");
        lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_13.setBounds(10, 493, 50, 14);
        panel.add(lblNewLabel_13);
        
        JLabel lblNewLabel_13_1 = new JLabel("Address:");
        lblNewLabel_13_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_13_1.setBounds(10, 528, 86, 14);
        panel.add(lblNewLabel_13_1);
        
        JLabel lblNewLabel_13_2 = new JLabel("Contact no.:");
        lblNewLabel_13_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_13_2.setBounds(10, 567, 86, 14);
        panel.add(lblNewLabel_13_2);
        
        textField = new JTextField();
        textField.addKeyListener(new KeyAdapter() {
        	  public void keyTyped(KeyEvent e) {
                  char inputChar = e.getKeyChar();
                  if (!Character.isDigit(inputChar) && inputChar != KeyEvent.VK_BACK_SPACE) {
                      e.consume(); // Ignore non-numeric input
                  }
              }
          });
        
        textField.setBounds(123, 156, 99, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		char name = e.getKeyChar();
        		if (!Character.isAlphabetic(name) ) {
        			e.consume();
        		}
        	}
        });
        
        textField_1.setColumns(10);
        textField_1.setBounds(123, 195, 99, 20);
        panel.add(textField_1);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(123, 315, 99, 20);
        panel.add(textField_3);
        
        textField_6 = new JTextField();
        textField_6.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		char name = e.getKeyChar();
        		if (!Character.isAlphabetic(name)) {
        			e.consume();
        		}
        	}
        });
        textField_6.setColumns(10);
        textField_6.setBounds(123, 493, 116, 20);
        panel.add(textField_6);
        
        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(123, 527, 116, 20);
        panel.add(textField_7);
        
        textField_8 = new JTextField();
        textField_8.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		char inputNumber = e.getKeyChar();
        		if (!Character.isDigit(inputNumber)) {
        			e.consume();
        		}
        	}
        });
        
        textField_8.setColumns(10);
        textField_8.setBounds(123, 566, 116, 20);
        panel.add(textField_8);
        
        JLabel lblNewLabel_4_1 = new JLabel("Leave Type:");
        lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_1.setBounds(10, 117, 121, 25);
        panel.add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_4_1_1 = new JLabel("Employee No.:");
        lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_1_1.setBounds(10, 152, 139, 25);
        panel.add(lblNewLabel_4_1_1);
        
        JLabel lblNewLabel_4_1_1_1 = new JLabel("Name:");
        lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_1_1_1.setBounds(10, 191, 86, 25);
        panel.add(lblNewLabel_4_1_1_1);
        
        JLabel lblNewLabel_4_1_1_2 = new JLabel("Campus:");
        lblNewLabel_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_1_1_2.setBounds(10, 227, 99, 25);
        panel.add(lblNewLabel_4_1_1_2);
        
        JLabel lblNewLabel_4_1_1_2_1 = new JLabel("Specific Purpose:");
        lblNewLabel_4_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_1_1_2_1.setBounds(10, 311, 165, 25);
        panel.add(lblNewLabel_4_1_1_2_1);
        
        comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Campus", "Manila ", "Makati ", "Malalolos"}));
        comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        comboBox_1.setBackground(Color.WHITE);
        comboBox_1.setBounds(123, 226, 99, 21);
        panel.add(comboBox_1);
        
        lblNewLabel_4_1_1_3 = new JLabel("Department:");
        lblNewLabel_4_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_1_1_3.setBounds(10, 267, 99, 25);
        panel.add(lblNewLabel_4_1_1_3);
        
        comboBox_2 = new JComboBox();
        comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Department", "CSIT", "Medtech", "Pharmacy", "Nursing"}));
        comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        comboBox_2.setBackground(new Color(255, 255, 255));
        comboBox_2.setBounds(123, 270, 99, 21);
        panel.add(comboBox_2);
        
        comboBox_1_1 = new JComboBox();
        comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select Type", "Emergency Leave", "Vacation Leave", "Maternity Leave", "Paternity Leave"}));
        comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        comboBox_1_1.setBackground(Color.WHITE);
        comboBox_1_1.setBounds(123, 120, 99, 21);
        panel.add(comboBox_1_1);
        
        startDateChooser = new JDateChooser();
        startDateChooser.setBounds(123, 361, 116, 20);
        panel.add(startDateChooser);
        
        endDateChooser = new JDateChooser();
        endDateChooser.setBounds(123, 411, 116, 20);
        panel.add(endDateChooser);
        
        JLabel lblNewLabel_13_3 = new JLabel("To");
        lblNewLabel_13_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_13_3.setBounds(163, 390, 27, 14);
        panel.add(lblNewLabel_13_3);
        

        
        JButton btnNewButton = new JButton("SUBMIT\r\n");
        btnNewButton.setBounds(642, 689, 150, 76);
        contentPane.add(btnNewButton);
        
        JLabel Background = new JLabel("New label");
        Background.setIcon(new ImageIcon(LeaveApplicationFormFrame2.class.getResource("/images/bbg.png")));
        Background.setBounds(0, 0, 948, 774);
        contentPane.add(Background);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (isAllFieldsFilledUP()) {
        			JOptionPane.showMessageDialog(null, "Successfully Submitted!");
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
    
    //Methods
    private boolean isAllFieldsFilledUP() {
        return !textField.getText().isEmpty() &&
                !textField_1.getText().isEmpty() &&
                !textField_3.getText().isEmpty() &&
                !textField_6.getText().isEmpty() &&
                !textField_7.getText().isEmpty() &&
                !textField_8.getText().isEmpty() &&
                comboBox_1.getSelectedIndex() != 0 &&
                comboBox_1_1.getSelectedIndex() != 0 &&
                comboBox_2.getSelectedIndex() != 0 &&
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