package superPackPractice;
// UPPER LEVEL EMPLOYEES WORK AT HQ NOT STORES
public class UpperLevelEmployee extends Employee {
    private String hqLocation;
    private String departmentName;

    public UpperLevelEmployee(String firstName, String lastName,
                              String employeeLevel, String employeeID,
                              String jobTitle, String hqLocation,
                              String departmentName) {
        super(firstName, lastName, employeeLevel, employeeID, jobTitle);
        this.hqLocation = hqLocation;
        this.departmentName = departmentName;
    }
}
