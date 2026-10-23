/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Activate")
 * Corrected snippet: case 2: System.out.println("Menu action: Renew")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_MobileRechargeMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Activate"); break;
            case 2: System.out.println("Menu action: Renew"); break;
            default: System.out.println("Invalid option");
        }
    }
}