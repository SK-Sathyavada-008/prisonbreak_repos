/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length-1
 * Corrected snippet: for(int i=0;i<v.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: count--;
 * Corrected snippet: 
 * Explanation: Do not subtract one from a valid occurrence count.
 */
public class Issue68_occurrence_count { public static void main(String[] args) { int[] v=new int[]{8, 10, 8, 5, 8}; int target=8, count=0; for(int i=0;i<v.length;i++) if(v[i]==target) count++;  System.out.println("Occurrences: "+count); } }
