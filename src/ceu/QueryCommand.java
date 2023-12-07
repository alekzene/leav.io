package ceu;

// FIXME: Adjust
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QueryCommand {
	int id;
    String category;
    String username;
    String pass;
    String name;
    String address;
    String contact_number;
    enum campus { Makati, Manila, Malolos };
    enum department { Canteen, Library, Faculty, Security, Accounting, HR };
    int total_leaves;
    int leaves_remaining;
    int leaves_used;
   
    public String insert(String name, String username, String password, String address) {
        this.name = name;
        this.username = username;
        this.pass = password;
        this.address = address;

        return "INSERT INTO employees (category, username, pass, name, address, contact_number, campus, department, total_leaves, leaves_remaining, leaves_used) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    public String deleteUser(int id) {
        this.id = id;

        return "DELETE FROM employees WHERE id = ?";
    }
    
    public String deleteRequest(int id) 
    {
        this.id = id;
        return "DELETE FROM leave_requests WHERE id = ?";
    }

    public String select() {
        return "SELECT * FROM account";
    }

    public PreparedStatement prepareInsertStatement(Connection connection, String name, String username, String password, String address, String role) {
        try {
            String query = insert(name, username, password, address);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, role);
            return preparedStatement;
        } catch (Exception e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    public PreparedStatement prepareDeleteStatement(Connection connection, int id) {
        try {
            String query = deleteUser(id);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            return preparedStatement;
        } catch (Exception e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    public PreparedStatement prepareSelectUsernameStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectUsername(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    public String selectUsername(String username) {
        return "SELECT * FROM employees WHERE username = ?";
    }
    

    public PreparedStatement prepareSelectPasswordStatement(Connection connection, String enteredPass) {
        try {
            String query = selectPassword(enteredPass);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredPass);
            return preparedStatement;
        } catch (Exception e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    public String selectPassword(String enteredPass) {
        return "SELECT * FROM employees WHERE pass = ?";
    }
    
    public PreparedStatement prepareSelectUserCategoryStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectUsername(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    public String selectUserCategory(String enteredUsername) {
        return "SELECT category FROM employees WHERE username = ?";
    }
    
    public PreparedStatement prepareSelectEmployeeIDStatement(Connection connection, String enteredEmployeeID) {
        try {
            String query = selectEmployeeID(enteredEmployeeID);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredEmployeeID);
            return preparedStatement;
        } catch (Exception e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    public String selectEmployeeID(String enteredEmployeeID) {
        return "SELECT employee_id FROM employees WHERE employee_id = ?";
    }
    
    public PreparedStatement prepareUpdatePasswordStatement(Connection connection, String enteredConfirmPassword, String enteredEmployeeID ) {
        try {
            String query = updatePassword(enteredConfirmPassword, enteredEmployeeID);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredConfirmPassword);
            preparedStatement.setString(2, enteredEmployeeID);
            return preparedStatement;
        } catch (Exception e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    public String updatePassword(String enteredConfirmPassword, String enteredEmployeeID) {
        return "UPDATE employees SET pass = ? WHERE employee_id = ?";
    }
}