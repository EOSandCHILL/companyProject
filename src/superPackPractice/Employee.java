package superPackPractice;
// EVERYONE WHO WORKS FOR THE COMPANY IS AN EMPLOYEE.
// EMPLOYEE == PARENT CLASS
public class Employee {
    private String firstName;
    private String lastName;
    private String employeeLevel;
    private String employeeID;
    private String jobTitle;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String employeeLevel,
                    String employeeID, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeLevel = employeeLevel;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeLevel='" + employeeLevel + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
    public void mustHaves(Employee employee, String companyName){
        System.out.println("All employees must have a name, " +
              jobTitle + ", " + employeeLevel + ", and " + employeeID + " at " + companyName);
    }

}
