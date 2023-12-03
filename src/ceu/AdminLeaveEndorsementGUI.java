package ceu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class AdminLeaveEndorsementGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textRemarks;
	private JTextField txtDate;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLeaveEndorsementGUI frame = new AdminLeaveEndorsementGUI();
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
	public AdminLeaveEndorsementGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 585);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel BGpanel = new JPanel();
		BGpanel.setBackground(new Color(255, 128, 255));
		BGpanel.setBounds(0, 0, 621, 546);
		contentPane.add(BGpanel);
		BGpanel.setLayout(null);
		
		JPanel ApplicationForm = new JPanel();
		ApplicationForm.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		ApplicationForm.setBackground(new Color(0, 0 , 0, 50));
		ApplicationForm.setLayout(null);
		ApplicationForm.setBounds(10, 37, 329, 487);
		BGpanel.add(ApplicationForm);
		
		JLabel lblForm = new JLabel("Accomplished Leave Application Form");
		lblForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblForm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblForm.setBounds(0, 0, 329, 14);
		ApplicationForm.add(lblForm);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 23, 309, 453);
		ApplicationForm.add(panel);
		panel.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(292, 0, 17, 453);
		panel.add(scrollBar);
		
		JLabel lblNewLabel_1 = new JLabel("Leave Application");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(89, 21, 117, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Center Scholar University");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(70, 11, 154, 14);
		panel.add(lblNewLabel_2);
		
		txtDate = new JTextField();
		txtDate.setBounds(105, 56, 86, 20);
		panel.add(txtDate);
		txtDate.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(105, 77, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(105, 99, 86, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(105, 121, 86, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 164, 86, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(105, 142, 86, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel_3 = new JLabel("Leave Type:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(10, 80, 60, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(10, 59, 46, 14);
		panel.add(lblNewLabel_4);
		scrollBar.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
			}
		});
		
		JPanel remarksType = new JPanel();
		remarksType.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		remarksType.setBackground(new Color(0, 0, 0, 50));
		remarksType.setLayout(null);
		remarksType.setBounds(349, 37, 262, 418);
		BGpanel.add(remarksType);
		
		JLabel lblRemarks = new JLabel("Remarks:");
		lblRemarks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRemarks.setBounds(10, 0, 58, 14);
		remarksType.add(lblRemarks);
		
		textRemarks = new JTextField();
		textRemarks.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textRemarks.setBounds(10, 21, 242, 386);
		remarksType.add(textRemarks);
		textRemarks.setColumns(10);
		
		JPanel Name = new JPanel();
		Name.setBackground(new Color(0, 0, 0, 1));
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(Name, popupMenu);
		popupMenu.setBounds(-6, 0, 145, 32);
		Name.setLayout(null);
		Name.setBounds(10, 11, 329, 15);
		BGpanel.add(Name);
		
		JLabel lblNewLabel = new JLabel(">");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(140, 0, 20, 14);
		Name.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Francisco, Earl Ace");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(20, 0, 125, 14);
		Name.add(lblName);
		
		JLabel lblLeaveApplication = new JLabel("Vacation Leave Application");
		lblLeaveApplication.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLeaveApplication.setBounds(155, 0, 165, 14);
		Name.add(lblLeaveApplication);
		
		JButton btnApprove = new JButton("Approve");
		btnApprove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnApprove.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnApprove.setBackground(new Color(61, 119, 254));
		btnApprove.setBounds(377, 480, 89, 23);
		BGpanel.add(btnApprove);
		
		JButton btnReject = new JButton("Reject");
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReject.setBackground(new Color(178, 34, 34));
		btnReject.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReject.setBounds(493, 480, 89, 23);
		BGpanel.add(btnReject);
		
		JLabel wowbg = new JLabel("");
		wowbg.setIcon(new ImageIcon("E:\\desktop\\OOP BG.png"));
		wowbg.setBounds(0, 0, 621, 546);
		BGpanel.add(wowbg);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
