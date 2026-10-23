/*
 * CORRECTION NOTES
 * Buggy snippet: case 2: System.out.println("Menu action: Evaluate")
 * Corrected snippet: case 2: System.out.println("Menu action: Review")
 * Explanation: The selected menu option must perform the action stated in the issue.
 */
public class Issue43_ExamAnswerSheetMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Evaluate"); break;
            case 2: System.out.println("Menu action: Review"); break;
            default: System.out.println("Invalid option");
        }
    }
}