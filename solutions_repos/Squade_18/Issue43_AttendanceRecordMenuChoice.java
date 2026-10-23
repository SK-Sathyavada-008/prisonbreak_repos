/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Mark")
 * Corrected snippet: case 2: System.out.println("Menu action: Correct")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_AttendanceRecordMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Mark"); break;
            case 2: System.out.println("Menu action: Correct"); break;
            default: System.out.println("Invalid option");
        }
    }
}