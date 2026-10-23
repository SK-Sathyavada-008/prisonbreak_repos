/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateDiscountedTicketFare` for Railway Reservation with Waiting List
 * Relevant starter snippet: System.out.println("Discounted Ticket fare: " + calculateDiscountedTicketFare(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedTicketFare(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inhe
 * Expected sample output:
 * Discounted Ticket fare: 180.0
 */
/* Correction: implemented calculateDiscountedTicketFare as required by the issue; the starter omitted this method. */
public class Issue61_VH03_RailwayReservationWithWaitingList {
    public static void main(String[] args) {
        System.out.println("Discounted Ticket fare: " + calculateDiscountedTicketFare(200, 10));
    }

    // Required method signature: static double calculateDiscountedTicketFare(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedTicketFare.
    static double calculateDiscountedTicketFare(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
