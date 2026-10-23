/*
 * CORRECTION NOTES
 * Buggy snippet: [index + 1] = 99
 * Corrected snippet: [index]=99
 * Explanation: Write the update at the requested index, not the following index.
 */
public class Issue54_ElectionCandidateUpdateArray {
    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        int index = 1;
        values[index]=99;
        System.out.print("Updated values:");
        for (int value : values) System.out.print(" " + value);
        System.out.println();
    }
}