/*
 * CORRECTION NOTES
 * Buggy snippet: requested < 0
 * Corrected snippet: requested<=0
 * Explanation: A zero-unit request must be rejected.
 */
public class Issue41_StudentMarkValidation {
    public static void main(String[] args) {
        int requested = 0;
        int available = 5;
        if (requested<=0 || requested > available) {
            System.out.println("Request rejected");
        } else {
            System.out.println("Request accepted");
        }
    }
}