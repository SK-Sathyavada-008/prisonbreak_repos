/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Pay")
 * Corrected snippet: case 2: System.out.println("Menu action: Refund")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_DigitalWalletMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Pay"); break;
            case 2: System.out.println("Menu action: Refund"); break;
            default: System.out.println("Invalid option");
        }
    }
}