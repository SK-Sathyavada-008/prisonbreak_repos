/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<marks.length-1
 * Corrected snippet: for(int i=0;i<marks.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: total/2
 * Corrected snippet: total/marks.length
 * Explanation: Average is total divided by the number of marks.
 */
public class Issue10_class_marks_average { public static void main(String[] args) { int[] marks=new int[]{45, 16, 42}; int total=0; for(int i=0;i<marks.length;i++) total+=marks[i]; System.out.println("Average: "+(total/marks.length)); } }
