/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `findHighestAvailableSeats` for Examination Scheduling and Hall Allocation
 * Relevant starter snippet: System.out.println("Highest Available seats: " + findHighestAvailableSeats(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestAvailableSeats(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied available seats array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libra
 * Expected sample output:
 * Highest Available seats: 18
 */
/* Correction: implemented findHighestAvailableSeats as required by the issue; the starter omitted this method. */
public class Issue58_VH35_ExaminationSchedulingAndHallAllocation {
    public static void main(String[] args) {
        System.out.println("Highest Available seats: " + findHighestAvailableSeats(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestAvailableSeats(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestAvailableSeats.
    static int findHighestAvailableSeats(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
