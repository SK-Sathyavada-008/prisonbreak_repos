/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `isValidConfirmRequest` for Railway Reservation with Waiting List
 * Relevant starter snippet: System.out.println("Confirm request valid: " + isValidConfirmRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidConfirmRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not 
 * Expected sample output:
 * Confirm request valid: true
 */
/* Correction: implemented isValidConfirmRequest as required by the issue; the starter omitted this method. */
public class Issue58_VH03_RailwayReservationWithWaitingList {
    public static void main(String[] args) {
        System.out.println("Confirm request valid: " + isValidConfirmRequest(2, 5));
    }

    // Required method signature: static boolean isValidConfirmRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidConfirmRequest.
    static boolean isValidConfirmRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
