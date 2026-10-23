/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `countAtLeastAvailableFlightSeats` for Airline Booking with Connecting Flights
 * Relevant starter snippet: System.out.println("Values meeting threshold: " + countAtLeastAvailableFlightSeats(new int[] {2, 5, 1, 7}, 4));
 * Corrected solution snippet: for (int value : values) if (value >= threshold) count++;
 * Explanation: The starter calls `countAtLeastAvailableFlightSeats(int[] values, int threshold)`, but the method has not been written. Write this method from scratch. Count how many supplied available flight seats values are at least the given threshold. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not u
 * Expected sample output:
 * Values meeting threshold: 2
 */
/* Correction: implemented countAtLeastAvailableFlightSeats as required by the issue; the starter omitted this method. */
public class Issue63_VH08_AirlineBookingWithConnectingFlights {
    public static void main(String[] args) {
        System.out.println("Values meeting threshold: " + countAtLeastAvailableFlightSeats(new int[] {2, 5, 1, 7}, 4));
    }

    // Required method signature: static int countAtLeastAvailableFlightSeats(int[] values, int threshold)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAtLeastAvailableFlightSeats.
    static int countAtLeastAvailableFlightSeats(int[] values, int threshold) {
        int count = 0;
        for (int value : values) if (value >= threshold) count++;
        return count;
    }
}
