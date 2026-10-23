/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Add")
 * Corrected snippet: case 2: System.out.println("Menu action: Delete")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_ContactRecordMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Add"); break;
            case 2: System.out.println("Menu action: Delete"); break;
            default: System.out.println("Invalid option");
        }
    }
}