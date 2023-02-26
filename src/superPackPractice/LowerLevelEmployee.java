package superPackPractice;
// LOWER LEVEL EMPLOYEES WORK AT STORES AND ENGAGE WITH CUSTOMERS DAILY
public class LowerLevelEmployee extends Employee {
    private String storeAddress;
    private int storeNumber;

    public LowerLevelEmployee(String firstName, String lastName, String employeeLevel,
                              String employeeID, String jobTitle,
                              String storeAddress, int storeNumber) {
        super(firstName, lastName, employeeLevel, employeeID, jobTitle);
        this.storeAddress = storeAddress;
        this.storeNumber = storeNumber;
    }
}
