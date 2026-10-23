/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculateRemainingEventCapacity` for College Fest Registration and Event Allocation
 * Relevant starter snippet: System.out.println("Remaining Event capacity: " + calculateRemainingEventCapacity(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingEventCapacity(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many event capacity remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constr
 * Expected sample output:
 * Remaining Event capacity: 5
 */
/* Correction: implemented calculateRemainingEventCapacity as required by the issue; the starter omitted this method. */
public class Issue59_VH18_CollegeFestRegistrationAndEventAllocation {
    public static void main(String[] args) {
        System.out.println("Remaining Event capacity: " + calculateRemainingEventCapacity(12, 7));
    }

    // Required method signature: static int calculateRemainingEventCapacity(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingEventCapacity.
    static int calculateRemainingEventCapacity(int capacity, int occupied) {
        return capacity - occupied;
    }
}
