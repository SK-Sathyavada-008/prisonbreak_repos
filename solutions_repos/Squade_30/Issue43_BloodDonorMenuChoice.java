/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Register")
 * Corrected snippet: case 2: System.out.println("Menu action: Request")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_BloodDonorMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Register"); break;
            case 2: System.out.println("Menu action: Request"); break;
            default: System.out.println("Invalid option");
        }
    }
}