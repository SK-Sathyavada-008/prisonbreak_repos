/*
 * CORRECTION NOTES
 * Buggy snippet: for (int i = 0; i < values.length - 1
 * Corrected snippet: for (int i = 0; i < values.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: "Total Stock units:
 * Corrected snippet: "Total stock units:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue45_ComputerComponentTotal {
    public static void main(String[] args) {
        int[] values = {2, 3, 4};
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        System.out.println("Total stock units: " + total);
    }
}