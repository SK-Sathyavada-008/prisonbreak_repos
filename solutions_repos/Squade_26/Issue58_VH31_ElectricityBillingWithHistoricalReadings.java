/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `calculateTotalMonthlyReadings` for Electricity Billing with Historical Readings
 * Relevant starter snippet: System.out.println("Total Monthly readings: " + calculateTotalMonthlyReadings(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalMonthlyReadings(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied monthly readings. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Monthly readings: 13
 */
/* Correction: implemented calculateTotalMonthlyReadings as required by the issue; the starter omitted this method. */
public class Issue58_VH31_ElectricityBillingWithHistoricalReadings {
    public static void main(String[] args) {
        System.out.println("Total Monthly readings: " + calculateTotalMonthlyReadings(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalMonthlyReadings(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalMonthlyReadings.
    static int calculateTotalMonthlyReadings(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
