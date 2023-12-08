package ceu;

import java.sql.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {      
	        SwingUtilities.invokeLater(() -> {
	            LogInFrame logInFrame = new LogInFrame();
	            logInFrame.setVisible(true);
	            logInFrame.setLocationRelativeTo(null);
	        });
	}
}
