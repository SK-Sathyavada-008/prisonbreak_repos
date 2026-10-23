/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `calculateTotalAvailableEventSlots` for College Fest Registration and Event Allocation
 * Relevant starter snippet: System.out.println("Total Available event slots: " + calculateTotalAvailableEventSlots(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalAvailableEventSlots(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied available event slots. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libr
 * Expected sample output:
 * Total Available event slots: 13
 */
/* Correction: implemented calculateTotalAvailableEventSlots as required by the issue; the starter omitted this method. */
public class Issue63_VH18_CollegeFestRegistrationAndEventAllocation {
    public static void main(String[] args) {
        System.out.println("Total Available event slots: " + calculateTotalAvailableEventSlots(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalAvailableEventSlots(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalAvailableEventSlots.
    static int calculateTotalAvailableEventSlots(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
