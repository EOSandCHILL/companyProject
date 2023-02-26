package superPackPractice;
// VP'S ARE UPPER LEVEL BUT NOT EXECUTIVE OFFICERS OF THE COMPANY
public class CompanyVicePresident extends UpperLevelEmployee {
    private String managersManaged;

    public CompanyVicePresident(String firstName, String lastName, String employeeLevel,
                                String employeeID, String jobTitle, String hqLocation,
                                String departmentName, String managersManaged) {
        super(firstName, lastName, employeeLevel, employeeID,
                jobTitle, hqLocation, departmentName);
        this.managersManaged = managersManaged;
    }
}
