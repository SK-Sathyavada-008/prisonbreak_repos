/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateRoomVacanciesPercentage` for Multi-Block Hostel Allocation and Transfer System
 * Relevant starter snippet: System.out.println("Room vacancies percentage: " + calculateRoomVacanciesPercentage(3, 4));
 * Corrected solution snippet: if (total == 0)
 * Explanation: The starter calls `calculateRoomVacanciesPercentage(int completed, int total)`, but the method has not been written. Write this method from scratch. Calculate the percentage represented by completed records out of the supplied total. Return 0 when total is zero. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Ja
 * Expected sample output:
 * Room vacancies percentage: 75.0
 */
/* Correction: implemented calculateRoomVacanciesPercentage as required by the issue; the starter omitted this method. */
public class Issue62_VH01_MultiBlockHostelAllocationAndTransferSystem {
    public static void main(String[] args) {
        System.out.println("Room vacancies percentage: " + calculateRoomVacanciesPercentage(3, 4));
    }

    // Required method signature: static double calculateRoomVacanciesPercentage(int completed, int total)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRoomVacanciesPercentage.
    static double calculateRoomVacanciesPercentage(int completed, int total) {
        if (total == 0) return 0.0;
        return completed * 100.0 / total;
    }
}
