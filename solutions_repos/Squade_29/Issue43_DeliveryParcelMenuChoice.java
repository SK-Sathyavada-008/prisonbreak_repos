/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Dispatch")
 * Corrected snippet: case 2: System.out.println("Menu action: Deliver")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_DeliveryParcelMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Dispatch"); break;
            case 2: System.out.println("Menu action: Deliver"); break;
            default: System.out.println("Invalid option");
        }
    }
}