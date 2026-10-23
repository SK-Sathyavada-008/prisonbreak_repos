/*
 * CORRECTION NOTES
 * Buggy snippet: for(int i=0;i<v.length-1
 * Corrected snippet: for(int i=0;i<v.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: for(int j=0;j<v.length-i-2
 * Corrected snippet: for(int j=0;j<v.length-i-1
 * Explanation: The adjacent-comparison loop stopped one position too early.
 * Buggy snippet: for(int i=0;i<v.length;i++) System.out.print(v[i]+" ");
 * Corrected snippet: for(int i=0;i<v.length;i++) System.out.print(v[i]+(i==v.length-1?"":" "));
 * Explanation: Avoid trailing spaces while printing all array values.
 */
public class Issue29_ascending_score_board { public static void main(String[] args) { int[] v=new int[]{7, -4, 11, 11}; for(int i=0;i<v.length;i++) for(int j=0;j<v.length-i-1;j++) if(v[j]>v[j+1]) { int t=v[j]; v[j]=v[j+1]; v[j+1]=t; } for(int i=0;i<v.length;i++) System.out.print(v[i]+(i==v.length-1?"":" ")); } }
