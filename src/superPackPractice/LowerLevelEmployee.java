package superPackPractice;
// LOWER LEVEL EMPLOYEES WORK AT STORES AND ENGAGE WITH CUSTOMERS DAILY
public class LowerLevelEmployee extends Employee {
    private String storeAddress;
    private int storeNumber;

    // I HAVE EXTENDED THE PARENT CLASS TO THIS CLASS. I DON'T HAVE TO USE ALL FEATURES
    // I CAN DELETE THE FEATURES I DON'T WANT TO USE FROM THE PARENT

    public LowerLevelEmployee(String firstName, String lastName, String employeeLevel,
                              String employeeID, String jobTitle,
                              String storeAddress, int storeNumber) {
        super(firstName, lastName, employeeLevel, employeeID, jobTitle);
        this.storeAddress = storeAddress;
        this.storeNumber = storeNumber;
    }
}
