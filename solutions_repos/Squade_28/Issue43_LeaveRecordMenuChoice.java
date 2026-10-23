/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Request")
 * Corrected snippet: case 2: System.out.println("Menu action: Approve")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_LeaveRecordMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Request"); break;
            case 2: System.out.println("Menu action: Approve"); break;
            default: System.out.println("Invalid option");
        }
    }
}