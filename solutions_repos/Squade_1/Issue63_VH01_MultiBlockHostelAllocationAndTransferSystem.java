/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `containsRoomNumber` for Multi-Block Hostel Allocation and Transfer System
 * Relevant starter snippet: System.out.println("Room number found: " + containsRoomNumber(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsRoomNumber(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested room number text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use
 * Expected sample output:
 * Room number found: true
 */
/* Correction: implemented containsRoomNumber as required by the issue; the starter omitted this method. */
public class Issue63_VH01_MultiBlockHostelAllocationAndTransferSystem {
    public static void main(String[] args) {
        System.out.println("Room number found: " + containsRoomNumber(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsRoomNumber(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsRoomNumber.
    static boolean containsRoomNumber(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
