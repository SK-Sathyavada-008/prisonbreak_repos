/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `findVoterRecordIndex` for Election System with Constituencies and Recount
 * Relevant starter snippet: System.out.println("Voter record index: " + findVoterRecordIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findVoterRecordIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested voter record ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use coll
 * Expected sample output:
 * Voter record index: 2
 */
/* Correction: implemented findVoterRecordIndex as required by the issue; the starter omitted this method. */
public class Issue62_VH13_ElectionSystemWithConstituenciesAndRecount {
    public static void main(String[] args) {
        System.out.println("Voter record index: " + findVoterRecordIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findVoterRecordIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findVoterRecordIndex.
    static int findVoterRecordIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
