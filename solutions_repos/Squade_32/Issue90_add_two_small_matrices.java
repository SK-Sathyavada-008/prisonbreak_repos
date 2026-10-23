/*
 * CORRECTION NOTES
 * Buggy snippet: i<1
 * Corrected snippet: i<a.length
 * Explanation: Process every matrix row.
 * Buggy snippet: (a[i][j]+b[i][j]+(j==0?1:0))
 * Corrected snippet: (a[i][j]+b[i][j])
 * Explanation: Matrix addition adds corresponding cells only.
 * Buggy snippet: only part of the matrices was processed and an extra value was added
 * Corrected snippet: add corresponding cells across every row and column
 * Explanation: Matrix addition sums matching cells and includes the entire result matrix.
 */
public class Issue90_add_two_small_matrices { public static void main(String[] args) { int[][] a={{4,9},{11,5}}; int[][] b={{9,1},{2,11}}; for(int i=0;i<a.length;i++) { for(int j=0;j<a[i].length;j++) System.out.print((a[i][j]+b[i][j])+(j==a[i].length-1?"":" ")); System.out.println(); } } }