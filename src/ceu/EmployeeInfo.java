package ceu;

public class EmployeeInfo {

	private String employeeUser, employeePass, employeeName, employeeType, employeeDepartment;
	private int employeeAge;
	private int employeeID;
	
	public EmployeeInfo() {
	
	}
	
	public EmployeeInfo(String employeeUser, String employeePass, String employeeName,
            String employeeType, String employeeDepartment, int employeeAge, int employeeID) {
this.employeeUser = employeeUser;
this.employeePass = employeePass;
this.employeeName = employeeName;
this.employeeType = employeeType;
this.employeeDepartment = employeeDepartment;
this.employeeAge = employeeAge;
this.employeeID = employeeID;
	
}
	
	public String getEmployeeUser() {
        return employeeUser;
    }

    public String getEmployeePass() {
        return employeePass;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeType() {
        return employeeType;
    }
    
    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public int getemployeeAge() {
        return employeeAge;
    }

    public int getEmployeeID() {
        return employeeID;
    }

   public static void main(String args[]) {
	   EmployeeInfo employee = new EmployeeInfo("jomjom123", "12345", "Jomari B. Arrojo", "Employee", "HR", 21, 123456789 );
   }
}