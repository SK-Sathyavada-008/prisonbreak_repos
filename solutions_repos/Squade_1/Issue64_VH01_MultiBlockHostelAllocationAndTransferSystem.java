/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `calculateTotalRoomVacancies` for Multi-Block Hostel Allocation and Transfer System
 * Relevant starter snippet: System.out.println("Total Room vacancies: " + calculateTotalRoomVacancies(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalRoomVacancies(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied room vacancies. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Room vacancies: 13
 */
/* Correction: implemented calculateTotalRoomVacancies as required by the issue; the starter omitted this method. */
public class Issue64_VH01_MultiBlockHostelAllocationAndTransferSystem {
    public static void main(String[] args) {
        System.out.println("Total Room vacancies: " + calculateTotalRoomVacancies(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalRoomVacancies(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalRoomVacancies.
    static int calculateTotalRoomVacancies(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
