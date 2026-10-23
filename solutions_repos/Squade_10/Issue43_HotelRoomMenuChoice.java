/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Book")
 * Corrected snippet: case 2: System.out.println("Menu action: Checkout")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_HotelRoomMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Book"); break;
            case 2: System.out.println("Menu action: Checkout"); break;
            default: System.out.println("Invalid option");
        }
    }
}