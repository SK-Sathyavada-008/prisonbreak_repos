/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `isValidParkRequest` for Multi-Floor Parking Allocation and Billing
 * Relevant starter snippet: System.out.println("Park request valid: " + isValidParkRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidParkRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use
 * Expected sample output:
 * Park request valid: true
 */
/* Correction: implemented isValidParkRequest as required by the issue; the starter omitted this method. */
public class Issue62_VH30_MultiFloorParkingAllocationAndBilling {
    public static void main(String[] args) {
        System.out.println("Park request valid: " + isValidParkRequest(2, 5));
    }

    // Required method signature: static boolean isValidParkRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidParkRequest.
    static boolean isValidParkRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
