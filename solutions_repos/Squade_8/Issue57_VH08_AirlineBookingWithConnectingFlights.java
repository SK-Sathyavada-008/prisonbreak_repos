/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `calculateTotalAvailableFlightSeats` for Airline Booking with Connecting Flights
 * Relevant starter snippet: System.out.println("Total Available flight seats: " + calculateTotalAvailableFlightSeats(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalAvailableFlightSeats(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied available flight seats. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external li
 * Expected sample output:
 * Total Available flight seats: 13
 */
/* Correction: implemented calculateTotalAvailableFlightSeats as required by the issue; the starter omitted this method. */
public class Issue57_VH08_AirlineBookingWithConnectingFlights {
    public static void main(String[] args) {
        System.out.println("Total Available flight seats: " + calculateTotalAvailableFlightSeats(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalAvailableFlightSeats(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalAvailableFlightSeats.
    static int calculateTotalAvailableFlightSeats(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
