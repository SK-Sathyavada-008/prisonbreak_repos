/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateFlightFare` for Airline Booking with Connecting Flights
 * Relevant starter snippet: System.out.println("Total Flight fare: " + calculateFlightFare(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateFlightFare(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit flight fare and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, o
 * Expected sample output:
 * Total Flight fare: 75
 */
/* Correction: implemented calculateFlightFare as required by the issue; the starter omitted this method. */
public class Issue60_VH08_AirlineBookingWithConnectingFlights {
    public static void main(String[] args) {
        System.out.println("Total Flight fare: " + calculateFlightFare(25, 3));
    }

    // Required method signature: static int calculateFlightFare(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateFlightFare.
    static int calculateFlightFare(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
