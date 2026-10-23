/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Purchase")
 * Corrected snippet: case 2: System.out.println("Menu action: Restock")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_ComputerComponentMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Purchase"); break;
            case 2: System.out.println("Menu action: Restock"); break;
            default: System.out.println("Invalid option");
        }
    }
}