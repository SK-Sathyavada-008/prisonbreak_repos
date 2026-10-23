/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length-1
 * Corrected snippet: for(int i=0;i<v.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: loop starts at index 0
 * Corrected snippet: loop starts at index 1
 * Explanation: Odd-index positions are zero-based indices 1, 3, 5, ...
 */
public class Issue86_odd_index_value_total { public static void main(String[] args) { int[] v=new int[]{4, -8, 5, 0, 7}; int sum=0; for(int i=1;i<v.length;i+=2) sum+=v[i]; System.out.println("Odd-index total: "+sum); } }