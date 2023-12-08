package ceu;

import java.awt.EventQueue;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboardFrame frame = new AdminDashboardFrame();
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 0, 675, 225);
		users.add(scrollPane);

//		table = new JTable();
//		table.setRowSelectionAllowed(false);
//		scrollPane.setViewportView(table);
//		table.setModel(new DefaultTableModel(
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
//		table.getColumnModel().getColumn(0).setResizable(false);
//		table.getColumnModel().getColumn(0).setMaxWidth(200);
//		table.getColumnModel().getColumn(1).setResizable(false);
//		table.getColumnModel().getColumn(1).setMaxWidth(150);
//		table.getColumnModel().getColumn(2).setResizable(false);
//		table.getColumnModel().getColumn(2).setMaxWidth(160);
//		table.getColumnModel().getColumn(3).setResizable(false);
//		table.getColumnModel().getColumn(3).setMaxWidth(150);
//		table.setFont(new Font("Tahoma", Font.BOLD, 16));
//		table.setRowHeight(50);
		
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
}