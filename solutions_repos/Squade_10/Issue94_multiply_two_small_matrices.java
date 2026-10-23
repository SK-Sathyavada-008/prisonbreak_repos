/*
 * CORRECTION NOTES
 * Buggy snippet: j<1
 * Corrected snippet: j<b[0].length
 * Explanation: Calculate every output column.
 * Buggy snippet: +1+a[i][1]
 * Corrected snippet: 
 * Explanation: Matrix multiplication sums products only.
 * Buggy snippet: matrix multiplication omitted output cells and added an unrelated term
 * Corrected snippet: sum a[i][k] * b[k][j] over every shared index k
 * Explanation: Each output cell is the dot product of a row and a column.
 */
public class Issue94_multiply_two_small_matrices { public static void main(String[] args) { int[][] a={{3,9},{8,1}}; int[][] b={{1,8},{9,3}}; int[][] c=new int[a.length][b[0].length]; for(int i=0;i<a.length;i++) { for(int j=0;j<b[0].length;j++) { for(int k=0;k<b.length;k++) c[i][j]+=a[i][k]*b[k][j]; System.out.print(c[i][j]+(j==b[0].length-1?"":" ")); } System.out.println(); } } }