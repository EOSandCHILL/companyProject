package superPackPractice;
// EMPLOYEES WHO HAVE MANAGERS AND WORK THE FLOORS DAILY
public class CompanyFloorStaff extends LowerLevelEmployee {
    private String shift;

    public CompanyFloorStaff(String firstName, String lastName,
                             String employeeLevel, String employeeID,
                             String jobTitle, String storeAddress,
                             int storeNumber, String shift) {
        super(firstName, lastName, employeeLevel, employeeID,
                jobTitle, storeAddress, storeNumber);
        this.shift = shift;
    }
}
