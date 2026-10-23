/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `calculateEventFee` for College Fest Registration and Event Allocation
 * Relevant starter snippet: System.out.println("Total Event fee: " + calculateEventFee(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateEventFee(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit event fee and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or ex
 * Expected sample output:
 * Total Event fee: 75
 */
/* Correction: implemented calculateEventFee as required by the issue; the starter omitted this method. */
public class Issue57_VH18_CollegeFestRegistrationAndEventAllocation {
    public static void main(String[] args) {
        System.out.println("Total Event fee: " + calculateEventFee(25, 3));
    }

    // Required method signature: static int calculateEventFee(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateEventFee.
    static int calculateEventFee(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
