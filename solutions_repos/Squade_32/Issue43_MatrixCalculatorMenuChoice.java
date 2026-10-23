/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Calculate")
 * Corrected snippet: case 2: System.out.println("Menu action: Transpose")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_MatrixCalculatorMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Calculate"); break;
            case 2: System.out.println("Menu action: Transpose"); break;
            default: System.out.println("Invalid option");
        }
    }
}