/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Withdraw")
 * Corrected snippet: case 2: System.out.println("Menu action: Deposit")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_ATMAccountMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Withdraw"); break;
            case 2: System.out.println("Menu action: Deposit"); break;
            default: System.out.println("Invalid option");
        }
    }
}