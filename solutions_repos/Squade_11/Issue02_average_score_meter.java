/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<values.length-1
 * Corrected snippet: for(int i=0;i<values.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: sum/(values.length-1)
 * Corrected snippet: sum/(values.length)
 * Explanation: The average must divide by the full number of values.
 * Buggy snippet: +20
 * Corrected snippet: 
 * Explanation: Do not add an unrelated constant to the average.
 */
public class Issue02_average_score_meter { public static void main(String[] args) { int[] values=new int[]{4, 8, 4, 5}; int sum=0; for(int i=0;i<values.length;i++) sum+=values[i]; int average=sum/(values.length); System.out.println("Average: "+average); } }
