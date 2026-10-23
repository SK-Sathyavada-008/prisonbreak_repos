/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `findLowestMonthlyReadings` for Electricity Billing with Historical Readings
 * Relevant starter snippet: System.out.println("Lowest Monthly readings: " + findLowestMonthlyReadings(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestMonthlyReadings(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied monthly readings array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external lib
 * Expected sample output:
 * Lowest Monthly readings: 4
 */
/* Correction: implemented findLowestMonthlyReadings as required by the issue; the starter omitted this method. */
public class Issue64_VH31_ElectricityBillingWithHistoricalReadings {
    public static void main(String[] args) {
        System.out.println("Lowest Monthly readings: " + findLowestMonthlyReadings(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestMonthlyReadings(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestMonthlyReadings.
    static int findLowestMonthlyReadings(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
