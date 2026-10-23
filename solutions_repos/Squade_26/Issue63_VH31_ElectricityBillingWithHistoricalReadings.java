/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `findHighestMonthlyReadings` for Electricity Billing with Historical Readings
 * Relevant starter snippet: System.out.println("Highest Monthly readings: " + findHighestMonthlyReadings(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestMonthlyReadings(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied monthly readings array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external lib
 * Expected sample output:
 * Highest Monthly readings: 18
 */
/* Correction: implemented findHighestMonthlyReadings as required by the issue; the starter omitted this method. */
public class Issue63_VH31_ElectricityBillingWithHistoricalReadings {
    public static void main(String[] args) {
        System.out.println("Highest Monthly readings: " + findHighestMonthlyReadings(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestMonthlyReadings(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestMonthlyReadings.
    static int findHighestMonthlyReadings(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
