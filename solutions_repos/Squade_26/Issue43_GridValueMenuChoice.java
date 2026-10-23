/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Check")
 * Corrected snippet: case 2: System.out.println("Menu action: Reset")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_GridValueMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Check"); break;
            case 2: System.out.println("Menu action: Reset"); break;
            default: System.out.println("Invalid option");
        }
    }
}