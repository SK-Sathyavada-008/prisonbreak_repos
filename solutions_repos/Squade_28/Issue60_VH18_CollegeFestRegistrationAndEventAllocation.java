/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `findHighestAvailableEventSlots` for College Fest Registration and Event Allocation
 * Relevant starter snippet: System.out.println("Highest Available event slots: " + findHighestAvailableEventSlots(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestAvailableEventSlots(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied available event slots array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or ext
 * Expected sample output:
 * Highest Available event slots: 18
 */
/* Correction: implemented findHighestAvailableEventSlots as required by the issue; the starter omitted this method. */
public class Issue60_VH18_CollegeFestRegistrationAndEventAllocation {
    public static void main(String[] args) {
        System.out.println("Highest Available event slots: " + findHighestAvailableEventSlots(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestAvailableEventSlots(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestAvailableEventSlots.
    static int findHighestAvailableEventSlots(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
