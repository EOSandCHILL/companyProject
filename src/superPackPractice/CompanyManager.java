package superPackPractice;
// MANAGERS ARE LOWER LEVEL EMPLOYEES AND MANAGE FLOOR STAFF
public class CompanyManager extends LowerLevelEmployee {
    private String managerType;
    private String floorStaffManaged;

    // I HAVE EXTENDED THE PARENT CLASS TO THIS CLASS. I DON'T HAVE TO USE ALL FEATURES
    // I CAN DELETE THE FEATURES I DON'T WANT TO USE FROM THE PARENT

    public CompanyManager(String firstName, String lastName, String employeeLevel,
                          String employeeID, String jobTitle, String storeAddress,
                          int storeNumber, String managerType,
                          String floorStaffManaged) {
        super(firstName, lastName, employeeLevel,
                employeeID, jobTitle, storeAddress,
                storeNumber);
        this.managerType = managerType;
        this.floorStaffManaged = floorStaffManaged;
    }
}
