/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateTotalAvailableSeats` for Examination Scheduling and Hall Allocation
 * Relevant starter snippet: System.out.println("Total Available seats: " + calculateTotalAvailableSeats(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalAvailableSeats(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied available seats. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Available seats: 13
 */
/* Correction: implemented calculateTotalAvailableSeats as required by the issue; the starter omitted this method. */
public class Issue62_VH35_ExaminationSchedulingAndHallAllocation {
    public static void main(String[] args) {
        System.out.println("Total Available seats: " + calculateTotalAvailableSeats(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalAvailableSeats(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalAvailableSeats.
    static int calculateTotalAvailableSeats(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
