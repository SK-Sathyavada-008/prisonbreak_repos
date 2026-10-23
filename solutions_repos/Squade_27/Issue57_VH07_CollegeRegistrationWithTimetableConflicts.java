/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `calculateDiscountedCourseFee` for College Registration with Timetable Conflicts
 * Relevant starter snippet: System.out.println("Discounted Course fee: " + calculateDiscountedCourseFee(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedCourseFee(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inher
 * Expected sample output:
 * Discounted Course fee: 180.0
 */
/* Correction: implemented calculateDiscountedCourseFee as required by the issue; the starter omitted this method. */
public class Issue57_VH07_CollegeRegistrationWithTimetableConflicts {
    public static void main(String[] args) {
        System.out.println("Discounted Course fee: " + calculateDiscountedCourseFee(200, 10));
    }

    // Required method signature: static double calculateDiscountedCourseFee(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedCourseFee.
    static double calculateDiscountedCourseFee(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
