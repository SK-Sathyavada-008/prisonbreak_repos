/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Park")
 * Corrected snippet: case 2: System.out.println("Menu action: Exit")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_ParkingVehicleMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Park"); break;
            case 2: System.out.println("Menu action: Exit"); break;
            default: System.out.println("Invalid option");
        }
    }
}