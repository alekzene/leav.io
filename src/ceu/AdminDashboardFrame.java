// FIXME: SHOW LEAVE REQUESTS IN TABLE
// FIXME: VIEW BUTTON LOGIC

package ceu; 

import java.awt.EventQueue;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

 		 
public class AdminDashboardFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable AdminDashboard_Table;
	
	// DATABASE
	private Connection connection;
	private QueryCommands qc;
	private String firstNameDB;
	private int pendingCount;
	private String newLeaveType;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboardFrame frame = new AdminDashboardFrame();
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
	 * @throws SQLException 
	 */
	public AdminDashboardFrame() throws SQLException {
		
		connection = DatabaseConnection.getConnection();
		qc = new QueryCommands();
		
		Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 0);		
		ResultSet rs = st.executeQuery("select * from leave_requests");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255, 150));
		panel_1.setBounds(27, 109, 717, 351);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Leave Requests");
		lblNewLabel_1.setBounds(21, 17, 199, 36);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		JPanel users = new JPanel();
		users.setBackground(new Color(255, 255, 255));
		users.setBounds(21, 69, 675, 224);
		panel_1.add(users);
		users.setLayout(null);
		
		DefaultTableModel adminDashboard_Model = new DefaultTableModel(0, 4) {
			boolean[] columnEditables = new boolean[] {
			false, false, false, true
		};
            @Override
//            public boolean isCellEditable(int row, int column) {
//                return column != 3; // Make all cells non-editable except for column 4
            	public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
            };

        // Set column headers
        String[] adminDashboard_Headers = {"Client ID", "Leave ID", "Type of Leave", ""};
        adminDashboard_Model.setColumnIdentifiers(adminDashboard_Headers);
        
        rs.last();
		int rowCount = rs.getRow();
		rs.first();
		
		int count = 0;
		for(int i = 1; i <= rowCount; i++ ) {	
	        
	        if(rs.getString("status").equals("Pending")) {
	    		count++;
	        	
	        	adminDashboard_Model.addRow(new Object[]{rs.getString("employee_id"), rs.getInt("id"), rs.getString("category"), "/images/icons8-eye-24.png" });
					
					
			}
	        
	        rs.next();
        }

//        }
        
     // Create the table with the model
        AdminDashboard_Table = new JTable(adminDashboard_Model);
        AdminDashboard_Table.setSize(new Dimension(660, 223));

        // Set the row height to 40 pixels
        AdminDashboard_Table.setRowHeight(40);

        // Disable cell selection
        AdminDashboard_Table.setCellSelectionEnabled(false);

        // Set a custom renderer and editor for the button column (Column 4)
        int buttonColumn = 3;
        AdminDashboard_Table.getColumnModel().getColumn(buttonColumn).setCellRenderer(new ButtonRenderer());
        AdminDashboard_Table.getColumnModel().getColumn(buttonColumn).setCellEditor(new ButtonEditor(new JCheckBox()));
        
     // Create the scroll pane and add the table to it
        JScrollPane scrollPane = new JScrollPane(AdminDashboard_Table);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(0, 0, 676, 226);
        
        users.add(scrollPane);
		        	
		JButton logOutButton = new JButton("LOG OUT");
		logOutButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm Log Out", JOptionPane.YES_NO_OPTION);

		        if (confirmation == JOptionPane.YES_OPTION) {
		            AdminDashboardFrame.this.dispose();
		            LogInFrame frame = new LogInFrame();
					frame.setVisible(true);	
					frame.setLocationRelativeTo(null);
		        } else {
		            // Do nothing
		        }
		    }
		});
	
		logOutButton.setForeground(Color.WHITE);
		logOutButton.setBackground(new Color(255, 108, 108));
		logOutButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		logOutButton.setBounds(299, 311, 126, 29);
		panel_1.add(logOutButton);
			
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255, 150));
		panel.setBounds(27, 37, 717, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Fetch Admin Name from Database
		  try (ResultSet resultSet = qc.prepareSelectFirstNameStatement(connection, LogInFrame.usernameDB).executeQuery()) {
              if (resultSet.next()) {
            	  firstNameDB = resultSet.getString("first_name");
              }
          } catch (SQLException ex) {
              ex.printStackTrace();
          }
				
		try (ResultSet resultSet = qc.prepareSelectAllLeaveRequestsStatement(connection).executeQuery()) {
		    List<Map<String, Object>> resultList = new ArrayList<>();

		    while (resultSet.next()) {
		        Map<String, Object> row = new HashMap<>();
		        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
		            String columnName = resultSet.getMetaData().getColumnName(i);
		            Object value = resultSet.getObject(i);
		            row.put(columnName, value);
		        }
		        resultList.add(row);
		    }
		    pendingCount = resultList.size();


//		    // Display or further process the resultList
//		    for (Map<String, Object> row : resultList) {
//		        System.out.println(row);
//		    }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

		JLabel lblNewLabel = new JLabel(String.format( firstNameDB + ", you have %S leave application requests to review.", count));
		lblNewLabel.setBounds(10, 0, 631, 55);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel bgIMG = new JLabel("");
		bgIMG.setIcon(new ImageIcon(AdminDashboardFrame.class.getResource("/images/bbg.png")));
		bgIMG.setBounds(0, 0, 771, 481);
		contentPane.add(bgIMG);
	}
	private static class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(false);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setIcon(new ImageIcon(getClass().getResource((String) value)));
            setText(null);
            return this;
        }
    }

    private static class ButtonEditor extends DefaultCellEditor {

        private JButton button;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	
    				try {
    					AdminLeaveEndorsementGUI endorsement = new AdminLeaveEndorsementGUI();
                    	endorsement.setVisible(true);
        				endorsement.setLocationRelativeTo(null);
    				} catch (Exception d) {
    					d.printStackTrace();
    				}
	                // FIXME 
                    fireEditingStopped();
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            button.setIcon(new ImageIcon(getClass().getResource(("/images/icons8-eye-24.png"))));
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return button.getIcon();
        }
    }
}