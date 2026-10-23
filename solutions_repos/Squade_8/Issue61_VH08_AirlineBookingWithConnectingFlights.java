/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `findHighestAvailableFlightSeats` for Airline Booking with Connecting Flights
 * Relevant starter snippet: System.out.println("Highest Available flight seats: " + findHighestAvailableFlightSeats(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestAvailableFlightSeats(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied available flight seats array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or e
 * Expected sample output:
 * Highest Available flight seats: 18
 */
/* Correction: implemented findHighestAvailableFlightSeats as required by the issue; the starter omitted this method. */
public class Issue61_VH08_AirlineBookingWithConnectingFlights {
    public static void main(String[] args) {
        System.out.println("Highest Available flight seats: " + findHighestAvailableFlightSeats(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestAvailableFlightSeats(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestAvailableFlightSeats.
    static int findHighestAvailableFlightSeats(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
