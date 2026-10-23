/*
 * CORRECTION NOTES
 * Buggy snippet: v[i]==v[j] && j==i+1
 * Corrected snippet: v[i]==v[j]
 * Explanation: Count duplicate pairs even when equal values are not adjacent.
 * Buggy snippet: (count-1)
 * Corrected snippet: count
 * Explanation: Print the number of repeated pairs without subtracting one.
 * Buggy snippet: only adjacent duplicates were counted
 * Corrected snippet: compare each value with all later values
 * Explanation: Duplicate values need not be next to each other in the array.
 */
public class Issue74_count_repeated_values { public static void main(String[] args) { int[] v=new int[]{2, 4, 2, 7, 4}; int count=0; for(int i=0;i<v.length;i++) for(int j=i+1;j<v.length;j++) if(v[i]==v[j]) count++; System.out.println("Repeated pairs: "+count); } }