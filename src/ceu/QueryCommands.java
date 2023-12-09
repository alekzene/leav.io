package ceu;

// FIXME: Adjust according to database needs
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QueryCommands {
	// ATTRIBUTES FOR EMPLOYEE TABLE
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
    
    // ATTRIBUTES FOR LEAVE REQUEST
    int leaveRequestID;
    int employeeIDFK;
    String leaveRequestCategory;
    String applicationDate; 
    String startDate;
    String endDate;
    int durationInDays;
    String reason;
    String clientComments;
    String status; 
    String adminRemarks;
    String mocName;
    String mocAddress;
    String mocNumber;
   
    public String deleteRequest(int id) 
    {
        this.id = id;
        return "DELETE FROM leave_requests WHERE id = ?";
    }

    public String select() {
        return "SELECT * FROM account";
    }

    // INSERT NEW EMPLOYEE ENTRY STATEMENT
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
    
    // INSERT NEW EMPLOYEE ENTRY QUERY
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
    
    // INSERT NEW LEAVE REQUEST ENTRY STATEMENT
    public PreparedStatement prepareInsertLeaveRequestStatement(Connection connection, int employeeIDFK, String leaveRequestCategory, String applicationDate, String startDate, String endDate, int durationInDays, String reason, String clientComments, String status, String adminRemarks, String mocName, String mocAddress, String mocNumber) {
        try {
            String query = insertLeaveRequest(employeeIDFK, leaveRequestCategory, applicationDate, startDate, endDate, durationInDays, reason, clientComments, status, adminRemarks, mocName, mocAddress, mocNumber);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, employeeIDFK);
            preparedStatement.setString(2, leaveRequestCategory);
            preparedStatement.setString(3, applicationDate);
            preparedStatement.setString(4, startDate);
            preparedStatement.setString(5, endDate);
            preparedStatement.setInt(6, durationInDays);
            preparedStatement.setString(7, reason);
            preparedStatement.setString(8, clientComments);
            preparedStatement.setString(9, status);
            preparedStatement.setString(10, adminRemarks);
            preparedStatement.setString(11, mocName);
            preparedStatement.setString(12, mocName);
            preparedStatement.setString(13, mocNumber);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // INSERT NEW LEAVE REQUEST ENTRY QUERY
    public String insertLeaveRequest(int employeeIDFK, String leaveRequestCategory, String applicationDate, String startDate, String endDate, int durationInDays, String reason, String clientComments, String status, String adminRemarks, String mocName, String mocAddress, String mocNumber) {
    	this.employeeIDFK = employeeIDFK;
    	this.leaveRequestCategory = leaveRequestCategory;
    	this.applicationDate = applicationDate;
    	this.startDate = startDate;
    	this.endDate = endDate;
    	this.durationInDays = durationInDays;
    	this.reason = reason;
    	this.clientComments = clientComments;
    	this.status = status;
    	this.adminRemarks = adminRemarks;
    	this.mocName = mocName;
    	this.mocAddress = mocAddress;
    	this.mocNumber = mocNumber;
        return "INSERT INTO leave_requests (employee_id, category, application_date, start_date, end_date, duration_in_days, reason, client_comments, status, admin_remarks, contact_name, contact_address, contact_number) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
    
    // SELECT EMPLOYEE ID (FOREGIN KEY) STATEMENT
    public PreparedStatement prepareSelectEmployeeIDFKStatement(Connection connection, String enteredUsername) {
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

    // SELECT EMPLOYEE ID (FOREIGN KEY) QUERY
    public String selectEmployeeIDFK(String enteredUsername) {
        return "SELECT id FROM employees WHERE username = ?";
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
    public PreparedStatement prepareSelectFullNameStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectFullName(enteredUsername);
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
    
    // SELECT CAMPUS STATEMENT
    public PreparedStatement prepareSelectCampusStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectCampus(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private String selectCampus(String enteredUsername) {
		return "SELECT campus FROM employees WHERE username = ?";
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
    
    // START DATE
    public PreparedStatement prepareSelectStartDateStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectStartDate(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private String selectStartDate(String enteredUsername) {
		return "SELECT start_date FROM leave_requests WHERE username = ?";
	}
    
 // END DATE
    public PreparedStatement prepareSelectEndDateStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectEndDate(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private String selectEndDate(String enteredUsername) {
		return "SELECT end_date FROM leave_requests WHERE username = ?";
	}
    
 // STATUS
    public PreparedStatement prepareSelectStatusStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectStatus(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private String selectStatus(String enteredUsername) {
		return "SELECT status FROM leave_requests WHERE username = ?";
	}
    
 // APPLICATION DATE
    public PreparedStatement prepareSelectApplicationDateStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectApplicationDate(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private String selectApplicationDate(String enteredUsername) {
		return "SELECT application_date FROM leave_requests WHERE username = ?";
	}

	// SELECT NAME QUERY
    public String selectFullName(String enteredUsername) {
        return "SELECT full_name FROM employees WHERE username = ?";
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
    
    // SELECT USER CATEGORY STATEMENT
    public PreparedStatement prepareSelectFirstNameStatement(Connection connection, String enteredUsername) {
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
    public String selectFirstName(String enteredUsername) {
        return "SELECT first_name FROM employees WHERE username = ?";
    }
    
    // SELECT ALL LEAVE REQUESTS STATEMENT
    public PreparedStatement prepareSelectAllLeaveRequestsStatement(Connection connection) {
        try {
            String query = selectAllLeaveRequests();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            return preparedStatement;
        } catch (Exception e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    // SELECT USER CATEGORY QUERY
    public String selectAllLeaveRequests() {
        return "SELECT * FROM leave_requests";
    }
    
 // Updated LeaveRemaining
    public PreparedStatement prepareUpdateLeavesRemaining(Connection connection, String enteredUsername, int leavesRemaining) {
        try {
            String query = updateLeavesRemaining();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, leavesRemaining);
            preparedStatement.setString(2, enteredUsername);
            return preparedStatement;
        } catch (SQLException e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    // UPDATE LEAVEREMAINING
    private String updateLeavesRemaining() {
        return "UPDATE employees SET leaves_remaining = ? WHERE username = ?";
    }
    
    // Select LeaveRequestID
    public PreparedStatement prepareSelectLeaveRequestIDStatement(Connection connection, String enteredUsername) {
        try {
            String query = selectLeaveRequestID(enteredUsername);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enteredUsername);
            return preparedStatement;
        } catch (SQLException e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    // SELECT LEAVEREQUESTIDS
    private String selectLeaveRequestID(String enteredUsername) {
        return "SELECT * id FROM leave_requests";
    }
}


