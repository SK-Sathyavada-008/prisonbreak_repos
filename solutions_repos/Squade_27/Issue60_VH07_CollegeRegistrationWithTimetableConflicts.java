/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `findCourseRegistrationIndex` for College Registration with Timetable Conflicts
 * Relevant starter snippet: System.out.println("Course registration index: " + findCourseRegistrationIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findCourseRegistrationIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested course registration ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; d
 * Expected sample output:
 * Course registration index: 2
 */
/* Correction: implemented findCourseRegistrationIndex as required by the issue; the starter omitted this method. */
public class Issue60_VH07_CollegeRegistrationWithTimetableConflicts {
    public static void main(String[] args) {
        System.out.println("Course registration index: " + findCourseRegistrationIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findCourseRegistrationIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findCourseRegistrationIndex.
    static int findCourseRegistrationIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
