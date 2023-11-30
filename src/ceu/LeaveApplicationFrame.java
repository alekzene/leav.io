package ceu;

import javax.swing.*;

public static void main( String[] args ) {
		JFrame frame = new JFrame ("Leave Application Form")
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		JButton button = new JButton("Press");
		frame.getContentPane().add(button); // Adds Button to content pane of frame
		frame.setVisible(true);
		}
class LeaveApplicationFrame{
	public static void main(String args[]){
		JFrame frame = new JFrame("Leave Application Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		JButton button1 = new JButton("Press");
		frame.getContentPane().add(button1);
		frame.setVisible(true);
	}
}
