package superPackPractice;
// EVERYONE WHO WORKS FOR THE COMPANY IS AN EMPLOYEE.
// EMPLOYEE == PARENT CLASS
public class Employee {
    private String firstName;
    private String lastName;
    private String employeeLevel;
    private String employeeID;
    private String jobTitle;

    public Employee(String firstName, String lastName, String employeeLevel,
                    String employeeID, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeLevel = employeeLevel;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }
}
