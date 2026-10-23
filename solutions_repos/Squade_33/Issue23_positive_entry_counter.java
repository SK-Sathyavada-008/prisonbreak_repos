/*
 * CORRECTION NOTES
 * Buggy snippet: if(v[i]>=0)
 * Corrected snippet: if(v[i] > 0)
 * Explanation: Positive values must be strictly greater than zero.
 */
public class Issue23_positive_entry_counter { public static void main(String[] args) { int[] v=new int[]{8, -12, 13, 8, 0}; int count=0; for(int i=0;i<v.length;i++) if(v[i] > 0) count++;  System.out.println("Count: "+count); } }
