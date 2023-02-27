package superPackPractice;
// UPPER LEVEL EMPLOYEES WORK AT HQ NOT STORES
public class UpperLevelEmployee extends Employee {
    private String hqLocation;
    private String departmentName;

    // I HAVE EXTENDED THE PARENT CLASS TO THIS CLASS. I DON'T HAVE TO USE ALL FEATURES
    // I CAN DELETE THE FEATURES I DON'T WANT TO USE FROM THE PARENT

    public UpperLevelEmployee(String firstName, String lastName,
                              String employeeLevel, String employeeID,
                              String jobTitle, String hqLocation,
                              String departmentName) {
        super(firstName, lastName, employeeLevel, employeeID, jobTitle);
        this.hqLocation = hqLocation;
        this.departmentName = departmentName;
    }
}
