/*
 * CORRECTION NOTES
 * Buggy snippet: if (value >= 0)
 * Corrected snippet: if(value > 0)
 * Explanation: Count only positive entries, not zero.
 * Buggy snippet: "Positive Runners:
 * Corrected snippet: "Positive runners:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue47_RaceEntryCount {
    public static void main(String[] args) {
        int[] values = {-1, 0, 2, 5};
        int count = 0;
        for (int value : values) {
            if(value > 0) count++;
        }
        System.out.println("Positive runners: " + count);
    }
}