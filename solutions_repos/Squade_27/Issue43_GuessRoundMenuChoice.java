/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Guess")
 * Corrected snippet: case 2: System.out.println("Menu action: Reset")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_GuessRoundMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Guess"); break;
            case 2: System.out.println("Menu action: Reset"); break;
            default: System.out.println("Invalid option");
        }
    }
}