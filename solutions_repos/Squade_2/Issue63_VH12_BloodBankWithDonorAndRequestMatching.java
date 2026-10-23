/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `findBloodUnitIndex` for Blood Bank with Donor and Request Matching
 * Relevant starter snippet: System.out.println("Blood unit index: " + findBloodUnitIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findBloodUnitIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested blood unit ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collecti
 * Expected sample output:
 * Blood unit index: 2
 */
/* Correction: implemented findBloodUnitIndex as required by the issue; the starter omitted this method. */
public class Issue63_VH12_BloodBankWithDonorAndRequestMatching {
    public static void main(String[] args) {
        System.out.println("Blood unit index: " + findBloodUnitIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findBloodUnitIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findBloodUnitIndex.
    static int findBloodUnitIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
