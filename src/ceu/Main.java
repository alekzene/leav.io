package ceu;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		UserDashboardFrame userDashboard = new UserDashboardFrame();
		 

	        SwingUtilities.invokeLater(() -> {
	            LogInFrame logInFrame = new LogInFrame();
	            logInFrame.setVisible(true);
	        });
	}

}
