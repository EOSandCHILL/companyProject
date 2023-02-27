package superPackPractice;
// EXECUTIVES ARE UPPER LVL AND ARE CEO'S, CTO'S, CFO'S ETC.
public class CompanyExecutive extends UpperLevelEmployee {
    private String presidentsManaged;

    // I HAVE EXTENDED THE PARENT CLASS TO THIS CLASS. I DON'T HAVE TO USE ALL FEATURES
    // I CAN DELETE THE FEATURES I DON'T WANT TO USE FROM THE PARENT

    public CompanyExecutive(String firstName, String lastName, String employeeLevel,
                            String employeeID, String jobTitle, String hqLocation,
                            String departmentName, String presidentsManaged) {
        super(firstName, lastName, employeeLevel, employeeID,
                jobTitle, hqLocation, departmentName);
        this.presidentsManaged = presidentsManaged;
    }
}
