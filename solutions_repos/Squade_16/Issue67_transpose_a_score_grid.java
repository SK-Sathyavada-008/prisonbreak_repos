/*
 * CORRECTION NOTES
 * Buggy snippet: row and column indices were mixed up
 * Corrected snippet: iterate original columns outside and rows inside
 * Explanation: A transpose swaps the row and column indices without changing values.
 */
public class Issue67_transpose_a_score_grid { public static void main(String[] args) { int[][] a={{9,4,9},{5,10,10}}; for(int j=0;j<a[0].length;j++) { for(int i=0;i<a.length;i++) System.out.print(a[i][j]+(i==a.length-1?"":" ")); System.out.println(); } } }