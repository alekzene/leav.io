package ceu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

class DatabaseConnection {
	private static Connection connection;
	
    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Load the JDBC driver and establish a connection
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/leave-management", "root", "");
            } catch (Exception e) {
                e.printStackTrace();
                // Handle the exception appropriately
            }
        }
        return connection;
    }
    
    void Connection(String query) {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // FIXME Change driver path
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/leave-management", "root", "");

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.executeUpdate();
            }
            connection.commit();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error connecting to database: " + e.getMessage(), e);
        }
    }
}