/*
 * CORRECTION NOTES
 * Buggy snippet: values[r].length - 1
 * Corrected snippet: values[r].length
 * Explanation: Include the last column in every row total.
 */
public class Issue56_QuizStudentRowTotals {
    public static void main(String[] args) {
        int[][] values = { {2, 3, 4}, {1, 5, 2} };
        System.out.print("Row totals:");
        for (int r = 0; r < values.length; r++) {
            int total = 0;
            for (int c = 0; c < values[r].length; c++) total += values[r][c];
            System.out.print(" " + total);
        }
        System.out.println();
    }
}