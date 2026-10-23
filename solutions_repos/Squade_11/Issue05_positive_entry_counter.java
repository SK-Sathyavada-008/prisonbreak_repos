/*
 * CORRECTION NOTES
 * Buggy snippet: if(v[i]>=0)
 * Corrected snippet: if(v[i] > 0)
 * Explanation: Positive values must be strictly greater than zero.
 */
public class Issue05_positive_entry_counter { public static void main(String[] args) { int[] v=new int[]{4, -12, 12, 4, 14}; int count=0; for(int i=0;i<v.length;i++) if(v[i] > 0) count++;  System.out.println("Count: "+count); } }
