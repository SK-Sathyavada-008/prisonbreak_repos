/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateCourseFee` for College Registration with Timetable Conflicts
 * Relevant starter snippet: System.out.println("Total Course fee: " + calculateCourseFee(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateCourseFee(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit course fee and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or 
 * Expected sample output:
 * Total Course fee: 75
 */
/* Correction: implemented calculateCourseFee as required by the issue; the starter omitted this method. */
public class Issue61_VH07_CollegeRegistrationWithTimetableConflicts {
    public static void main(String[] args) {
        System.out.println("Total Course fee: " + calculateCourseFee(25, 3));
    }

    // Required method signature: static int calculateCourseFee(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateCourseFee.
    static int calculateCourseFee(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
