/*
 * CORRECTION NOTES
 * Buggy snippet: if (value <= 0)
 * Corrected snippet: if(value < 0)
 * Explanation: A non-negative value includes zero.
 */
public class Issue44_BloodDonorNonNegative {
    public static void main(String[] args) {
        int value = 0;
        if(value < 0) {
            System.out.println("Value rejected");
        } else {
            System.out.println("Value accepted");
        }
    }
}