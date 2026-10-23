/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Vote")
 * Corrected snippet: case 2: System.out.println("Menu action: Recount")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_ElectionCandidateMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Vote"); break;
            case 2: System.out.println("Menu action: Recount"); break;
            default: System.out.println("Invalid option");
        }
    }
}