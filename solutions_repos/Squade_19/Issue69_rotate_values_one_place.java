/*
 * CORRECTION NOTES
 * Buggy snippet: i<v.length-2
 * Corrected snippet: i<v.length-1
 * Explanation: Shift every element except the final destination.
 * Buggy snippet: v[v.length-1]=v[1];
 * Corrected snippet: v[v.length-1]=first;
 * Explanation: A left rotation places the original first value at the end.
 * Buggy snippet: for(int n:v) System.out.print(n+" ");
 * Corrected snippet: for(int i=0;i<v.length;i++) System.out.print(v[i]+(i==v.length-1?"":" "));
 * Explanation: Avoid trailing spaces while printing all array values.
 */
public class Issue69_rotate_values_one_place { public static void main(String[] args) { int[] v=new int[]{9, -13, 14, 10}; int first=v[0]; for(int i=0;i<v.length-1;i++) v[i]=v[i+1]; v[v.length-1]=first; for(int i=0;i<v.length;i++) System.out.print(v[i]+(i==v.length-1?"":" ")); } }
