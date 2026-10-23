/*
 * CORRECTION NOTES
 * Buggy snippet: if(r[j]<r[j+1])
 * Corrected snippet: if(r[j]>r[j+1])
 * Explanation: Ascending order swaps adjacent values when the left value is larger.
 * Buggy snippet: i<r.length-1
 * Corrected snippet: i<r.length
 * Explanation: Print the final inserted element too.
 * Buggy snippet: for(int i=0;i<r.length;i++) System.out.print(r[i]+" ");
 * Corrected snippet: for(int i=0;i<r.length;i++) System.out.print(r[i]+(i==r.length-1?"":" "));
 * Explanation: Avoid trailing spaces while printing all array values.
 */
public class Issue87_insert_into_sorted_scores { public static void main(String[] args) { int[] v=new int[]{-13, 7, 8, 12}; int value=20; int[] r=new int[v.length+1]; for(int i=0;i<v.length;i++) r[i]=v[i]; r[v.length]=value; for(int i=0;i<r.length;i++) for(int j=0;j<r.length-i-1;j++) if(r[j]>r[j+1]) { int t=r[j]; r[j]=r[j+1]; r[j+1]=t; } for(int i=0;i<r.length;i++) System.out.print(r[i]+(i==r.length-1?"":" ")); } }
