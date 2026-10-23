/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<values.length-1
 * Corrected snippet: for(int i=0;i<values.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: sum+=i;
 * Corrected snippet: sum+=values[i];
 * Explanation: The sum must add each value, not its index.
 * Buggy snippet: sum+=values[0];
 * Corrected snippet: 
 * Explanation: The first array value must not be added twice.
 */
public class Issue31_supply_count_total { public static void main(String[] args) { int[] values=new int[]{2, -12, 14, 2, 1}; int sum=0; for(int i=0;i<values.length;i++) sum+=values[i];   System.out.println("Sum: "+sum); } }
