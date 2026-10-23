/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `isValidRecordReadingRequest` for Electricity Billing with Historical Readings
 * Relevant starter snippet: System.out.println("Record reading request valid: " + isValidRecordReadingRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidRecordReadingRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; d
 * Expected sample output:
 * Record reading request valid: true
 */
/* Correction: implemented isValidRecordReadingRequest as required by the issue; the starter omitted this method. */
public class Issue61_VH31_ElectricityBillingWithHistoricalReadings {
    public static void main(String[] args) {
        System.out.println("Record reading request valid: " + isValidRecordReadingRequest(2, 5));
    }

    // Required method signature: static boolean isValidRecordReadingRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidRecordReadingRequest.
    static boolean isValidRecordReadingRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
