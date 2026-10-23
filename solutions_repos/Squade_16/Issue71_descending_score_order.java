/*
 * CORRECTION NOTES
 * Buggy snippet: j<v.length-i-2
 * Corrected snippet: j<v.length-i-1
 * Explanation: Compare all adjacent pairs during sorting.
 * Buggy snippet: for(int n:v) System.out.print(n+" ");
 * Corrected snippet: for(int i=0;i<v.length;i++) System.out.print(v[i]+(i==v.length-1?"":" "));
 * Explanation: Avoid trailing spaces while printing all array values.
 */
public class Issue71_descending_score_order { public static void main(String[] args) { int[] v=new int[]{3, -13, 11, 4}; for(int i=0;i<v.length;i++) for(int j=0;j<v.length-i-1;j++) if(v[j]<v[j+1]) { int t=v[j]; v[j]=v[j+1]; v[j+1]=t; } for(int i=0;i<v.length;i++) System.out.print(v[i]+(i==v.length-1?"":" ")); } }
