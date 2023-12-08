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
import java.util.EventObject;
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
	 */
	public AdminDashboardFrame() {
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
		
		DefaultTableModel model = new DefaultTableModel(0, 4) {
			boolean[] columnEditables = new boolean[] {
			false, false, false, false
		};
            @Override
//            public boolean isCellEditable(int row, int column) {
//                return column != 3; // Make all cells non-editable except for column 4
            	public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
            };

        // Set column headers
        String[] headers = {"Employee Name", "Department", "Type of Leave", ""};
        model.setColumnIdentifiers(headers);

        // Populate the table with 20 rows
//        for (int i = 0; i < 20; i++) {
        // FIXME: FIX PRINT LOGIC / ROW ADDITION LOGIC
            model.addRow(new Object[]{"Francisco, Earl Ace", "Library", "Vacation", "/images/icons8-eye-24.png"});
//        }
        
     // Create the table with the model
        AdminDashboard_Table = new JTable(model);
        AdminDashboard_Table.setSize(new Dimension(660, 223));
        AdminDashboard_Table.setPreferredSize(new Dimension(100, 40));

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
        scrollPane.setBounds(0, 0, 675, 224);
        
        users.add(scrollPane);
        
//		AdminDashboard_Table = new JTable();
//		AdminDashboard_Table.setRowSelectionAllowed(false);
//		scrollPane.setViewportView(AdminDashboard_Table);
//		AdminDashboard_Table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{"Francisco, Earl Ace", "Library", "Vacation Leave", null },
//				{"Gallano, Matt Joshua", "Canteen", "Vacation Leave", null },
//				{"Arrojo, Jomari", "Security", "Sick Leave", null },
//				{"Padilla, Daniel", "HR", "Paternal Leave", null},
//				{"Brilantes, Andrea", "HR", "Maternal Leave", null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//			},
//			new String[] {
//				"Name", "Department", "Type of Leave", ""
//			}
//		) {
//			boolean[] columnEditables = new boolean[] {
//				false, false, false, false
//			};
//			public boolean isCellEditable(int row, int column) {
//				return columnEditables[column];
//			}
//		});
//		AdminDashboard_Table.getColumnModel().getColumn(0).setResizable(false);
//		AdminDashboard_Table.getColumnModel().getColumn(0).setMaxWidth(200);
//		AdminDashboard_Table.getColumnModel().getColumn(1).setResizable(false);
//		AdminDashboard_Table.getColumnModel().getColumn(1).setMaxWidth(150);
//		AdminDashboard_Table.getColumnModel().getColumn(2).setResizable(false);
//		AdminDashboard_Table.getColumnModel().getColumn(2).setMaxWidth(160);
//		AdminDashboard_Table.getColumnModel().getColumn(3).setResizable(false);
//		AdminDashboard_Table.getColumnModel().getColumn(3).setMaxWidth(150);
//		AdminDashboard_Table.setFont(new Font("Tahoma", Font.BOLD, 16));
//		AdminDashboard_Table.setRowHeight(50);
		
		JButton btnNewButton = new JButton("+  New Leave Type");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JTextField leaveTypeField = new JTextField();
                Object[] message = {
                        "Enter new leave type:", leaveTypeField
                };
                int option = JOptionPane.showConfirmDialog(null, message,
                        "New Leave Type", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                		//add to leaves type
                }
            }
        });
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(503, 18, 175, 29);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOG OUT");
		btnNewButton_1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm Log Out", JOptionPane.YES_NO_OPTION);

		        if (confirmation == JOptionPane.YES_OPTION) {
		            AdminDashboardFrame.this.dispose();
		            LogInFrame frame = new LogInFrame();
					frame.setVisible(true);	
		        } else {
		            // Do nothing or handle cancellation
		        }
		    }
		});
	
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 108, 108));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(299, 311, 126, 29);
		panel_1.add(btnNewButton_1);
		
		int pendingCount= 5;
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255, 150));
		panel.setBounds(27, 37, 717, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		JLabel lblNewLabel = new JLabel(String.format("Kathryn, you have %S leave application requests to review.", pendingCount));
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