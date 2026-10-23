/*
 * CORRECTION NOTES
 * Buggy snippet: if(v[i]>=0)
 * Corrected snippet: if(v[i]>0)
 * Explanation: Only positive measurements pass; zero does not.
 */
public class Issue89_count_passing_measurements { public static void main(String[] args) { int[] v=new int[]{7, -8, 14, 3, 1}; int count=0; for(int i=0;i<v.length;i++) if(v[i]>0) count++;  System.out.println("Count: "+count); } }
