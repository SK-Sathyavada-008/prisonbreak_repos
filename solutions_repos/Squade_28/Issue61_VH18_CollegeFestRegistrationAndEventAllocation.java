/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateAvailableEventSlotsPercentage` for College Fest Registration and Event Allocation
 * Relevant starter snippet: System.out.println("Available event slots percentage: " + calculateAvailableEventSlotsPercentage(3, 4));
 * Corrected solution snippet: if (total == 0)
 * Explanation: The starter calls `calculateAvailableEventSlotsPercentage(int completed, int total)`, but the method has not been written. Write this method from scratch. Calculate the percentage represented by completed records out of the supplied total. Return 0 when total is zero. Use the supplied values exactly as shown in the starter file. Keep the implementation to ba
 * Expected sample output:
 * Available event slots percentage: 75.0
 */
/* Correction: implemented calculateAvailableEventSlotsPercentage as required by the issue; the starter omitted this method. */
public class Issue61_VH18_CollegeFestRegistrationAndEventAllocation {
    public static void main(String[] args) {
        System.out.println("Available event slots percentage: " + calculateAvailableEventSlotsPercentage(3, 4));
    }

    // Required method signature: static double calculateAvailableEventSlotsPercentage(int completed, int total)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateAvailableEventSlotsPercentage.
    static double calculateAvailableEventSlotsPercentage(int completed, int total) {
        if (total == 0) return 0.0;
        return completed * 100.0 / total;
    }
}
