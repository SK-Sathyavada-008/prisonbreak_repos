/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Borrow")
 * Corrected snippet: case 2: System.out.println("Menu action: Return")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_LibraryBookMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Borrow"); break;
            case 2: System.out.println("Menu action: Return"); break;
            default: System.out.println("Invalid option");
        }
    }
}