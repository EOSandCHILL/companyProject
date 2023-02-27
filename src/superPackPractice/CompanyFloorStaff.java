package superPackPractice;
// EMPLOYEES WHO HAVE MANAGERS AND WORK THE FLOORS DAILY
public class CompanyFloorStaff extends LowerLevelEmployee {
    private String shift;

    // I HAVE EXTENDED THE PARENT CLASS TO THIS CLASS. I DON'T HAVE TO USE ALL FEATURES
    // I CAN DELETE THE FEATURES I DON'T WANT TO USE FROM THE PARENT

    public CompanyFloorStaff(String firstName, String lastName,
                             String employeeLevel, String employeeID,
                             String jobTitle, String storeAddress,
                             int storeNumber, String shift) {
        super(firstName, lastName, employeeLevel, employeeID,
                jobTitle, storeAddress, storeNumber);
        this.shift = shift;
    }
}
