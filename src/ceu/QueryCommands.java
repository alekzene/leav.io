package ceu;

// FIXME: Adjust according to database needs
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryCommands {
	int id;
    String category;
    String employeeID;
    String username;
    String pass;
    String name;
    String address;
    String contactNumber;
    String campus;
    String department;
    int totalLeaves;
    int leavesRemaining;
    int leavesUsed;
    private Connection connection;
   
    public String deleteRequest(int id) 
    {
        this.id = id;
        return "DELETE FROM leave_requests WHERE id = ?";
    }

    public String select() {
        return "SELECT * FROM account";
    }
 
    public QueryCommands(Connection connection) {
        this.connection = connection;
    }

    // INSERT NEW ENTRY STATEMENT
    public PreparedStatement prepareInsertStatement(Connection connection, String employeeID, String category, String username, String pass, String name, String address, String contactNumber, String campus, String department, int totalLeaves, int leavesRemaining, int leavesUsed) {
        try {
            String query = insert(employeeID, category, username, pass, name, address, contactNumber, campus, department, totalLeaves, leavesRemaining, leavesUsed);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, category);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, pass);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, name);
            preparedStatement.setString(6, address);
            preparedStatement.setString(7, contactNumber);
            preparedStatement.setString(8, campus);
            preparedStatement.setString(9, department);
            preparedStatement.setInt(10, totalLeaves);
            preparedStatement.setInt(11, leavesRemaining);
            preparedStatement.setInt(12, leavesUsed);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // INSERT NEW ENTRY QUERY
    public String insert(String category, String employee_id, String username, String pass, String name, String address, String contact_number, String campus, String department, int total_leaves, int leaves_remaining, int leaves_used) {
        this.category = category;
        this.employeeID = employee_id;
        this.username = username;
        this.pass = pass;
    	this.name = name;
        this.address = address;
        this.contactNumber = contact_number;
        this.campus = campus;
        this.department = department;
        this.totalLeaves = total_leaves;
        this.leavesRemaining = leaves_remaining;
        this.leavesUsed = leaves_used;

        return "INSERT INTO employees (category, employee_id, username, pass, name, address, contact_number, campus, department, total_leaves, leaves_remaining, leaves_used) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    // DELETE EMPLOYEE ENTRY STATEMENT
    public PreparedStatement prepareDeleteStatement(Connection connection, int id) {
        try {
            String query = deleteUser(id);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // DELET EMPLOYEE ENTRY QUERY
    public String deleteUser(int id) {
        this.id = id;

        return "DELETE FROM employees WHERE id = ?";
    }

    // SELECT USERNAME STATEMENT
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

    // SELECT USERNAME QUERY
    public String selectUsername(String enteredUsername) {
        return "SELECT * FROM employees WHERE username = ?";
    }
    
    // SELECT PASSWORD STATEMENT
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

    // SELECT PASSWORD QUERY
    public String selectPassword(String enteredPass) {
        return "SELECT * FROM employees WHERE pass = ?";
    }
    
    // SELECT USER CATEGORY STATEMENT
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

    // SELECT USER CATEGORY QUERY
    public String selectUserCategory(String enteredUsername) {
        return "SELECT category FROM employees WHERE username = ?";
    }
    
    // SELECT EMPLOYEE ID STATEMENT
    public PreparedStatement prepareSelectEmployeeIDStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectEmployeeID(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    // SELECT EMPLOYEE ID QUERY
    public String selectEmployeeID(String enteredUsername) {
        return "SELECT employee_id FROM employees WHERE username = ?";
    }
    
    // SELECT NAME STATEMENT
    public PreparedStatement prepareSelectNameStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectName(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

 // SELECT DEPARTMENT STATEMENT
    public PreparedStatement prepareSelectDepartmentStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectDepartment(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private String selectDepartment(String enteredUsername) {
		return "SELECT department FROM employees WHERE username = ?";
	}
    
 // LEAVES REMAINING
    public PreparedStatement prepareLeavesRemaining(Connection connection, String enteredUsername) {
        try {
            String query = displayLeavesRemaining(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private String displayLeavesRemaining(String enteredUsername) {
		return "SELECT leaves_remaining FROM employees WHERE username = ?";
	}
    
  // LEAVES USED
    public PreparedStatement prepareLeavesUsed(Connection connection, String enteredUsername) {
        try {
            String query = displayLeavesUsed(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private String displayLeavesUsed(String enteredUsername) {
		return "SELECT leaves_used FROM employees WHERE username = ?";
	}

	// SELECT NAME QUERY
    public String selectName(String enteredUsername) {
        return "SELECT name FROM employees WHERE username = ?";
    }
    
    // UPDATE PASSWORD STATEMENT
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

    // UPDATE PASSWORD QUERY
    public String updatePassword(String enteredConfirmPassword, String enteredEmployeeID) {
        return "UPDATE employees SET pass = ? WHERE employee_id = ?";
    }
     
    //ADD NEW LEAVE TYPE STATEMENT
    public PreparedStatement prepareAddLeaveTypeStatement(Connection connection, String newLeaveType) {
        try {
            String existingEnumValues = getExistingEnumValues();
            String query = "ALTER TABLE leave_requests MODIFY COLUMN category ENUM(" + existingEnumValues + ", ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, newLeaveType);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

 // ADD NEW LEAVE TYPE QUERY
    public String addLeaveTypeQuery(String newLeaveType) {
    	String existingEnumValues = getExistingEnumValues();
        String query = "ALTER TABLE leave_requests ADD COLUMN category ENUM(" + existingEnumValues + ", ?)";
        query = query.replace("ENUM", "`ENUM`");
        
        return query;
    }
    
    private String getExistingEnumValues() {
        String query = "SHOW COLUMNS FROM leave_requests LIKE 'category'";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            if (resultSet.next()) {
                String enumValues = resultSet.getString("Type");
                String[] valuesArray = enumValues.split(",");
                for (int i = 1; i < valuesArray.length; i++) {
                    valuesArray[i] = valuesArray[i].trim(); 
                }
                return String.join(", ", valuesArray);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }
}