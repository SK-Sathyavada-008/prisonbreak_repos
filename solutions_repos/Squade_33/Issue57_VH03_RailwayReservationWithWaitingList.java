/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `calculateTicketFare` for Railway Reservation with Waiting List
 * Relevant starter snippet: System.out.println("Total Ticket fare: " + calculateTicketFare(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateTicketFare(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit ticket fare and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, o
 * Expected sample output:
 * Total Ticket fare: 75
 */
/* Correction: implemented calculateTicketFare as required by the issue; the starter omitted this method. */
public class Issue57_VH03_RailwayReservationWithWaitingList {
    public static void main(String[] args) {
        System.out.println("Total Ticket fare: " + calculateTicketFare(25, 3));
    }

    // Required method signature: static int calculateTicketFare(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTicketFare.
    static int calculateTicketFare(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
