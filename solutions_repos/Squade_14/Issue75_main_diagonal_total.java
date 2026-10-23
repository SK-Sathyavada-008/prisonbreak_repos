/*
 * CORRECTION NOTES
 * Buggy snippet: i<2
 * Corrected snippet: i<a.length
 * Explanation: Visit every row of the square matrix.
 * Buggy snippet: a[i][2-i]
 * Corrected snippet: a[i][i]
 * Explanation: The main diagonal uses matching row and column indices.
 */
public class Issue75_main_diagonal_total { public static void main(String[] args) { int[][] a={{1,2,3},{4,5,6},{7,8,10}}; int sum=0; for(int i=0;i<a.length;i++) sum+=a[i][i]; System.out.println("Diagonal: "+sum); } }
