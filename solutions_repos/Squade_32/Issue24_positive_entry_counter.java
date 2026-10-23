/*
 * CORRECTION NOTES
 * Buggy snippet: if(v[i]>=0)
 * Corrected snippet: if(v[i] > 0)
 * Explanation: Positive values must be strictly greater than zero.
 */
public class Issue24_positive_entry_counter { public static void main(String[] args) { int[] v=new int[]{7, -10, 10, 5, 12}; int count=0; for(int i=0;i<v.length;i++) if(v[i] > 0) count++;  System.out.println("Count: "+count); } }
