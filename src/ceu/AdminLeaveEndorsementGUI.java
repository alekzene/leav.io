package ceu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class AdminLeaveEndorsementGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setBackground(new Color(25, 25, 112));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 516);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0, 1));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel bgPanel = new JPanel();
		bgPanel.setBackground(new Color(0, 0, 0, 1));
		bgPanel.setBounds(0, 0, 621, 546);
		contentPane.add(bgPanel);
		bgPanel.setLayout(null);
		
		JPanel ApplicationForm = new JPanel();
		ApplicationForm.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		ApplicationForm.setBackground(new Color(0, 0 , 0, 50));
		ApplicationForm.setLayout(null);
		ApplicationForm.setBounds(10, 37, 329, 430);
		bgPanel.add(ApplicationForm);
		
		JLabel lblForm = new JLabel("Accomplished Leave Application Form");
		lblForm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblForm.setBounds(10, 11, 309, 14);
		ApplicationForm.add(lblForm);
		
		JPanel leaveFormPanel = new JPanel();
		leaveFormPanel.setLayout(null);
		leaveFormPanel.setBounds(10, 36, 309, 383);
		ApplicationForm.add(leaveFormPanel);
		
		JLabel lblTitleForm = new JLabel("Leave Application");
		lblTitleForm.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTitleForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleForm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitleForm.setBounds(89, 30, 117, 14);
		leaveFormPanel.add(lblTitleForm);
		
		JLabel lblCompany = new JLabel("Center Scholar University");
		lblCompany.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompany.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCompany.setBounds(74, 11, 154, 14);
		leaveFormPanel.add(lblCompany);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDate.setBounds(10, 68, 86, 14);
		leaveFormPanel.add(lblDate);
		
		JLabel lblLeaveType = new JLabel("Leave Type:");
		lblLeaveType.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLeaveType.setBounds(10, 89, 99, 14);
		leaveFormPanel.add(lblLeaveType);
		
		JLabel lblEmployeeNo = new JLabel("Employee No.:");
		lblEmployeeNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmployeeNo.setBounds(10, 111, 99, 14);
		leaveFormPanel.add(lblEmployeeNo);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(10, 130, 60, 14);
		leaveFormPanel.add(lblName);
		
		JLabel lblOffice = new JLabel("Campus & Office:");
		lblOffice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOffice.setBounds(10, 151, 99, 14);
		leaveFormPanel.add(lblOffice);
		
		JLabel lblPurpose = new JLabel("Specific Purpose:");
		lblPurpose.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPurpose.setBounds(10, 171, 99, 14);
		leaveFormPanel.add(lblPurpose);
		
		JLabel lblPeriodApplied = new JLabel("Period Applied");
		lblPeriodApplied.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPeriodApplied.setBounds(10, 206, 99, 14);
		leaveFormPanel.add(lblPeriodApplied);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFrom.setBounds(10, 227, 46, 14);
		leaveFormPanel.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTo.setBounds(119, 227, 17, 14);
		leaveFormPanel.add(lblTo);
		
		JLabel lblTotalDays = new JLabel("Total no. of Days:");
		lblTotalDays.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalDays.setBounds(10, 246, 109, 14);
		leaveFormPanel.add(lblTotalDays);
		
		JLabel lblContact = new JLabel("Means of Contact:");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContact.setBounds(10, 281, 117, 14);
		leaveFormPanel.add(lblContact);
		
		JLabel lblContactName = new JLabel("Name:");
		lblContactName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContactName.setBounds(10, 306, 46, 14);
		leaveFormPanel.add(lblContactName);
		
		JLabel lblContactAddress = new JLabel("Address:");
		lblContactAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContactAddress.setBounds(10, 326, 86, 14);
		leaveFormPanel.add(lblContactAddress);
		
		JLabel lblContactNo = new JLabel("Contact no.:");
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContactNo.setBounds(10, 346, 86, 14);
		leaveFormPanel.add(lblContactNo);
		
		JLabel lblDate2 = new JLabel("New label");
		lblDate2.setBounds(119, 68, 180, 14);
		leaveFormPanel.add(lblDate2);
		
		JLabel lblName2 = new JLabel("New label");
		lblName2.setBounds(119, 130, 180, 14);
		leaveFormPanel.add(lblName2);
		
		JLabel lblOffice2 = new JLabel("New label");
		lblOffice2.setBounds(119, 151, 180, 14);
		leaveFormPanel.add(lblOffice2);
		
		JLabel lblPurpose2 = new JLabel("New label");
		lblPurpose2.setBounds(119, 171, 180, 14);
		leaveFormPanel.add(lblPurpose2);
		
		JLabel lblEmpNo2 = new JLabel("New label");
		lblEmpNo2.setBounds(119, 111, 180, 14);
		leaveFormPanel.add(lblEmpNo2);
		
		JLabel lblLeaveTyp2 = new JLabel("New label");
		lblLeaveTyp2.setBounds(119, 89, 180, 14);
		leaveFormPanel.add(lblLeaveTyp2);
		
		JLabel lblFrom2 = new JLabel("New label");
		lblFrom2.setBounds(52, 227, 60, 14);
		leaveFormPanel.add(lblFrom2);
		
		JLabel lblTo2 = new JLabel("New label");
		lblTo2.setBounds(144, 227, 155, 14);
		leaveFormPanel.add(lblTo2);
		
		JLabel lblDays = new JLabel("New label");
		lblDays.setBounds(119, 246, 76, 14);
		leaveFormPanel.add(lblDays);
		
		JLabel contactName = new JLabel("New label");
		contactName.setBounds(119, 306, 180, 14);
		leaveFormPanel.add(contactName);
		
		JLabel contactAddress = new JLabel("New label");
		contactAddress.setBounds(119, 326, 180, 14);
		leaveFormPanel.add(contactAddress);
		
		JLabel contactNo = new JLabel("New label");
		contactNo.setBounds(119, 346, 180, 14);
		leaveFormPanel.add(contactNo);
		
		JPanel remarksType = new JPanel();
		remarksType.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		remarksType.setBackground(new Color(0, 0, 0, 50));
		remarksType.setLayout(null);
		remarksType.setBounds(349, 37, 262, 239);
		bgPanel.add(remarksType);
		
		JLabel lblRemarks = new JLabel("Employee Remarks");
		lblRemarks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRemarks.setBounds(10, 0, 130, 39);
		remarksType.add(lblRemarks);
		
		JLabel lblNewLabel_14_2_1 = new JLabel("New label");
		lblNewLabel_14_2_1.setBounds(20, 296, 221, 164);
		remarksType.add(lblNewLabel_14_2_1);
		lblNewLabel_14_2_1.setVerticalAlignment(SwingConstants.TOP);
		
		JPanel panelRemarks = new JPanel();
		panelRemarks.setBounds(10, 36, 242, 192);
		remarksType.add(panelRemarks);
		panelRemarks.setLayout(null);
		
		JLabel lblRemarksForm = new JLabel("New label");
		lblRemarksForm.setBounds(10, 11, 222, 170);
		panelRemarks.add(lblRemarksForm);
		lblRemarksForm.setVerticalAlignment(SwingConstants.TOP);
		
		JPanel panelName = new JPanel();
		panelName.setBackground(new Color(0, 0, 0, 1));
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(panelName, popupMenu);
		popupMenu.setBounds(-6, 0, 145, 32);
		panelName.setLayout(null);
		panelName.setBounds(10, 11, 329, 15);
		bgPanel.add(panelName);
		
		JLabel lblNewLabel = new JLabel(">");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(140, 0, 20, 14);
		panelName.add(lblNewLabel);
		
		JLabel lblAdminName = new JLabel("Francisco, Earl Ace");
		lblAdminName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdminName.setBounds(20, 0, 140, 14);
		panelName.add(lblAdminName);
		
		JLabel lblLeaveApplication = new JLabel("Vacation Leave");
		lblLeaveApplication.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLeaveApplication.setBounds(155, 0, 105, 14);
		panelName.add(lblLeaveApplication);
		
		JButton btnApprove = new JButton("Approve");
		btnApprove.setForeground(Color.WHITE);
		btnApprove.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm Approval", JOptionPane.YES_NO_OPTION);

		        if (confirmation == JOptionPane.YES_OPTION) {
		            JOptionPane.showMessageDialog(null, "Application Approved."); 
		            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(btnApprove);
		            currentFrame.dispose();
		        } else {
		            
		        }
		    }
		});
		btnApprove.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnApprove.setBackground(new Color(0, 123, 183));
		btnApprove.setBounds(349, 444, 131, 23);
		bgPanel.add(btnApprove);
		
		JButton btnReject = new JButton("Reject");
		btnReject.setForeground(Color.WHITE);
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm Leave Rejection", JOptionPane.YES_NO_OPTION);

		        if (confirmation == JOptionPane.YES_OPTION) {
		            JOptionPane.showMessageDialog(null, "Application Rejected."); 
		            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(btnReject);
		            currentFrame.dispose();
		        } else {
		            
		        }
		    }
		});
		btnReject.setBackground(new Color(232, 60, 94));
		btnReject.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReject.setBounds(490, 444, 121, 23);
		bgPanel.add(btnReject);
		
		JPanel commentPanel = new JPanel();
		commentPanel.setLayout(null);
		commentPanel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		commentPanel.setBackground(new Color(0, 0, 0, 50));
		commentPanel.setBounds(349, 284, 262, 146);
		bgPanel.add(commentPanel);
		
		JLabel lblComment = new JLabel("Comment");
		lblComment.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComment.setBounds(10, 0, 91, 39);
		commentPanel.add(lblComment);
		
		JTextArea typeComment = new JTextArea();
		typeComment.setFont(new Font("Tahoma", Font.PLAIN, 11));
		typeComment.setLineWrap(true);
		typeComment.setWrapStyleWord(true);
		typeComment.setColumns(10);
		typeComment.setBackground(UIManager.getColor("Button.background"));
		typeComment.setBounds(20, 50, 221, 74);
		commentPanel.add(typeComment);
		
		JPanel panelComment = new JPanel();
		panelComment.setBounds(10, 39, 242, 96);
		commentPanel.add(panelComment);
		panelComment.setLayout(null);
		
		JLabel backgroundIMG = new JLabel("");
		backgroundIMG.setIcon(new ImageIcon(AdminLeaveEndorsementGUI.class.getResource("/images/bbg.png")));
		backgroundIMG.setBounds(0, 0, 621, 480);
		bgPanel.add(backgroundIMG);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
