package superPackPractice;
// EXECUTIVES ARE UPPER LVL AND ARE CEO'S, CTO'S, CFO'S ETC.
public class CompanyExecutive extends UpperLevelEmployee {
    private String presidentsManaged;

    public CompanyExecutive(String firstName, String lastName, String employeeLevel,
                            String employeeID, String jobTitle, String hqLocation,
                            String departmentName, String presidentsManaged) {
        super(firstName, lastName, employeeLevel, employeeID,
                jobTitle, hqLocation, departmentName);
        this.presidentsManaged = presidentsManaged;
    }
}
