/*
 * CORRECTION NOTES
 * Buggy snippet: values.length + 1
 * Corrected snippet: values.length
 * Explanation: Average must divide by the number of entries, not one more.
 * Buggy snippet: "Average Occupied rooms:
 * Corrected snippet: "Average occupied rooms:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue46_HotelRoomAverage {
    public static void main(String[] args) {
        int[] values = {60, 80, 100};
        int total = 0;
        for (int value : values) total += value;
        double average = (double) total / (values.length);
        System.out.println("Average occupied rooms: " + average);
    }
}