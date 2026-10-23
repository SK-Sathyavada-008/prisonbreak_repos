/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Reserve")
 * Corrected snippet: case 2: System.out.println("Menu action: Cancel")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_RailwaySeatMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Reserve"); break;
            case 2: System.out.println("Menu action: Cancel"); break;
            default: System.out.println("Invalid option");
        }
    }
}